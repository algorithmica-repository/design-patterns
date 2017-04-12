package com.alg.dp.project2.solution2;

public class GumballMachine {
	private int ngumballs;
	private float money;	
	private IState state;
	
	private NoGumballsNoCoin ng_nc;
	private NoGumballsCoin ng_c;
	private GumballsNoCoin g_nc;
	private GumballsCoin g_c;
	
	public IState getState(String id) {
		if(id.equals("ng_nc"))
			return ng_nc;
		else if(id.equals("ng_c"))
			return ng_c;
		else if(id.equals("g_nc"))
			return g_nc;
		else
			return g_c;
	}
	
	public GumballMachine() {
		ngumballs = 0;
		money = 0.0f;
		ng_nc = new NoGumballsNoCoin(this);
		ng_c = new NoGumballsCoin(this);
		g_nc = new GumballsNoCoin(this);
		g_c = new GumballsCoin(this);
		state = ng_nc;
	}
	
	public GumballMachine(int count) {
		//reuse the default constuctor logic
		this();
		ngumballs = count;
		money = 0.0f;
		state = g_nc;
	}

	public void addGumballs(int count) {
		state.addGumballs(count);		
	}
	
	public void insertCoin() {
		state.insertCoin();
	}

	public void turnHandle() {
		state.turnHandle();
	}

	@Override
	public String toString() {
		return "GumballMachine [ngumballs=" + ngumballs + ", money=" + money
				+ ", state=" + state + "]";
	}

	public void addCount(int count) {
		ngumballs += count;
	}
	
	public void setState(IState state) {
		this.state = state;
	}
	
	public void updateState() {
		ngumballs -= 1;
		money += 1;
	}
	
	public int getNumGumballs() {
		return ngumballs;
	}
}
