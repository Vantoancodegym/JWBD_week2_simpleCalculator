<%--
  Created by IntelliJ IDEA.
  User: THINKPADX240
  Date: 2/2/2021
  Time: 4:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
 <form method="post" action="/calculator">
<h5>First</h5>
  <input name="first">

<h5>Second</h5>
    <input name="second"><br>
  <select name="operator">
    <option>+</option>
    <option>-</option>
    <option>x</option>
    <option>/</option>
  </select>
     <input value="Calculator" type="submit">
 </form>
 <input value="${result}">
  </body>

</html>
