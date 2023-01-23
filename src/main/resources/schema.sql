DROP TABLE IF EXISTS task;

CREATE TABLE task (
     id int NOT NULL AUTO_INCREMENT,
     description VARCHAR(250) DEFAULT NULL,
     priority long
);