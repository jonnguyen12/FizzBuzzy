var $ = (function($) {
	var lessonbody = document.querySelector("#lessonbody"),
		body = document.querySelector("body"),
		quiz = document.querySelector("#quiz"),
		p = {},
		pIndex = 0,
		quizScore = 0;
	return {
		createP: function(text) {
			var newP = document.createElement("p");
			newP.innerHTML = text;
			newP.id = "p" + pIndex;
			p[pIndex] = newP;
			pIndex += 1;
			lessonbody.appendChild(newP);
		},
		createImg: function(url) {
			var imgContainer = document.createElement("div"),
				img = document.createElement("img");
			imgContainer.style.textAlign = "center";
			img.src = url;
			img.style.maxWidth = "100%";
			imgContainer.appendChild(img);
			lessonbody.appendChild(imgContainer);
		},
		createQuestion: function(question, choices, answer) {
			var questionText = document.createElement("p"),
				questionForm = document.createElement("form"),
				answersContainer = document.createElement("div"),
				i = 0,
				inputhtml = "";
			questionText.innerHTML = question;
			answersContainer.className = "answersContainer";
			answersContainer.appendChild(questionText);
			answersContainer.appendChild(questionForm);
			//console.log(choices[choice]);
			for(i = 0; i < choices.length; i++) {
			 	inputhtml += '<input name="' + answer + '" type="radio" '; 
				if(choices[i] === answer) {
					inputhtml += 'class="correct" ';
				}	
				inputhtml += '/>' + ' ' + choices[i] + '<br>';
				questionForm.innerHTML = inputhtml;
			}
			quiz.appendChild(answersContainer);
		}
	};
}($ || {}));

