package co.eju.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.eju.prj.comm.Command;

public class BookForm implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		return "books/bookForm";
	}

}
