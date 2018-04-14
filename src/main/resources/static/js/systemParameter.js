layui.config({
	base : "js/"
}).use(['form','layer','jquery'],function(){
	var form = layui.form(),
		layer = parent.layer === undefined ? layui.layer : parent.layer,
		laypage = layui.laypage,
		$ = layui.jquery;

 	var system;
 	form.on("submit(updateSystemParameter)",function(data){
        system = '{"cmsName":"'+$(".cmsName").val()+'",';  //模版名称
        system += '"version":"'+$(".version").val()+'",';	 //当前版本
        system += '"author":"'+$(".author").val()+'",'; //开发作者
        system += '"homePage":"'+$(".homePage").val()+'",'; //网站首页
        system += '"server":"'+$(".server").val()+'",'; //服务器环境
        system += '"dataBaseVersion":"'+$(".dataBaseVersion").val()+'",'; //数据库版本
        system += '"maxUpload":"'+$(".maxUpload").val()+'",'; //最大上传限制
        system += '"userRights":"'+$(".userRights").val()+'",'; //用户权限
        system += '"description":"'+$(".description").val()+'",'; //站点描述
        system += '"powerby":"'+$(".powerby").val()+'",'; //版权信息
        system += '"record":"'+$(".record").val()+'",'; //网站备案号
        system += '"keywords":"'+$(".keywords").val()+'"}'; //默认关键字
 		window.sessionStorage.setItem("system",system);
 		//弹出loading
 		var index = top.layer.msg('数据提交中，请稍候',{icon: 16,time:false,shade:0.8});
        $.ajax({
            url : "/system/updateSystemParameter",
            type : "post",
            data : system,
            dataType : "json",
            contentType: "application/json",
            success : function(data){
                layer.close(index);
                layer.msg("系统基本参数修改成功！");
            },
            error: function(){
                layer.close(index);
                layer.msg("系统基本参数修改失败！");
            }
        })
 		return false;
 	})


 	//加载默认数据
 	if(window.sessionStorage.getItem("systemParameter")){
 		var data = JSON.parse(window.sessionStorage.getItem("systemParameter"));
 		fillData(data);
 	}else{
 		$.ajax({
			url : "/system/getParameter",
			type : "get",
			dataType : "json",
			success : function(data){
				fillData(data);
			}
		})
 	}

 	//填充数据方法
 	function fillData(data){
 		$(".version").val(data.version);      //当前版本
		$(".author").val(data.author);        //开发作者
		$(".homePage").val(data.homePage);    //网站首页
		$(".server").val(data.server);        //服务器环境
		$(".dataBase").val(data.dataBase);    //数据库版本
		$(".maxUpload").val(data.maxUpload);  //最大上传限制
		$(".userRights").val(data.userRights);//当前用户权限
		$(".cmsName").val(data.cmsName);      //模版名称
		$(".description").val(data.description);//站点描述
		$(".powerby").val(data.powerby);      //版权信息
		$(".record").val(data.record);      //网站备案号
		$(".keywords").val(data.keywords);    //默认关键字
 	}
 	
})
