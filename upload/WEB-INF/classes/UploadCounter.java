import javax.servlet.*;
import javax.servlet.http.*;


public class UploadCounter implements HttpSessionAttributeListener{

private static int session_uploads = 0;

	public void attributeAdded(HttpSessionBindingEvent event){
	
		 session_uploads++;
	}
	
	public void attributeRemoved(HttpSessionBindingEvent event){

		
	}
	
	public void attributeReplaced(HttpSessionBindingEvent event){
	
		
	}
	public static int getNewAttributes(){
	
	return session_uploads;
	
	}

}
