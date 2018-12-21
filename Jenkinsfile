pipeline {
    agent any 
   // tools {
    //maven 'maven3'
  //}////////
    
    stages
    {
    
     stage('Build'){
       
            steps{
                
                    sh 'mvn clean package' 
            }
        }

        stage('Test')
        {
            post{
    success{
            emailext body: 'Success', subject: 'testing extended email', to: 'jegapriyamunieswaran@gmail.com'
       }
     failure
     {
        emailext body: 'Failed', subject: 'testing extended email', to: 'jegapriyamunieswaran@gmail.com'
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

