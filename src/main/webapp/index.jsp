<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>

    <title>CLASS-INFO</title>

    <style>

        .table-div {
            width: 70%;
            margin: 20px auto;
        }

        .table {
            width: 100%;
            border-collapse: collapse;
            table-layout: fixed;
        }

        .table th,
        .table td {
            border: 1px solid #ccc;
            text-align: center;
            height: 70px;
        }

        .table thead th {
            height: 50px;
            background-color: #f5f5f5;
        }

        .table thead th:first-child,
        .table tbody th {
            width: 100px;
        }

        .table tbody td:not(.disabled):hover {
            background-color: #e6f4ff;
            cursor: pointer;
        }

        .table thead th:last-child,
        .table tbody td:last-child {
            background-color: #ffdddd;
        }

        .table tbody td.disabled {
            background-color: #ffdddd;
            cursor: not-allowed;
        }

    </style>

</head>

<body>

<%
    String[] days = {
            "SATURDAY",
            "SUNDAY",
            "MONDAY",
            "TUESDAY",
            "WEDNESDAY",
            "THURSDAY",
            "FRIDAY"
    };

    String[] hours = {
            "08:00-09:00",
            "09:00-10:00",
            "10:00-11:00",
            "11:00-12:00",
            "12:00-13:00",
            "13:00-14:00",
            "14:00-15:00",
            "15:00-16:00"
    };

    request.setAttribute("days", days);
    request.setAttribute("hours", hours);
%>

<div class="table-div">

    <table class="table">

        <thead>

        <tr>

            <th>TIME</th>

            <c:forEach var="day" items="${days}">

                <th>${day}</th>

            </c:forEach>

        </tr>

        </thead>

        <tbody>

        <c:forEach var="hour" items="${hours}">

            <tr>

                <th>${hour}</th>

                <c:forEach var="day" items="${days}">

                    <c:choose>

                        <c:when test="${day == 'FRIDAY'}">

                            <td class="disabled"></td>

                        </c:when>

                        <c:otherwise>

                            <td onclick="location.href='create-class.jsp?day=${day}&time=${hour}'">
                            </td>

                        </c:otherwise>

                    </c:choose>

                </c:forEach>

            </tr>

        </c:forEach>

        </tbody>

    </table>

</div>

</body>

</html>
```
