-- create database vishnu;
-- use vishnu;
-- create table mca1(roll_no int,Name varchar(50),elective varchar(50),primary key(roll_no));
-- desc mca1;
-- insert into mca1 values(40,'sreyas','AI');
-- select * from mca1;
-- insert into mca1 values(41,'malu','AI');
-- insert into mca1 values(42,'vishnu','AI');
-- select * from mca1;
-- alter table mca1 add column mark float(30,2);
-- select * from mca1;
-- insert into mca1(mark)values(49);
use insurance;
-- select * from person;
select * from person where Name like'a%';
-- select * from participate;
select * from participate where dam_amt>10000;
select * from  accident where DATE between '2021-01-01' and '2027-12-31';
-- truncate table vehicle;
-- select * from vehicle;
-- select * from person;
-- select * from owns;
-- select * from participate;
-- select * from accident;
-- select * from person;
-- truncate table owns;
-- truncate table participate;
-- truncate table accident;
-- truncate table person;
-- select * from owns;
-- select * from acciden;
select vehicle.lisence,Model,year,Name,address	from vehicle,person,owns where owns.driver_id=person.driver_id and owns.lisence=vehicle.lisence;





