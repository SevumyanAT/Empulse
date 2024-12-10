create table position(
id bigint primary key generated always as identity,
post_name varchar not null,
wage int not null
);