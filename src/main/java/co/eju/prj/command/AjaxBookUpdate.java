package co.eju.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.eju.prj.book.service.BookService;
import co.eju.prj.book.service.BookVO;
import co.eju.prj.book.serviceImpl.BookServiceImpl;
import co.eju.prj.comm.Command;

public class AjaxBookUpdate implements Command {
	public String msg;
	
	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		//request로 값을 전부 vo객체 넣어주어야함
		//update처리
		//!=0 -> yes ==0 -> no
		BookService bookDao = new BookServiceImpl();
		BookVO vo = new BookVO();
		
		System.out.println("id"+request.getParameter("id"));
		vo.setId(Integer.parseInt(request.getParameter("id".trim()).trim()));
		vo.setTitle(request.getParameter("title"));
		vo.setAuthor(request.getParameter("author"));
		vo.setImage(request.getParameter("image"));
		vo.setSubject(request.getParameter("subject"));
		int n = bookDao.bookUpdate(vo);
		if(n !=0) {
			msg = "yes";
		} else {
			msg = "no";
		}
//		String msg = null;
		return "ajax:"+msg;
	}

}
