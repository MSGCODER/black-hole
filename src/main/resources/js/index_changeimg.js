jQuery(document).ready(function () {
	var h = $(window).height();
	$('.big-hero').css('min-height', h);
	$(window).resize(function() {
		var now = $(window).height();
		$('.big-hero').css('min-height', now);
	});

});
function changeBigHero(obj, num) {
	$('.carousel').carousel(num);
	$('.series').children().removeClass('active');
	$(obj).parent().addClass('active');
	if(num == 0){
		$(".no-experience").css("display", "inline");
		$(".experience").css("display", "none");
	}else{
		$(".no-experience").css("display", "none");
		$(".experience").css("display", "inline");
	}
}