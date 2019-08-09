package com.alg.oodesign.solution31;

import java.util.Random;

class MyThread extends Thread {
	private DinnerMenu dmenu;
	public MyThread(DinnerMenu dmenu) {
		this.dmenu = dmenu;
	}
	@Override
	public void run() {
		Iterator it = dmenu.iterator();
		while(it.hasNext())
			System.out.println(Thread.currentThread().getId() + ":" + it.next());
	}
	
}
public class Test {

	public static void main(String[] args) throws Exception {
		Random r = new Random(); 
		BreakfastMenu bmenu = new BreakfastMenu(5);
		for(int i = 0; i < 6; ++i) {
			String name = "BItem" + i;
			int price = r.nextInt(500) + 100;
			MenuItem item = new MenuItem(name, price);
			bmenu.addItem(item);;
		}
		
		DinnerMenu dmenu = new DinnerMenu();
		for(int i = 0; i < 100; ++i) {
			String name = "DItem" + i;
			int price = r.nextInt(500) + 100;
			MenuItem item = new MenuItem(name, price);
			dmenu.addItem(item);;
		}
		
		/*while(bmenu.hasNext())
			System.out.println(bmenu.next());
		
		while(dmenu.hasNext())
			System.out.println(dmenu.next());
			
*/
		MyThread t1 = new MyThread(dmenu);
		t1.start();
		MyThread t2 = new MyThread(dmenu);
		t2.start();
		t1.join();
		t2.join();
	}

}
