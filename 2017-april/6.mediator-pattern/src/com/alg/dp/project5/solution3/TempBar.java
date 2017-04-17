package com.alg.dp.project5.solution3;

public class TempBar implements IWidget {
	private float temp;
	
	public void update(float temp) {
		this.temp = temp;
		System.out.println("Temp bar:" + temp);
	}
	
	@Override
	public void change(float temp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		
	}

}
