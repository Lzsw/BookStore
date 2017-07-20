window.onload = function() {  
    //分析cookie值，显示上次的登陆信息
    var loginnameValue = getCookieValue("loginname");
    document.getElementByIdx_x("name2").value = loginnameValue;
    var passwordValue = getCookieValue("password");
    document.getElementByIdx_x("pwd").value = passwordValue;
 }
 
function sublogin(){
        var loginnameValue = document.getElementByIdx_x("name2").value;
        var passwordValue = document.getElementByIdx_x("pwd").value;
        if( document.getElementByIdx_x("saveCookie").checked){   
            setCookie("loginname",loginnameValue,24,"/");
            setCookie("password",passwordValue,24,"/");      
            document.getElementByIdx_x("form1").submit();
        }else{ 
            //如果没有选中记住密码,则立即过期
            var loginnameValue = document.getElementByIdx_x("name2").value;
            var passwordValue = document.getElementByIdx_x("pwd").value;
            deleteCookie(getCookieValue("loginname"),"/");
            document.getElementByIdx_x("form1").submit();
        }    
}
 
function getCookieValue(name){
         var name = escape(name);
         //读cookie属性，这将返回文档的所有cookie
         var allcookies = document.cookie;      
         //查找名为name的cookie的开始位置
          name += "=";
         var pos = allcookies.indexOf(name);   
         //如果找到了具有该名字的cookie，那么提取并使用它的值
         if (pos != -1){                                            
//如果pos值为-1则说明搜索"version="失败
             var start = pos + name.length;                 
//cookie值开始的位置
             var end = allcookies.indexOf(";",start);       
//从cookie值开始的位置起搜索第一个";"的位置,即cookie值结尾的位置
             if (end == -1) end = allcookies.length;       
//如果end值为-1说明cookie列表里只有一个cookie
             var value = allcookies.substring(start,end);
//提取cookie的值
             return (value);                          
//对它解码     
              }  
         else return "";                              
//搜索失败，返回空字符串
}
 
function setCookie(name,value,hours,path){
         var name = escape(name);
         var value = escape(value);
         var expires = new Date();
          expires.setTime(expires.getTime() + hours*60*60*1000);
          path = path == "" ? "" : ";path=" + path;
          _expires = (typeof hours) == "string" ? "" : ";expires=" + expires.toUTCString();
          document.cookie = name + "=" + value + _expires + path;
}
 
//删除cookie
function deleteCookie(name,path){
    var name = escape(name);
    var expires = new Date(0);
    path = path == "" ? "" : ";path=" + path;
    document.cookie = name + "="+ ";expires=" + expires.toUTCString() + path;
}