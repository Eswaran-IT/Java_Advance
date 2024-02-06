<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link href="bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h2>Register</h2>
        <form action="Register" method="post">
            <div class="form-group">
                <label for="registerUsername">Username:</label>
                <input type="text" class="form-control" id="registerUsername" name="username">
            </div>
            <div class="form-group">
                <label for="registerPassword">Password:</label>
                <input type="password" class="form-control" id="registerPassword" name="password">
            </div>
            <button type="submit" class="btn btn-primary">Register</button>
        </form>
    </div>

    <!-- Bootstrap JS (Optional) -->
    <script src="bootstrap.bundle.min.js"></script>
</body>
</html>
