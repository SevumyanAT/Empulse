create table department(
id bigint primary key generated always as identity,
department_location varchar not null
)