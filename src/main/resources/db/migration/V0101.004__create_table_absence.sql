create table absence(
    id           bigint  primary key generated always as identity,
    employee_id  bigint  references employee(id),
    absence_date date    not null,
    bank_account varchar references employee (bank_account),
    cause        varchar not null
);