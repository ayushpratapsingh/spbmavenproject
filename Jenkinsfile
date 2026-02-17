pipeline {
    agent any 
    tools
    {
        maven "MVN3"
        jdk "JDK17"
    }
    stages 
	{
        stage('github dev branch fetches') 
		{
            steps 
			{
                git branch: 'dev', url: 'https://github.com/ayushpratapsingh/spbmavenproject.git'
            }
        }
        stage('maven clean') 
		{
            steps 
			{
              sh "mvn clean"    
            }
        }
        stage('maven package') 
		{
            steps 
			{
              sh "mvn package -DSkipTests"    
            }
        }
        stage('docker build and push') 
		{
           steps 
		   {
            script
			{
            withDockerRegistry(credentialsId: 'docker-jenkins-login') 
			  {
                    sh "docker build -t aps0813568/jenkins-demo:tagv1 ."
                    sh "docker push aps0813568/jenkins-demo:tagv1"
              }
            }
          }
		}
    }
        post {
        always {
            mail to: 'ayush.pratap906@gmail.com',
                 subject: "Jenkins Build Notification: ${currentBuild.fullDisplayName}",
                 body: """\
                 Build Status: ${currentBuild.currentResult}
                 Project: ${env.JOB_NAME}
                 Build Number: ${env.BUILD_NUMBER}
                 Build URL: ${env.BUILD_URL}
                 """
               }
           }
}
