function getCookie(name){
	var cookie1=document.cookie 

    //loginname=Jack,password=123456;
	//loginname,Jack ;password,123456
	var arr=cookie1.split(";")

	for(var i=0;i<ar,length;i++){
		var arr2=arr[i].split("=");
		//arr2[0]->loginname .arr2[1]->Jack ;arr2[0]->password,
		if(arr2[0]==name){
			return arr2[1];
		}
	}
	//alert(arr);
	return false;
}

function setCookie(name,value,day){
	var date1=new Date();

	var nowDate=date1.getDate();
	date1.setDate(nowDate+day);

	document .cookie=name+"="+value+";expires="+date1;
}

function  removeCookie(name){
	setCookie(name,".",-1)
}