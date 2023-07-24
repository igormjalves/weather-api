-- SCRIPTS PARA CRIACAO DA TABELA








-- CRIACAO DA SEQUENCIA PARA GERACAO DOS IDs

CREATE SEQUENCE weather_seq;

SELECT * FROM information_schema.sequences WHERE sequence_name = 'weather_seq';

ALTER TABLE weather ALTER COLUMN id SET DEFAULT nextval('weather_seq');

ALTER TABLE weather
	ALTER COLUMN country TYPE character varying,
	ALTER COLUMN weather_status TYPE character varying,
	ALTER COLUMN description TYPE character varying;