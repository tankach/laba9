<%-- 
    Document   : Mark
    Created on : 19 груд. 2023 р., 15:48:51
    Author     : tanka
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mark</title>
        <style>
        body {
            background-color: grey;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        #grades {
            width: 800px;
            margin: auto;
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin-top: 50px;
        }
        h1 {
            text-align: center;
        }
        form {
            width: 100%;
            max-width: 400px;
            margin: 20px auto;
        }
        table {
            width: 100%;
            margin-top: 10px;
            border-collapse: collapse;
        }
        table,
        th,
        td {
            border: 1px solid black;
        }
        th,
        td {
            padding: 10px;
            text-align: left;
        }
        input[type=text],
        input[type=email] {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
            margin-top: 5px;
            margin-bottom: 10px;
        }
        input[type=submit] {
            width: 100%;
            background-color: #4caf50;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type=submit]:hover {
            background-color: #45a049;
        }
        #content{
                background-color: lightblue;
                width: 600px;
                margin: 20px auto;
            }
       </style>
    </head>
    <body>
        <h1>Scores of <c:out value="${user.getId()}"/> <c:out value="${user.getName()}"/> <c:out value="${user.getSurname()}"/></h1>
        
        <div id="content">
            <table class="list">
                <tr>
                    <th>Discipline</th>
                    <th>Score</th>
                    <th>ECTS</th>
                </tr>
                <c:forEach var="disc" items="${scores}">
                    <tr>
                        <td><c:out value="${disc.getTitle()}"/></td>
                        <td><c:out value="${disc.getMakr_let()}"/></td>
                        <td><c:out value="${disc.getMakr()}"/></td>
                    </tr>
                </c:forEach>
            </table>
    </div>
        
    </body>
</html>
