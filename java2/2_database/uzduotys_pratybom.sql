-- 1. Išrinkite visus duomenis iš lentelės “DARBUOTOJAS”.
select * from DARBUOTOJAS;


--5. Išrinkite visus duomenis apie darbuotojus, kurie dirba Java skyriuje.
select * from DARBUOTOJAS
where SKYRIUS_PAVADINIMAS='Java';


-- 10. Įterpkite į lentelę “DARBUOTOJAS” naują darbuotoją, užpildydami visus reikiamus laukus
-- (asmens kodą, vardą, pavardę, nuo kada pradėjo dirbti, gimimo metus,
--     pareigas, skyriaus pavadinimą ir projekto numerį ).

-- 1 budas: Visos vertes surasomos stulpeliu eiliskumo tvarka
insert into DARBUOTOJAS values
('39303094444', 'Tomas', 'Zvinys', '2020-03-30', '1993-03-03', 'Programuotojas', 'Java', 3 );

-- Kadangi primary key yra asmens kodas - negalim antra kart iterpt tokios pacios eilutes (reik istrint)
delete from DARBUOTOJAS where ASMENSKODAS='39303094444';

-- 2 budas: Patys nurodom stulpeliu eiliskuma
insert into DARBUOTOJAS (
ASMENSKODAS, DIRBANUO, GIMIMOMETAI, PAREIGOS, PAVARDE, PROJEKTAS_ID, SKYRIUS_PAVADINIMAS, VARDAS) values
('39303094444', '2020-03-30', '1993-03-03', 'Programuotojas', 'Zvinys', 3, 'Java','Tomas');


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

update DARBUOTOJAS
 set PAREIGOS = 'Testuotojas'
 where PAVARDE = 'Antanaitis';


