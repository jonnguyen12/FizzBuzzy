function init() {
    var count = 1; 
    window.addEventListener('keydown', function(e) {
        if(e.keyCode == 32 || e.which == 32) {           
            if(count > 6)
            	count = 1;
            count++;
            
            dance(count);
        }
    });
    
    var f1 = document.getElementById("1");
    var f2 = document.getElementById("2");
    var f3 = document.getElementById("3");
    var f4 = document.getElementById("4");
    var f5 = document.getElementById("5");
    var f6 = document.getElementById("6");

    var dance = function(count) {
        var e = count % 6;
        switch(e) {
            case 0:
                f1.style.display="inline-block";
                f2.style.display="none";
                f3.style.display="none";
                f4.style.display="none";
                f5.style.display="none";
                f6.style.display="none";
                break;
            case 1:
                f1.style.display="none";
                f2.style.display="inline-block";
                f3.style.display="none";
                f4.style.display="none";
                f5.style.display="none";
                f6.style.display="none";
                break;
            case 2:
                f1.style.display="none";
                f2.style.display="none";
                f3.style.display="inline-block";
                f4.style.display="none";
                f5.style.display="none";
                f6.style.display="none";
                break;
            case 3:
                f1.style.display="none";
                f2.style.display="none";
                f3.style.display="none";
                f4.style.display="inline-block";
                f5.style.display="none";
                f6.style.display="none";
                break;
            case 4:
                f1.style.display="none";
                f2.style.display="none";
                f3.style.display="none";
                f4.style.display="none";
                f5.style.display="inline-block";
                f6.style.display="none";
                break;
            case 5:
                f1.style.display="none";
                f2.style.display="none";
                f3.style.display="none";
                f4.style.display="none";
                f5.style.display="none";
                f6.style.display="inline-block";
                break;
        }
    };
}


