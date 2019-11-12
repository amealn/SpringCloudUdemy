INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('andres','$2a$10$F/yoycnWzulpVMQxi3OL1OhLgzq11gGbqh2B0FtGGgsrkMDijDptK',1, 'Andres', 'Guzman', 'profesor@bolsadeideas.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$CYi7RjQXQKcT1jmeMP4jVOV1ZQT5HIFayRtlwcOgskgm/jtrYrfty',1, 'John', 'Doe', 'john.doe@bolsadeideas.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);