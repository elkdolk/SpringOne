<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<head>

</head>

<title><tiles:getAsString name="title" /></title>

<body>

	


	<tiles:insertAttribute name="body" />
	<center>
		<tiles:insertAttribute name="footer" />
	</center>
</body>