<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<h1>${user.name}</h1>

<c:forEach items="${user.blogs}" var="blog">

	<h1>${blog.name}</h1>
	<p>${blog.url}</p>

	<table class="table table-bordered table-striped table-hover" >
		<thead>
			<tr>
				<th>Item</th>
				<th>Link</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${blog.items}" var="item">
				<tr>
					<td>${item.title}</td>
					<td>${item.link}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</c:forEach>