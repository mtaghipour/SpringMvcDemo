<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
    <title>Student Registration Form</title>
</head>

<body>

<form:form action="processForm" modelAttribute="student">

    First Name : <form:input path="firstName"/>
    <br>
    <br>
    Last Name : <form:input path="lastName"/>
    <br>
    <br>

    <%--
    <form:select path="country">
        <form:option value="Iran" label="Iran"/>
        <form:option value="Germany" label="Germany"/>
        <form:option value="USA" label="USA"/>
        <form:option value="France" label="France"/>
    </form:select>
    --%>

    <form:select path="country">

        <form:options items="${student.countryOptions }"/>

    </form:select>

    <br>
    <br>

    <%--
        Favorite Programming Language :
        Java <form:radiobutton path="favoriteLanguage" value="Java" />
        C# <form:radiobutton path="favoriteLanguage" value="C#" />
        Python <form:radiobutton path="favoriteLanguage" value="Python" />
        C++ <form:radiobutton path="favoriteLanguage" value="C++" />
     --%>

    Favorite Programming Language :
    <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguages }"/>

    <br>
    <br>

    Operating Systems :
    Linux <form:checkbox path="operatingSystems" value="Linux"/>
    Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
    MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>

    <br>
    <br>


    <input type="submit" value="Submit">
</form:form>

</body>


</html>