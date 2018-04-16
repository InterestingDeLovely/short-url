/**
 * Created by haojy on 2018/3/30.
 */
//本地
function getShortUrl() {
    var newsList;
    newsList = '{"longName":"'+$("#url").val()+'",';  //长连接
    newsList += '"description":"'+$("#desc").val()+'"}'; //链接用途
    $.ajax({
        cache : true,
        type : "POST",
        url : "/getShortUrl",
        data : newsList,
        async : false,
        dataType : "json",
        contentType: "application/json",
        error : function() {
            alert("系统异常");
        },
        success : function(data) {
            $('#sUrlDiv').removeClass("hidden")
            if (data.code == 0) {
                $('#sUrl').html(getHost()+data.data);
            }
        }
    });

}

/*新浪*/
function getSinaShortUrl() {
    var newsList;
    newsList = '{"longName":"'+$("#sinaurl").val()+'",';  //长连接
    newsList += '"description":"'+$("#sinadesc").val()+'"}'; //链接用途
    $.ajax({
        cache : true,
        type : "POST",
        url : "/getSinaShortUrl",
        data : newsList,
        async : false,
        dataType : "json",
        contentType: "application/json",
        error : function() {
            alert("系统异常");
        },
        success : function(data) {
            $('#sUrlDiv').removeClass("hidden")
            if (data.code == 0) {
                $('#sUrl').html(data.data);
            }
        }
    });

}

function getHost() {
    var protocol = window.location.protocol;
    var host = window.location.host;
    return protocol+'//'+host+'/';
}