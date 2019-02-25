<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head>
		<link href="styles.css" rel="stylesheet">
		<title>
			Uber Fee Calculator Result
		</title>
	</head>
	<body>
		<div id="centerDiv">
			<img src="img/uberLogo.png">
			<h1>Welcome to the UBER fee calculator!</h1>
			<p>The calculated partner fee is: <c:out value="${requestScope.res}" /></p>
		</div>
	</body>
</html>
