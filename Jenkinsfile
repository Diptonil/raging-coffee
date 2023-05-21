pipeline {
  agent all
  stages {
    stage('clean') {
      steps {
        sh 'mvn clean'
      }
    }
    stage('test') {
      steps {
        sh 'mvn test'
      }
    }
  }
}

