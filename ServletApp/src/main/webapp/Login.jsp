<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <!-- Bootstrap CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h2>Login</h2>
        <form action="Login" method="post">
            <div class="form-group">
                <label for="loginUsername">Username:</label>
                <input type="text" class="form-control" id="loginUsername" name="username">
            </div>
            <div class="form-group">
                <label for="loginPassword">Password:</label>
                <input type="password" class="form-control" id="loginPassword" name="password">
            </div>
            <button type="submit" class="btn btn-primary">Login</button>
        </form>
    </div>

    <!-- Bootstrap JS (Optional) -->
    <script src="bootstrap.bundle.min.js"></script>
</body>
</html>
