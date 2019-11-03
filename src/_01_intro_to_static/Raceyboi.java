package _01_intro_to_static;


	public class Raceyboi {
	    static int nextBibNumber;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;

	    Raceyboi (String name, int speed){
	        this.name = name;
	        this.speed = speed;
	        nextBibNumber++;
	        bibNumber = nextBibNumber;
	    }

	    public static void main(String[] args) {
	        //create two athletes
	    Raceyboi racer1 = new Raceyboi("Jackson" , 5);
	    Raceyboi racer2 = new Raceyboi("Jackson's brother in law that he didn't consent to have but he did anyway" , 8);
	        //print their names, bibNumbers, and the location of their race. 
	   racer1.name="Jackson";
	  racer2.name="Jackson's brother in law that he didn't consent to have but he did anyway";
System.out.println("Jackson");
System.out.println("Jackson's brother in law that he didn't consent to have but he did anyway");

	    }
	}