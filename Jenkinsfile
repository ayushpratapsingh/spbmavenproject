pipeline {
    agent any 
    tools
    {
        maven "MVN3"
        jdk "JDK17"
    }
    stages {
        stage('github dev branch fetches') {
            steps {
                git branch: 'dev', url: 'https://github.com/ayushpratapsingh/spbmavenproject.git'
            }
        }
        stage('mvn build') {
            steps {
                sh "mvn package"
            }
        }
    }
}
