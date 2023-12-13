delete from Cars cascade;
delete from Drivers cascade;
delete from Requests cascade;
delete from Trips cascade;
delete from Users cascade;
delete from Role cascade;
insert into Role(id, role_name) values ('1', 'USER');
insert into Role(id, role_name) values ('2', 'ADMIN');

drop sequence USERS_SEQ if exists;
CREATE SEQUENCE USERS_SEQ START WITH 1 INCREMENT BY 50;