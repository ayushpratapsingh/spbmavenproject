pipeline {  
    agent any
    tools
    {
        maven "MVN3"
        jdk "JDK17"
    }
    stages {
        stage('github fetches') {
            steps {
                git branch: 'dev', url: 'https://github.com/ayushpratapsingh/spbmavenproject.git'
            }
        }
        stage('maven compile') {
            steps {
                sh "mvn compile"
            }
        }
        stage('maven package') {
            steps {
                sh "mvn clean package"
            }
        }
        stage('Deploy') {
            steps {
                deploy adapters: [tomcat9(alternativeDeploymentContext: '', credentialsId: 'Jenkins8568', path: '', url: 'http://3.80.186.120:8080/')], contextPath: 'springviews', onFailure: false, war: 'target/*.war'
            }
        }
    }
}
