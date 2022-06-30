use furama_spring_boot;

-- Thêm dữ liệu vào bảng customer_type -- 
insert into customer_type (customer_type_name) values ('Diamond');
insert into customer_type (customer_type_name) values ('Platinium');
insert into customer_type (customer_type_name) values ('Gold');
insert into customer_type (customer_type_name) values ('Silver');
insert into customer_type (customer_type_name) values ('Member');

insert into customer (customer_code, customer_name, customer_type_id, customer_gender, customer_birth, customer_id_card, customer_phone, customer_email, customer_address, status_delete) 
			values ('KH-0002','Nguyen Duy Trung', 1, 1, '2003-06-29', '677688844', '4732525265','duytrung@gmail.com', 'Quang Nam', 1);
insert into customer (customer_code, customer_name, customer_type_id, customer_gender, customer_birth, customer_id_card, customer_phone, customer_email, customer_address, status_delete) 
			values ('KH-0003','Nguyen Thien Duy', 1, 1, '1995-11-30', '634688334', '75477822','thienduy@gmail.com', 'Quang Nam', 1);

-- Thêm dữ liệu vào bảng position --
insert into `position` (position_name) values ('Lễ tân');
insert into `position` (position_name) values ('Phục vụ');
insert into `position` (position_name) values ('Chuyên viên');
insert into `position` (position_name) values ('Giám sát');
insert into `position` (position_name) values ('Quản lý');
insert into `position` (position_name) values ('Giám đốc');

-- Thêm dữ liệu vào bảng education_degree --
insert into education_degree (education_degree_name) values ('Trung cấp');
insert into education_degree (education_degree_name) values ('Cao đẳng');
insert into education_degree (education_degree_name) values ('Đại học');
insert into education_degree (education_degree_name) values ('Sau đại học');

-- Thêm dữ liệu vào bảng division --
insert into division (division_name) values ('Sale-marketing');
insert into division (division_name) values ('Hành chính');
insert into division (division_name) values ('Phục vụ');
insert into division (division_name) values ('Quản lý');

-- Thêm dữ liệu vào bảng user --
insert into `user_name` (user_name, password) values ('quangphuc@gmail.com','123123');
insert into `user_name` (user_name, password) values ('thienduy@gmail.com','123123');
insert into `user_name` (user_name, password) values ('duytrung@gmail.com','123123');
insert into `user_name` (user_name, password) values ('nhathoang@gmail.com','123123');