package _05_netflix;

public class movieboi {
public static void main(String[] args) {
	
	Movie Endgame = new Movie("Endgame",5);
	Movie LetsPlayEp3 = new Movie("We found diamonds! Minecraft Let's play Episode 3" , 3);
	Movie Roblox = new Movie("Roblox" , 4);
	Movie PoweringMemes = new Movie("Roblox: Powering memes" , 4);
	Movie sdfgkdfhjd = new Movie("jfbsbdfjkbsdkfhjb" , 0);
	
	System.out.println(Endgame.getTicketPrice());
	System.out.println(LetsPlayEp3.getTicketPrice());
	System.out.println(Roblox.getTicketPrice());
	System.out.println(PoweringMemes.getTicketPrice());
	System.out.println(sdfgkdfhjd.getTicketPrice());
	
	NetflixQueue what = new NetflixQueue();
	what.addMovie(Endgame);
	what.addMovie(LetsPlayEp3);
	what.addMovie(Roblox);
	what.addMovie(PoweringMemes);
	what.addMovie(sdfgkdfhjd);
	
	what.printMovies();
	
	System.out.println("The best movie is..");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
