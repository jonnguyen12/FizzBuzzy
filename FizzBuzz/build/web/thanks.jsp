
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Information</title>
    </head>
    <body>
        <h1>Successful Signin/Signup</h1>

        <p>Your information: </p>
        <label>Email:</label>
        <span>${student.email}</span><br>
        <label>Username: </label>
        <span>${student.username}</span><br>


        <p>To enter another email address, click on the Back 
            button in your browser or the Return button shown 
            below.</p>

        <form action="" method="post">
            <input type="hidden" name="action" value="signin">
            <input type="submit" value="Return">
        </form>
    </body>
</html>
