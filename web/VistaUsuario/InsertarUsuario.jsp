
<%@page import="java.sql.ResultSet"%>
<%@page import="Factory.FactoryConnectionDB"%>
<%@page import="Factory.ConnectionDB"%>
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
          <a class="navbar-brand" href="#">Usuario</a>
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
            <li><a href="../Personas?opc=list">Persona</a></li>
            <li class="active"><a href="#">Usuario</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container" >
         <div class="jumbotron">
           <center>
               <form action="../Usuario" method="post">
                <h4>Agregar Nuevo Usuario</h4>
                <table class="table table-bordered" style="width: 600px;">
                    <tr>
                        <td><label>IdUsuario</label></td>
                        <td><input type="text" name="id" id="id" class="form-control" required=""></td>
                    </tr>
                    <tr>
                        <td><label>Usuario</label></td>
                        <td><input type="text" name="user" id="user" class="form-control" required=""></td>
                    </tr>
                    <tr>
                        <td><label>Contraseña</label></td>
                        <td><input type="password" name="pwd" id="pwd" class="form-control" required=""></td>
                    </tr>
                    <tr>
                        <td><label>Nombre Persona</label></td>
                        <td>
                     <% 
                    ConnectionDB conn=FactoryConnectionDB.open(FactoryConnectionDB.ORACLE);
                    StringBuilder sql= new StringBuilder();
                    sql.append("select * from persona order by id_persona");
                    ResultSet rs2=conn.query(sql.toString()); 
                    %>
                    <select class="input-sm" name="per">
                                <% while(rs2.next())
                                 {%>
                                 <option value="<%=rs2.getString(1)%>"><%=rs2.getString(2)+' '+rs2.getString(3)%></option>
                                 <%}%>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center">
                            <input type="submit" name="opc" value="Insertar" class="btn btn-success">
                            <a href="Usuario.jsp" class="btn btn-danger">Regresar</a>
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
