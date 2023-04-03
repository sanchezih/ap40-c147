USE blog;
-- -----------------------------------------------------------------------------
INSERT INTO PUBLICACION (titulo, cuerpo) VALUES ('Herramientas No Code', 'El movimiento No Code esta impulsado por la creciente demanda...');
INSERT INTO PUBLICACION (titulo, cuerpo) VALUES ('Qué es ChatGPT', 'ChatGPT es un modelo de lenguaje de gran escala...');
INSERT INTO PUBLICACION (titulo, cuerpo) VALUES ('Para que sirve un servidor VPS?', 'Cuando se trata de planificar un buen contexto para...');
-- -----------------------------------------------------------------------------
INSERT INTO COMENTARIO (nombre, cuerpo, cd_publicacion) VALUES ('Fernanda', 'Buen articulo!', 1);
INSERT INTO COMENTARIO (nombre, cuerpo, cd_publicacion) VALUES ('Nicolas', 'Gracias', 1);
INSERT INTO COMENTARIO (nombre, cuerpo, cd_publicacion) VALUES ('RobertoXXX', 'Muy buenoXXX', 2);