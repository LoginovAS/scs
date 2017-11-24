CREATE database scsdb;

CREATE TABLE teachers (
  t_id serial,
  t_name VARCHAR(255) NOT NULL,
  PRIMARY KEY (t_id)
) engine=InnoDB;

CREATE TABLE groups (
  g_id serial,
  g_name VARCHAR(10),
  PRIMARY KEY (g_id)
) engine=InnoDB;

CREATE TABLE students (
  s_id serial,
  s_name VARCHAR(255) NOT NULL,
  g_id BIGINT UNSIGNED NOT NULL ,
  PRIMARY KEY (s_id)
) engine=InnoDB;

CREATE INDEX IND_ST_G_ID ON students(g_id);

ALTER TABLE students ADD CONSTRAINT ST_G_ID_FK FOREIGN KEY (g_id)
  REFERENCES groups(g_id);

 CREATE CONSTRAINT FOREIGN KEY ON (g_id)
    REFERENCES groups(g_id)
      ON UPDATE CASCADE
      ON DELETE CASCADE;