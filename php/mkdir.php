<?php 
if (!file_exists('../test'))
{
 mkdir ("../test"); 
 echo '创建文件夹test成功';
} else {
  echo '需创建的文件夹test已经存在';
}
?>