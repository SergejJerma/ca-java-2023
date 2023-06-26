-- lenteliu apjungimas nenaudojant 'join' keyword'o
-- SELECT projektai.*, vykdymas.valandos
SELECT *
FROM projektai, vykdymas
WHERE projektai.nr = vykdymas.projektas
AND trukme = 12;

-- Niekad nepamirstam jungimo salygos
-- kitaip gausim CARTESIAN JOIN (CROSS JOIN)
SELECT *
FROM projektai, vykdymas;

-- kitas variantas - naudojant 'join'
SELECT * 
FROM projektai join vykdymas on projektai.nr = vykdymas.projektas
WHERE trukme = 12;

-- renkames is kurios lenteles norime duomenu <tenteles_pavadinimas>.<stulpelio_pavadinimas>
SELECT projektai.*, vykdymas.statusas
FROM projektai join vykdymas on projektai.nr = vykdymas.projektas
WHERE trukme = 12;

SELECT *
FROM vykdytojai, vykdymas 
WHERE 
vykdymas.vykdytojas = vykdytojai.nr 
AND projektas = 1;


-- Informacija apie tai, kokie vykdytojai kokius projektus vykdo ir kiek  kiekvienam projektui skiria valandų:
SELECT pavarde, pavadinimas, valandos
FROM vykdytojai, projektai, vykdymas
WHERE projektas = projektai.nr AND vykdytojas = vykdytojai.nr;

-- Tas pats tik su 'join' keyword'u
SELECT pavarde, pavadinimas, valandos
FROM vykdytojai
	inner join vykdymas on vykdymas.vykdytojas = vykdytojai.nr
    inner join projektai on projektai.nr = vykdymas.projektas;


-- Visų projekto Nr. 1 vykdytojų pavardės, statusai ir valandos:
SELECT pavarde, statusas, valandos
FROM vykdytojai
	JOIN vykdymas ON vykdytojas = nr
WHERE projektas = 1;

-- ????
select * from vykdytojai;
SELECT A.pavarde, B.pavarde 
	FROM vykdytojai A, vykdytojai B
WHERE
	A.kvalifikacija = B.kvalifikacija 
	AND A.nr < B.nr;		-- distincs netinka
    
-- Vykdytojai, vykdantys ypatingos svarbos projektus ir kiek kiekvienam  tokiam projektui skiria valandų:
SELECT pavarde, pavadinimas, valandos
FROM vykdytojai, projektai, vykdymas  
WHERE
	projektas = projektai.nr
    AND  vykdytojas = vykdytojai.nr
    AND  svarba = 'Ypatinga';


-- Projektai, kuriuos vykdo informatikai ir kiek kiekvienam projektui skiria  valandų:
SELECT pavarde, pavadinimas, valandos
FROM vykdytojai, projektai, vykdymas
WHERE 
	projektas = projektai.nr
	AND  vykdytojas = vykdytojai.nr
	AND  kvalifikacija = 'Informatikas';

-- Projekto Nr. 1 vykdytojų pavardės:
SELECT pavarde FROM vykdytojai
JOIN vykdymas ON vykdytojas = nr WHERE projektas = 1;

SELECT pavarde FROM vykdytojai, vykdymas
where vykdytojas = nr and projektas = 1;

-- Galima jungti ir daugiau lentelių, pavyzdžiui:
SELECT pavarde, pavadinimas, valandos FROM
(vykdytojai JOIN vykdymas ON vykdytojas = vykdytojai.nr)
JOIN projektai ON projektas = projektai.nr;

-- LEFT OUTER JOIN
-- Darbuotojai ir jų dalyvavimas projekte Nr. 1:
SELECT pavarde, statusas, valandos
FROM vykdytojai 
	LEFT OUTER JOIN vykdymas ON vykdytojas = nr
WHERE projektas = 1;

-- Rezultatas nesikeičia taikant RIGHT OUTER JOIN ir  sukeičiant lenteles vietomis:
SELECT pavarde, statusas, valandos
FROM vykdymas
	RIGHT OUTER JOIN vykdytojai ON vykdytojas = nr
WHERE projektas = 1;

-- Struktūrinės  užklausos – (Structured QL).
-- Pavardės vykdytojų, dalyvaujančių projekte Nr. 1:
SELECT pavarde 
FROM vykdytojai 
WHERE nr IN (SELECT vykdytojas FROM vykdymas WHERE projektas = 1);


-- Vykdytojai, dalyvaujantys bent viename ypatingos svarbos projekte:
SELECT pavarde 
FROM vykdytojai 
WHERE nr IN (
	SELECT vykdytojas 
    FROM vykdymas 
    WHERE projektas IN (SELECT nr FROM projektai WHERE svarba = 'Ypatinga')
);

-- Didelis dalinių užklausų kiekis, nereiškia gero stiliaus.
-- Vykdytojai, dalyvaujantys bent viename didelės svarbos projekte gali būti  išrinkti ir taip:
SELECT DISTINCT pavarde, projektas, svarba
FROM vykdytojai, vykdymas, projektai  
WHERE 
	projektas = projektai.nr 
    AND vykdytojas = vykdytojai.nr  
    AND svarba = 'Aukšta';


