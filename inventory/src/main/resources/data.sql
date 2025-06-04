insert into category (name, parent_id, active) values ('Moveis', null, true);
insert into category (name, parent_id, active) values ('Cadeira', 1, true);
insert into category (name, parent_id, active) values ('Serviço de montagem', null, true);

insert into product (name, type, category_id, price, active) values ('Cadeira de madeira', 'PHYSICAL', 2, 18.99, true);
insert into product (name, type, category_id, price, active) values ('Mesa com tampo de vidro', 'PHYSICAL', 2, 129.99, true);
insert into product (name, type, category_id, price, active) values ('Montagem de móveis', 'SERVICE', 3, 70.0, true);

insert into stock_movement (product_id, type, unit_type, quantity, cost, occurred_at) values (1, 'IN', 'UNITS', 15, 16.99, current_timestamp());

