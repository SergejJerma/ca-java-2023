----------------------------------------------------------------
-- Uzduotys is "užduotys 1 pratybom.pdf"


-- 1. Išrinkite visus duomenis iš lentelės “DARBUOTOJAS”.
select * from DARBUOTOJAS;


-- 2. Išrinkite visus duomenis iš stulpelio “ASMENSKODAS” - lentelėje “DARBUOTOJAS”.
select ASMENSKODAS from DARBUOTOJAS;


-- 3. Išrinkite visus duomenis iš stulpelių “VARDAS”,”PAVARDĖ”, “PAREIGOS” - lentelėje “DARBUOTOJAS”.
select VARDAS, PAVARDE, PAREIGOS from DARBUOTOJAS;


-- 4. Išrinkite skirtingas reikšmes iš stulpelio SKYRIUS_PAVADINIMAS - lentelėje “DARBUOTOJAS”.
select distinct SKYRIUS_PAVADINIMAS from DARBUOTOJAS;


-- 5. Išrinkite visus duomenis apie darbuotojus, kurie dirba Java skyriuje.
select * from DARBUOTOJAS
where SKYRIUS_PAVADINIMAS='Java';


-- 6. Išrinkite duomenis, kokias pareigas užima Giedrius
select PAREIGOS from DARBUOTOJAS where VARDAS = 'Giedrius';


-- 7. Išrinkite visus duomenis apie darbuotojus, kurių gimimo data - 1986-09-19
select * from DARBUOTOJAS where GIMIMOMETAI = '1986-09-19';


-- 8. Išrinkite darbuotojų vardus, kurių pavardės yra Sabutis
select VARAS from DARBUOTOJAS where PAVARDE = 'Sabutis';


-- 9. Išrinkite duomenis (vardą ir pavardę) apie programuotojus iš Java skyriaus
select VARDAS, PAVARDE from DARBUOTOJAS where SKYRIUS_PAVADINIMAS = 'Java';


-- 10. Įterpkite į lentelę “DARBUOTOJAS” naują darbuotoją, užpildydami visus reikiamus laukus
-- (asmens kodą, vardą, pavardę, nuo kada pradėjo dirbti, gimimo metus,
--     pareigas, skyriaus pavadinimą ir projekto numerį ).

-- I budas: Visos vertes surasomos stulpeliu eiliskumo tvarka
insert into DARBUOTOJAS values
('39303094444', 'Tomas', 'Zvinys', '2020-03-30', '1993-03-03', 'Programuotojas', 'Java', 3 );

-- Kadangi primary key yra asmens kodas - negalim antra kart iterpt tokios pacios eilutes (reik istrint)
delete from DARBUOTOJAS where ASMENSKODAS='39303094444';


-- II budas: Patys nurodom stulpeliu eiliskuma
insert into DARBUOTOJAS (
ASMENSKODAS, DIRBANUO, GIMIMOMETAI, PAREIGOS, PAVARDE, PROJEKTAS_ID, SKYRIUS_PAVADINIMAS, VARDAS) values
('39303094444', '2020-03-30', '1993-03-03', 'Programuotojas', 'Zvinys', 3, 'Java','Tomas');


-- 11. Įterpkite į lentelę “DARBUOTOJAS” naują darbuotoją, užpildydami tik laukus
-- (asmens kodą, vardą, pavardę, nuo kada pradėjo dirbti, gimimo metus).
-- Pareigas, skyriaus pavadinimą ir projekto numerį palikite neužpildytus.
insert into DARBUOTOJAS (ASMENSKODAS, VARDAS, PAVARDE, DIRBANUO, GIMIMOMETAI)
 values ('123456789', 'Vardenis', 'Pavardenis', '2013-05-04', '1990-01-01');
 
 
 -- 12. Užpildykite likusius tuščius laukus “DARBUOTOJAS” lentelėje, jūsų prieš tai įterptame įraše.
 -- Priskirkite darbuotojui pareigas, skyrių ir projektą.
 update DARBUOTOJAS 
 set PAREIGOS = 'Testuotojas', SKYRIUS_PAVADINIMAS = 'Java', PROJEKTAS_ID = 2 
 where ASMENSKODAS = '123456789';
 
 
 -- 13. Ištrinkite lentelės “DARBUOTOJAS” įrašą, kurio asmens kodas yra toks, kurį jūs sukūrėte.
 delete from DARBUOTOJAS where ASMENSKODAS = '123456789';
 

-- 14. Įterpkite, du darbuotojus, pavarde Antanaitis kurių pareigos būtų “Programuotojas”.
select * from SKYRIUS;
insert into DARBUOTOJAS (
ASMENSKODAS, DIRBANUO, GIMIMOMETAI, PAREIGOS, PAVARDE, PROJEKTAS_ID, SKYRIUS_PAVADINIMAS, VARDAS) values
('39303123456', '2020-03-30', '1993-03-03', 'Programuotojas', 'Antanaitis', 3, 'Java','Antantas');
insert into DARBUOTOJAS (
ASMENSKODAS, DIRBANUO, GIMIMOMETAI, PAREIGOS, PAVARDE, PROJEKTAS_ID, SKYRIUS_PAVADINIMAS, VARDAS) values
('39303012345', '2020-03-30', '1993-03-03', 'Programuotojas', 'Antanaitis', 3, 'C#','Vardenis');


-- 15. Pakeiskite, abiejų Antanaičių pareigas į “Testuotojas” vienu sakiniu.
select * from DARBUOTOJAS where PAVARDE = 'Antanaitis';


-- 16. Suskaičiuokite, kiek įmonėje dirba Testuotojų.
select count(*) from DARBUOTOJAS where PAREIGOS = 'Testuotojas';

update DARBUOTOJAS
 set PAREIGOS = 'Testuotojas';


select * from DARBUOTOJAS where DIRBANUO between '1900-05-05' and NOW();
