package com.cesar.JenkinsLaboratoryApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsLaboratoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsLaboratoryApplication.class, args);
		
		say( "Hello Jenkins" );
	}
	
	public static boolean say( String message ) {
		
		if ( message != null ) {
			
			if ( ! message.isBlank() ) {
								
				System.out.println( message );
				
				return true;
			}
		}
		return false;
	}
}
