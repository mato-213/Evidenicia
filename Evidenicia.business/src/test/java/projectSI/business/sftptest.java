package projectSI.business;

import java.nio.charset.Charset;
import java.util.Properties;

import org.junit.Test;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;


public class sftptest {

	@Test
	public void sftpconnect() throws Exception{
		 String login ="test";
		 String server = "127.0.0.1";
         int port = 22;
		
	            JSch jsch = new JSch();
	           
				Session session = jsch.getSession(login, server, port);
				 session.setPassword("test".getBytes(Charset.forName("ISO-8859-1")));
		            Properties config = new java.util.Properties();
	            config.put("StrictHostKeyChecking", "no");
	            System.out.println("configuration");
	            session.setConfig(config);

	            session.connect();
	         
	            Channel channel = session.openChannel("sftp");
	            System.out.println("connecion");
	            channel.connect();
	            
	            ChannelSftp c = (ChannelSftp) channel;
	            System.out.println("ls");
	            c.ls("");

	        
		
	}
}
