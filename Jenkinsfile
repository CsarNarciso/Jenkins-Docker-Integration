pipeline {
    
    agent any
    
    tools {
        
        maven 'Maven 3.9.6'
    }
    
    stages {
        
        stage('build') {
            
            steps {
                
                sh 'mvn package'
            }
        }

	stage('delivery') {

	      steps {

		  sh 'docker build -t docker-integration-test .'
	       }
	}
    }
}
