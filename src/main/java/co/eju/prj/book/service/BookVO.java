package co.eju.prj.book.service;

public class BookVO {
	private int id;
	private String title;
	private String author;
	private String image;
	private String subject;
	private String nFileName;
	private String PFileName;
	
	
	public String getnFileName() {
		return nFileName;
	}
	public void setnFileName(String nFileName) {
		this.nFileName = nFileName;
	}
	public String getPFileName() {
		return PFileName;
	}
	public void setPFileName(String pFileName) {
		PFileName = pFileName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "BookVO [id=" + id + ", title=" + title + ", author=" + author + ", image=" + image + ", subject="
				+ subject + "]";
	}
	
	
	
}
