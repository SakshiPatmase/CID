pipeline {
    agent any
    stages {
        stage('Test') {
            steps{
                bat 'Junit is running test cases'
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