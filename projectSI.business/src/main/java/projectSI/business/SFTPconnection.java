package projectSI.business;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.Properties;

import javax.ejb.Stateless;
import javax.inject.Inject;




import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

@Stateless
public class SFTPconnection {

	  
	public SFTPconnection() {
		// TODO Auto-generated constructor stub
	}
	
	public void createFile() {
		try {
			File f = new File("test.txt");
			f.createNewFile();
			System.out.println(f.getAbsolutePath());
		OutputStream os;
		
			os = new FileOutputStream(f);
		
		PrintStream printStream = new PrintStream(os);
		printStream.print("String");
		printStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sendMessage() throws Exception{
		 String login ="test";
		 String server = "localhost";
         int port = 22;
		
	             JSch jsch = new JSch();
	           
				Session session = jsch.getSession(login, server, port);
				session.setPassword("test");
	            Properties config = new java.util.Properties();
	            config.put("StrictHostKeyChecking", "no");
	            session.setConfig(config);

	            session.connect();
	    
	            // Initializing a channel
	             Channel channel = session.openChannel("sftp");
	            channel.connect();
	            ChannelSftp c = (ChannelSftp) channel;
	            c.put(new ByteArrayInputStream("mesage".getBytes()),"file.txt");
	   

	        
		
		
	}
	
	
}
