public class workingwithjava {
	
	public static void main(String[] args) {
		
		
		//property name
		System.getProperty("os.name");
		System.out.println("OS = " + System.getProperty("os.name"));
		
		//getting milliseconds
		System.currentTimeMillis();  
		System.out.println("Milliseconds since Jan 1 1970 = " + System.currentTimeMillis());  
		
		//boolean  
		String awake = String.valueOf(true);
		System.out.println("My boolean result for isAwake = " + awake);
		
		//hex string
		String hexnum = "64";
		int num = Integer.parseInt(hexnum,10);
		System.out.println("My hex result for 100 = " + num);
		
		
  
	  boolean isAwake = Boolean.parseBoolean("True"); 
	  
	  
	}  
}
