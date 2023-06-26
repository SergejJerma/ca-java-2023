----------------------------------------------------------------
-- Uzduotys is pfd "užduotys 3 paskaitai.pdf" 
-- Uzduotys su schema "darbuotojai" (ne "projektas")

-- 1. Išrinkite darbuotojų vardus ir pavardes kartu su projekto pavadinimu, kuriame jie dirba.
select d.VARDAS, d.PAVARDE, p.PAVADINIMAS
from DARBUOTOJAS d
	inner join PROJEKTAS p on d.PROJEKTAS_ID = p.ID;
    
    
-- 2. Išsirinkite darbuotojų dirbančių projekte Kaunas vardus, pavardes ir projekto pavadinimą.
select d.VARDAS, d.PAVARDE, p.PAVADINIMAS
from DARBUOTOJAS d
	inner join PROJEKTAS p on d.PROJEKTAS_ID = p.ID
where p.PAVADINIMAS = 'Kaunas';
    
    
-- 3. Išrinkite visus projekto Registrų Centras vykdytojus dirbančius Testavimo skyriuje.
select d.VARDAS, d.PAVARDE, d.SKYRIUS_PAVADINIMAS, p.PAVADINIMAS
from DARBUOTOJAS d
	inner join PROJEKTAS p on d.PROJEKTAS_ID = p.ID
where d.SKYRIUS_PAVADINIMAS = 'Testavimo';


-- 4. Išrinkite visas moteris dirbančias projekte Izola ir 
-- išveskite į ekraną jų vardus, pavardes ir projekto pavadinimą.
select d.VARDAS, d.PAVARDE, p.PAVADINIMAS
from DARBUOTOJAS d
	inner join PROJEKTAS p on d.PROJEKTAS_ID = p.ID
where 
	p.pavadinimas = 'Izola'
    and d.ASMENSKODAS like '4%';
    
    
-- 5. Išrinkite skyrių pavadinimus su juose dirbančių darbuotojų skaičiumi.
select SKYRIUS_PAVADINIMAS, count(*) darbuotoju_skyriuje
from DARBUOTOJAS d
	group by SKYRIUS_PAVADINIMAS;
    
    
-- 6. Apribokite #5 užklausos rezultatą taip,
-- kad rodytų tik tuos skyrius kur dirba bent 5 darbuotojai.
select SKYRIUS_PAVADINIMAS, count(*) darbuotoju_skyriuje
from DARBUOTOJAS d
	group by SKYRIUS_PAVADINIMAS
having darbuotoju_skyriuje >= 5;


-- 7. Išrinkite darbuotojus (vardus, pavardes) kartu su skyrių,
-- kuriuose jie dirba pavadinimais, tačiau nesančius tų skyrių vadovais.
select * -- d.VARDAS, d.PAVARDE, d.SKYRIUS_PAVADINIMAS
from DARBUOTOJAS d
	left join SKYRIUS s on d.SKYRIUS_PAVADINIMAS = s.PAVADINIMAS
where d.ASMENSKODAS != s.VADOVAS_ASMENSKODAS;
-- Turi nebuti:
-- 	Deivydas	Piliukas
-- 	Kestas	Liutas
-- 	Zita	Lietuvaite

-- select d.ASMENSKODAS, d.VARDAS, d.PAVARDE, d.SKYRIUS_PAVADINIMAS, s.PAVADINIMAS, s.VADOVAS_ASMENSKODAS
-- from DARBUOTOJAS d 
-- 	inner join SKYRIUS s on d.SKYRIUS_PAVADINIMAS = s.PAVADINIMAS
-- where d.ASMENSKODAS = s.VADOVAS_ASMENSKODAS; 


-- 8. Sukurkite naują įrašą lentelėje “DARBUOTOJAS” (asmens kodas: 38807117896,
-- vardas: Pranas, pavardė:Logis, Dirba nuo: 2009-11-12, gimimo metai: 1988-11-14,
-- pareigos: null, skyrius_pavadinimas: null, projektas_id: null).
insert into DARBUOTOJAS (ASMENSKODAS, VARDAS, PAVARDE, DIRBANUO, GIMIMOMETAI, PAREIGOS, SKYRIUS_PAVADINIMAS, PROJEKTAS_ID)
values ('38807117896', 'Pranas', 'Logis', '2009-11-12', '1988-11-14', null, null, null);
	
-- 9. Išrinkite darbuotojų vardus, pavardes ir skyriaus pavadinimą.
--  Rodykite, net ir tuos darbuotojus, kurie nedirba jokiame skyriuje
-- (skyriaus pavadinimą pasiimkite iš lentelės SKYRIUS).
select d.VARDAS, d.PAVARDE, s.PAVADINIMAS
from DARBUOTOJAS d
	left join SKYRIUS s on d.SKYRIUS_PAVADINIMAS = s.PAVADINIMAS;
    
-- 10. 1# punkto užklausą pataisykite taip, kad 
-- rodytų tik tuos vardus ir projektų pavadinimus kuriuose dirba daugiau nei 4 darbuotojai.
select d.VARDAS, d.PAVARDE,
	s.PAVADINIMAS skyriaus_pavadinimas
from DARBUOTOJAS d
	left join SKYRIUS s on d.SKYRIUS_PAVADINIMAS = s.PAVADINIMAS	-- is tiesu - bereiksmis jungimas; tiesiog salyga to reikalauja
    inner join (
		select PROJEKTAS_ID, count(PROJEKTAS_ID) darbuotoju_sk_projekte
        from DARBUOTOJAS
        group by PROJEKTAS_ID
        having darbuotoju_sk_projekte > 4
	) projektu_statistika on projektu_statistika.PROJEKTAS_ID = d.PROJEKTAS_ID;
    

-- 11. Išrinkite projektus, turinčius daugiau nei 4 darbuotojus.
-- Pateikite projektų pavadinimus, darbuotojų skaičių projekte, darbuotojų vardus ir pavardes
select d.VARDAS, d.PAVARDE, d.SKYRIUS_PAVADINIMAS,
    projektu_statistika.darbuotoju_sk_projekte,
    p.PAVADINIMAS
from DARBUOTOJAS d
    inner join (
		select PROJEKTAS_ID, count(PROJEKTAS_ID) darbuotoju_sk_projekte
        from DARBUOTOJAS
        group by PROJEKTAS_ID
        having darbuotoju_sk_projekte > 4
	) projektu_statistika on projektu_statistika.PROJEKTAS_ID = d.PROJEKTAS_ID
    inner join PROJEKTAS p on p.id = projektu_statistika.PROJEKTAS_ID;
    

    
