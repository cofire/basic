-- INNER JOIN（内连接,或等值连接）：获取两个表中字段匹配关系的记录。
-- LEFT JOIN（左连接）：获取左表所有记录，即使右表没有对应匹配的记录。
-- RIGHT JOIN（右连接）： 与 LEFT JOIN 相反，用于获取右表所有记录，即使左表没有对应匹配的记录。

select * from student INNER JOIN grade on student.ID=grade.ID;

select * from student LEFT JOIN grade on student.ID=grade.ID;

select * from student RIGHT JOIN grade on student.ID=grade.ID;

