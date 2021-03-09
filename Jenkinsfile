pipeline {
    agent any
    stages {
        stage('Test') {
            steps{
                sh 'echo run junit test cases'
            }
        }
    }
    post {
        failure {
            mail bcc: '', body: "$BUILD_NUMBER", subject: "$JOB_NAME", to: 'sakshipatmase@gmail.com'
        }
        success {
            mail bcc: '', body: "$BUILD_NUMBER", subject: "$JOB_NAME", to: 'sakshipatmase@gmail.com'
        }      
    }
}