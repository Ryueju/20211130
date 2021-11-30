package co.eju.prj.book.service;

import java.util.List;

public interface BookService {
	
	List<BookVO> bookList();
	BookVO bookSelect(BookVO vo);
	int bookInsert(BookVO vo);
	int bookUpdate(BookVO vo);
	int bookDelete(BookVO vo);
	
	List<BookVO> bookSearchList(String searchKey);

}
