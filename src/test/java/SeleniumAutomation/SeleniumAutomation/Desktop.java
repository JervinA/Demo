package SeleniumAutomation.SeleniumAutomation;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Desktop {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		
		Screen s = new Screen();
		
		Pattern setting = new Pattern("C:\\Users\\c.JERVIN\\Documents\\Setting.PNG");
		s.click(setting);
		Thread.sleep(9000);
		Pattern system = new Pattern("C:\\Users\\c.JERVIN\\Documents\\System.PNG");	
//		Pattern val = new Pattern("C:\\Users\\c.JERVIN\\Documents\\ValndUp");
		
	if (s.exists(system) != null) {
		System.out.println("is displayed");
	} else {
		System.out.println("not displayed");
	}
		
		
		}
		
		
	/*	s.click(system);
		Thread.sleep(5000);
		Pattern close = new Pattern("C:\\Users\\c.JERVIN\\Documents\\Close.PNG");
		s.click(close);  */
		
		
		
	}


