CREATE TABLE MARCA  (ID INT, NOME VARCHAR(20), OPTLOCK INT )
CREATE TABLE MODELO (ID INT, MARCA_ID INT, NOME VARCHAR(20), OPTLOCK INT )
CREATE TABLE TICKET (ID INT, MODELO_ID INT, PLACA VARCHAR(20), OPTLOCK INT )