-- 使用 SELECT ... INTO OUTFILE 语句导出数据
mysql> SELECT * FROM runoob_tbl 
    -> INTO OUTFILE '/tmp/tutorials.txt';