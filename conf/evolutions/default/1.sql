# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category (
  id                            bigint not null,
  name                          varchar(255),
  constraint pk_category primary key (id)
);
create sequence category_seq;

create table credit_card (
  id                            bigint not null,
  card_holder                   varchar(255),
  card_number                   bigint,
  card_expire_date              bigint,
  ccv                           bigint,
  constraint pk_credit_card primary key (id)
);
create sequence credit_card_seq;

create table product (
  id                            bigint not null,
  name                          varchar(255),
  category_id                   bigint,
  description                   varchar(255),
  stock                         integer,
  available                     varchar(255),
  reserved                      varchar(255),
  constraint pk_product primary key (id)
);
create sequence product_seq;

create table users (
  email                         varchar(255) not null,
  name                          varchar(255),
  address                       varchar(255),
  number                        varchar(255),
  password                      varchar(255),
  points                        integer,
  user_loan                     varchar(255),
  constraint pk_users primary key (email)
);

create table users_library (
  id                            bigint not null,
  user_product_id               bigint,
  user_email                    varchar(255),
  date_transaction              timestamp,
  expiring_date                 timestamp,
  extendable                    varchar(255),
  returned                      varchar(255),
  tempo                         integer,
  tempo2                        integer,
  tempo3                        integer,
  constraint pk_users_library primary key (id)
);
create sequence users_library_seq;

alter table product add constraint fk_product_category_id foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_product_category_id on product (category_id);


# --- !Downs

alter table product drop constraint if exists fk_product_category_id;
drop index if exists ix_product_category_id;

drop table if exists category;
drop sequence if exists category_seq;

drop table if exists credit_card;
drop sequence if exists credit_card_seq;

drop table if exists product;
drop sequence if exists product_seq;

drop table if exists users;

drop table if exists users_library;
drop sequence if exists users_library_seq;

