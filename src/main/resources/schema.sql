drop table Cars if exists cascade;
drop table Drivers if exists cascade;
drop table Trips if exists cascade;
drop table Requests if exists cascade;
drop table Users if exists cascade;
drop table Role if exists cascade;
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
create table Trips (
    id identity primary key,
    start_date date not null,
    end_date date not null,
    status varchar(50) not null,
    driver_id bigint
);
create table Requests (
    id identity primary key,
    description varchar(200) not null,
    request_date date not null,
    distance varchar(50) not null,
    required_capacity varchar(50) not null,
    required_type varchar(50) not null,
    status varchar(50) not null
);
create table Users (
    id identity primary key,
    login varchar(50) not null,
    password varchar(100) not null,
    role bigint not null
);
create table Role (
    id identity primary key,
    role_name varchar(50) not null
);
alter table Users add foreign key (role) references Role(id);