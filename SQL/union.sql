-- SELECT expression1, expression2, ... expression_n
-- FROM tables
-- [WHERE conditions]
-- UNION [ALL | DISTINCT]
-- SELECT expression1, expression2, ... expression_n
-- FROM tables
-- [WHERE conditions];

--无重复值 
select stuID from student
UNION
select stuID from grade;
-- 有重复值
select stuID from student
UNION ALL
select stuID from grade;