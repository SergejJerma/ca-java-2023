----------------------------------------------------------------
-- PASKAITOS MEDZIAGA IS SKAIDRIU
-- dirbam su sakila duomenu rinkiniu

-- LIKE
select * from film where description like '%_rama%' and description like '%_ction%';
select * from film where description like '%_rama%' or description like '%_ction%';


-- EILISKUMAS (PRECEDENCE)
select count(*) from film where (rental_rate > 6.00 and length < 90) or rating = 'PG-13';
select count(*) from film where rental_rate > 6.00 and (length < 90 or rating = 'PG-13');
select count(*) from film where rental_rate > 6.00 and length < 90 or rating = 'PG-13';
select count(*) from film where rating = 'PG-13' or rental_rate > 6.00 and length < 90 ;


-- ORDER BY
select * from film order by length;			-- rikiuoti nuo trumpiausio filmo
select * from film order by length desc;	-- rikiuoti nuo ilgiausio filmo


-- UPPER, LOWER
select upper(description) from film;
select lower(description) from film;
select description from film;


-- CONCAT
select concat(title, ' rental_duration: ', rental_duration) from film;
select title, special_features from film where special_features like concat('%', 'Commentaries', '%', 'Scenes');


-- GROUP BY ir AVG, COUNT, MAX, MIN, SUM
select * from film;

select distinct
	rating,
    count(rating),
	avg(rental_rate) as vidurkis,
	count(rental_rate) eiluciu_kiekis,
	max(rental_rate),
	min(rental_rate),
	sum(rental_rate)
from film
group by rating;


-- 2023-06-23
-- HAVING
SELECT
 category.category_id,
 category.name,
 COUNT(film_id) AS number_of_films
FROM film_category
join category on film_category.category_id = category.category_id
GROUP BY category_id
HAVING COUNT(film_id) > 60
order by number_of_films desc;

-- norim gauti tik 1 eilute (kuriai kategorijai priklauso daugiausiai filmu)
SELECT
 category.category_id,
 category.name,
 COUNT(film_id) AS number_of_films
FROM film_category
    join category on film_category.category_id = category.category_id
GROUP BY category_id
order by number_of_films desc
LIMIT 1;

select * from country;
