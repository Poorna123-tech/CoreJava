package assignment;

   class T2Batsman {
    	
      void Batsman(){}
 	  private String name ;
 	  private int runsScored;
 	  private int centuries;
 	  private int halfCenturies;
 	  private int ballsFaced;
 	  private int fours;
 	  private int sixes;
	public T2Batsman(String name, int runsScored, int centuries, int halfCenturies, int ballsFaced, int fours,
			int sixes) {
		super();
		this.name = name;
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced = ballsFaced;
		this.fours = fours;
		this.sixes = sixes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRunsScored() {
		return runsScored;
	}
	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}
	public int getCenturies() {
		return centuries;
	}
	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}
	public int getHalfCenturies() {
		return halfCenturies;
	}
	public void setHalfCenturies(int halfCenturies) {
		this.halfCenturies = halfCenturies;
	}
	public int getBallsFaced() {
		return ballsFaced;
	}
	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}
	public int getFours() {
		return fours;
	}
	public void setFours(int fours) {
		this.fours = fours;
	}
	public int getSixes() {
		return sixes;
	}
	public void setSixes(int sixes) {
		this.sixes = sixes;
	}
  
 	
 	 }
 public class T2_Batsman{
   public static void main(String args[]){
		 T2_Batsman b = new T2_Batsman();
		 System.out.print("name = AB de Villars" + "\nrunsScored = 973" +  "\ncenturies = 4" + "\nhalfCenturies = 7" + "\nballsFaced = 640" + "\nfours = 83"+ "\nsixes = 38");
   }
 }