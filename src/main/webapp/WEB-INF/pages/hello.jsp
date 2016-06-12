<html>
<body>
	<h1>${message}</h1>
	<form action="/springMVC/user/logIn" method="post">
	  <table>
	  <thead> Please enter below details to logIn.</thead>
	  <tr>
	   <td>UserName :</td>
	   <td><input type="text" name="userName" value=""/></td>
	  </tr>
	  <tr>
	   <td>Password :</td>
	   <td><input type="text" name="password" value=""/></td>
	  </tr>
	  <tr>
	   <td><input type="submit" name="logIn" value="logIn" /></td>
	   <td><input type="reset" name="reset" value="reset" /></td>
	  </tr>
	  <tr>
	  <td>
	  are you new Member? <a href="/springMVC/user/enrollment">Click Here</a>
	  </td>
	  </tr>
	  </table>
	</form>
</body>
</html>