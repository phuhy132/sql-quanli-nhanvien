<?php

$connection = mysqli_connect("localhost","root","","Exam");
    
     $name = $_POST["name"];
     $email = $_POST["email"];
     $contact = $_POST["contact"];
     $address = $_POST["address"];
     
     $sql = "INSERT INTO exam(name,email,contact,address) VALUES ('$name','$email','$contact','$address')";
     
     $result = mysqli_query($connection,$sql);
     
     if($result){
         echo "Data Inserted";
        
     }
     else{
         echo "Failed";
     }
     mysqli_close($connection);
     
          
    
    


?>