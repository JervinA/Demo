package SeleniumAutomation.SeleniumAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.hotkey.Keys;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class ReadExcel_Sikuli {

	public static void main(String[] args) throws FindFailed, InterruptedException, AWTException {
		
		Screen s = new Screen();
		
		Robot robot = new Robot();
		
		Thread.sleep(4000);
		
	/*	Pattern FirstA = new Pattern("C:\\Users\\c.JERVIN\\Documents\\A.PNG");
		s.click(FirstA);  */
		Thread.sleep(4000);
		 s.type("f", Keys.CTRL);
		 Thread.sleep(2000);
		 s.type("2");
		 Thread.sleep(2000);
		 s.type(Keys.ENTER);
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_ESCAPE);
         robot.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(2000);	
			
			

            // Simulate pressing Ctrl + Shift + Right Arrow
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_RIGHT);
            robot.keyRelease(KeyEvent.VK_RIGHT);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_DOWN);

            // Release Ctrl + Shift + Down Arrow
            robot.keyRelease(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_C);

            // Release Ctrl + C
            robot.keyRelease(KeyEvent.VK_C);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            
       /*     Pattern CSheet3 = new Pattern("C:\\Users\\c.JERVIN\\Documents\\Sheet3.PNG");
    		s.click(CSheet3);  */
            
    		
    	//	s.click(FirstA);
            
            //moving to team
            
             robot.keyPress(KeyEvent.VK_CONTROL);
             robot.keyPress(KeyEvent.VK_PAGE_UP);
            robot.keyRelease(KeyEvent.VK_PAGE_UP);
            robot.keyRelease(KeyEvent.VK_CONTROL);
    		
    	/*	robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_DOWN);

            // Release Ctrl + Shift + Down Arrow
            robot.keyRelease(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            
            Thread.sleep(3000);
		
            Pattern CellS = new Pattern("C:\\Users\\c.JERVIN\\Documents\\Cell.PNG");
    		s.click(CellS); */
    		Thread.sleep(3000);
    		
    		robot.keyPress(KeyEvent.VK_CONTROL);           
            robot.keyPress(KeyEvent.VK_V);           
            robot.keyRelease(KeyEvent.VK_CONTROL);           
            robot.keyRelease(KeyEvent.VK_V);
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);                                   
            Thread.sleep(2000);
            
             robot.keyPress(KeyEvent.VK_CONTROL);                       
            robot.keyPress(KeyEvent.VK_HOME);
            robot.keyRelease(KeyEvent.VK_HOME);                      
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(2000);
            
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_DOWN);           
            robot.keyRelease(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            Thread.sleep(2000);

          //moving to Sriram
            
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            
            //Searching data
            
            s.type("f", Keys.CTRL);
   		 Thread.sleep(2000);
   		 s.type("2");
   		 Thread.sleep(2000);
   		 s.type(Keys.ENTER);
   		 Thread.sleep(2000);
   		 robot.keyPress(KeyEvent.VK_ESCAPE);
            robot.keyRelease(KeyEvent.VK_ESCAPE);
   			Thread.sleep(2000);	
            
   			//applying ctrl shift right
   			
   			robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_RIGHT);
            robot.keyRelease(KeyEvent.VK_RIGHT);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            
            //applying ctrl shift down
            
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(2000);
            
            //copying data
            
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_C);
            robot.keyRelease(KeyEvent.VK_C);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(1000);
            
            //moving to TEAM sheet
            
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_PAGE_UP);
           robot.keyRelease(KeyEvent.VK_PAGE_UP);
           robot.keyRelease(KeyEvent.VK_CONTROL);
           robot.keyPress(KeyEvent.VK_CONTROL);
           robot.keyPress(KeyEvent.VK_PAGE_UP);
          robot.keyRelease(KeyEvent.VK_PAGE_UP);
          robot.keyRelease(KeyEvent.VK_CONTROL);
          Thread.sleep(2000);
          
          //pasting data
          
          robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_V);
          robot.keyRelease(KeyEvent.VK_CONTROL);     
          robot.keyRelease(KeyEvent.VK_V);
          Thread.sleep(2000);
           
          //moving to blank cell
          
          robot.keyPress(KeyEvent.VK_DOWN);
          robot.keyRelease(KeyEvent.VK_DOWN);                              
          Thread.sleep(2000);            
          robot.keyPress(KeyEvent.VK_CONTROL);         
          robot.keyPress(KeyEvent.VK_HOME);
          robot.keyRelease(KeyEvent.VK_HOME);         
          robot.keyRelease(KeyEvent.VK_CONTROL);          
          robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_SHIFT);
          robot.keyPress(KeyEvent.VK_DOWN);          
          robot.keyRelease(KeyEvent.VK_DOWN);
          robot.keyRelease(KeyEvent.VK_SHIFT);
          robot.keyRelease(KeyEvent.VK_CONTROL);         
          robot.keyPress(KeyEvent.VK_PAGE_DOWN);
          robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
          Thread.sleep(2000);
          
          //moving to user
          
          robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_PAGE_DOWN);
          robot.keyRelease(KeyEvent.VK_CONTROL);
          robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
          robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_PAGE_DOWN);
          robot.keyRelease(KeyEvent.VK_CONTROL);
          robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
          robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_PAGE_DOWN);
          robot.keyRelease(KeyEvent.VK_CONTROL);
          robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
          Thread.sleep(1000);
          
          //finding data
          
          s.type("f", Keys.CTRL);
    		 Thread.sleep(2000);
    		 s.type("2");
    		 Thread.sleep(2000);
    		 s.type(Keys.ENTER);
    		 Thread.sleep(2000);
    		 robot.keyPress(KeyEvent.VK_ESCAPE);
             robot.keyRelease(KeyEvent.VK_ESCAPE);
    			Thread.sleep(2000);	
           
    			
    			//applying ctrl shift right
       			
       			robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_SHIFT);
                robot.keyPress(KeyEvent.VK_RIGHT);
                robot.keyRelease(KeyEvent.VK_RIGHT);
                robot.keyRelease(KeyEvent.VK_SHIFT);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                
                //applying ctrl shift down
                
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_SHIFT);
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_SHIFT);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                Thread.sleep(1000);
                
                //copying data
                
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_C);
                robot.keyRelease(KeyEvent.VK_C);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                
                //moving to Team sheet
                
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_PAGE_UP);
               robot.keyRelease(KeyEvent.VK_PAGE_UP);
               robot.keyRelease(KeyEvent.VK_CONTROL);
               robot.keyPress(KeyEvent.VK_CONTROL);
               robot.keyPress(KeyEvent.VK_PAGE_UP);
              robot.keyRelease(KeyEvent.VK_PAGE_UP);
              robot.keyRelease(KeyEvent.VK_CONTROL);
              robot.keyPress(KeyEvent.VK_CONTROL);
              robot.keyPress(KeyEvent.VK_PAGE_UP);
             robot.keyRelease(KeyEvent.VK_PAGE_UP);
             robot.keyRelease(KeyEvent.VK_CONTROL);
             Thread.sleep(1000);
             
             //pasting data
             
             robot.keyPress(KeyEvent.VK_CONTROL);
             robot.keyPress(KeyEvent.VK_V);
             robot.keyRelease(KeyEvent.VK_CONTROL);     
             robot.keyRelease(KeyEvent.VK_V);
             Thread.sleep(2000);
             
           //moving to blank cell
             
             robot.keyPress(KeyEvent.VK_DOWN);
             robot.keyRelease(KeyEvent.VK_DOWN);                              
             Thread.sleep(2000);            
             robot.keyPress(KeyEvent.VK_CONTROL);         
             robot.keyPress(KeyEvent.VK_HOME);
             robot.keyRelease(KeyEvent.VK_HOME);         
             robot.keyRelease(KeyEvent.VK_CONTROL);          
             robot.keyPress(KeyEvent.VK_CONTROL);
             robot.keyPress(KeyEvent.VK_SHIFT);
             robot.keyPress(KeyEvent.VK_DOWN);          
             robot.keyRelease(KeyEvent.VK_DOWN);
             robot.keyRelease(KeyEvent.VK_SHIFT);
             robot.keyRelease(KeyEvent.VK_CONTROL);         
             robot.keyPress(KeyEvent.VK_PAGE_DOWN);
             robot.keyRelease(KeyEvent.VK_PAGE_DOWN); 
             Thread.sleep(2000);
                
                
}
}
