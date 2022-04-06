create table person (
id serial primary key,
first_name varchar(100) not null,
last_name varchar(100) not null,
role_id varchar(100) not null,
role_name varchar (100) not null,
username varchar (100) not null,
password varchar(100) not null );

insert into person (first_name, last_name,role_id, role_name,username, password) values ('wil','osias', 'A12B','author','dro','wildro');
insert into person (first_name, last_name,role_id, role_name,username, password) values ('peter','joias','E13N' ,'editor','pro','prodro');
insert into person (first_name, last_name,role_id, role_name,username, password) values ('johno','ole', 'E23N' ,'editor','bro','brodro');
insert into person (first_name, last_name,role_id, role_name,username, password) values ('paulo','obi', 'A45Y'  ,'author','qro','qrodro');

create table genre(
id serial primary key,
genre_id integer not null,
genre_name varchar (100) not null);

ins

