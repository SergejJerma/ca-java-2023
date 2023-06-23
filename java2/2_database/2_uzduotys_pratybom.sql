----------------------------------------------------------------
-- Uzduotys is pfd "užduotys 2 paskaitai.pdf"

-- 1. Išrinkite duomenis apie darbuotoją (asmens kodą, vardą ir pavarde) iš lenteles DARBUOTOJAS kurie būtų gimę 1988m liepos 20d.
select ASMENSKODAS, VARDAS, PAVARDE
from DARBUOTOJAS
where GIMIMOMETAI = '1988-07-20';

-- 2. Išrinkite visus duomenis apie darbuotojus iš lentelės DARBUOTOJAS kurie yra gimę iki 1988m liepos 29d
select *
from DARBUOTOJAS
where GIMIMOMETAI < '1988-07-29'
order by GIMIMOMETAI desc;

-- 3. Išrinkite duomenis apie darbuotojus ( dirba nuo kada ir gimimo metus)
-- iš lentelės DARBUOTOJAS
-- kurie būtų įsidarbinę nuo 2009m spalio 30d iki 2012m lapkričio 11d.

-- I budas
select DIRBANUO, GIMIMOMETAI
 from DARBUOTOJAS
 where DIRBANUO >= '2009-10-30' and DIRBANUO <= '2012-11-11';

-- II budas
 -- iskaitant '2009-10-30' ir '2012-11-11'
 select DIRBANUO, GIMIMOMETAI
 from DARBUOTOJAS
 where DIRBANUO between '2009-10-30' and '2012-11-11';


-- 4. Išrinkite duomenis apie darbuotojus (vardą, Skyrių ir Projekto ID) 
-- iš lentelės DARBUOTOJAS kurie dirba 2 ir 3 skyriuose. (Panaudoti IN operatorių).
select VARDAS, SKYRIUS_PAVADINIMAS, PROJEKTAS_ID 
from DARBUOTOJAS
where PROJEKTAS_ID in (2, 3);


-- 5. Išrinkite duomenis (vardą, pavarde ir asmens kodą) apie visas moteris 
-- iš lentelės DARBUOTOJAS (panaudojant operatorių LIKE).
select VARDAS, PAVARDE, ASMENSKODAS 
from DARBUOTOJAS
where ASMENSKODAS like '4%';

-- Pagal pirma asmens kodo skaitmeni... bet ne 100% patikima, nes yra isimciu (zr. wikipedia :) )
select VARDAS, PAVARDE, ASMENSKODAS 
from DARBUOTOJAS 
where SUBSTRING(ASMENSKODAS, 1, 1) in ('2', '4', '6');


-- 6. Išrinkite visus duomenis apie visus darbuotojus iš lentelės DARBUOTOJAS,
-- kurie yra gimę 12 dieną (panaudojant operatorių LIKE).
select * 
from DARBUOTOJAS
where GIMIMOMETAI like '%12';

select * 
from DARBUOTOJAS
where DAY(GIMIMOMETAI) = 12;


-- 7. išrinkite visus projektus iš lentelės PROJEKTAS kad projekto pavadinime 3 raidė būtų ‘u’.
select * from PROJEKTAS where PAVADINIMAS like '__u%';


-- 8. Išrinkite visus darbuotojus iš lentelės DARBUOTOJAS kuriems nepaskirtos jokios pareigos.
select *
from DARBUOTOJAS
where PAREIGOS is null;


-- 9. Išrinkite duomenis apie darbuotoją (vardą, pavarde, nuo kada dirba ir pareigas),
-- kad tenkintų sąlygas: (dirba nuo 2011-02-12 ir jų pareigos yra Programuotojai).
select *
from DARBUOTOJAS
where DIRBANUO >= '2011-02-12' and PAREIGOS like 'Programuotoja%';


-- 10. Išrinkite duomenis apie darbuotojus (vardą, pavardę, skyriaus pavadinimą ir projekto ID)
-- iš lentelės DARBUOTOJAS su sąlyga, kad jie butų iš Java skyriaus arba 1 projekto.
select VARDAS, PAVARDE, SKYRIUS_PAVADINIMAS, PROJEKTAS_ID
from DARBUOTOJAS
where SKYRIUS_PAVADINIMAS = 'Java' or PROJEKTAS_ID = 1;


-- 11. Išrinkite visus darbuotojų vardus išskyrus tuos kurių vardai prasideda raide ‘S’.
select * from DARBUOTOJAS where VARDAS like 'S%';


-- 12. Išrinkite duomenis ( vardą, dirba nuo kada ir gimimo metus) iš lentelės “DARBUOTOJAS”,
-- apie visus darbuotojus tik ne tuos kurie įsidarbino nuo 2009m spalio 30d iki 2012m lapkričio 11d.
select VARDAS, DIRBANUO, GIMIMOMETAI 
from DARBUOTOJAS 
where DIRBANUO < '2009-10-30' or DIRBANUO >= '2012-11-11';


-- 13. Išrinkite duomenis apie darbuotojus (vardą, pavardę ir gimimo metus) iš lentelės
-- DARBUOTOJAS ir išrikiuokite visus duomenis nuo seniausio žmogaus iki jauniausio.
select VARDAS, PAVARDE, GIMIMOMETAI 
from DARBUOTOJAS 
order by GIMIMOMETAI;


-- 14. Išrinkite duomenis apie darbuotojus (vardą, pavardę ir gimimo metus) iš lentelės
-- DARBUOTOJAS ir išrikiuokite visus duomenis nuo jauniausio žmogaus iki seniausio.
select VARDAS, PAVARDE, GIMIMOMETAI 
from DARBUOTOJAS 
order by GIMIMOMETAI desc;

-- 15. Išrinkite iš lentelės DARBUOTOJAS projekto id kuris būtu minimalus skaičius ir maksimalus skaičius.
select max(PROJEKTAS_ID), min(PROJEKTAS_ID) from DARBUOTOJAS;


-- 16. Išrinkite duomenis apie projektą ir kiek tame projekte yra priskirta žmonių
-- iš lentelės DARBUOTOJAS (projekto numeris ir skaičius kiek dalyvauja žmonių).
select PROJEKTAS_ID, count(PROJEKTAS_ID) as zmoniu_skaicius_projekte
from DARBUOTOJAS
group by PROJEKTAS_ID;


-- 17. Išrinkite duomens (projekto numeris, pareigos, skaičius)
-- iš lentelės DARBUOTOJAS, kiek dirba programuotų kiekvienam projekte.
select PROJEKTAS_ID, PAREIGOS, count(*)
from DARBUOTOJAS 
where PAREIGOS like 'Programuotoja%'
group by PROJEKTAS_ID, PAREIGOS;


-- 18. #17 punkto užklausą pataisykite taip, kad rodytų tik tuos projektus, kur dirba bent 2 darbuotojai.
select PROJEKTAS_ID, PAREIGOS, count(*)
from DARBUOTOJAS 
where PAREIGOS like 'Programuotoja%'
group by PROJEKTAS_ID, PAREIGOS



-- (offtopic) Visi duomenys apie kiekvieną darbuotoją + kiek tame projekte (kur dirba darbuotojas) yra iš viso darbuotojų
-- Pareigos - kiekvienam darbuotojui unikalios, todel ju grupuoti negalime
select D1.*, D2.skaicius as viso_darbuotoju_siame_projekte	-- D1.PROJEKTAS_ID, D1.PAREIGOS
from DARBUOTOJAS D1 inner join
(
	select
	PROJEKTAS_ID, COUNT(*) skaicius
	from DARBUOTOJAS D group by D.PROJEKTAS_ID
) D2 on D1.PROJEKTAS_ID = D2.PROJEKTAS_ID;

