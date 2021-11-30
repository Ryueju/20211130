<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,400&amp;display=swap"
	rel="stylesheet">

<link rel="stylesheet" href="fonts/icomoon/style.css">

<link rel="stylesheet" href="css/owl.carousel.min.css">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">

<!-- Style -->
<link rel="stylesheet" href="css/style.css">

<title>My book Reviews</title>
</head>

<body>


	<div class="content">

		<div class="container">
			<h2 class="mb-5">My book Reviews</h2>


			<div class="table-responsive">

				<table class="table table-striped custom-table">
					<thead>
						<tr>

							<th scope="col">Order</th>
							<th scope="col">TITLE</th>
							<th scope="col">AUTHOR</th>
							<th scope="col">PUBLISHER</th>
							<th scope="col">OPINION</th>
							<th scope="col"></th>
						</tr>
					</thead>
					<tbody>
						<tr scope="row">
					<tbody>


						<c:forEach items="${books }" var="book">
							<tr onclick="location.href='bookSelect.do?id=${book.id }'">
								<td>${book.id }</td>
								<td>${book.title }</td>
								<td>${book.author }</td>
								<td>${book.image }</td>
								<td>${book.subject }</td>
								<td><a href="#" class="more">Details</a></td>
							</tr>
						</c:forEach>


					</tbody>
				</table>
			</div>

			<div>
				<button id="lastbutton" class="btn btn-dark" type="button"
					onclick="location.href='bookForm.do'">리뷰 등록</button>
			</div>
		</div>

	</div>



	<script src="js/jquery-3.6.0.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/main.js"></script>

</body>






</body>
</html>