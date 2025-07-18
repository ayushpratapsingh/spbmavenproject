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
                git branch: 'dev', url: 'https://github.com/jaiswaladi246/Boardgame.git'
            }
        }
        stage('mvn build') {
            steps {
                sh "mvn package"
            }
        }
    }
}
