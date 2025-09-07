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
        stage('maven clean') {
            steps {
              sh "maven clean"    
            }
        }
        stage('maven package') {
            steps {
              sh "maven package -DSkipTests"    
            }
        }
        stage('docker build and push') {
           steps {
            script{
            withDockerRegistry(credentialsId: 'docker-jenkins-login') {
                    sh "docker build -t aps0813568/jenkins-demo:tagv1 ."
                    sh "docker push"
                  }
              }
          }
     }
  }
}
