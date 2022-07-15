<%--
  Created by IntelliJ IDEA.
  User: theportableone
  Date: 7/15/22
  Time: 11:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<form method="post">
    <label for="crust">Crust</label>
    <select id="crust" name="crust">
        <option value="wheat">Wheat</option>
        <option value="garlic">Garlic</option>
        <option value="deep">Deep Dish</option>
        <option value="thin">Thin</option>
    </select>
    <label for="sauce">Sauce</label>
    <select id="sauce" name="sauce">
        <option value="white">White</option>
        <option value="tomato">Tomato</option>
        <option value="none">None</option>
    </select>
    <label for="size">Size</label>
    <select id="size" name="size">
        <option value="large">Large</option>
        <option value="medium">Medium</option>
        <option value="small">Small</option>
    </select>
    <div>Toppings
    <label for="pepperoni">Pepperoni</label>
    <input type="checkbox" id="pepperoni" name="pepperoni" value="pepperoni">
    <label for="sausage">Sausage</label>
    <input type="checkbox" id="sausage" name="sausage" value="sausage">
    <label for="ham">Ham</label>
    <input type="checkbox" id="ham" name="ham" value="ham">
    <label for="cheese">Extra Cheese</label>
    <input type="checkbox" id="cheese" name="cheese" value="cheese">
    </div>
    <label for="address">Delivery Address</label>
    <input type="text" id="address" name="address">
    <input type="submit">
</form>

</body>
</html>
