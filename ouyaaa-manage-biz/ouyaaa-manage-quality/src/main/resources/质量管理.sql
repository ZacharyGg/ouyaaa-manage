/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/9/4 10:23:53                            */
/*==============================================================*/


drop table if exists quality_checkpoint_item;

drop table if exists quality_checkpoint_result;

drop table if exists quality_checkpoint_result_overview;

drop table if exists quality_regulation_item;

drop table if exists quality_unqualified_reason;

/*==============================================================*/
/* Table: quality_checkpoint_item                               */
/*==============================================================*/
create table quality_checkpoint_item
(
   item_id              int not null auto_increment,
   item_code            varchar(50) not null,
   item_name            varchar(50),
   item_part            varchar(50),
   item_content         varchar(50),
   item_standart        varchar(50),
   item_cycle           int,
   cycle_unit           int,
   regu_code            varchar(50),
   x_axis               double,
   y_axis               double,
   z_axis               double,
   d_code               varchar(50),
   status_code          int,
   update_by            varchar(50),
   update_time          longblob,
   primary key (item_id)
);

/*==============================================================*/
/* Table: quality_checkpoint_result                             */
/*==============================================================*/
create table quality_checkpoint_result
(
   result_id            int not null auto_increment,
   result_name          varchar(50),
   check_id             int,
   item_id              int,
   unqua_id             int,
   is_qualified         int,
   status_code          int,
   update_by            varchar(50),
   update_time          date,
   create_time          date,
   primary key (result_id)
);

/*==============================================================*/
/* Table: quality_checkpoint_result_overview                    */
/*==============================================================*/
create table quality_checkpoint_result_overview
(
   overview_id          int not null auto_increment,
   check_code           varchar(50) not null,
   regu_code            varchar(50),
   machine_code         varchar(50),
   work_code            varchar(50),
   check_date           date,
   check_team           int,
   check_shift          int,
   check_by             varchar(50),
   check_time           datetime,
   qualified_count      int,
   unqualified_count    int,
   status_code          int,
   update_by            varchar(50),
   update_time          datetime,
   primary key (overview_id)
);

/*==============================================================*/
/* Table: quality_regulation_item                               */
/*==============================================================*/
create table quality_regulation_item
(
   regu_id              int not null auto_increment,
   regu_type            varchar(50),
   regu_code            varchar(50),
   regu_name            varchar(50),
   regu_cycle           int,
   cycle_unit           int,
   regu_version         varchar(50),
   status_code          varchar(50),
   machine_code         varchar(50),
   machine_type         varchar(50),
   update_by            varchar(50),
   update_time          datetime,
   create_time          datetime,
   primary key (regu_id)
);

/*==============================================================*/
/* Table: quality_unqualified_reason                            */
/*==============================================================*/
create table quality_unqualified_reason
(
   unqua_id             int not null auto_increment,
   unqua_code           varchar(50),
   unqua_name           varchar(50),
   item_id              int,
   resolvent_code       varchar(50),
   experience_code      varchar(50),
   status_code          int,
   update_by            varchar(50),
   update_time          datetime,
   primary key (unqua_id)
);

