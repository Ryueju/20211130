package co.eju.prj.comm;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.eju.prj.command.AjaxBookUpdate;
import co.eju.prj.command.BookDelete;
import co.eju.prj.command.BookForm;
import co.eju.prj.command.BookResister;
import co.eju.prj.command.BookReview;
import co.eju.prj.command.BookSelect;
import co.eju.prj.command.BookUpdate;
import co.eju.prj.command.HomeCommand;


@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Command> map = new HashMap<String, Command>();
       
   
    public FrontController() {
        super();
      
    }


	public void init(ServletConfig config) throws ServletException {
		map.put("/home.do", new HomeCommand());
		map.put("/bookReview.do", new BookReview()); //책 리뷰 게시판
		map.put("/bookForm.do", new BookForm()); //책 리뷰 등록폼
		map.put("/bookResister.do", new BookResister()); //책 리뷰 작성처리
		
		map.put("/bookDelete.do", new BookDelete()); //책 리뷰 삭제처리
		map.put("/bookSelect.do", new BookSelect()); //책 리뷰 개별보기
		
		map.put("/bookUpdate.do", new BookUpdate()); //책 리뷰 수정페이지 이동
		map.put("/ajaxBookUpdate.do", new AjaxBookUpdate());//책 리뷰 수정페이지 처리
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
	      //request객체들이 갖고 있는 것임
	      String uri= request.getRequestURI();
	      String contextPath = request.getContextPath();
	      String page = uri.substring(contextPath.length());
	      
	      Command command = map.get(page); //
	      String viewPage = command.run(request, response); 
	      if(!viewPage.endsWith(".do")) {
	          if(viewPage.startsWith("ajax:")) {
	             response.setContentType("text/html; charset=UTF-8");
	             PrintWriter out = response.getWriter();
	             out.write(viewPage.substring(5));
	             return;
	          }if(viewPage.endsWith(".jsp")) {
	             viewPage="WEB-INF/views/"+viewPage;
	          }else {
	             viewPage = viewPage+".tiles";
	             
	          }
	          
	       }
	      
	      RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
	      dispatcher.forward(request, response);
	}

}
