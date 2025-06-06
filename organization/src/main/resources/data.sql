insert into department (name, description, last_modified_at) values
('Comercial', 'Responsável pelo relacionamento com os clientes.', current_timestamp()),
('Recursos Humanos', 'Responsável pela gestão e desenvolvimento dos colaboradores.', current_timestamp()),
('Financeiro', 'Responsável pelo gerenciamento e controle das finanças da empresa.', current_timestamp());

insert into position (name, description, department_id, last_modified_at) values
('Vendedor', 'É o contato do cliente com a empresa.', 1, current_timestamp()),
('Analista Financeiro', 'É quem movimenta os recursos financeiros da empresa conforme necessário.', 3, current_timestamp()),
('Gerente Comercial', 'Gerencia uma equipe de vendas.', 1, current_timestamp()),
('Recrutador', 'É responsável pelo recrutamento e comunicados internos', 2, current_timestamp());