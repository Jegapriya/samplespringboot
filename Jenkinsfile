pipeline {
    agent any 
    //tools {
    //maven 'maven3'
 // }
    node {
  stage('SCM') {
    git 'https://github.com/foo/bar.git'
  }
  stage('SonarQube analysis') {
    // requires SonarQube Scanner 2.8+
    def scannerHome = tool 'SonarQube Scanner 2.8';
    withSonarQubeEnv('My SonarQube Server') {
      sh "${scannerHome}/bin/sonar-scanner"
    }
  }
}
    stages {
        stage('Build') { 
            steps {
               sh 'mvn clean package'
            }
        }
      
        //stage('Test') { 
            //steps {
                // 
            //}
        //}
        stage('Deploy') { 
           steps {
    //sh 'curl -X POST http://localhost:10000/shutdown || true'
    // copy file to target location
    sh 'cp target/*.jar /tmp/'
    // start the application
    sh 'nohup java -jar /tmp/*.jar &'
    // wait for application to respond
   // sh 'while ! httping -qc1 http://localhost:10000 ; do sleep 1 ; done'
           }
        }
    }
}
