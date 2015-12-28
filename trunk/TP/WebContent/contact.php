<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>iBusiness</title>
<link href="styles/ibstyles.css" rel="stylesheet" type="text/css" />
<link href="images/logo.gif" rel="shortcut icon" />
<script type="text/javascript" src="scripts/vwd_curvycorners.js"></script>
<script type="text/javascript" src="scripts/capply.js"></script>
<script type="text/javascript" src="scripts/contact_check.js"></script>
<!--[if lt IE 7]>
<style type="text/css">
.px_fix{
	left:0px;
	bottom:-3px;
}
</style>
<![endif]-->
</head>
<body>
<div id="main_cnr">
  <div id="in_cnr" class="contact">
    <div id="header_cnr">
      <div id="navigation_cnr" class="cbox">
      <img src="images/px_fix.gif" class="px_fix" />
        <ul>
          <li><a href="index.html">Home</a></li>
          <li><a href="services.html">Services</a></li>
          <li><a href="about.html">About</a></li>
          <li><a href="#">Clients</a></li>
          <li><a href="#">Download</a></li>
          <li><a href="#">News</a></li>
          <li class="last"><a href="contact.php" class="active">Contact</a></li>
        </ul>
        <img src="images/logo.gif" id="logo" /> </div>
      <!--navigation_cnr-->
    </div>
    <!--header_cnr-->
    <div id="body_cnr">
      <div id="banner_cnr" class="cbox">
      <img src="images/px_fix.gif" class="px_fix" />
        <div id="b_lft">
        	<div id="c_form">
          <form action="contact_send.php" name="contact">
            <div class="field">Name* :<br />
              <input type="text" name="name"/>
            </div>
            <!--field-->
            <div class="field"> Email* :<br />
              <input type="text" name="email"/>
            </div>
            <!--field-->
            <div class="field"> Your Business* :<br />
              <input type="text" name="buss"/>
            </div>
            <!--field-->
            <div class="field">Message* :<br />
              <textarea cols="50" rows="7" name="message"></textarea>
            </div>
            <!--field--></form>
            <a href="#" id="submit" class="more" onclick="return contact_validation();">Send</a>
            <!--submit-->          
        </div>
        </div>
        <!--b_lft-->
        <div id="b_rgt"> <img src="images/cname.gif" />
          <h1>Contact Us</h1>
          <p>Morbi pellentesque varius dolor. Curabitur placerat diam ac ante.<br />
          <br />1773 Our Street Number 6<br />
City, State, 335566<br /><br />
Phone: 888.456.2323
          </p>
        </div>
        <!--b_rgt-->
      </div>
      <!--banner_cnr-->
    </div>
    <!--body_cnr-->
    <br />
    <div id="footer_cnr" class="cbox">
      <div class="fl">&copy; 2009 All Rights Reserved | <a href="#">Privacy Policy</a></div>
      <!--.fl-->
      <div class="fr"><a href="#">Contact Us</a></div>
      <!--.fr-->
    </div>
    <!--footer_cnr-->
  </div>
  <!--in_cnr-->
</div>
<!--main_cnr-->
</body>
</html>
