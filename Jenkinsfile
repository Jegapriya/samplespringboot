pipeline {
    agent any 
   // tools {
    //maven 'maven3'
  //}//////
    
    stages
    {
        stage('Build'){
            steps{
                try
                {
                    sh 'mvn clean package'
                }
                catch(err)
                {
                    emailext body: '${err}.', subject: 'testing extended email', to: 'jegapriyamunieswaran@gmail.com'
                }
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
