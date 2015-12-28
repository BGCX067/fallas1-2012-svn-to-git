<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Sistema para la detecci&oacuten de lavado de dinero</title>
<link href="styles/ibstyles.css" rel="stylesheet" type="text/css" />
<link href="images/logo.gif" rel="shortcut icon" />
<script type="text/javascript" src="scripts/vwd_curvycorners.js"></script>
<script type="text/javascript" src="scripts/capply.js"></script>
<!--[if lt IE 7]>
<style type="text/css">
.px_fix{
	left:1px;
	bottom:-3px;
}
</style>
<![endif]-->
</head>
<body>
	
	<div id="main_cnr">
		<div id="in_cnr" class="services">
			<div id="header_cnr">
				<div id="navigation_cnr" class="cbox">
					<img src="images/px_fix.gif" class="px_fix" />
					<ul>
						<li><a href="index.html" >Inicio</a></li>
          <li><a href="conceptos.html">Conceptualizaci&oacuten</a></li>
          <li><a href="evaluacion.html" class="active">Evaluaci&oacuten de riesgo</a></li>
          <li><a href="tp.html">Trabajo Pr&aacutectico</a></li>
					</ul>
					<img src="images/logo.gif" id="logo" />
				</div>
				<!--navigation_cnr-->
			</div>
			<!--header_cnr-->
			<div id="body_cnr">
				<div id="banner_cnr" class="cbox">
					<h1>Resultado</h1>
				
				<!--banner_cnr-->
				<div id="srv_cnr">
					<div id="srv_lft">
						<div id="c_form">
							<form action="RespuestasAction">

<br><br><br>
								<h3>Calificaci&oacuten</h3>


								<div class="field">
<h4>
									<% String resultado=(String) session.getAttribute("resultado");  %>
<%=resultado%></h4>
</div>
<div class="field">
<h3>Significado</h3>
<br>
<ul>
  <b>ALTO:</b> significa que la actividad del cliente o posible cliente puede generar problemas al banco relacionados con el lavado de dinero.<br/><br/>
  <b>MEDIO:</b> si bien hay cierto riesgo debido a la actividad del cliente o posible cliente, con la documentaci&oacuten que presenta es posible demostrar que las operaciones son aut&eacutenticas.<br/><br/>
  <b>BAJO:</b> la actividad del cliente o posible cliente y la documentaci&oacuten que present&oacute no implica un riesgo para el banco y la pol&iacutetica del lavado de dinero.
</ul>



</div>

<div class="field">
<h3>Pasos a seguir si el riesgo es ALTO</h3>
Primero, se bloquea la cuenta para impedir que ingresen m&aacutes dep&oacutesitos con ese nivel de riesgo.  Se insiste en que presente la documentaci&oacuten respaldatoria. Esto se debe a que desde el momento en que se detecta el caso hasta que efectivamente se denuncia, el banco es responsable. Si no se consigue la documentaci&oacuten que pueda demostrar fehacientemente que es legal, se denuncia ante la UIF.<br> Posteriormente, la UIF decide si estudiar&aacute o no el caso.
De todas formas, esto solo se realiza en caso extremo, dado que la persona que ser&iacutea denunciada es un cliente del banco. Asimismo, el banco advierte que si no se presenta la documentaci&oacuten ser&aacute necesario hacer la denuncia.


</div>
   <div class="field">
								    <br>
								    <br><br><br><br></br>
								    </div>
   
							</form>
						</div></div>
						
						 <!--body_cnr-->
 

    
    <div id="footer_cnr" class="cbox">
      <div class="fl"> 16/07/2012 FIUBA </div>
      <!--.fl-->
      <div class="fr">75.67 Sistemas aut. de diag. y detecci&oacuten de fallas I</div>
      <!--.fr-->
    </div>
    <!--footer_cnr-->
  </div>
  <!--in_cnr-->
</div>
<!--main_cnr-->
</body>
</html>
