insert into dominio(id, nome) values (1, 'Banco de Dados');
insert into dominio(id, nome) values (1, 'LDAP');

insert into usuario(id, nome, login, senha, dominio_id, ultimo_acesso) values (1, 'Cal Lightman', 'cal', '123', 1, sysdate());
insert into usuario(id, nome, login, senha, dominio_id, ultimo_acesso) values (2, 'Gillian Foster', 'gillian', '123', 1, sysdate());
insert into usuario(id, nome, login, senha, dominio_id, ultimo_acesso) values (3, 'Ria Torres', 'ria', '123', 1, sysdate());
insert into usuario(id, nome, login, senha, dominio_id, ultimo_acesso) values (4, 'Eli Locker', 'eli', '123', 1, sysdate());
insert into usuario(id, nome, login, senha, dominio_id, ultimo_acesso) values (5, 'Emily Lightman', 'emily', '123', 1, sysdate());
