FROM mysql:8

COPY sakila/1-sakila-schema.sql /docker-entrypoint-initdb.d/step_1.sql
COPY sakila/2-sakila-data.sql /docker-entrypoint-initdb.d/step_2.sql
COPY sakila/3-sakila-complete.sql /docker-entrypoint-initdb.d/step_3.sql

COPY darbuotojai/1-darbuotojai-schema.sql /docker-entrypoint-initdb.d/step_4.sql

COPY projektas/1-projektas-schema.sql /docker-entrypoint-initdb.d/step_5.sql