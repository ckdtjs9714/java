
public class Book {
	private String title;
	private String author;
	private String genre;
	private int agecut;
	private boolean Bestseller;

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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getAgecut() {
		return agecut;
	}

	public void setAgecut(int agecut) {
		this.agecut = agecut;
	}

	public boolean isBestseller() {
		return Bestseller;
	}

	public void setBestseller(boolean bestseller) {
		Bestseller = bestseller;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		b.setTitle("no game no life");
		b.setAuthor("???");
		b.setGenre("fantasi");
		b.setAgecut(15);
		b.setBestseller(false);
		
	}

}
