<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
    <title>Student Confirmation Form</title>
</head>

<body>

The student is confirmed : ${student.firstName} ${student.lastName}

<br>
<br> County is : ${student.country }

<br>
<br> Favorite Programming Language is : ${student.favoriteLanguage }

<br>
<br>

<ul>
    <c:forEach var="temp" items="${student.operatingSystems }">
        <li> ${temp} </li>
    </c:forEach>
</ul>

</body>


</html>