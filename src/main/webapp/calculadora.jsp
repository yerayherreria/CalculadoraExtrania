<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="calculadora.Calculadora"%>
   
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="ISO-8859-1">
	<title>Mi extraña calculadora</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="calculadoraStyle.css">
</head>
<body>
	<div class="container">
    <div class="row">
      <div class="col-md-6 offset-md-3">
        <div class="login-container mx-auto"> 
          <h2>Calculator</h2>
          <form method="get" action="">
            <div class="form-group">
              <label for="number1">Number:</label>
              <input type="number" step="any" id="number1" class="form-control" placeholder="Number" name="num" >
            </div>
            <div class="form-group">
            	<label for="options">Options:</label>
            	<select name="signos">
            			<option name="0"></option>
				        <option name="1">+</option>
				        <option name="2">-</option>
				</select>
            </div>
            <!-- CUADRO QUE MUESTRA INFORMACIÓN -->
			<div class="info">
              <textarea cols="32" readonly="readonly"> <%
              if(request.getParameter("enviar")!=null) {
            	  out.println(Calculadora.enviar(request.getParameter("num"),request.getParameter("signos")));
              }
              if(request.getParameter("borrar")!=null){
            	  Calculadora.borrar();
              }
              if(request.getParameter("resultado")!=null){
            	  out.println(Calculadora.solucionar());
              }
               %></textarea>
            </div>
          	<hr> 
          	<!-- BOTONES -->
            <input class="btn btn-primary" type="submit" value="Result" name="resultado">&nbsp
			<input class="btn btn-primary" type="submit" value="Send" name="enviar">&nbsp
			<input class="btn btn-primary" type="submit" value="Reset" name="borrar">
          </form>
        <div class="footer mt-auto">
          <p>© 2023 IES Jacarandá</p>
        </div>
      </div>
    </div>
  </div>
</body>
</html>
