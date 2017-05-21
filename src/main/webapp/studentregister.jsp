<%@ taglib uri="http://www.springframework.org/tags/form" prefix="student"%>
<student:form action="registerStudent.html" method="post" commandName="Student">
<table>
<tr>
    <td>StudentFirstName</td><td><student:input path="studentFirstName"/></td><td><student:errors path="studentFirstName"/></td>
</tr>

<tr>
   <td>StudentLastName</td><td><student:input path="studentLastName"/></td><td><student:errors path="studentLastName"/></td>
</tr>

<tr>
  <td>Email</td><td><student:input path="studentEmail"/></td><td><student:errors path="studentEmail"/></td>
</tr>
<tr>
  <td>Age</td><td><student:input path="studentAge"/></td><td><student:errors path="studentAge"/></td>
</tr>

<tr>
  <td>DateOfBirth</td><td><student:input path="studentDOB"/></td><td><student:errors path="studentDOB"/></td>
</tr>

<tr>
   <td>Gender</td><td><student:radiobutton path="studentGender" value="MALE" label="Male"/>
   <student:radiobutton path="studentGender" value="FEMALE" label="Female"/></td><td><student:errors path="studentGender"/></td>
</tr>
<tr>
  <td>Country</td><td><student:select path="studentCountry">
          <student:option value="">--Select--</student:option>
          <student:option value="INDIA">India</student:option>
           <student:option value="USA">USA</student:option>
            <student:option value="CHINA">China</student:option>
            </student:select>
   </td>
   <td><student:errors path="studentCountry"/></td>         
</tr>
</table>
 <input type=submit value="submit">
</student:form>