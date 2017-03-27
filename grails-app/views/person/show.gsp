<%--
  Created by IntelliJ IDEA.
  User: abhilash
  Date: 27/3/17
  Time: 5:22 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>

<g:form controller="person" action="viewList">

   First Name:   <input type="text" name="firstName">
    Last Name:   <input type="text" name="lastName">

    <g:submitButton name="Submit"/>
</g:form>

<g:link mapping="personList">Person List</g:link>

</body>
</html>