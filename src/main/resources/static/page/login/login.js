layui.config({
	base: "js/"
}).use(['form', 'layer'], function() {
	var form = layui.form,
		layer = parent.layer === undefined ? layui.layer : parent.layer,
		$ = layui.jquery;
	//video背景
	$(window).resize(function() {
		if($(".video-player").width() > $(window).width()) {
			$(".video-player").css({
				"height": $(window).height(),
				"width": "auto",
				"left": -($(".video-player").width() - $(window).width()) / 2
			});
		} else {
			$(".video-player").css({
				"width": $(window).width(),
				"height": "auto",
				"left": -($(".video-player").width() - $(window).width()) / 2
			});
		}
	}).resize();

	//登录按钮事件
	form.on("submit(login)", function(data) {
		$.ajax({
			url:"/c/ohl/login",
			type:"post",
			data:{"name":$("[name=username]").val(),"password":$("[name=password]").val()},
			dataType:"json",
			success:function(result){
				if(result!=null){
					window.sessionStorage.setItem("ADMIN",JSON.stringify(result));
					window.location.href = "../../index.html";
				}else{
					layer.open({title: '操作提示',content: '账号或密码错误！'});  
				}
			}
		})
	})
})