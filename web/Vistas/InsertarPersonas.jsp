
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Theme Template for Bootstrap</title>

    
    <!-- Bootstrap core CSS -->
    <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap theme -->
    <link href="../bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="theme.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>
    

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Persona</title>
    </head>
    <body role="document">
        <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Personas</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
              <li><a href="../index.jsp">Inicio</a></li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Distrito Misionero<span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                  <li><a href="../Vistas/Shaday.jsp">Shaday</a></li>
                  <li><a href="../Vistas/Adonay.jsp">Adonay</a></li>
                  <li><a href="../Vistas/Shalom.jsp">Shalom</a></li>
                  <li><a href="../Vistas/Kerigma.jsp">Kerigma</a></li>
                
            </ul>
            </li>
            <li><a href="#about">Termometro</a></li>
            <li class="active"><a href="#">Persona</a></li>
            <li><a href="../VistaUsuario/Usuario.jsp">Usuario</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container" >
         <div class="jumbotron">
           <center>
               <form action="../Personas" method="post">
                <h4>Agregar Nueva Persona</h4>
                <table class="table table-bordered" style="width: 600px;">
                    <tr>
                        <td><label>IdPersona</label></td>
                        <td><input type="text" name="id" id="id" class="form-control" required=""></td>
                    </tr>
                    <tr>
                        <td><label>Nombres</label></td>
                        <td><input type="text" name="nombre" id="nombre" class="form-control" required=""></td>
                    </tr>
                    <tr>
                        <td><label>Apellido Paterno</label></td>
                        <td><input type="text" name="ap" id="ap" class="form-control" required=""></td>
                    </tr>
                    <tr>
                        <td><label>Apellido Materno</label></td>
                        <td><input type="text" name="am" id="am" class="form-control" required=""></td>
                    </tr>
                    <tr>
                        <td><label>Dni</label></td>
                        <td><input type="text" name="dni" id="dni" class="form-control" required=""></td>
                    </tr>
                    <tr>
                        <td><label>Direccion</label></td>
                        <td><input type="text" name="dir" id="dir" class="form-control" required=""></td>
                    </tr>
                    <tr>
                        <td><label>Cumpleaños</label></td>
                        <td><input type="date" name="cumple" id="cumple" class="form-control" required=""></td>
                    </tr>
                    <tr>
                        <td><label>Telefono</label></td>
                        <td><input type="text" name="telef" id="telef" class="form-control"></td>
                    </tr>
                    <tr>
                        <td><label>Correo</label></td>
                        <td><input type="text" name="correo" id="correo" class="form-control"></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center">
                            <input type="submit" name="opc" value="Insertar" class="btn btn-success">
                            <a href="Personas.jsp" class="btn btn-danger">Regresar</a>
                         </td>
                    </tr>
                </table>
            </form>
           </center>
        </div>
        </div>   
        
    
            <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="../bootstrap/js/bootstrap.min.js"></script>
    <script src="../../assets/js/docs.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
        
    </body>
</html>
