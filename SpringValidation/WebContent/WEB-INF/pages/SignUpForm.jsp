<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script type="text/CSS">
	.errMsg{
		color:red;
	}
</script>
<form:form method="POST" commandName="customer" action="/SpringValidation/customer/signup">
	
	<table>
		<tr>
			<td>Customer Name:</td>
			<td><form:input path="name"/></td>
			<td><form:errors path="name"></form:errors></td>
		</tr>
		<tr>
			<td>Customer Age:</td>
			<td><form:input path="age"/></td>
			<td><form:errors path="age"></form:errors></td>
		</tr>
		<tr>
			<td colspan="3"><input type="submit" value="Submit"/></td>
		</tr>	
	</table>

</form:form>
</body>
</html>