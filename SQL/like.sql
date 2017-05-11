-- SELECT field1, field2,...fieldN 
-- FROM table_name
-- WHERE field1 LIKE condition1 [AND [OR]] filed2 = 'somevalue'

select * from student where stuName like '李%';

-- 结果
-- | ID | stuID    | stuName |
-- +----+----------+---------+
-- |  1 | 1000090  | 李应    |
-- |  2 | 10131677 | 李应2   |
-- |  3 | 10131678 | 李应3   |
-- |  4 | 10131680 | 李应5   |
-- +----+----------+---------+

select * from student where stuName like '李_';

-- 结果
-- +----+---------+---------+
-- | ID | stuID   | stuName |
-- +----+---------+---------+
-- |  1 | 1000090 | 李应    |
-- +----+---------+---------+