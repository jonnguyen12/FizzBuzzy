(function() {
	"use strict";
	$.createP("A programming language is a language that humans use to give instructions to the computer. Computers are very dumb machines. They can't reason or use logic, and they can only perform the exact instructions you tell them. Furthermore, computers only understand 1's and 0's. For example, if you wanted a computer to add the numbers 2 and 5, you would have to translate your instructions into something like this: 01011111 0010 0101.");
	$.createImg("bit-sea.png");
	$.createP("The first 01011111 tells the computer it needs to perform addition, the next 0010 tells the computer the first number it needs to add is '2', and the last 0101 tells the computer the second number to add is '5'. This is a very general idea of what happens under the machine. These instructions, encoded as 0's and 1's, are known as 'machine code'. Because it is extremely difficult to memorize all combinations of 0's and 1's of every machine instruction, we developed programming languages. Programming languages look like English, and they are eventually translated by a program called a compiler into the 1's and 0's that the computer understands. Java is one such programming language, and is very easy to learn!");
	$.createP("A program is just a bunch of consecutive instructions, written in a programming language. When you use a programming language, you have to follow that language's 'syntax'. Just like in English, if you don't use correct syntax, no one would understand what you are saying!");
	$.createImg("img1/1-3.png");
	$.createImg("img1/1-4.png");
	$.createImg("img1/1-5.png");
	$.createP("If you wanted to write a program that printed out the result of 4 + 2, you would tell the computer something like this: 'Print the result of adding the numbers 4 and 2!'. But of course, computer's don't understand English, so you would have to use a programming language. In Java, we would tell the computer 'System.out.println(4 + 2)'. Here, 'System.out.println' is telling the computer to print whatever is inside of the (). So we are telling the computer, 'calculate the result of 4 plus 2, and print it out'.");
	$.createImg("img1/1-7.png");
	$.createP("In programming languages, we also use something called variables. Variables in Java are similar to variables in math. They are basically placeholders for a value that we can change later.");
	$.createImg("img1/1-6.png");
	$.createImg("img1/1-10.png");
	$.createP("In Java, we have different variable 'types', which describe the type of the variable (duh). For example, the special keyword 'int' describes an integer variable, which is any whole number (0, -5, 23...). When we declare variables in Java, we have to tell the computer what type it is. If you tell the computer that 'x' is an integer, when in reality it is a string, the computer will be confused, and you'd be a liar!");
	$.createImg("img1/1-9.png");
	$.createImg("img1/1-10.png");
	$.createP("Variables are useful because you can declare at variable at the top of your code, and use them throughout your program. Later, if you wanted to change that variable, you would only need to change it in one place, and the changes will reflect throughout the rest of your program.");
	$.createImg("img1/1-11.png");
	$.createQuestion("Question 1: What data type would the number 5.5 be?", ["int", "string", "double"], "double");
	$.createQuestion("Question 2: What data type would the number 10 be?", ["int", "string", "double"], "int");
	$.createQuestion("What would be the output if you ran the following code?<br>x = 5;<br>System.out.println(x*2);", ["5", "2", "10"], "10");
	$.createQuestion("Which of these characters needs to be at the end of every statement?", [";", ".", ":", "?"], ":");

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
