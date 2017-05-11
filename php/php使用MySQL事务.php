<?php 
if(!mysqli_query($conn, "insert into runoob_transaction_test (id) values(8)"))
{
  mysqli_query($conn, "ROLLBACK");     // 判断当执行失败时回滚
}
if(!mysqli_query($conn, "insert into runoob_transaction_test (id) values(9)"))
{
  mysqli_query($conn, "ROLLBACK");      // 判断执行失败时回滚
}
?>