<?php
  header("Content-type: text/html;charset=utf-8");
  $dir = "./image/";  //要获取的目录
  echo "********** 获取目录下所有文件和文件夹 ***********<hr/>";
  //先判断指定的路径是不是一个文件夹
  if (is_dir($dir)){
    if ($dh = opendir($dir)){
      while (($file = readdir($dh))!= false){
        //文件名的全路径 包含文件名
        $filePath = $dir.$file;
        echo "<img src='".$filePath."'/>";
        echo "<br>";
      }
      closedir($dh);
    }
  }
?>

<!-- 用字符串数组的形式储存图片src -->
<?php
  header("Content-type: text/html;charset=utf-8");
  $dir = "./image/";  //要获取的目录
  echo "********** 获取目录下所有文件和文件夹 ***********<hr/>";
  //先判断指定的路径是不是一个文件夹
  if (is_dir($dir)){
    if ($dh = opendir($dir)){
      $i=0;
      while (($file = readdir($dh))!= false){
        //文件名的全路径 包含文件名
        $filePath[$i] = $dir.$file;
        echo $filePath[$i];
        echo "<br>";
        $i++;
      }
      echo $filePath[2];
      closedir($dh);
    }
  }
?>
