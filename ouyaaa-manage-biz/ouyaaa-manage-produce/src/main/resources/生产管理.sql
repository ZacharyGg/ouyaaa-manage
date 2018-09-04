/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/9/4 13:24:24                            */
/*==============================================================*/


drop table if exists product_calendar;

drop table if exists product_order_status;

drop table if exists product_personnel;

drop table if exists product_work_order;

/*==============================================================*/
/* Table: product_calendar                                      */
/*==============================================================*/
create table product_calendar
(
   calendar_id          int not null auto_increment,
   calendar_code        varchar(50),
   produce_date         date,
   produce_team         int,
   produce_shift        int,
   is_enable            boolean,
   update_by            varchar(50),
   update_time          datetime,
   primary key (calendar_id)
);

/*==============================================================*/
/* Table: product_order_status                                  */
/*==============================================================*/
create table product_order_status
(
   status_id            int not null auto_increment,
   status_code          varchar(50),
   status_name          varchar(50),
   is_enable            boolean,
   update_by            varchar(50),
   updae_time           datetime,
   primary key (status_id)
);

/*==============================================================*/
/* Table: product_personnel                                     */
/*==============================================================*/
create table product_personnel
(
   personnel_id         int not null auto_increment,
   machine_code         varchar(50),
   produce_date         date,
   produce_shift        int,
   personel_code        int,
   is_enable            boolean,
   update_by            varchar(50),
   update_time          datetime,
   primary key (personnel_id)
);

/*==============================================================*/
/* Table: product_work_order                                    */
/*==============================================================*/
create table product_work_order
(
   order_id             int not null auto_increment,
   order_code           varchar(50) not null,
   plan_date            date,
   start_time           datetime,
   end_time             datetime,
   produce_shift        int,
   produce_team         int,
   produce_brand        int,
   produce_value        int,
   unit_code            int,
   produce_storage      varchar(50),
   produce_machine      varchar(50),
   up_machine           varchar(50),
   down_machine         varchar(50),
   order_sort           int,
   oeder_status         int,
   create_by            varchar(50),
   create_time          datetime,
   update_by            varchar(50),
   update_time          datetime,
   primary key (order_id)
);

