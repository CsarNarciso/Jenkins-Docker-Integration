package com.cesar.JenkinsLaboratoryApp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsLaboratoryApplicationTests {

	@Test
	void sayCorrectMessageShouldReturnTrue() {
		
		String message = "Something";
		
		assertThat( JenkinsLaboratoryApplication.say(message) ).isTrue();
	}
	
	@Test
	void sayNullMessageShouldReturnFalse() {
		
		String NullMessage = null;
		
		assertThat( JenkinsLaboratoryApplication.say(NullMessage) ).isFalse();
	}
	
	
	@Test
	void sayEmptyMessageShouldReturnFalse() {
		
		String EmptyMessage = "";
		
		assertThat( JenkinsLaboratoryApplication.say(EmptyMessage) ).isFalse();
	}
}
