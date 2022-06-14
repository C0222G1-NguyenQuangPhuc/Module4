<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <caption>
    <h2>Convert Currency</h2>
    <form action="/convert" method="post">
      <table>
        <tr>
          <th>Money</th>
          <td><input type="number" value="${money}" name="money"></td>
        </tr>
        <tr>
          <th>Result</th>
          <td>${convertMoney}</td>
        </tr>
        <tr>
        </tr>
      </table>
      <div>
        <input type="submit" value="Convert">
      </div>
    </form>
  </caption>
  </body>
</html>
