var videos = document.getElementsByTagName('video');
    for (var i = videos.length - 1; i >= 0; i--) {
    	(function(){
    		var p = i;
    	videos[p].addEventListener('play',function(){
    		pauseAll(p);
    	})
    	})()
    }
    function pauseAll(index){
    	for (var j = videos.length - 1; j >= 0; j--) {
    		if (j!=index) videos[j].pause();
    	}
    };





$(document).ready(function(){
	$("input[name='like1']").mouseover(function(){
		$("#mianshi").css("background-image","url(imgs/mianshi2)");
	})
	$("input[name='like2']").mouseover(function(){
		$("#mianshi").css("background-image","url(imgs/mianshi3)");
	})
	$("input[name='like3']").mouseover(function(){
		$("#mianshi").css("background-image","url(imgs/mianshi4)");
	})
	$("input[name='like4']").mouseover(function(){
		$("#mianshi").css("background-image","url(imgs/mianshi5)");
	})
	$("input[name='like5']").mouseover(function(){
		$("#mianshi").css("background-image","url(imgs/mianshi6)");
	})
	$("input[name='like6']").mouseover(function(){
		$("#mianshi").css("background-image","url(imgs/mianshi7)");
	})
});

window.onload = function (){
		var i = 0;
	var time = setInterval(function bb() {
		var aar = ["imgs/mianshi2.jpg","imgs/mianshi3.jpg","imgs/mianshi4.jpg","imgs/mianshi5.jpg","imgs/mianshi6.jpg","imgs/mianshi7.jpg"];
		if(i<4){
			$("#mianshi").css('background-image', 'url('+aar[i]+')');
			i++;
		}else{i=0}
	}, 2000);
	
}