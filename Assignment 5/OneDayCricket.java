package demo;

public class OneDayCricket extends Cricket {
	
	
	public OneDayCricket(int targetScore) {
		super(50,targetScore);
	}
	
	double calcCurrentRunrate(int currentScore,int currentOver) {
		return currentScore/currentOver;
	}
	
	double calcReqdRunrate(int remainingRuns,int remainingOver) {
		return remainingRuns/remainingOver;
	}
	

}

