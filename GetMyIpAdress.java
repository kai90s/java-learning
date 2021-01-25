package kuis_sem_3;

import java.net.InetAddress;

public class GetMyIpAdress {

	public static void main(String[] args) throws Exception
	{
	
		InetAddress myIP=InetAddress.getLocalHost();
		
		System.out.println("My IP Address is : ");
		System.out.println(myIP.getHostAddress());
	}

}
