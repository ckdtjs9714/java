
public class Movie {
	String title;
	double rating;
	String Director;
	String Date;
	String Writer;
	String actor;
	String genre;
	
	void print(){
			System.out.println
			(title +":"+"genre :"+ genre +","+ "Director :" + Director+","+"Writer :" + Writer +","+ "MainActor :" + actor + ","+"Date :" + Date +","+"rating :" +rating);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m;
		m = new Movie();
		m.title = "Tomb Raider ";
		m.Director = " Roar Uthaug ";
		m.Writer = "Geneva Robertson-Dworet ";
		m.actor = "Alicia Vikander";
		m.Date = " 8 March 2018 ";
		m.rating = 7.5;
		m.genre = "Action-Adventure";
		m.print();
	}

}
