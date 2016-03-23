<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="CreateUser.html" method="post">

<form:label path="name">Name</form:label>
<form:input path="name"/>
<br/>

<br/>
<input type="submit" value="Create"/>
</form:form>

<hr>
<table border=5 align="center">
 <c:forEach list="${LIST2}" var="spring">
        <tr>
            <td><c:out value="${list.name}"/></td>
            </c:forEach>
      </table>

</table>

</body>
</html> 