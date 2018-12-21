pipeline {
    agent any 
   // tools {
    //maven 'maven3'
  //}//////
    
    stages
    {
        stage('Build'){
            steps{
                sh 'mvn clean package'
            }
        }
        
        stage('Test') { 
            steps {
        sh 'exit 0'
        step([$class: 'Mailer', notifyEveryUnstableBuild: true, recipients: 'jegapriyamunieswaran@gmail.com', sendToIndividuals: true])
            }
        }
        stage('Deploy') { 
           steps {
    //sh 'curl -X POST http://localhost:10000/shutdown || true'
    // copy file to target location
    sh 'cp target/*.war /tmp/'
    // start the application
    sh 'nohup java -jar /tmp/*.war &'
    // wait for application to respond
   // sh 'while ! httping -qc1 http://localhost:10000 ; do sleep 1 ; done'
           }
        }
    }
}
