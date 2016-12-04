<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<table class="table table-bordered table-striped table-hover">
	<thead>
		<tr>
			<th>User name</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${users}" var="user">
			<tr>
				<td><a href='<spring:url value="/users/${user.id}.html"></spring:url>' >${user.name}</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
