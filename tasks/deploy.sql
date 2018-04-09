Drop table if exists trips;
Drop table if exists cities;
Create Table cities (
name varchar Primary key
);

Create Table trips(
ID serial primary key,
number varchar, 
city_from varchar references cities(name),
city_to varchar,
departure_date timestamp,
foreign key(city_to)references cities(name)
);

create Table stops(
arrive_date timestamp,
tripID integer references trips(ID),
city varchar references cities(name)
); 




insert into cities values('msk');
insert into cities values('omsk');
--insert into trips values(,'A-1','msk','omsk','2018-04-01 21:00:00');
insert into trips(number,city_from,city_to,departure_date)
values('A-1','msk','omsk','2018-04-01 21:00:00');