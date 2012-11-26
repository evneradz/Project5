import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class TotalUploadsCounter implements ServletContextAttributeListener {

  private static int total_up = 0;
  
  public void attributeAdded(ServletContextAttributeEvent scab) {
   total_up++;
  }

  
  public void attributeRemoved(ServletContextAttributeEvent scab) {

  }

 
  public void attributeReplaced(ServletContextAttributeEvent scab) {
 
  }
  
  public static int getAccessions(){
	
	return total_up-1; //Deleting adedXorg.apache.jasper.runtime.JspApplicationContextImpl org.apache.jasper.runtime.JspApplicationContextImpl@580754fc

	
	}

}
