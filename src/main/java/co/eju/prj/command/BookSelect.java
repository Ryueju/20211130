package co.eju.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.eju.prj.book.service.BookService;
import co.eju.prj.book.service.BookVO;
import co.eju.prj.book.serviceImpl.BookServiceImpl;
import co.eju.prj.comm.Command;

public class BookSelect implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		BookService bookDao = new BookServiceImpl();
		BookVO vo = new BookVO();
		vo.setId(Integer.parseInt(request.getParameter("id").trim()));
		request.setAttribute("book", bookDao.bookSelect(vo));
		return "books/bookSelect";
	}

}
