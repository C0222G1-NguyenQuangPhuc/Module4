use furama_spring_boot;

insert into customer_type (customer_type_name) values ('Diamond');
insert into customer_type (customer_type_name) values ('Platinium');
insert into customer_type (customer_type_name) values ('Gold');
insert into customer_type (customer_type_name) values ('Silver');
insert into customer_type (customer_type_name) values ('Member');

insert into customer (customer_code, customer_name, customer_type_id, customer_gender, customer_birth, customer_id_card, customer_phone, customer_email, customer_address, status_delete) 
			values ('KH-0002','Nguyen Duy Trung', 1, 1, '2003-06-29', '677688844', '4732525265','duytrung@gmail.com', 'Quang Nam', 1);
insert into customer (customer_code, customer_name, customer_type_id, customer_gender, customer_birth, customer_id_card, customer_phone, customer_email, customer_address, status_delete) 
			values ('KH-0003','Nguyen Thien Duy', 1, 1, '1995-11-30', '634688334', '75477822','thienduy@gmail.com', 'Quang Nam', 1);
