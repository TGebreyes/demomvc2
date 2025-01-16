<%@ page language="java" contentType="text/html"%>

<!DOCTYPE html>
<head>
    <title>Welcome</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
    <div class="container">
        <form action="login">
            <div class="row">
                <label for="name">Enter your username:</label> <input type="text"
                    id="name" name="name">
            </div>
            <div class="row">
                <label for="pass">Enter your Password:</label> <input
                    type="password" id="pass" name="password">
            </div>
            <div class="row">
                <button class="btn">Submit</button>
            </div>
        </form>
    </div>
</body>
</html>
