-- -------------------------
-- lenteliu kurimas
 -- -------------------------

-- galima istrinti lentele, jeigu ji jau egzistuoja (be klaidu; net jei ji ir neegzistuoja)
drop table if exists vykdymas;

-- lenteles sukurimas
CREATE TABLE `vykdymas` (
    `projektas` integer NOT NULL,
    `vykdytojas` integer NOT NULL,
    `statusas` varchar(60) default 'Programuotojas',
    `valandos` SMALLINT default 1
);

insert into vykdymas (projektas, vykdytojas, statusas)
 values (null, 1, null);
 select * from vykdymas;
 
 -- -------------------------
 -- lenteles stulpeliai
 -- -------------------------
 
 -- istrinam (drop'inam) lenteles stulpeli (mes klaida, jeigu tokio nera)
 ALTER TABLE vykdytojai DROP gimtadienis;
 
 -- pridedam lenteles stulpeli
 ALTER TABLE vykdytojai ADD gimtadienis DATE not null default '2023-06-26';	-- CURDATE() default'ine reiksme turi buti hard-coded

 select * from vykdytojai;
 
 -- galime atskirai istrinti / prideti default'ine reiksme
 ALTER TABLE projektai ALTER svarba DROP DEFAULT; 
 ALTER TABLE projektai ALTER svarba SET DEFAULT 'Didele';
 select * from projektai;
 
-- -------------------------
 -- primary key
 -- -------------------------
 
 drop table if exists TEST;
 
CREATE TABLE TEST(
	ID INT PRIMARY KEY, 		-- pirminis raktas (neleidzia null versciu - kaip gi jas suindeksuotumem?!)
	NAME VARCHAR(255) unique	-- leidzia kiek norim deti null verciu (juk null = vertes nera; nera ir ka kalbeti apie unique)
);
select * from TEST;
insert into TEST (ID, NAME) values (4, null);

CREATE TABLE TEST(
	ID INT, -- be pirminio rakto (jis apibreztas zemiau)
	NAME VARCHAR(255),
    CONSTRAINT pk_id PRIMARY KEY (ID)	-- pirminis raktas
);

-- -------------------------
-- composite primary key
 -- -------------------------
 
CREATE TABLE persons (
	p_id INT NOT NULL,
	last_name VARCHAR(255) NOT NULL,
	first_name VARCHAR(255),
    address VARCHAR(255),
    city VARCHAR(255),
    
	-- kombinuotas kelių stulpelių pirminis raktas
	CONSTRAINT pk_PersonID PRIMARY KEY (p_id, last_name)
);

-- dvieju stulpeliu kombinacija yra primary key
insert into persons (p_id, last_name) values (1, 'lasName');
select * from persons;
insert into persons (p_id, last_name) values (1, 'lasName2');
insert into persons (p_id, last_name) values (2, 'lasName');


 
 