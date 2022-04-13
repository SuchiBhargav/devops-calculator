pipeline {
    environment{
        imageName=""
    }
    agent any

    stages {
        stage('Git Build') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/SuchiBhargav/devops-calculator.git'
            }

        }
        stage('Maven Build') {
            steps {
                script{
                    sh 'mvn clean package'
                }
            }

        }
         stage('Docker Build To Image') {
            steps {
              script{
                  imageName =docker.build 'suchibhargav/calc-devops'
              }
            }

         }
         stage('Push Docker Image') {
            steps {
                script{
                    docker.withRegistry('','docker-jenkins'){
                    imageName.push()
                    }
                }
            }

         }
        stage('Ansible Pull Docker Image') {
            steps {
              ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'ansible', inventory: 'deploy-docker/inventory', playbook: 'deploy-docker/deploy-image.yml', sudoUser: null
            }

        }
        
    }
}
