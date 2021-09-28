package SeleniumSingleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonDriver {
	
	private static SingletonDriver sinngletonDriver =null;
	public static WebDriver driver;
	
	//1 Private Construcctor
	//2 static method as getInstance() whose return type is of object of singleton Class
		
	private SingletonDriver(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\STUDY Mate\\SELENIUM\\Jar's & Software\\webDriver Chrome\\Chrome 94\\chromedriver_win32_2\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static SingletonDriver getInstance(){
		
		if(sinngletonDriver == null ){		
			sinngletonDriver = new SingletonDriver();
		}
		return sinngletonDriver;
	}	
} 
	
	
	


