pipeline {
    
    agent any

    environment {

	DOCKER_USERNAME = 'csarnar'    
	APP_NAME = 'jenkins-docker-integration'
	RELEASE = '1.0.0'
	IMAGE_NAME = '${DOCKER_USERNAME}' + '/' + '${APP_NAME}'
	IMAGE_TAG = '${RELEASE}' + '-' + '${BUILD_NUMBER}'
    }
	
    tools {
        
        maven 'Maven 3.9.6'
    }
    
    stages {

	stage('Build maven') {                          
		
		steps {
			
			sh 'mvn package'             
		}         
	}
	    
	stage('Build docker image') {

	      steps {

		  script {

		  	docker-image = docker.build '${IMAGE_NAME}'

			  withRegistry('',dockerHubKey) {

				  docker-image.push('${IMAGE_TAG}')
				  docker-image.push('latest')
			  }
		  }
	       }
	}
    }
}
