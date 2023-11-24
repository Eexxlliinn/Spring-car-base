drop table Cars if exists cascade;
drop table Drivers if exists cascade;
drop table Trips if exists cascade;
drop table Requests if exists cascade;
drop table Users if exists cascade;
drop table Roles if exists cascade;
create table Cars (
    id identity primary key,
    car_number varchar(50) not null,
    model varchar(50) not null,
    capacity varchar(50) not null
);
create table Drivers (
    id identity primary key,
    full_name varchar(50) not null,
    age varchar(50) not null,
    license_number varchar(50) not null,
    category varchar(50) not null,
    phone_number varchar(50) not null,
    car_id bigint not null,
    request_id bigint,
    user_id bigint not null
);