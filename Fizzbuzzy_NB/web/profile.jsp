<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Profile</title>
	<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Londrina+Solid' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="style.css">
</head>
<body>
	<div id="container">
		<section id="title">FizzBuzzy</section>
		<section id="subtitle">LEARN PROGRAMMING LOGIC</section>
		<section id="profileheader">
			User Profile
		</section>
		<section id="profile">
                    <span style="color:red;"> ${message} </span>
			<div id="imagerow">
				<img src="img/spiderman.gif" alt="" height="200px" id="profileimage">
                         
				Username: <span>${student.username}</span>
				<br>
				Email: <span>${student.email}</span>
                                <br>
                                Score: <span>${student.score}</span>
			</div>
			<div id="profiledescription">

			</div>
                        <section id="profile">
                    <form action="lesson/lesson0.html" method="POST">
                        <input type="hidden"  name="username" value=${student.username}>
				<br>
                                <input type="hidden" name="email" value=${student.email}>
				<br>
    <input type="submit" value="Learn now, buddy!">
                    </form>
		</section>
                 </section>
	</div>
</body>
</html>
