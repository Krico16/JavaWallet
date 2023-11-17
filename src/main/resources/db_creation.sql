drop table if exists "users";

create TYPE wallet_type as ENUM ('DEBIT','CREDIT');

create type transaction_status as ENUM ('CREATED','PROCESSING','FAILED','COMPLETED');

create table if NOT EXISTS "users"
(
    id              uuid primary key not null,
    document_number varchar(20),
    names           varchar(30),
    lastnames       varchar(60),
    email           varchar(100),
    password        varchar(100),
    is_active        bool,
    created_at      timestamp
    );

create table if not exists "wallet"
(
    wallet_id         uuid primary key not null,
    user_id           uuid,
    wallet_type       wallet_type,
    available_amount  decimal,
    restricted_amount decimal
);


create table if not exists "transaction"
(
    transaction_id uuid primary key NOT NULL,
    wallet_sender uuid,
    wallet_receiver uuid,
    amount decimal,
    status transaction_status,
    created_at timestamp
);

