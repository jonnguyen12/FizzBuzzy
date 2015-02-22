function init() {
    var currentslide = 0;
    var fontsize = function(n) {
        return n + "px"; 
    };
    //initialize container element and set its dynamic properties.
    //static properties (textalign etc) set in stylesheet 

    var height = window.innerHeight + "px";
    var width = window.innerWidth + "px";
    var currentslide = 1;
    var slides = document.getElementsByClassName('slide'); 
    for(var i = 0; i < slides.length; i++) {
        slides[i].style.height = height;
        slides[i].style.width = width;
        slides[i].style.minHeight = height;
        slides[i].style.minWidth = width;
        slides[i].style.maxHeight = height;
        slides[i].style.maxWidth = width;
    }    
    
    var addSlideControls = function() {
        window.addEventListener('keypress', function(e) {
            if(e.keyCode == 39 || e.which == 39) { //right arrowkey
                console.log('right');
                window.location = "homepage.html#" + (++currentslide);
            }
                
            if(e.keyCode == 37 || e.which == 37) { //left arrowkey
                if(currentslide > 1)
                    window.location = "homepage.html#" + (--currentslide);
            }

            if(e.keyCode == 38 || e.which == 38) {
                e.preventDefault();    
            }
            if(e.keyCode == 40 || e.which == 40) {
                e.preventDefault();    
            }
        });
    };

    addSlideControls();

    document.getElementById("helloworld").addEventListener('click', function(e) {
         var string = document.getElementById("code").value;
         if(string == "print \"hello, world\"")
             alert('yay');
         
    });

    /*var editor = CodeMirror.fromTextArea(document.getElementById("code"), {
        mode: {name: "python",
                version: 3,
                singleLineStringErrors: false},
        lineNumbers: true,
        indentUnit: 4,
        matchBrackets: true
    });
    */
}
