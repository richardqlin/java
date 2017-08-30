class TestSleep extends Thread{

	public void run(){
		int i=0;
		while (i<100){
			try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
			System.out.println(i);
			i++;
		}
	}
public static void main(String[] args){
	TestSleep t1=new TestSleep();
	TestSleep t2= new TestSleep();

t1.start();
t2.start();
} 

}