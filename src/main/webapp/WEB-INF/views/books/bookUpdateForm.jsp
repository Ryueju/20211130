<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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

    <title>Modify my review</title>
  </head>
  
  <body>
  

  <div class="content">
    
    <div class="container">
      <h2 class="mb-5">Modify my review</h2>
      

      <div class="table-responsive">
<form method="post" id="dataTable">
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

             
						
						
						
						
					
                      
                      <td>${book.id }</td>
                     <td>
							<input type="text" id="title" name="title" value="${book.title }">
						</td>
                     
						<td>
							<input type="text" id="author" name="author" value="${book.author }">
						</td>
                      <td>
							<input type="text" id="image" name="image" value="${book.image }">
						</td>
                      <td>
							<input   type="text" id="subject" name="subject" rows="5" cols="25" value="${book.subject }">
						</td>
                      <td><a href="#" class="more">Details</a></td>
            
            </tr>

          
          </tbody>
        </table>
        
        <div>
			<button id="lastbutton" class="btn btn-dark" type="button" onclick="AjaxBookUpdate()">수정</button>
			<button  id="lastbutton" class="btn btn-dark" type="button" onclick="history.back()">뒤로가기</button>
			<input  type="hidden" value="${book.id }" id="id" name="id">
			
		</div>
        </form>
      </div>


    </div>

  </div>
    
    

    <script src="js/jquery-3.6.0.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/main.js"></script>
  
</body>

<script type="text/javascript">

	function AjaxBookUpdate(){
		//아작스처리
		//yes -> alert(성공) location.href = bookselect.do?id='+'${book.id }'
		//no -> alert(실패)
		$.ajax({
			url : "ajaxBookUpdate.do",
			type : 'post',
			datatype : 'text',
			data : $('#dataTable').serialize(),
			success : function(data){
				if(data){
				location.href = 'bookSelect.do?id='+'${book.id }'
				alert("수정 완료");
				}else if(data){
					alert("수정 실패");
				}
			},
			error : function(data){
				
				alert("error..");
			}
				
		})
		
	}
</script>
</body>
</html>