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