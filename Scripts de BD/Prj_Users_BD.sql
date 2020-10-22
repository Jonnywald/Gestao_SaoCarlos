CREATE TABLE Users (
	login VARCHAR(20) PRIMARY KEY,
	nome VARCHAR(50),
	senha VARCHAR(20),
	adm BOOLEAN
	
);

INSERT INTO Users (login, nome, senha, adm) VALUES ("admin", "admin", "admin", true);