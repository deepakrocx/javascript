class Demo{
   String name ;
   int age ;
	long contact ;
	long uid ;
	static String coyntry = "INDIA";
	public Demo(){
		System.out.println("creation block");
		
	}
	public static void main(String [] args){
		Demo obj1 = new Demo();
		Demo obj2 = new Demo();
				System.out.println(obj1);
				System.out.println(obj2);
	}
		
}