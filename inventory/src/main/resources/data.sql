insert into category (name, parent_id, active, last_modified_at) values
('Moveis', null, true, current_timestamp()),
('Cadeira', 1, true, current_timestamp()),
('Serviço de montagem', null, true, current_timestamp());

insert into product (name, type, category_id, unit_type, price, active, last_modified_at) values
('Cadeira de madeira', 'PHYSICAL', 2, 'UNITS', 18.99, true, current_timestamp()),
('Mesa com tampo de vidro', 'PHYSICAL', 2, 'UNITS', 129.99, true, current_timestamp()),
('Montagem de móveis', 'SERVICE', 3, 'UNITS', 70.0, true, current_timestamp());

insert into stock_movement (product_id, type, quantity, cost, occurred_at) values
(1, 'IN', 15, 16.99, current_timestamp());

insert into stock_order_status (id, name, description, previous_status_id, next_status_id) values
(1, 'WAITING_FOR_SEPARATION', 'The product is waiting to be separated at stock.', null, 2),
(2, 'SEPARATED', 'The product is separated.', 1, 2),
(3, 'PACKED', 'The product is packed.', 2, 3),
(4, 'READY_TO_WITHDRAWAL', 'The product is ready to be withdrawn by the customer or deliverer.', 3, 4),
(5, 'WITHDRAWN', 'The last stock step. The product is in customer or deliverer possession.', 4, 5);

