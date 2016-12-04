<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<form:form commandName="user" cssClass="form-horizontal">

	<div class="form-group">
		<label for="name" class="col-sm-2 control-label">Name</label>
		<div class="col-sm-10">
			<form:input path="name" cssClass="form-control" placeholder="name" />
		</div>
	</div>
	<div class="form-group">
		<label for="email" class="col-sm-2 control-label">email</label>
		<div class="col-sm-10">
			<form:input path="email" cssClass="form-control" placeholder="email" />
		</div>
	</div>
	<div class="form-group">
		<label for="password" class="col-sm-2 control-label">Password</label>
		<div class="col-sm-10">
			<form:password path="password" cssClass="form-control" 	placeholder="Password"/>
		</div>
	</div>

	<div class="form-group">
		<div class="col-sm-2">
			<button type="submit" value="Save" class="btn btn-lg btn-primary">Sign in</button>
		</div>
	</div>

</form:form>