/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/9/4 13:19:27                            */
/*==============================================================*/


drop index Index_parent_code on basis_component;

drop index Index_code on basis_component;

drop table if exists basis_component;

drop index Index_code on basis_machine;

drop table if exists basis_machine;

drop table if exists basis_machine_component;

drop index Index_code on basis_machine_type;

drop table if exists basis_machine_type;

drop index Index_code on basis_shift;

drop table if exists basis_shift;

drop table if exists basis_shift_team;

drop index Index_code on basis_team;

drop table if exists basis_team;

/*==============================================================*/
/* Table: basis_component                                       */
/*==============================================================*/
create table basis_component
(
   component_id         integer not null auto_increment,
   parent_code          varchar(50),
   component_code       varchar(50),
   component_name       varchar(50),
   component_privoder   varchar(50),
   component_price      double,
   arrival_time         date,
   update_time          date,
   update_by            varchar(50),
   primary key (component_id)
);

/*==============================================================*/
/* Index: Index_code                                            */
/*==============================================================*/
create unique index Index_code on basis_component
(
   component_code
);

/*==============================================================*/
/* Index: Index_parent_code                                     */
/*==============================================================*/
create unique index Index_parent_code on basis_component
(
   parent_code
);

/*==============================================================*/
/* Table: basis_machine                                         */
/*==============================================================*/
create table basis_machine
(
   machine_id           integer not null auto_increment,
   machine_code         varchar(50),
   machine_name         varchar(50),
   machine_privoder     varchar(50),
   machine_price        double,
   type_id              integer,
   arrival_time         datetime,
   update_time          datetime,
   update_by            varchar(50),
   primary key (machine_id)
);

/*==============================================================*/
/* Index: Index_code                                            */
/*==============================================================*/
create unique index Index_code on basis_machine
(
   machine_code
);

/*==============================================================*/
/* Table: basis_machine_component                               */
/*==============================================================*/
create table basis_machine_component
(
   relation_id          integer not null auto_increment,
   machine_id           integer,
   component_id         integer,
   primary key (relation_id)
);

/*==============================================================*/
/* Table: basis_machine_type                                    */
/*==============================================================*/
create table basis_machine_type
(
   type_id              integer not null auto_increment,
   type_code            varchar(50),
   type_name            varchar(50),
   update_time          datetime,
   update_by            varchar(50),
   primary key (type_id)
);

/*==============================================================*/
/* Index: Index_code                                            */
/*==============================================================*/
create unique index Index_code on basis_machine_type
(
   type_code
);

/*==============================================================*/
/* Table: basis_shift                                           */
/*==============================================================*/
create table basis_shift
(
   shift_id             integer not null auto_increment,
   shift_code           varchar(50),
   shift_name           varchar(50),
   start_time           datetime,
   end_time             datetime,
   continue_time        datetime,
   is_enable            boolean,
   update_time          datetime,
   update_by            varchar(50),
   primary key (shift_id)
);

/*==============================================================*/
/* Index: Index_code                                            */
/*==============================================================*/
create unique index Index_code on basis_shift
(
   shift_code
);

/*==============================================================*/
/* Table: basis_shift_team                                      */
/*==============================================================*/
create table basis_shift_team
(
   relation_id          integer not null auto_increment,
   shift_id             integer,
   team_id              integer,
   primary key (relation_id)
);

/*==============================================================*/
/* Table: basis_team                                            */
/*==============================================================*/
create table basis_team
(
   team_id              integer not null auto_increment,
   team_code            varchar(50),
   team_name            varchar(50),
   is_enable            boolean,
   update_time          datetime,
   update_by            varchar(50),
   primary key (team_id)
);

/*==============================================================*/
/* Index: Index_code                                            */
/*==============================================================*/
create unique index Index_code on basis_team
(
   team_code
);

