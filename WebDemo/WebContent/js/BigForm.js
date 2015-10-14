function getData(){
	var request;
	request = new XMLHttpRequest();
	request.onreadystatechange = function(){
		if (xmlHttp.readyState == 4) {
			if (xmlHttp.status === 200) {
				document.getElementById("divHello").innerHTML = xmlHttp.responseText;
			} else {
				alert("Something Went Wrong!");
			}
		}
	};
	request.open("GET", "../../BigForm/?username= ?pass= ?sex = ?color1 = ?color2 = ", async, username, password)
}