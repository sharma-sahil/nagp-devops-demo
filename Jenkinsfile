pipeline {
    agent any

    stages {
    	stage('Checkout'){
    		steps {
    			git credentialsId: 'dbf685a2-1463-4395-9002-1a2bf725daa4', 
    			url: 'https://github.com/sharma-sahil/nagp-devops-demo.git'
    		}
    	}
    
        stage('Build') {
            steps {
                sh "/usr/local/src/apache-maven/bin/mvn clean install"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}