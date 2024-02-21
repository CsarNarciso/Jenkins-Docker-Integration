pipeline {
    
    agent any
    
    tools {
        
        maven 'Maven 3.9.6'
    }
    
    stages {
	    
	stage('Build docker image') {

	      steps {

		  script {

		  	docker.build 'whatever/whateverelse:lts'
		  }
	       }
	}
    }
}
