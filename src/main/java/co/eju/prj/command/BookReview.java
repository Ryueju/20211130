package co.eju.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.eju.prj.book.service.BookService;
import co.eju.prj.book.serviceImpl.BookServiceImpl;
import co.eju.prj.comm.Command;

public class BookReview implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		
		//bookList 처리
				BookService bookDao = new BookServiceImpl();
				request.setAttribute("books", bookDao.bookList());
		return "books/bookReview";
	}

}
