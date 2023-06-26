drop schema if exists projektas;

create schema projektas;

use projektas;


CREATE TABLE `projektai` (
    `nr` integer NOT NULL,
    `pavadinimas` varchar(60),
    `svarba` varchar(60) DEFAULT 'Vidutinė',
    `pradzia` date,
    `trukme` integer
);

CREATE TABLE `vykdymas` (
    `projektas` integer NOT NULL,
    `vykdytojas` integer NOT NULL,
    `statusas` varchar(60) default 'Programuotojas',
    `valandos` SMALLINT default 1
);


CREATE TABLE `vykdytojai` (
    `nr` integer NOT NULL,
    `pavarde` varchar(60),
    `kvalifikacija` varchar(60) DEFAULT 'Informatikas',
    `kategorija` SMALLINT,
    `issilavinimas` varchar(60)
);


insert into `projektai` (`nr`, `pavadinimas`, `svarba`, `pradzia`, `trukme`) values
(1, 'Studentų apskaita', 'Aukšta', '2015-01-01', 12),
(2, 'Buhalterinė apskaita', 'Vidutinė', '2005-03-01', 10),
(3, 'WWW svetainė', 'Ypatinga', '2005-06-01', 2);


insert into `vykdymas` (`projektas`, `vykdytojas`, `Statusas`, `Valandos`) values
(1, 1, 'Programuotojas', 30),
(1, 2, 'Dokumentuotojas', 100),
(1, 3, 'Testuotojas', 100),
(1, 4, 'Vadovas', 100),
(2, 1, 'Programuotojas', 300),
(2, 2, 'Analitikas', 250),
(2, 34, 'Vadovas', 100),
(3, 1, 'Programuotojas', 250),
(3, 2, 'Vadovas', 400),
(3, 3, 'Dizaineris', 150);

insert into `vykdytojai` (`nr`, `pavarde`, `kvalifikacija`, `kategorija`, `issilavinimas`) values
(1, 'Jonaitis', 'Informatikas', 2, 'VU'),
(2, 'Petraitis', 'Statistikas', 3, 'VU'),
(3, 'Gražulytė', 'Inžinierius', 1, null),
(4, 'Onaitytė', 'Vadybininkas', 5, 'VDU'),
(5, 'Antanaitis', 'Informatikas', 3, 'VU');


ALTER TABLE `projektai`
    ADD CONSTRAINT `projektai_pkey` PRIMARY KEY (`nr`);


ALTER TABLE `vykdymas`
    ADD CONSTRAINT `vykdymas_pkey` PRIMARY KEY (`projektas`, `vykdytojas`);

ALTER TABLE `vykdytojai`
    ADD CONSTRAINT `vykdytojai_pkey` PRIMARY KEY (`nr`);