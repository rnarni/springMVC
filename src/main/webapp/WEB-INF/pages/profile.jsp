<div>FirstName: ${sessionScope.user.firstName}</div>
<div>LastName:  ${sessionScope.user.lastName}</div>
<div>UserName: ${sessionScope.user.userName}</div>

<c:if test="${sessionScope.user != null}">
    <a href="/springMVC/user/logOut">logout</a>
</c:if>