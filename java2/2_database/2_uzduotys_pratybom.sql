----------------------------------------------------------------
-- Uzduotys is pfd "užduotys 2 paskaitai.pdf"

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


-- 7. išrinkite visus projektus iš lentelės PROJEKTAS kad projekto pavadinime 3 raidė būtų ‘u’.
select * from PROJEKTAS where PAVADINIMAS like '__u%';


-- 11. Išrinkite visus darbuotojų vardus išskyrus tuos kurių vardai prasideda raide ‘S’.
select * from DARBUOTOJAS where VARDAS like 'S%';


-- 15. Išrinkite iš lentelės DARBUOTOJAS projekto id kuris būtu minimalus skaičius ir maksimalus skaičius.
select max(PROJEKTAS_ID), min(PROJEKTAS_ID) from DARBUOTOJAS;


-- (offtopic) Isrinkti moteris is lenteles DARBUOTOJAS
select * from DARBUOTOJAS where SUBSTRING(ASMENSKODAS, 1, 1) in ('2', '4', '6');


-- 17. Išrinkite duomens (projekto numeris, pareigos, skaičius)
-- iš lentelės DARBUOTOJAS kiek dirba programuotų kiekvienam projekte.
-- Pareigos - kiekvienam darbuotojui unikalios, todel ju grupuoti negalime
select D1.*, D2.skaicius	-- D1.PROJEKTAS_ID, D1.PAREIGOS
from DARBUOTOJAS D1 inner join
(
	select
	PROJEKTAS_ID, COUNT(*) skaicius
	from DARBUOTOJAS D group by D.PROJEKTAS_ID
) D2 on D1.PROJEKTAS_ID = D2.PROJEKTAS_ID;

