-- #### LVL 1

-- 1. **Selecting data:**\
--    Write a query to select all records from the 'actor' table.
select * from actor;

-- 2. **Where clause:**\
--    Write a query to fetch all movies in the 'film' table that are rated 'R'. Use the WHERE clause.
select * from film f where f.rating = 'R';

-- 3. **Joining tables:**\
--    Write a query to join the 'film' table and the 'language' table to show the film title and the language of each film.
select f.title, l.name
from film f
	inner join language l on f.language_id = l.language_id;

-- 4. **Ordering data:**\
--    Write a query to list all stores in the 'store' table in ascending order of their address ID.
select * from store order by address_id;

-- 5. **Grouping data:**\
--    Write a query to count the number of films in each rating category in the 'film' table. Use the GROUP BY clause.
select f.rating, count(*) from film f group by rating;

-- 6. **Aggregate functions:**\
--    Write a query to find the average rental rate of films in the 'film' table.
select avg(rental_rate) from film;

-- 7. **Subqueries:**\
--    Write a query to find films in the 'film' table with a rental rate higher than the average rental rate.
select * from film where rental_rate > (select avg(rental_rate) from film);

-- 8. **Inserting data:**\
--    Insert a new record into the 'customer' table with appropriate values.
-- This should include customer first name, last name, email, address id and store id at least.
insert into customer (first_name, last_name, email, address_id, store_id)
values ('CustomerFirstName', 'CustomerLastName', 'customer@email.com', 1, 1);

-- 9. **Updating data:**\
--    Update the 'rental_rate' of film 'ALICE FANTASIA' in the 'film' table to 2.99
update film set rental_rate=2.99 where film.title = 'ALICE FANTASIA';


-- #### LVL 2

-- 1. **Complex Joins:**
--    Write a query that joins 'film', 'inventory', and 'rental' tables to fetch the films that have never been rented out.
select *
from film f
	left join inventory i on f.film_id = i.film_id
    left join rental r on r.inventory_id = i.inventory_id
where
	r.rental_date is null;

-- 2. **Pattern Matching:**
--    Write a query to find customers in the 'customer' table whose first name starts with 'A' and ends with 'S'.\
-- 		How many films have they rented out any film?
--    Use `LIKE` operator.
select c.*, count(c.customer_id) as times_rented_a_movie
	from customer c
		inner join rental r on c.customer_id = r.customer_id
where c.first_name like 'A%S'
group by c.customer_id;


-- 3. **Date Functions:**
--    Find the customers who have a rental from the 'rental' table due within the last 7 days.
select *
from customer c
	inner join rental r on c.customer_id = r.customer_id
where DATE_SUB(CURDATE(), INTERVAL 7 DAY) >= r.return_date;


-- 4. **Use of CASE Statement:**
--    Write a query to categorize films from the 'film' table into 'SHORT' (length < 60), 'NORMAL' (length between 60 and
--    120), and 'LONG' (length > 120) using the `CASE` statement.
select f.film_id, f.title, f.length,
case
	when f.length < 60 then 'SHORT'
    when 60 <= f.length and f.length < 120 then 'NORMAL'
    when 120 <= f.length then 'LONG'
end as film_length_category
from film f;


-- 5. **Having Clause:**
--    Write a query to list the categories from the 'category' table that have more than 60 films.\
--    Use the `HAVING` clause.
select c.category_id, c.name, major_categories.films_in_category
from (
    select fc.category_id, count(fc.category_id) films_in_category
    from film_category fc
    group by fc.category_id
    having films_in_category > 60
) major_categories inner join category c on c.category_id = major_categories.category_id;


-- 6. **Complex Aggregate Functions:**
--    Find the total rental duration for each customer by summing up the rental duration of all films they've rented.
--    Display the top 10 customers with the highest total rental duration.
select c.customer_id, c.first_name, c.last_name, rental_duration.rental_duration_days
from customer c
inner join (
    select
        r.customer_id,
        sum(DATEDIFF(r.return_date, r.rental_date) ) as rental_duration_days
    from rental r
    group by r.customer_id
) rental_duration on rental_duration.customer_id = c.customer_id
order by rental_duration.rental_duration_days desc
limit 10;


-- 7. **Nested Queries:**
--    Write a query to find films in the 'film' table that have a rental rate within the top 10% of rental rates.

-- rikiuojam filmus pagal rental_rate
select f.film_id, f.title, f.rental_rate, row_number() over (order by rental_rate desc) as rate_rank
from film f;


-- skaiciojam kas yra tas top 10%: suzinom kiek filmu yra is viso (1000) ir kad top 10% riba yra 100-asis filmas
select round(count(*) * 0.10) movies_in_top10
from film f;

-- koks yra rental_rate filmo, esancio top 10% apacioje?
select f2.rental_rate
from film f1
         inner join (
    -- rikiuojam filmus pagal rental_rate
    select f.film_id, f.title, f.rental_rate, row_number() over (order by rental_rate desc) as rate_rank
    from film f) f2 on f1.film_id = f2.film_id
where f2.rate_rank = (
    -- skaiciojam kas yra tas top 10%: suzinom kiek filmu yra is viso (1000) ir kad top 10% riba yra 100-asis filmas
    select round(count(*) * 0.10) movies_in_top10
    from film f
);

-- Viskas kartu: filmai, turintys top 10% rental_rate
select *
from film f3
where f3.rental_rate >= (
    select f2.rental_rate
    from film f1
    inner join (
        -- rikiuojam filmus pagal rental_rate
        select f.film_id, f.title, f.rental_rate, row_number() over (order by rental_rate desc) as rate_rank
        from film f) f2 on f1.film_id = f2.film_id
    where f2.rate_rank = (
        -- skaiciojam kas yra tas top 10%: suzinom kiek filmu yra is viso (1000) ir kad top 10% riba yra 100-asis filmas
        select round(count(*) * 0.10) movies_in_top10
        from film f
    )
);


-- 8. **Using LIMIT and OFFSET:**
--    Fetch 10 films starting from the 11th highest length film in the 'film' table.
-- Ne visai teisingai suformuluota uzduotis, nes ... o kas jeigu, yra daug tokios pat trukmes filmu?
-- Kai kurie filmai tiesiog nepateks i sarasa del atsitiktiniu priezasciu...
select f.film_id, f.title, f.length, row_number() over (order by length desc) as length_rank
from film f
order by f.length desc
limit 10
offset 10;

-- 9. **Updating using subqueries:**
--    Increase the rental_rate by 10% for films in the 'film' table that have been rented out more times
--    than the average rental.

-- kiek kartu, kuris rental buvo isnuomotas
select inventory_id, count(inventory_id) as times_rented
from rental r
group by inventory_id;

-- kiek kartu, kuris filmas buvo isnuomotas
-- (pasirodo tas pats filmas gali buti skirtingu parduotuviu inventoriuose)
select f.film_id, f.title, sum(rental_statistics.times_rented) film_rented_times
from film f
    inner join inventory i on f.film_id = i.film_id
    inner join (
        -- kiek kartu, kuris rental buvo isnuomotas
        select inventory_id, count(inventory_id) as times_rented
        from rental r
        group by inventory_id order by times_rented desc
    ) rental_statistics on rental_statistics.inventory_id = i.inventory_id
group by f.film_id
order by film_rented_times desc;


-- kiek kartu vidutiniskai buvo isnuomotas kiekvienas filmas
select avg(film_rented_times)
from (
    -- kiek kartu, kuris filmas buvo isnuomotas
    select f.film_id, f.title, sum(rental_statistics.times_rented) film_rented_times
    from film f
             inner join inventory i on f.film_id = i.film_id
             inner join (
                -- kiek kartu, kuris rental buvo isnuomotas
                select inventory_id, count(inventory_id) as times_rented
                from rental r
                group by inventory_id order by times_rented desc
            ) rental_statistics on rental_statistics.inventory_id = i.inventory_id
    group by f.film_id
    order by film_rented_times desc
) film_rental_statistics;


-- viskas viename - didiname rental_rate daugiausiai kartu isnuomotiems filmams:
WITH
    -- kiek kartu, kuris rental buvo isnuomotas
    rental_statistics AS (
        SELECT inventory_id, COUNT(*) AS times_rented
        FROM rental
        GROUP BY inventory_id
    ),

    -- kiek kartu, kuris filmas buvo isnuomotas
    film_rental_statistics AS (
        SELECT f.film_id, f.title, f.rental_rate, SUM(rs.times_rented) AS film_rented_times
        FROM film f
             JOIN inventory i ON f.film_id = i.film_id
             JOIN rental_statistics rs ON rs.inventory_id = i.inventory_id
        GROUP BY f.film_id, f.title, f.rental_rate
    ),

    -- filmai, kuriem filmam reikia pakeisti rental_rate
    films_to_update as (
        SELECT *
        FROM film_rental_statistics
        WHERE film_rented_times >
              (
                  SELECT AVG(film_rented_times)
                  FROM film_rental_statistics
              )
        ORDER BY film_rented_times DESC
    )
select * from films_to_update;
-- uzkomentuokite auksciau esanti select ir atkomentuokite zemiau esanti update statement'a
-- update film f set f.rental_rate = f.rental_rate * 1.1
-- where f.film_id in (select film_id from films_to_update);



-- 10. **Creating Views:**
--     Create a view that joins the 'customer', 'rental', and 'payment' tables and shows each customer's email, total
--     number of rentals, and total amount paid.

create or replace view customer_rental_payments as
with
    customer_rentals AS (
        select c.customer_id, c.email, count(c.customer_id) as rental_count
        from customer c
            inner join rental r on c.customer_id = r.customer_id
        group by c.customer_id
    ),

    customer_payments AS (
        select c.customer_id, c.email, sum(p.amount) as total_amount
        from customer c
                 inner join payment p on c.customer_id = p.customer_id
        group by c.customer_id
    )

-- make this a view
select cr.customer_id, cr.email, cr.rental_count, cp.total_amount
from customer_rentals cr
    inner join customer_payments cp on cr.customer_id = cp.customer_id;

select * from customer_rental_payments;

