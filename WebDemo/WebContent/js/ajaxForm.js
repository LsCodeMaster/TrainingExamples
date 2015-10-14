function ajaxFunction() {
	var xmlHttp;
	try {
		xmlHttp = new XMLHttpRequest();
	} catch (e) {
		try {
			xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
		} catch (e) {
			try {
				xmlHttp = new ActiveObejct("Microsoft.XMLHTTP");
			} catch (e) {
				alert("Your browser does not support AJAX!");
				return false;
			}
		}
	}
	xmlHttp.onreadystatechange = function() {
		if (xmlHttp.readyState == 4) {
			if (xmlHttp.status === 200) {
				document.getElementById("divHello").innerHTML = xmlHttp.responseText;
			} else {
				alert("Something Went Wrong!");
			}
		}
	};
	xmlHttp.open("GET", "../../Greeting?firstname="
			+ document.regfrm.fname.value, true);
	xmlHttp.send(null);
}
//
//$(document).ready(function(){
//    $("#lNameId").click(function(){
//        $(this).hide();
//    });
//});
function setCookie(cname, cvalue, exdays) {
    var d = new Date();
    d.setTime(d.getTime() + (exdays*24*60*60*1000));
    var expires = "expires="+d.toUTCString();
    document.cookie = cname + "=" + cvalue + "; " + expires;
}
function getCookie(cname) {
    var name = cname + "=";
    var ca = document.cookie.split(';');
    for(var i=0; i<ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0)==' ') c = c.substring(1);
        if (c.indexOf(name) == 0) return c.substring(name.length,c.length);
    }
    return "";
}
function checkCookie() {
    var username=getCookie("username");
    if (username!="") {
        alert("Welcome again " + username);
    }else{
        username = prompt("Please enter your name:", "");
        if (username != "" && username != null) {
            setCookie("username", username, 365);
        }
    }
}
