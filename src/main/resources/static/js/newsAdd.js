layui.config({
	base : "js/"
}).use(['form','layer','jquery','layedit','laydate'],function(){
	var form = layui.form(),
		layer = parent.layer === undefined ? layui.layer : parent.layer,
		laypage = layui.laypage,
		layedit = layui.layedit,
		laydate = layui.laydate,
		$ = layui.jquery;

	//创建一个编辑器
 	var editIndex = layedit.build('news_content');
 	var addNewsArray = [],addNews;
 	form.on("submit(addNews)",function(data){
 		//是否添加过信息
	 	if(window.sessionStorage.getItem("addNews")){
	 		addNewsArray = JSON.parse(window.sessionStorage.getItem("addNews"));
	 	}
	 	//显示、审核状态
 		var isShow = data.field.show=="on" ? "checked" : "",
 			shortStatus = data.field.shenhe=="on" ? "审核通过" : "待审核";

 		addNews = '{"shortName":"'+$(".shortName").val()+'",';  //短链接名称
        addNews += '"desc":"'+$(".desc").val()+'",'; //短链接作用描述
 		addNews += '"id":"'+new Date().getTime()+'",';	 //短链接id
 		addNews += '"shortLook":"'+$(".shortLook option").eq($(".shortLook").val()).text()+'",'; //开放浏览
 		addNews += '"newsTime":"'+$(".newsTime").val()+'",'; //发布时间
 		addNews += '"shortAuthor":"'+$(".shortAuthor").val()+'",'; //短链接作者
 		addNews += '"isShow":"'+ isShow +'",';  //是否有效
 		addNews += '"shortStatus":"'+ shortStatus +'"}'; //审核状态
 		addNewsArray.unshift(JSON.parse(addNews));
 		window.sessionStorage.setItem("addNews",JSON.stringify(addNewsArray));
 		//弹出loading
 		var index = top.layer.msg('数据提交中，请稍候',{icon: 16,time:false,shade:0.8});
        setTimeout(function(){
            top.layer.close(index);
			top.layer.msg("短链接添加成功！");
 			layer.closeAll("iframe");
	 		//刷新父页面
	 		parent.location.reload();
        },2000);
 		return false;
 	})
	
})
