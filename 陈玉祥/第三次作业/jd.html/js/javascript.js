                 
				 
				 
			 var arr = document.getElementById("uu").getElementsByTagName("li");
             for (var i = 0; i < arr.length; i++) {

              arr[i].onmouseover = function () { 

                this.style.backgroundColor = "gray";
            }

            arr[i].onmouseout = function () {

                this.style.backgroundColor = "#fff";

            }

        }
		
		
		 document.getElementsByTagName("rd").onclick = function () {

            this.src = document.getElementsByTagName("rd1").href;
            return false;

        }
