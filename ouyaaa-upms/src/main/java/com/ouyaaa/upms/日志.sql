/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/9/1 15:54:13                            */
/*==============================================================*/


drop table if exists sys_log;

/*==============================================================*/
/* Table: sys_log                                               */
/*==============================================================*/
create table sys_log
(
   log_id               integer not null,
   log_type             varchar(50),
   log_title            varchar(50),
   create_user          varchar(50),
   create_time          date,
   update_time          date,
   service_id           varchar(50),
   remote_address       varchar(50),
   user_agent           varchar(50),
   request_uri          varchar(50),
   request_method       varchar(50),
   request_params       varchar(50),
   exc_time             double,
   del_flag             varchar(50),
   request_exception    varchar(50),
   primary key (log_id)
);

