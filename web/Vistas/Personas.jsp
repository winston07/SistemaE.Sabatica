<%@page import="model.Persona"%>
<jsp:useBean id="list"  scope="session" class="java.util.ArrayList" />
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
        <div style="width: 1050px;">
            <a href="InsertarPersonas.jsp" class="btn btn-primary btn-sm">Nuevo</a>
            
            <table class="table table-bordered">
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Apellido Paterno</th>
                    <th>Apellido Materno</th>
                    <th>Dni</th>
                    <th>Direccion</th>
                    <th>Cumpleaños</th>    
                    <th>Telefono</th>
                    <th>Correo</th>
                    <th></th>
                </tr>
                <% 
                    for(int i=0;i< list.size(); i++){
                    Persona persona=new Persona();
                    persona= (Persona)list.get(i);
                 %>
                <tr>
                    <td><%=persona.getId_persona() %></td>
                    <td><%=persona.getPer_nombres() %></td>
                    <td><%=persona.getPer_apell_pat() %></td>
                    <td><%=persona.getPer_apell_mat() %></td>
                    <td><%=persona.getPer_dni() %></td>
                    <td><%=persona.getPer_direccion() %></td>
                    <td><%=persona.getPer_cumple() %></td>
                    <td><%=persona.getPer_telefono() %></td>
                    <td><%=persona.getPer_correo()%></td>
                    <td>
                        <a href="ModificarPersonas.jsp?id=<%=persona.getId_persona() %>&opc=Modificar" class="btn btn-primary btn-sm">Editar</a>
                        <a href="../Personas?id=<%=persona.getId_persona() %>&opc=Eliminar" class="btn btn-primary btn-sm">Eliminar</a>
                    </td>
                </tr>
                <% } %>
            </table>
        </div>
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
