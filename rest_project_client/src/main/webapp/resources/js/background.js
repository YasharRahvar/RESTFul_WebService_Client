(function($){
	var x= 0;
	var y= 0;
	
	var banner = $("#header");
	
	banner.css('backgroundposition',x + 'px' + ' ' + y + 'px' );
	window.setInterval(function(){
		banner.css("backgroundPosition", x+'px' + ' ' + y +'px' );
		y--;
		//x--;
	},90);
})(jQuery);
	