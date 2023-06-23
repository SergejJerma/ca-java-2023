-- lenteliu apjungimas nenaudojant 'join' keyword'o
SELECT * 
FROM projektai, vykdymas
WHERE projektai.nr = vykdymas.projektas
AND trukme = 12;

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