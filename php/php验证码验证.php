<?php 
if(strcasecmp($_POST['code'],$_SESSION['code'])==0){
    echo 'ok';
}else{
    echo 'no';
}
?>