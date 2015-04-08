function init($, _) {
	var register = $.querySelector("#registerbutton");
	var body = $.querySelector("body");

	var seperator = $.querySelector("#seperator");
	seperator.width = _.innerWidth / 1.5 + "px";
	var studying = $.querySelector("#studying");
	studying.style.margin = "50px auto 0px auto";
	studying.style.boxShadow = "0 0 2px";
	var desc = $.querySelector("#descriptioncontent");
	desc.style.width = _.innerWidth / 1.5 + "px";
	desc.style.margin = "auto";
	desc.style.fontSize = "20px";
	desc.style.lineHeight = "175%";

	/*var div = $.createElement("mydiv");
	div.style.width = _.innerWidth / 2 + "px";
	div.style.height = _.innerHeight / 2 + "px";
	div.style.backgroundColor = "white";
	div.style.boxShadow = "0 0 2px";
	div.style.zIndex = 5;
	div.id = "registerdiv";
	div.style.position = "absolute";
	div.style.top = (_.innerHeight / 2) - (_.innerHeight / 2) / 2 + "px";
	div.style.left = (_.innerWidth / 2) - (_.innerWidth / 2) / 2 + "px";

	var namefield = $.createElement("input");
	var emailfield = $.createElement("input");
	var passwordfield = $.createElement("input");

	namefield.type = "text";
	emailfield.type = "email";
	passwordfield.type = "password";

	div.style.textAlign = "center";
	namefield.style.width = emailfield.style.width = passwordfield.style.width = "200px";
	namefield.style.lineheight = emailfield.style.lineheight = passwordfield.style.lineheight = "175%";
	namefield.style.border = emailfield.style.border = passwordfield.style.border = "solid 1px";
	namefield.style.display = emailfield.style.display = passwordfield.style.display = "block";
	namefield.style.margin = emailfield.style.margin = passwordfield.style.margin = "20px auto 0px auto";

	namefield.placeholder = "Enter your full name";
	emailfield.placeholder = "Enter your email";
	passwordfield.placeholder = "Enter a password";

	var form = document.createElement("form");
	form.setAttribute("method", "post");
	form.setAttribute("action", "StudentController");

	var submit = $.createElement("div");	
	var cancel = $.createElement("div");
	cancel.innerHTML = "Cancel";
	submit.innerHTML = "Submit";
	cancel.style.display = submit.style.display = "inline-block";
	cancel.style.border = submit.style.border = "solid 1px";
	cancel.style.backgroundColor = submit.style.backgroundColor = "#A61010";
	cancel.style.color = submit.style.color = "white";
	cancel.style.padding = submit.style.padding = "5px";
	cancel.style.marginTop = submit.style.marginTop = "40px";
	cancel.style.cursor = submit.style.cursor = "pointer";
	cancel.style.fontSize = submit.style.fontSize = "30px";

	div.appendChild(namefield);
	div.appendChild(emailfield);
	div.appendChild(passwordfield);
	div.appendChild(submit);
	div.appendChild(cancel);
	body.appendChild(div);	

	div.style.display = "none";

	submit.addEventListener("click", function() {
		div.style.display = "none";
	});

	cancel.addEventListener("click", function() {
		div.style.display = "none";
	});
	register.addEventListener("click", function() {
		div.style.display = "initial";
	});*/


}
