-- SELECT field1, field2,...fieldN FROM table_name1, table_name2...[WHERE condition1 [AND [OR]] condition2.....

-- 比较语句的关键字
-- BINARY、binary(区分大小写比较)
-- limit 查询数据的行数
-- mysql> SELECT * FROM table LIMIT 5,10;  // 检索记录行 6-15

-- //为了检索从某一个偏移量到记录集的结束所有的记录行，可以指定第二个参数为 -1： 
mysql> SELECT * FROM table LIMIT 95,-1; // 检索记录行 96-last.

-- //如果只给定一个参数，它表示返回最大的记录行数目： 
mysql> SELECT * FROM table LIMIT 5;     //检索前 5 个记录行

-- //换句话说，LIMIT n 等价于 LIMIT 0,n