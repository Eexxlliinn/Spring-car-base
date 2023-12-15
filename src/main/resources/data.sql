delete from Cars cascade;
delete from Drivers cascade;
delete from Requests cascade;
delete from Trips cascade;
delete from Users cascade;
delete from Roles cascade;

insert into Cars(car_number, model, capacity, status) values ('3561-AH-5', 'Gruzovik', '2000', 'Available');
insert into Cars(car_number, model, capacity, status) values ('1234-OP-7', 'Legkovaya', '4500', 'Available');
insert into Cars(car_number, model, capacity, status) values ('7777-TX-1', 'Gruzovik', '3200', 'Available');
insert into Cars(car_number, model, capacity, status) values ('9502-OK-3', 'Fura', '5000', 'Available');
insert into Cars(car_number, model, capacity, status) values ('6161-EC-2', 'Tank', '7800', 'Available');
insert into Cars(car_number, model, capacity, status) values ('1641-XE-4', 'Helicopter', '1500', 'Available');




insert into Roles(id, role_name) values ('1', 'USER');
insert into Roles(id, role_name) values ('2', 'ADMIN');

drop sequence USERS_SEQ if exists;
CREATE SEQUENCE USERS_SEQ START WITH 1 INCREMENT BY 50;
drop sequence DRIVER_SEQ if exists;
CREATE SEQUENCE DRIVER_SEQ START WITH 1 INCREMENT BY 50;