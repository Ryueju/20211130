package co.eju.prj.command;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import co.eju.prj.book.service.BookService;
import co.eju.prj.book.service.BookVO;
import co.eju.prj.book.serviceImpl.BookServiceImpl;
import co.eju.prj.comm.Command;

public class BookDelete implements Command {
	
	private String message = null;

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		BookService bookDao = new BookServiceImpl();
		BookVO book = new BookVO();
		
		book.setId(Integer.parseInt(request.getParameter("id").trim()));
	//	request.setAttribute("book", bookDao.bookDelete(book));
		
		
		int r = bookDao.bookDelete(book);
		if(r>0) {
			message = "삭제가 정상적으로 완료 되었습니다.";
		}else {
			message = "삭제 중에 오류가 발생하였습니다.";
		}
		request.setAttribute("message", message);
		
		return "bookReview.do";
	}

}
