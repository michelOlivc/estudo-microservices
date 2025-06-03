insert into department (name, description) values ('Comercial', 'Responsável pelo relacionamento com os clientes.');
insert into department (name, description) values ('Recursos Humanos', 'Responsável pela gestão e desenvolvimento dos colaboradores.');
insert into department (name, description) values ('Financeiro', 'Responsável pelo gerenciamento e controle das finanças da empresa.');

insert into position (name, description, department_id) values ('Vendedor', 'É o contato do cliente com a empresa.', 1);
insert into position (name, description, department_id) values ('Analista Financeiro', 'É quem movimenta os recursos financeiros da empresa conforme necessário.', 3);
insert into position (name, description, department_id) values ('Gerente Comercial', 'Gerencia uma equipe de vendas.', 1);
insert into position (name, description, department_id) values ('Recrutador', 'É responsável pelo recrutamento e comunicados internos', 2);