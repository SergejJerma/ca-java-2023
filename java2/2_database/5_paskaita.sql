-- ------------------------
-- table joins
-- ------------------------

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


-- Informacija apie tai, kokie vykdytojai kokius projektus vykdo ir kiek  kiekvienam projektui skiria valandų:
SELECT pavarde, pavadinimas, valandos
FROM vykdytojai, projektai, vykdymas
WHERE projektas = projektai.nr AND vykdytojas = vykdytojai.nr;

SELECT pavarde, pavadinimas, valandos
FROM vykdymas
    inner join vykdytojai on vykdymas.vykdytojas = vykdytojai.nr
    inner join projektai on vykdymas.vykdytojas = vykdytojai.nr;


--    Visų projekto Nr. 1 vykdytojų pavardės, statusai ir valandos:
SELECT pavarde, statusas, valandos
FROM vykdymas
         inner join vykdytojai on vykdymas.vykdytojas = vykdytojai.nr
         inner join projektai on vykdymas.projektas = projektai.nr
WHERE vykdymas.projektas = 1;

-- Vykdytojai, kuriems nepriskirtas joks projektas:
select vykdytojai.*, vykdymas.*
from vykdymas
    right join vykdytojai on vykdymas.vykdytojas = vykdytojai.nr
where
    projektas is null;

-- Projektai, kuriems nepriskirtas joks vykdytojas

insert into `projektai` (`nr`, `pavadinimas`, `svarba`, `pradzia`, `trukme`)
values (4, 'Naujas projektas', 'Abejotina', null, null);    -- Sukuriam projekta be vykdytojo (kol kas tokio nera)

select *
from projektai
    left join vykdymas on projektai.nr = vykdymas.projektas
where
    vykdymas.projektas is null;

-- -----------------
-- Transactions
-- -----------------
drop table if exists CUSTOMERS;
CREATE TABLE CUSTOMERS
(
    ID      INT PRIMARY KEY,
    NAME    VARCHAR(255),
    AGE     INT,
    ADDRESS VARCHAR(255),
    SALARY  DECIMAL(10, 2)
);

INSERT INTO CUSTOMERS (ID, NAME, AGE, ADDRESS, SALARY)
VALUES (1, 'Ramesh', 32, 'Ahmedabad', 2000.00),
       (2, 'Khilan', 25, 'Delhi', 1500.00),
       (3, 'kaushik', 23, 'Kota', 2000.00),
       (4, 'Chaitali', 25, 'Mumbai', 6500.00),
       (5, 'Hardik', 27, 'Bhopal', 8500.00),
       (6, 'Komal', 22, 'MP', 4500.00),
       (7, 'Muffy', 24, 'Indore', 10000.00);

BEGIN;
start transaction;
# SET TRANSACTION ISOLATION LEVEL READ COMMITTED;
# SET TRANSACTION ISOLATION LEVEL REPEATABLE READ;

select * from CUSTOMERS;

delete from CUSTOMERS c where ID = 1;

SAVEPOINT mano_savepointas;

select * from CUSTOMERS;

-- ddl nepaklusta transakciju kontekstui:
-- kita transakcija, net ir neuzdaryta, is kart matys jeigu dingo/atsirado (tarkim) lentele
# drop table CUSTOMERS;

INSERT INTO CUSTOMERS (ID, NAME, AGE, ADDRESS, SALARY)
VALUES (8, 'Antanas', 32, 'gatve', 2880.00);

select * from CUSTOMERS;

rollback to mano_savepointas;

-- ivykdzius DDL operacija - automatiskai uzdaromas commit'as
drop table orders;


commit;