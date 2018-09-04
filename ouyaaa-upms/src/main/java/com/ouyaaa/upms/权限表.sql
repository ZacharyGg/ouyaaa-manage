/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/8/30 16:23:12                           */
/*==============================================================*/


drop table if exists sys_dept;

drop table if exists sys_dept_relation;

drop table if exists sys_menu;

drop table if exists sys_role;

drop table if exists sys_role_dept;

drop table if exists sys_role_menu;

drop table if exists sys_user;

drop table if exists sys_user_role;

/*==============================================================*/
/* Table: sys_dept                                              */
/*==============================================================*/
create table sys_dept
(
   dept_id              integer not null,
   dept_name            varchar(50),
   dept_desc            varchar(50),
   order_num            char(10),
   parent_id            integer,
   del_flag             boolean,
   create_time          date,
   update_time          date,
   primary key (dept_id)
);

/*==============================================================*/
/* Table: sys_dept_relation                                     */
/*==============================================================*/
create table sys_dept_relation
(
   ancestor_id          integer not null,
   descendant_id        integer,
   primary key (ancestor_id)
);

/*==============================================================*/
/* Table: sys_menu                                              */
/*==============================================================*/
create table sys_menu
(
   menu_id              integer not null,
   mune_name            varchar(50),
   mune_desc            varchar(50),
   parent_id            integer,
   menu_type            varchar(50),
   menu_permission      varchar(50),
   menu_icon            varchar(50),
   menu_sort            integer,
   menu_component       varchar(50),
   menu_path            varchar(50),
   del_flag             boolean,
   create_time          date,
   update_time          date,
   primary key (menu_id)
);

/*==============================================================*/
/* Table: sys_role                                              */
/*==============================================================*/
create table sys_role
(
   role_id              integer not null,
   role_code            varchar(50),
   role_name            varchar(50),
   role_desc            varchar(50),
   create_time          date,
   update_time          date,
   del_flag             boolean,
   primary key (role_id)
);

/*==============================================================*/
/* Table: sys_role_dept                                         */
/*==============================================================*/
create table sys_role_dept
(
   role_id              integer,
   dept_id              integer
);

/*==============================================================*/
/* Table: sys_role_menu                                         */
/*==============================================================*/
create table sys_role_menu
(
   role_id              integer,
   menu_id              integer
);

/*==============================================================*/
/* Table: sys_user                                              */
/*==============================================================*/
create table sys_user
(
   user_id              integer not null,
   user_name            varchar(50),
   user_pwd             varchar(50),
   user_salt            varchar(50),
   user_phone           varchar(50),
   user_avatar          varchar(50),
   del_flag             boolean,
   create_time          date,
   update_time          date,
   primary key (user_id)
);

/*==============================================================*/
/* Table: sys_user_role                                         */
/*==============================================================*/
create table sys_user_role
(
   user_id              integer,
   role_id              integer
);

alter table sys_role_dept add constraint FK_Reference_5 foreign key (role_id)
      references sys_role (role_id) on delete restrict on update restrict;

alter table sys_role_dept add constraint FK_Reference_6 foreign key (dept_id)
      references sys_dept (dept_id) on delete restrict on update restrict;

alter table sys_role_menu add constraint FK_Reference_3 foreign key (role_id)
      references sys_role (role_id) on delete restrict on update restrict;

alter table sys_role_menu add constraint FK_Reference_4 foreign key (menu_id)
      references sys_menu (menu_id) on delete restrict on update restrict;

alter table sys_user_role add constraint FK_Reference_7 foreign key (user_id)
      references sys_user (user_id) on delete restrict on update restrict;

alter table sys_user_role add constraint FK_Reference_8 foreign key (role_id)
      references sys_role (role_id) on delete restrict on update restrict;

