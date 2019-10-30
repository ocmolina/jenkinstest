pipeline {
  agent any
  stages {
    stage('build') {
      agent {
        docker {
          image 'maven:3-alpine'
        }

      }
      steps {
        sh 'mvn clean compile'
      }
    }
    stage('test') {
      agent {
        docker {
          image 'maven:3-alpine'
        }

      }
      steps {
        sh 'mvn clean test'
      }
    }
    stage('deploy') {
      when {
                branch "master"
            }
      steps {
        build 'stage'
      }
    }
  }
}
