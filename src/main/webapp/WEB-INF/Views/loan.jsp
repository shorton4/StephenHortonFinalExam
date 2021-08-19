<%--
  Created by IntelliJ IDEA.
  User: Steve Horton
  Date: 2021-08-19
  Time: 1:21 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>My Page</title>
    <style>
        h1{
            text-align:center;
            background-color: cyan;
        }
    </style>
</head>
<body>
<h1 id=mes">${errorMessage}</h1>
<div class="container2">
    <h2>Loans</h2>

    <table class="table table-striped"></table>
    <thead>
    <tr>
        <td>${todo.clientno}</td>
        <td>${todo.clientname}</td>
        <td>${todo.loanamount}</td>
        <td>${todo.years}</td>
        <td>${todo.loantype}</td>

        <td>    <a type=button" class="btn btn-primary"
                   href=update-todo?id=${todo.clientno}">Edit</a></td>

        <td>    <a type=button" class="btn btn-primary"
                   href=delete-todo?id=${todo.clientno}">Delete</a></td>

        <td>    <a type=button" class="btn btn-primary" onmouseout="myFunction()"
                   href=see-todo?id=${todo.clientno}">Amortization Table</a></td>
    </tr>
    <script>
        function myFunction(){
            document.getElementById("mes").innerHTML = "";
        }
    </script>
    </thead>
</div>
</body>
</html>

