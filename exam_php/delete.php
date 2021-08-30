<?php

    $connection = mysqli_connect("localhost","root","","Exam");
    
     $id = $_POST["id"];
     
     $sql = "DELETE FROM exam WHERE id='$id'";
     
     $result = mysqli_query($connection,$sql);
     
     if($result){
         echo "Data Deleted";
        
     }
     else{
         echo "Failed";
     }
     mysqli_close($connection);
     


?>