<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Formula General</title>
</head>
<body>
<h1>Formula General</h1>

<section>
  <p>Datos de la Formula General</p>
  <img src="formula.png"width="500" heigth="500" align="left" alt="No se pudo mostrar la imagen"></a><br>
  <form action="destino.jsp" method="post">
    <label for="a">Coeficiente a:</label>
    <input type="text" id="a" name="a"><br>
    <label for="b">Coeficiente b:</label>
    <input type="text" id="b" name="b"><br>
    <label for="c">Coeficiente c:</label>
    <input type="text" id="c" name="c"><br>

    <input type="submit" name="Enviar">
    <input type="reset" name="Borrar">
  </form>
</section>
</body>
</html>