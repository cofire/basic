<?php 
//检测是否登录，若已登录则转向主页  
if(isset($_SESSION['userid'])){  
    header("Location:../index.php");  //页面重定向
    exit();  
} 
?>
