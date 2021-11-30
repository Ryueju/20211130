package co.eju.prj.command;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.eju.prj.book.service.BookService;
import co.eju.prj.book.service.BookVO;
import co.eju.prj.book.serviceImpl.BookServiceImpl;
import co.eju.prj.comm.Command;

public class BookResister implements Command {
	private String filePath = "C:\\fileTest";//..\\두번 넣는것은 특수 기호를 인식하라는 의미
	private int fileSize = 1024*1024*100; 

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		BookService bookDao = new BookServiceImpl();
		BookVO book = new BookVO();
		
		//insert 값 -> vo객체 / insert
		try {
			MultipartRequest multi = new MultipartRequest(request, filePath, fileSize, "UTF-8", new DefaultFileRenamePolicy());
			String orgFile = multi.getOriginalFileName("nFileName");
			String fileName =  multi.getFilesystemName("nFileName");
			fileName = filePath + File.separator+fileName;//저장경로를 포함해서 가공(/slash)추가 이렇게 추가하면 굳\\2번할 필요가 없음
			if(orgFile!=null) {
				book.setnFileName(orgFile);
				book.setPFileName(fileName);
			}else {
				//map에 insert into notice(,,,,) col명을 모두 써주면, null값을 제대로 인식해주므로
				//딱히 if구문을 사용할 필요가 없음
				book.setnFileName("");
				book.setPFileName("");
			}
			
			//multi를 사용하는 경우 request대신 multi로 받아주어야함
			
			//form으로 넘어오는 값들은 전부 String으로 들어옴
			//vo객체를 전부 String 으로 하거나 Date.valueOf를 사용해서 변화해주어야함
			book.setAuthor(multi.getParameter("author"));
			book.setImage(multi.getParameter("image"));
			book.setTitle(multi.getParameter("title"));
			book.setSubject(multi.getParameter("subject"));
			bookDao.bookInsert(book);
		}
		
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "bookReview.do";
	}

}
