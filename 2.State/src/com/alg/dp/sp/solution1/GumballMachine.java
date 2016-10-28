package com.alg.dp.sp.solution1;

public class GumballMachine {
	private int gumballs;
	private float money;
	private int state;
	
	final static int NO_GUMBALLS_NO_QUARTER = 0;
	final static int NO_GUMBALLS_QUARTER = 3;
	final static int GUMBALLS_NO_QUARTER = 1;
	final static int GUMBALLS_QUARTER = 2;
	
	public GumballMachine() {
		state = NO_GUMBALLS_NO_QUARTER;
	}
	
	public void insertQuarter() {
		if(state == NO_GUMBALLS_NO_QUARTER) {
			state = NO_GUMBALLS_QUARTER;	
			System.out.println("Quarter is inserted");
		} else if(state == NO_GUMBALLS_QUARTER) {
			System.out.println("Quarter already inserted");
		} else if(state == GUMBALLS_NO_QUARTER) {
			state = GUMBALLS_QUARTER;
			System.out.println("Quarter is inserted");
		} else {
			System.out.println("Quarter already inserted");
		}		
	}
	
	public void ejectQuarter() {
		if(state == NO_GUMBALLS_NO_QUARTER || state == GUMBALLS_NO_QUARTER) {
			System.out.println("No quarter is inserted");			
		} else  {
			System.out.println("Quarter is ejected");
			if(state == GUMBALLS_QUARTER)
				state = GUMBALLS_NO_QUARTER;
			else
				state = NO_GUMBALLS_NO_QUARTER;
		} 		
	}
	
	public void turnHandle() {
		if(state == NO_GUMBALLS_NO_QUARTER) {
			System.out.println("Please insert quarter");			
		} else if(state == NO_GUMBALLS_QUARTER) {
			System.out.println("No stock left..take ur quarter back");
			state = NO_GUMBALLS_NO_QUARTER;
		} else if(state == GUMBALLS_NO_QUARTER) {
			System.out.println("Please insert quarter");
		} else {
			System.out.println("Take the gumball");
			--gumballs;
			money += 0.25;
			if(gumballs == 0)
				state = NO_GUMBALLS_NO_QUARTER;
			else
				state = GUMBALLS_NO_QUARTER;
		}
	}
	
	public void addGumballs(int count) {
		gumballs += count;	
		if(state == NO_GUMBALLS_NO_QUARTER) {
			state = GUMBALLS_NO_QUARTER;			
		} else if(state == NO_GUMBALLS_QUARTER) {
			state = GUMBALLS_QUARTER;
		} else {
			
		}
		System.out.println("Added " + count + " gumballs");
	}
	
	public String toString() { 
		return "Gumballs:" + gumballs + "\nMoney:" + money;
	}

}
