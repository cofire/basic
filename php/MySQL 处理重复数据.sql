-- 防止表中出现重复数据
-- 设置指定的字段为 PRIMARY KEY（主键） 或者 UNIQUE（唯一） 索引来保证数据的唯一性.

-- 统计重复数据
-- 确定哪一列包含的值可能会重复。
-- 在列选择列表使用COUNT(*)列出的那些列。
-- 在GROUP BY子句中列出的列。
-- HAVING子句设置重复数大于1。

SELECT COUNT(*) as repetitions, last_name, first_name
FROM person_tbl
GROUP BY last_name, first_name
HAVING repetitions > 1;

-- 过滤重复数据
-- 读取不重复的数据可以在 SELECT 语句中使用 DISTINCT 关键字来过滤重复数据。
SELECT DISTINCT last_name, first_name FROM person_tbl;

SELECT last_name, first_name
FROM person_tbl
GROUP BY (last_name, first_name);

 -- 删除重复数据

 mysql> CREATE TABLE tmp SELECT last_name, first_name, sex
 ->                  FROM person_tbl;
 ->                  GROUP BY (last_name, first_name, sex);
 mysql> DROP TABLE person_tbl;
 mysql> ALTER TABLE tmp RENAME TO person_tbl;

-- 在数据表中添加 INDEX（索引） 和 PRIMAY KEY（主键）这种简单的方法来删除表中的重复记录
mysql> ALTER IGNORE TABLE person_tbl
-> ADD PRIMARY KEY (last_name, first_name);