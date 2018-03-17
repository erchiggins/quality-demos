package com.revature.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.Surfer;
import com.revature.client.SurferClient;

public class Driver {

	public static void main(String[] args) {
	
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		SurferClient sc = ac.getBean("surferClient", SurferClient.class);
		
		//set this as the URI of the service you're attempting to consume
		//(and make sure it's running before you run this class) 
		sc.setResourceUrl("http://localhost:8087");
		
		//System.out.println(sc.getSurfers());
		
		//iterate through the surfers retrieved from the /allSurfers endpoint
		//Jackson has converted the JSON-formatted string into Java objects
		for(Surfer s1 : sc.getSurfers()){
			System.out.println(s1);
		}
		
		//now create a surfer object and POST it back to the service 
		Surfer s2 = new Surfer(5,"Crazy Chad",4);
		sc.addSurfer(s2);
	}

}
