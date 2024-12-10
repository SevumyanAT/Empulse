create table paid_salary(
id bigint primary key generated always as identity,
employee_id bigint references employee(id),
payment_date date not null,
bank_account varchar references employee(bank_account)
);