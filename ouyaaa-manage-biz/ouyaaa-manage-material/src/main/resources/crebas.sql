/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/9/4 11:28:17                            */
/*==============================================================*/


drop table if exists material_bom_detail;

drop table if exists material_bom_version;

drop table if exists material_brand_class;

/*==============================================================*/
/* Table: material_bom_detail                                   */
/*==============================================================*/
create table material_bom_detail
(
   materila_id          integer not null auto_increment,
   parent_code          varchar(50),
   parent_name          varchar(50),
   materila_code        varchar(50),
   materila_name        varchar(50),
   bom_id               integer,
   materila_value       varchar(50),
   materila_unit        varchar(50),
   is_enable            boolean,
   update_by            varchar(50),
   update_time          datetime,
   primary key (materila_id)
);

/*==============================================================*/
/* Table: material_bom_version                                  */
/*==============================================================*/
create table material_bom_version
(
   version_id           int not null auto_increment,
   version_code         varchar(50),
   brand                varchar(50),
   start_time           varchar(50),
   end_time             boolean,
   version_status       int,
   update_by            varchar(50),
   update_time          datetime,
   primary key (version_id)
);

/*==============================================================*/
/* Table: material_brand_class                                  */
/*==============================================================*/
create table material_brand_class
(
   material_id          int not null auto_increment,
   material_code        varchar(50) not null,
   material_name        varchar(50),
   brand_code           varchar(50),
   is_enable            boolean,
   update_by            varchar(50),
   update_time          datetime,
   primary key (material_id)
);

