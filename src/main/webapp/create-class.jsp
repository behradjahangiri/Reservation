<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Class Form</title>
</head>
<style>
    form {
        width: 400px;
        margin: 60px auto;
        padding: 30px;
        border: 1px solid #ddd;
        border-radius: 10px;
        background-color: #ffffff;
        box-shadow: 0 4px 12px rgba(0, 0, 0, 0.08);
    }

    form h2 {
        text-align: center;
        margin-bottom: 25px;
    }

    .form-group {
        margin-bottom: 18px;
    }

    .form-group label {
        display: block;
        margin-bottom: 6px;
        font-weight: bold;
    }

    .form-group input {
        width: 100%;
        padding: 10px;
        box-sizing: border-box;
        border: 1px solid #ccc;
        border-radius: 6px;
        font-size: 14px;
    }

    .form-group input:focus {
        outline: none;
        border-color: #007bff;
    }

    .form-group input[readonly] {
        background-color: #f5f5f5;
    }

    form button {
        width: 100%;
        padding: 12px;
        border: none;
        border-radius: 6px;
        background-color: #007bff;
        color: white;
        font-size: 15px;
        font-weight: bold;
        cursor: pointer;
    }

    form button:hover {
        background-color: #0056b3;
    }
</style>
<body>
<form action="create-class" method="post">

    <h2>Create Class</h2>

    <input type="hidden" name="day" value="${param.day}">
    <input type="hidden" name="time" value="${param.time}">

    <div class="form-group">
        <label>Class Name</label>
        <input type="text" name="className" required>
    </div>

    <div class="form-group">
        <label>Teacher</label>
        <input type="text" name="teacher" required>
    </div>

    <div class="form-group">
        <label>Day</label>
        <input type="text" value="${param.day}" readonly>
    </div>

    <div class="form-group">
        <label>Time</label>
        <input type="text" value="${param.time}" readonly>
    </div>

    <button type="submit">CREATE CLASS</button>

</form>
