package co.eju.prj.book.serviceImpl;

import java.util.List;


import org.apache.ibatis.session.SqlSession;

import co.eju.prj.book.service.BookMapper;
import co.eju.prj.book.service.BookService;
import co.eju.prj.book.service.BookVO;
import co.eju.prj.comm.DataSource;

public class BookServiceImpl implements BookService {
	
	private SqlSession sqlSession = DataSource.getDataSource().openSession(true);
	private BookMapper map = sqlSession.getMapper(BookMapper.class);

	@Override
	public List<BookVO> bookList() {
		// TODO Auto-generated method stub
		return map.bookList();
	}

	@Override
	public BookVO bookSelect(BookVO vo) {
		// TODO Auto-generated method stub
		return map.bookSelect(vo);
	}

	@Override
	public int bookInsert(BookVO vo) {
		// TODO Auto-generated method stub
		return map.bookInsert(vo);
	}

	@Override
	public int bookUpdate(BookVO vo) {
		// TODO Auto-generated method stub
		return map.bookUpdate(vo);
	}

	@Override
	public int bookDelete(BookVO vo) {
		// TODO Auto-generated method stub
		return map.bookDelete(vo);
	}

	@Override
	public List<BookVO> bookSearchList(String searchKey) {
		// TODO Auto-generated method stub
		return map.bookSearchList(searchKey);
	}

}
