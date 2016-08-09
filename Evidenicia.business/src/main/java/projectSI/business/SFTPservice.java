package projectSI.business;

import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;



@ManagedBean
public class SFTPservice {

	
	public String sftp() {
		
////		sftp.sendMessage("msg");
		
		return "#";
		
	}
	  public void buttonAction(ActionEvent actionEvent) {
	        createMessage("sprava");
	    }
	     
	    public void createMessage(String summary) {

//	    	sftp.sendMessage(summary);
	    }
	
}
