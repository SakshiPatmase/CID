pipeline {
    agent any
    stages {
        stage('Test') {
            steps{
                echo test cases are running
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