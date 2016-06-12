<html>
 <head> <title>User enrollment</title></head>
 <body>
 <form action="/springMVC/user/saveMember" method="post">
   <table>
    <thead>
     <h4>Please enter User details to become member:</h4>
    </thead>
    <tr>
      <td>
      	First Name :
      </td>
      <td>
      	<input type="text" name="firstName" value="" />
      </td>
    </tr>
    <tr>
      <td>
      	Last Name  :
      </td>
      <td>
      	<input type="text" name="lastName" value="" />
      </td>
    </tr>
    <tr>
      <td>
        User Name  :
      </td>
      <td>
      	<input type="text" name="userName" value="" />
      </td>
    </tr>
    <tr>
      <td>
      	Password   :
      </td>
      <td>
        <input type="password" name="password" value="" />
      </td>
    </tr>
    <tr>
     <td> <input type="submit" name="saveMember" value="saveMember"/> </td>
     <td>  <input type="reset" name="reset" value="reset" /> </td>
    </tr>
   </table>
   </form>
 </body>
</html>