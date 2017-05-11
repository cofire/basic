-- 查看数据库
show databases;

-- 创建数据库
create database site;

-- 删除数据库
drop database site;

-- 设置数据库格式
set character_set_database=utf8;

-- 查看数据库编码格式
show variables like 'character_set_database';

-- 选定数据库

use site;

-- 查看表
show tables;

-- 删除表
drop table 

-- 修改表的属性modify或change

ALTER TABLE testalter_tbl MODIFY c CHAR(10);

-- 添加一列或删除一列 add/drop
ALTER TABLE testalter_tbl ADD i INT;