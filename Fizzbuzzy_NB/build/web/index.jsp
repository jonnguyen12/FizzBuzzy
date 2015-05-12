<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>FizzBuzzy</title>
	<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Londrina+Solid' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="style.css">
</head>
<body>

<div id="container">
		<section id="title">FizzBuzzy</section>
		<section id="subtitle">LEARN PROGRAMMING LOGIC</section>
		<section id="bearholder"><img src="img/dancingbear.gif" alt="Dancing Bear"></section>
		<section id="logincontainer">
			<c:if test="${message != null}">
				<p style="color:red;"><i>${message}</i></p>
			</c:if>
			<form action="StudentController" method="POST">
				<%--<input type="hidden" name="action" value="add">--%>
				<input type="text" placeholder="Username" name="username">
				<br>
				<input type="email" placeholder="Email" name="email">
				<br>
				<input type="password" placeholder="Password" name="password">
				<br>
				<input class="submitbutton" type="submit" name="action" value="Login">
				<input class="submitbutton" type="submit" name="action" value="Register">
			</form>
		</section>

		<hr id="seperator">

		<section id="description">
			<div id="header">What is FizzBuzzy?</div>

			<div id="descriptioncontent">
				Lorem ipsum dolor sit amet, amet detraxit id quo, vivendo vituperatoribus eum at. Laoreet vocibus ea usu, est ea iriure blandit. Et accusam nominati maiestatis has, qui congue aliquip integre id. In semper ponderum repudiare eum. Labitur corpora ad sed, meliore appetere elaboraret his cu. Per tota lorem ut, cum at elit noluisse tincidunt.
<br>
<br>
Copiosae vulputate ex sea. Id modo epicurei consequat vix, augue homero oblique eum in. Ne elit novum paulo cum, facer electram intellegebat in eos. Sit te aperiri impedit, inani quidam assueverit an eos. Sint reque nominati ea vel, mei vidit alienum ea. Vix aliquam phaedrum no, fabellas probatus ea eam. Ea unum solet consequuntur vis, mundi iriure deleniti sed eu.
<br><br>
Id ius veritus oporteat iracundia, ei dicat audire malorum mei. His nihil graeci ad. Ea dicant eruditi vis. Eos affert delectus principes ne. Elitr quaeque ea pro, quas veniam laoreet ei sit.
<br><br>
Antiopam tractatos ex pri, illum fierent insolens at his. Has simul vidisse ne. Id vidit malorum indoctum quo, facer choro et sea. Te invenire patrioque usu, ea consul adversarium eos. Pro cu iudico copiosae delicatissimi, soleat oportere accusamus vim te, cum alii cotidieque ad.
<br><br>
Eum omnes feugiat admodum ad, ex nec placerat repudiare. An mea tation scriptorem. Unum laboramus ea duo, euismod accusam fabellas est an. Dico voluptatum deterruisset eam ea, qui laoreet oportere dissentiet an, mei eu unum dicta labitur.
			</div>

		<img src="img/studying.jpg" id="studying">
		</section>
	</div>		
	<script src="main.js"></script>
	<script>
		(function($, _) {
			init($, _);
		}(document, window));
	</script>
</body>
</html>
