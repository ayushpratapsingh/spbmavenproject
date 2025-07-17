pipeline {
    agent any

    parameters{
        choice(choices: ['master', 'dev', 'test'], name: 'branch_name')
}
    stages {
        stage('Git Checkout') {
            steps {
               git branch: "${params.branch_name}", url: 'https://github.com/ayushpratapsingh/spbmavenproject.git'
            }
        }
        stage('Clean Artifacts') {
            steps {
                sh "mvn -v"
                sh "mvn clean"
            }
        }
    }
}
