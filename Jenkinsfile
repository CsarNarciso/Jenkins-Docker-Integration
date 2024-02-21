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
    }
}
