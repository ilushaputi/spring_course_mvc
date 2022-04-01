<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>
    Dear Employee, you are WELCOME!!!
</h2>
<br>
<br>
<br>
<br>
<%--
Your name: ${param.employeeName}
--%>

Your name: ${employee.name}
<br>
Your surname: ${employee.surName}
<br>
Your salary: ${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your car: ${employee.carBrand}
<br><br><br>
Language (s):
<ul>
    <c:forEach var="lang" items="${employee.languageMap}"/>

    <li>${lang}</li>
    <br><br>
</ul>

Phone number: ${employee.phoneNumber}
<br>
Email: ${employee.email}

</body>


</html>