create table if not exists author
(
    id         serial primary key,
    first_name varchar(100) not null,
    last_name  varchar(100) not null
);