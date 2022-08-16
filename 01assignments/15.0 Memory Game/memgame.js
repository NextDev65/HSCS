var score = 0;
var cnum = 10;
function mario(m) {
	switch (m) {
		case 1:
            document.getElementById("c1").style.display = "inline";
            document.getElementById("1c").style.display = "none";
            break;
        case 2:
            document.getElementById("c2").style.display = "inline";
            document.getElementById("2c").style.display = "none";
            break;
        case 3:
            document.getElementById("c3").style.display = "inline";
            document.getElementById("3c").style.display = "none";
            break;
        case 4:
            document.getElementById("c4").style.display = "inline";
            document.getElementById("4c").style.display = "none";
            break;
        case 5:
            document.getElementById("c5").style.display = "inline";
            document.getElementById("5c").style.display = "none";
            break;
        case 6:
            document.getElementById("c6").style.display = "inline";
            document.getElementById("6c").style.display = "none";
            break;
        case 7:
            document.getElementById("c7").style.display = "inline";
            document.getElementById("7c").style.display = "none";
            break;
        case 8:
            document.getElementById("c8").style.display = "inline";
            document.getElementById("8c").style.display = "none";
            break;
        case 9:
            document.getElementById("c9").style.display = "inline";
            document.getElementById("9c").style.display = "none";
            break;
        case 0:
            document.getElementById("c0").style.display = "inline";
            document.getElementById("0c").style.display = "none";
            break;
		default:
			document.getElementById("c1").style.display = "inline";
			document.getElementById("c2").style.display = "inline";
			document.getElementById("c3").style.display = "inline";
			document.getElementById("c4").style.display = "inline";
			document.getElementById("c5").style.display = "inline";

			document.getElementById("1c").style.display = "none";
			document.getElementById("2c").style.display = "none";
			document.getElementById("3c").style.display = "none";
			document.getElementById("4c").style.display = "none";
			document.getElementById("5c").style.display = "none";

			document.getElementById("c6").style.display = "inline";
			document.getElementById("c7").style.display = "inline";
			document.getElementById("c8").style.display = "inline";
			document.getElementById("c9").style.display = "inline";
			document.getElementById("c0").style.display = "inline";

			document.getElementById("6c").style.display = "none";
			document.getElementById("7c").style.display = "none";
			document.getElementById("8c").style.display = "none";
			document.getElementById("9c").style.display = "none";
			document.getElementById("0c").style.display = "none";
			
			document.getElementById("match").innerHTML = "Scoreboard";
			score = 0;
			document.getElementById("score").innerHTML = score;
			break;
	}
    /*
    var nums = [1,2,3,4,5,6,7,8,9,10];
    var one = nums[Math.floor(Math.random() * 10) + 1];
    nums[one] = 0;
    var two = Math.floor(Math.random() * 10) + 1;
    if (nums[two] = 0)
    var three = Math.floor(Math.random() * 10) + 1;
    var four = Math.floor(Math.random() * 10) + 1;
    var five = Math.floor(Math.random() * 10) + 1;
    var six = Math.floor(Math.random() * 10) + 1;
    var seven = Math.floor(Math.random() * 10) + 1;
    var eight = Math.floor(Math.random() * 10) + 1;
    var nine = Math.floor(Math.random() * 10) + 1;
    var ten = Math.floor(Math.random() * 10) + 1;
    */
}
function flip(c) {
    switch(c) {
        case 1:
            document.getElementById("c1").style.display = "none";
            document.getElementById("1c").style.display = "inline";
            if (cnum == 8) {
                match("match");
            }
			else if (cnum != 10) {
				match("mis",1);
			}
            else
                cnum = 1;
            break;
        case 2:
            document.getElementById("c2").style.display = "none";
            document.getElementById("2c").style.display = "inline";
            if (cnum == 9) {
                match("match");
            }
			else if (cnum != 10) {
				match("mis",2);
			}
            else
                cnum = 2;
            break;
        case 3:
            document.getElementById("c3").style.display = "none";
            document.getElementById("3c").style.display = "inline";
            if (cnum == 7) {
                match("match");
            }
			else if (cnum != 10) {
				match("mis",3);
			}
            else
                cnum = 3;
            break;
        case 4:
            document.getElementById("c4").style.display = "none";
            document.getElementById("4c").style.display = "inline";
            if (cnum == 6) {
                match("match");
            }
			else if (cnum != 10) {
				match("mis",4);
			}
            else
                cnum = 4;
            break;
        case 5:
            document.getElementById("c5").style.display = "none";
            document.getElementById("5c").style.display = "inline";
            if (cnum == 0) {
                match("match");
            }
			else if (cnum != 10) {
				match("mis",5);
			}
            else
                cnum = 5;
            break;
        case 6:
            document.getElementById("c6").style.display = "none";
            document.getElementById("6c").style.display = "inline";
            if (cnum == 4) {
                match("match");
            }
			else if (cnum != 10) {
				match("mis",6);
			}
            else
                cnum = 6;
            break;
        case 7:
            document.getElementById("c7").style.display = "none";
            document.getElementById("7c").style.display = "inline";
            if (cnum == 3) {
                match("match");
            }
			else if (cnum != 10) {
				match("mis",7);
			}
            else
                cnum = 7;
            break;
        case 8:
            document.getElementById("c8").style.display = "none";
            document.getElementById("8c").style.display = "inline";
            if (cnum == 1) {
                match("match");
            }
			else if (cnum != 10) {
				match("mis",8);
			}
            else
                cnum = 8;
            break;
        case 9:
            document.getElementById("c9").style.display = "none";
            document.getElementById("9c").style.display = "inline";
            if (cnum == 2) {
                match("match");
            }
			else if (cnum != 10) {
				match("mis",9);
			}
            else
                cnum = 9;
            break;
        case 0:
            document.getElementById("c0").style.display = "none";
            document.getElementById("0c").style.display = "inline";
            if (cnum == 5) {
                match("match");
            }
			else if (cnum != 10) {
				match("mis",0);
			}
            else
                cnum = 0;
            break;
		default:
			alert("Pick a new card");
    }
}
function match(mushroom,mush) {
	switch (mushroom) {
		case "match":
			score++;
			document.getElementById("match").innerHTML = "Match!";
			cnum = 10;
			document.getElementById("score").innerHTML = score;
			break;
		case "mis":
			score--;
			document.getElementById("match").innerHTML = "Not a match!";
			setTimeout(function(){
				mario(cnum);
				mario(mush);
				cnum = 10;
				document.getElementById("score").innerHTML = score;
			},900);
			break;
	}
}