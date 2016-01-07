<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>Member List</title>
</head>

<body>
<form action="add.htm">
  Name <input type="text" name="name" />
  Phone <input type="text" name="phone" />
  Email <input type="text" name="email" />
  <input type="submit" />
</form>
<table border="1">
  <tr>
    <th>Name</th>
    <th>Phone</th>
    <th>Email</th>
    <th></th>
  </tr>
  <c:forEach items="${members}" var="member">
  <tr>
    <td>${member.name}</td>
    <td>${member.phone}</td>
    <td>${member.email}</td>
    <td><a href="remove.htm?memberName=${member.name}">Remove</a></td>
  </tr>
  </c:forEach>
</table>
</body>
</html>
