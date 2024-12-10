create table working_hours(
id bigint primary key generated always as identity,
employee_id bigint references employee(id),
working_hours int not null
);