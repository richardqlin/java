class TestMultiPriority1 extends Thread{
	public void run(){
		System.out.println("running thread name is:"+Thread.currentThread().getName());
		System.out.println("running thread priority is:"+Thread.currentThread().getPriority());

	}

	public static void main(String args[]){
		TestMultiPriority1 m1= new TestMultiPriority1();
		TestMultiPriority1 m2= new TestMultiPriority1();

		//System.out.println("Name of t1:"+t1.getName());
		//System.out.println("Name of t2:"+t2.getName());

		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MIN_PRIORITY);
		m1.start();
		m2.start();

		//t1.setName("Sonoo Jaiswai");
		//System.out.println("After changing name of t1:"+t1.getName());
	}
}