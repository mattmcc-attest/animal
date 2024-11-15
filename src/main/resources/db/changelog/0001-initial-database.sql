create type breed as enum (
    'GERMAN_SHEPHERD',
    'BICHON_FRISE',
    'PITBULL'
);

create table dog (
    id uuid not null default gen_random_uuid(),
    name text not null,
    breed breed,
    primary key (id)
);
