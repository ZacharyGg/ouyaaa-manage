-- 插入部门信息
insert sys_dept (dept_id,dept_name,dept_desc,order_num,parent_id,del_flag,create_time,update_time)
values (0001,'技术部','','1',0001,'0',date(now()),date(now()));
insert sys_dept (dept_id,dept_name,dept_desc,order_num,parent_id,del_flag,create_time,update_time)
values (0002,'管理部','','1',0002,'0',date(now()),date(now()));
insert sys_dept (dept_id,dept_name,dept_desc,order_num,parent_id,del_flag,create_time,update_time)
values (00011,'研发部','','1',0001,'0',date(now()),date(now()));
insert sys_dept (dept_id,dept_name,dept_desc,order_num,parent_id,del_flag,create_time,update_time)
values (00012,'测试部','','1',0001,'0',date(now()),date(now()));
insert sys_dept (dept_id,dept_name,dept_desc,order_num,parent_id,del_flag,create_time,update_time)
values (00013,'需求部','','1',0001,'0',date(now()),date(now()));
insert sys_dept (dept_id,dept_name,dept_desc,order_num,parent_id,del_flag,create_time,update_time)
values (000111,'研发部一组','','1',00011,'0',date(now()),date(now()));
insert sys_dept (dept_id,dept_name,dept_desc,order_num,parent_id,del_flag,create_time,update_time)
values (000112,'研发部二组','','1',00011,'0',date(now()),date(now()));
insert sys_dept (dept_id,dept_name,dept_desc,order_num,parent_id,del_flag,create_time,update_time)
values (000113,'研发部三组','','1',00011,'0',date(now()),date(now()));
select * from sys_dept;
-- 插入用户信息
INSERT upms.sys_user(user_name,user_pwd,user_dept,user_salt,user_phone,user_avatar,del_flag,create_time,update_time) values
('张三','123456','111','123456','137','','0',date(now()),date(now()));
INSERT upms.sys_user(user_name,user_pwd,user_dept,user_salt,user_phone,user_avatar,del_flag,create_time,update_time) values
('李四','123456','111','123456','137','','0',date(now()),date(now()));
INSERT upms.sys_user(user_name,user_pwd,user_dept,user_salt,user_phone,user_avatar,del_flag,create_time,update_time) values
('王五','123456','12','123456','137','','0',date(now()),date(now()));

-- 插入角色信息
insert upms.sys_role (role_code,role_name,role_desc,create_time,update_time,del_flag)values
('Admin','管理','',date(now()),date(now()),0);
insert upms.sys_role (role_code,role_name,role_desc,create_time,update_time,del_flag)values
('Dev','开发','',date(now()),date(now()),0);
insert upms.sys_role (role_code,role_name,role_desc,create_time,update_time,del_flag)values
('Test','测试','',date(now()),date(now()),0);
insert upms.sys_role (role_code,role_name,role_desc,create_time,update_time,del_flag)values
('Requ','需求','',date(now()),date(now()),0);

-- 插入用户角色信息
insert upms.sys_user_role (user_id,role_id) values (2,1);
insert upms.sys_user_role (user_id,role_id) values (4,2);
insert upms.sys_user_role (user_id,role_id) values (5,2);
insert upms.sys_user_role (user_id,role_id) values (6,3);
insert upms.sys_user_role (user_id,role_id) values (6,4);

-- 插入菜单信息
insert upms.sys_menu (mune_name,mune_desc,parent_id,menu_type,menu_permission,menu_icon,menu_sort,menu_component,menu_path,del_flag,create_time,update_time)values
('部门管理','',0,'','read','','','','','0',date(now()),date(now()));
insert upms.sys_menu (mune_name,mune_desc,parent_id,menu_type,menu_permission,menu_icon,menu_sort,menu_component,menu_path,del_flag,create_time,update_time)values
('用户管理','',0,'','read','','','','','0',date(now()),date(now()));
insert upms.sys_menu (mune_name,mune_desc,parent_id,menu_type,menu_permission,menu_icon,menu_sort,menu_component,menu_path,del_flag,create_time,update_time)values
('角色管理','',0,'','read','','','','','0',date(now()),date(now()));
insert upms.sys_menu (mune_name,mune_desc,parent_id,menu_type,menu_permission,menu_icon,menu_sort,menu_component,menu_path,del_flag,create_time,update_time)values
('菜单管理','',0,'','read','','','','','0',date(now()),date(now()));

insert upms.sys_menu (menu_name,menu_desc,parent_id,menu_type,menu_permission,menu_icon,menu_sort,menu_component,menu_path,del_flag,create_time,update_time)values
('增加部门','',1,'','read','','','','','0',date(now()),date(now()));
insert upms.sys_menu (menu_name,menu_desc,parent_id,menu_type,menu_permission,menu_icon,menu_sort,menu_component,menu_path,del_flag,create_time,update_time)values
('删除部门','',1,'','read','','','','','0',date(now()),date(now()));
insert upms.sys_menu (menu_name,menu_desc,parent_id,menu_type,menu_permission,menu_icon,menu_sort,menu_component,menu_path,del_flag,create_time,update_time)values
('修改管理','',1,'','read','','','','','0',date(now()),date(now()));
insert upms.sys_menu (menu_name,menu_desc,parent_id,menu_type,menu_permission,menu_icon,menu_sort,menu_component,menu_path,del_flag,create_time,update_time)values
('查询管理','',1,'','read','','','','','0',date(now()),date(now()));

-- 插入权限菜单信息
insert upms.sys_role_menu (role_id,menu_id) values(1,1);
insert upms.sys_role_menu (role_id,menu_id) values(1,2);
insert upms.sys_role_menu (role_id,menu_id) values(1,3);
insert upms.sys_role_menu (role_id,menu_id) values(1,4);

insert upms.sys_role_menu (role_id,menu_id) values(2,1);
insert upms.sys_role_menu (role_id,menu_id) values(2,2);

insert upms.sys_role_menu (role_id,menu_id) values(3,3);

insert upms.sys_role_menu (role_id,menu_id) values(4,4);
insert upms.sys_role_menu (role_id,menu_id) values(4,3);