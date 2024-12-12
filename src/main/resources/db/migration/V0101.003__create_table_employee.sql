create table employee(
    id                   bigint  primary key generated always as identity,
    first_name           varchar not null,
    last_name            varchar not null,
    passport_no          varchar unique not null,
    university_education varchar,
    birth_date           date    not null,
    bank_account         varchar unique not null,
    mentor_id            bigint  references employee(id),
    position_id          bigint  references position(id),
    department_id        bigint  references department(id)
);
