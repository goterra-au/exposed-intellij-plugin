DROP TABLE IF EXISTS LONG_TYPES;
DROP TABLE IF EXISTS MISC_TYPES;
DROP TABLE IF EXISTS CHAR_TYPES;
DROP TABLE IF EXISTS FLOATING_POINT_TYPES;
DROP TABLE IF EXISTS INTEGER_TYPES;
DROP TABLE IF EXISTS DECIMAL_TYPES;
DROP TABLE IF EXISTS SMALL_INT_TYPES;
DROP TABLE IF EXISTS DATETIME_TYPES;

CREATE TABLE LONG_TYPES(
    "L1" BIGSERIAL NOT NULL,
    "L2" BIGINT NOT NULL
);
CREATE TABLE MISC_TYPES(
    "M1" BOOLEAN NOT NULL,
    "M2" BYTEA NOT NULL,
    "M3" UUID NOT NULL
);
CREATE TABLE CHAR_TYPES(
    "C1" CHARACTER(5) NOT NULL,
    "C2" CHAR NOT NULL,
    "C3" CHARACTER VARYING NOT NULL,
    "C4" VARCHAR(5) NOT NULL,
    "C5" TEXT NOT NULL
);
CREATE TABLE FLOATING_POINT_TYPES(
    "F1" DOUBLE PRECISION NOT NULL,
    "F2" FLOAT8 NOT NULL,
    "F3" REAL NOT NULL,
    "F4" FLOAT4 NOT NULL
);
CREATE TABLE INTEGER_TYPES(
    "I1" SERIAL NOT NULL,
    "I2" INTEGER NOT NULL,
    "I3" INT NOT NULL,
    "I4" INT4 NOT NULL
);
CREATE TABLE DECIMAL_TYPES(
    "D1" NUMERIC NOT NULL,
    "D2" NUMERIC(4) NOT NULL,
    "D3" NUMERIC(5, 2) NOT NULL,
    "D4" DECIMAL NOT NULL,
    "D5" DECIMAL(6) NOT NULL,
    "D6" DECIMAL(7, 3) NOT NULL
);
CREATE TABLE SMALL_INT_TYPES(
    "S1" SMALLINT NOT NULL,
    "S2" INT2 NOT NULL
);

CREATE TABLE DATETIME_TYPES(
    D1 TIMESTAMP NOT NULL,
    D2 DATE NOT NULL
);