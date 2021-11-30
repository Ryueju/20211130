<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>



<body>

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&amp;display=swap" rel="stylesheet">

    <link rel="stylesheet" href="fonts/icomoon/style.css">

    <link rel="stylesheet" href="css/owl.carousel.min.css">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    
    <!-- Style -->
    <link rel="stylesheet" href="css/style.css">

    <title>Table #6</title>
  </head>
  
  <body>
  

  <div class="content">
    
    <div class="container">
      <h2 class="mb-5">Modify your Review!</h2>
      
<form action="bookResister.do" method="post" id="frm" enctype="multipart/form-data">
           
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

              
                      
                      <td>
                       NO
                      </td>
                      <td><textarea rows="2" cols="20" name="title" id="title"></textarea></td>
                      <td>
                       <textarea rows="2" cols="20" name="author" id="author"></textarea>
                      </td>
                      <td><textarea rows="2" cols="20" name="image" id="image"></textarea></td>
                      <td><textarea rows="5" cols="25" name="subject" id="subject"></textarea></td>
                      <td><a href="#" class="more">★★★★★</a></td>
            
            </tr>         
          </tbody>
        </table>
      </div>
 <br>
                <div>
                    <input id="lastbutton" class="btn btn-dark" type="submit" value="저 장">&nbsp;&nbsp;&nbsp;&nbsp;
                    <button id="lastbutton" class="btn btn-dark" type="button" onclick="location.href='bookReview.do'" value="취 소">돌아가기</button>
                </div>
            </form>

    </div>

  </div>
    
    

    <script src="js/jquery-3.6.0.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/main.js"></script>
  
</body>

	 <div>
          
           
        </div>
    
</body>
</html>