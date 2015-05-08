(function() {
	"use strict";
	$.createP("Every now and then, usually between eight and ten in the evening, Jacques finds himself transforming into a small furry rodent with a bushy tail.");
	$.createImg("weresquirrel.png");
	$.createP("To work with a chunk of digital data, we’ll first have to find a way to represent it in our machine’s memory. Say, as a simple example, that we want to represent a collection of numbers: 2, 3, 5, 7, and 11.");
	$.createP("On one hand, Jacques is quite glad that he doesn’t have classic lycanthropy. Turning into a squirrel tends to cause fewer problems than turning into a wolf. Instead of having to worry about accidentally eating the neighbor (that would be awkward), he worries about being eaten by the neighbor’s cat. After two occasions where he woke up on a precariously thin branch in the crown of an oak, naked and disoriented, he has taken to locking the doors and windows of his room at night and putting a few walnuts on the floor to keep himself busy.");
	$.createP("Imagine a sea of bits. An ocean of them. A typical modern computer has more than 30 billion bits in its volatile data storage. Nonvolatile storage (the hard disk or equivalent) tends to have yet a few orders of magnitude more.");
	$.createImg("bit-sea.png");
	$.createQuestion("Question 1: Who is jackie chan", ["jackie chan", "jackie chan", "jackie chan", "jeff"], "jeff");

	var questions = document.getElementsByTagName("input"),
scores = {},
i = 0,
j = 0;
for(i = 0; i < questions.length; i++) {
	questions[i].addEventListener("click", function() {
		if(this.className === "correct") {
			scores[i] = 10;
		} else {
			scores[i] = 0;
		}
	});
}

var submit = document.querySelector("#submitcontainer");
submit.addEventListener("click", function() {
	var totalscore = 0;
	for(var score in scores) {
		if(scores.hasOwnProperty(score)) {
			totalscore += scores[score];
		}
	}
	document.querySelector("#quizscore").value = totalscore;
	document.querySelector("#myform").submit();
});
}());
