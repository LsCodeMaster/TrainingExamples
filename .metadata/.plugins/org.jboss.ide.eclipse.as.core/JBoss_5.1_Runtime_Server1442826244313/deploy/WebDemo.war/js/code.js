function validateForm() {
	var firstName = document.forms["getName"]["firstname"].value;
	var lastName = document.forms["getname"]["lastname"].value;
	if (firstName == null || firstName == "" || lastName == null
			|| lastName == "") {
		alert("Name must be filled out");
		return false;
	}
}
function getRandomColor() {
	var letters = '0123456789ABCDEF'.split('');
	var color = '#';
	for (var i = 0; i < 6; i++) {
		color += letters[Math.floor(Math.random() * 16)];
	}
	return color;
}
function Person(first,last,age) {
	this.first_name = first;
	this.last_name = last;
	this.age = age;
	this.func = function(){
		alert("Hi");
	};
}

var hashMap = {
	key : 1,
	value : 23,
	getValue : function(){
		return this.value;
	}
};

function objectTest(){
	var Ian = new Person("Ian", "Liszewski", 23); 
	alert(Ian.first_name);	
	Ian.func();
	alert(hashMap.key);
	alert(hashMap.getValue());
}

function changeUp() {
	document.getElementById('title').style.color = getRandomColor();
	document.getElementById('p1').style.color = getRandomColor();
	document.getElementById('p2').style.color = getRandomColor();
	document.getElementById('btn').style.background = getRandomColor();
	document.body.style.backgroundColor = getRandomColor();
}
var para = document.createElement("p");
var text = document.createTextNode("This was created Dynamically!");
para.appendChild(text);
document.getElementById("dynamic").appendChild(para);
var myObj = new Object();
myObj.type = "object";
alert(myObj.type);
alert(myObj["type"]);
//setInterval(changeUp, 1000);
 			