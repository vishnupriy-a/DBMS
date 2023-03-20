use insurance;
-- create table person(driver_id varchar(50) primary key,Name varchar(50),address varchar(50));
-- create table car(lisence varchar(50) primary key,Model varchar(50),year int(50));
-- create table accident(report_no varchar(50) primary key,DATE date,location varchar(50));
-- create table owns(driver_id varchar(50),lisence varchar(50), primary key(driver_id,lisence));
-- create table participate(report_no varchar(50),lisence varchar(50),driver_id varchar(50),damage_amount float(40),primary key(report_no,lisence));
-- alter table participate add foreign key(driver_id)references person(driver_id);
-- alter table car rename to vehicle;
-- alter table accident change report_no report_num varchar(50);
-- alter table person add column gender varchar(50);
-- alter table accident drop column location;
alter table participate modify damage_amount float(3,2);
 