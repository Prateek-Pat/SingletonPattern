package SingletonClass;

/*
	In OOP's Sinnleton class is as class which can have only one object (Instance of the class)at a time

	Rule to create to create SingletonClass
	1) Create private constructor
	2) Create static method (getInstance) that has return type of object of this singleton Class
		
	This process also called as Lazy Initialization
 														*/

public class singletonClass{
	
	public static singletonClass SC = null;
	public String str;
		
	//1st condition private constructor
	private singletonClass(){
		
		str = "Creatiing SIngleton Class and Implementing it";
		//String str = "Creatiing SIngleton Class and Implementing it";
	}
	
	//2nd condition static method
	public static singletonClass getInstance(){
	if(SC == null){  // if condition is true then only initialize the object SC 
	SC = new singletonClass();			
				}
	return SC;
	}

	public static void main(String[] args) {
		
		singletonClass X = singletonClass.getInstance();
		/*
		 * 
			On creating objecct X following things will be happn
			1) getInstance() method will be called
			2) Since SC is not null, Hence SC will be initialized
			3) As soon as object created singletonClass() constructor will be called & str will be inistalized
			4) SC object will now initialized with singletonClass().
		
			*/
		
		singletonClass Y = singletonClass.getInstance();
		/*
		 * 1) This Y object will not be initialzed, Since SC==null condition is not true
		 * 
		 */
		singletonClass Z = singletonClass.getInstance();		
		/*
		 * 1) This Y object will not be initialzed, Since SC==null condition is not true
		 * 
		 */
		
		String FisrttObj = X.str;
		System.out.println(FisrttObj);
		
		String SecondObj = Y.str;
		System.out.println(SecondObj);
	}
}