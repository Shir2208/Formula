<%--
  Created by IntelliJ IDEA.
  User: Shirley
  Date: 17/11/2023
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formula</title>
</head>
<body>
<%@ page import="com.shir.formula.model.service.Calcular" %>
<%@ page import="com.shir.formula.model.MCalcular" %>
<%@ page import="com.shir.formula.model.service.Archivo" %>

<%
    String a = request.getParameter("a");
    String b = request.getParameter("b");
    String c = request.getParameter("c");

    Double result1, result2;
    MCalcular mCalcular = new MCalcular(a,b,c);

    Calcular calcular = new Calcular(mCalcular);
    calcular.result1();
    result1 = mCalcular.getResult1();
    calcular.result2();
    result2 = mCalcular.getResult2();

    ServletContext servletContext = request.getServletContext();
    String ruta = servletContext.getRealPath("/WEB-INF/Result.txt");
    ruta = ruta.replace('\\','/');
    Archivo.add(mCalcular,ruta);
%>

<h2>Resultado final</h2>
<p>Suma: <%= result1%> </p>
<p>Resta: <%= result2%> </p>

<a href="index.jsp">Regresar</a>
</body>
</html>
