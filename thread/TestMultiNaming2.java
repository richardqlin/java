class TestMultiNaming2 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String args[]){
		TestMultiNaming2 t1= new TestMultiNaming2();
		TestMultiNaming2 t2= new TestMultiNaming2();

		//System.out.println("Name of t1:"+t1.getName());
		//System.out.println("Name of t2:"+t2.getName());

		t1.start();
		t2.start();
		//t1.setName("Sonoo Jaiswai");
		//System.out.println("After changing name of t1:"+t1.getName());
	}
}