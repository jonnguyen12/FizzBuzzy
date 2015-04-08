<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign-in Page</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    <body>
        <h1>Sign up to study now</h1>
<c:if test="${message != null}">
    <p><i>${message}</i></p>
</c:if>    

    <form action="StudentController" method="post">
        <input type="hidden" name="action" value="add">
        <label class="pad_top">Email:</label>
        <input type="email" name="email" value="${student.email}" 
               required><br>
        <label class="pad_top">Username:</label>
        <input type="text" name="username" value="${student.username}"  
               required><br>
        <label class="pad_top">Password:</label>
        <input type="password" name="password" value="${student.password}"  
               required><br> 
        <br>
        <label>&nbsp;</label>
        <input type="submit" value="Sign In" class="margin_left">
        <label>&nbsp;</label>
        <input type="submit" value="Sign Up" class="margin_right">
    </form>
    </body>
</html>
