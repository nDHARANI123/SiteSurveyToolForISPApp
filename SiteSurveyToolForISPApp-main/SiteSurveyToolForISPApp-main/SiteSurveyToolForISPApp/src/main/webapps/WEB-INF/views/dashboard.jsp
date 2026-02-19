<!-- Define JSP Tags Before deploying JSP pages -->
<%@ page language="java" contentType="text/html; charset=UTF-8" %>

	<!DOCTYPE html>
	<html>

	<head>
		<title> Dashboard</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
	</head>

	<body>
		<!-- Outer Nav -->
		<nav class="" navbar navbar-dark bg-dark"">

			<!-- First Div-->
			<div class="container-fluid">
				<span class="navbar-brand">Site Survey Tool</span>
				<a href="/logout" class="btn btn-danger">Logout</a>
			</div>
		</nav> <!-- Close Nav-->

		<!-- Outer div-->
		<div class="container mt-4">
			<h2>Welcome, ${sessionScope.USER} </h2>

			<!-- Inner Div-->
			<div class="list-group mt-3">
				<a href="/property" class="list-group-item list-group-item-action">Add Property</a>
				<a href="/floor" class="list-group-item list-group-item-action">Upload Floor Plan</a>
			</div> <!-- Close Inner div-->
		</div> <!-- Close Outer Div-->

	</body>

	</html>