<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Main Page</title>
    <!-- Bootstrap CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h2>Main Page</h2>
        <div class="jumbotron">
            <h1 class="display-4">Welcome, <%= request.getAttribute("username") %>!</h1>
            <p class="lead">This is your main page where you can see your entered data.</p>
        </div>
    </div>

    <!-- Bootstrap JS (Optional) -->
    <script src="bootstrap.bundle.min.js"></script>
</body>
</html>
