package SeleniumAutomation.SeleniumAutomation;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Desktoptry {
	
	@Test
	

	public static void main(String[] args) throws InterruptedException, FindFailed {
Screen s = new Screen();

		Pattern setting = new Pattern("C:\\Users\\c.JERVIN\\Documents\\Desktoptry.PNG");
		s.click(setting);
		Thread.sleep(9000);
/*		Pattern system = new Pattern("C:\\Users\\c.JERVIN\\Documents\\System.PNG");	

		
	if (s.exists(system) != null) {
		System.out.println("is displayed");
	} else {
		System.out.println("not displayed");
	}
		*/
		
		

	}

}

