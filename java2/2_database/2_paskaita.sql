----------------------------------------------------------------
-- PASKAITOS MEDZIAGA IS SKAIDRIU

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
	avg(rental_rate) as vidurkis,
	count(rental_rate) eiluciu_kiekis,
	max(rental_rate),
	min(rental_rate),
	sum(rental_rate)
from film
group by rating;

