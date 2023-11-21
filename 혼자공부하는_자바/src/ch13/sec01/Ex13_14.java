package ch13.sec01;

import java.util.ArrayList;
/*
 	동기화된 임계영역의 코드를 수행하다가 작업을 더 이상 진행할 상황이 아니면 
 	wait()호출하여 쓰레드가 락을 반납하고 기다리게 함
 	그러면 다른 쓰레드가 락을 얻어 해당 객체에 대한 작업을 수행할 수 있게 됨
 	나중에 작업을 진행할 수 있는 상황이 되면 notify()를 호출해서,
 	작업을 중단했던 쓰레드가 다시 락을 얻어 작업을 진행할 수 있게 함
 	
 	
 	
 */
class Customer implements Runnable {
	private Table table;
	private String food;
	
	Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			if(eatFood()) {
				System.out.println(name + " ate a " + food);
			} else {
				System.out.println(name + " failed to eat. : (");
			}
		}
	}
	boolean eatFood() {
		return table.remove(food);
	}	
}

class Cook implements Runnable {
	private Table table;
	
	Cook(Table table) {
		this.table = table;
	}
	public void run() {
		while(true) {
			int idx = (int)(Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
class Table {
	String[] dishNames = {"donut", "donut", "burger"};
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>();

	public synchronized void add(String dish) { // synchronized를 추가
		if(dishes.size() >= MAX_FOOD) {
			return;
		}
		dishes.add(dish);
		System.out.println("Dishes : " + dishes.toString());
	}
	
	public boolean remove(String dishName) {
		synchronized(this) {
			while(dishes.size()==0) {
				String name = Thread.currentThread().getName();
				System.out.println(name + "is wating.");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
			for(int i=0; i<dishes.size(); i++) 
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i);
					return true;
				}
		}
		
			return false;
		}
		public int dishNum() {
			return dishNames.length;	
		}
	}

public class Ex13_14 {
	public static void main(String[] args) throws Exception {
		Table table = new Table(); // 여러 쓰레드가 공유하는 객체
			
		new Thread(new Cook(table), "COOK").start();
		new Thread(new Customer(table, "donut"), "CUST1").start();
		new Thread(new Customer(table, "burger"), "CUST2").start();
		
		Thread.sleep(5000);
		System.exit(0);
	}

}
