<?php

	 $to = "caboudreau@gmail.com";
	 $subject ="Contact Information";
	 $bussiness = $_GET['buss'];
	 $con = $_GET['message'];
	 $content = "Our Business:$bussiness <br> Message:$con";
	 $from = $_GET['email'];
	 $name = $_GET['name'];
 	 $headers = "From: $name E-mail: $from";
	 mail($to,$subject,$content,$headers); 	
	 header("Location:contact.php");
?>
