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
        stage('Push to artifactory') {
            steps {
                script{
                    def server = Artifactory.server '123456789@artifactory'
                    def buildInfo = Artifactory.newBuildInfo()
                    buildInfo.env.capture = true
                    buildInfo.env.collect()
                    def rtMaven = Artifactory.newMavenBuild()
                    rtMaven.tool = 'M3'
                    rtMaven.deployer releaseRepo: 'workshop', snapshotRepo:'workshop', server: server
                    rtMaven.run pom: 'pom.xml', goals: 'clean install', buildInfo: buildInfo
                    server.publishBuildInfo buildInfo
                }
            }
        }
        stage('Build docker image') {
            steps {
                sh "docker build -t sharma-sahil-1.0"
            }
        }
    }
}