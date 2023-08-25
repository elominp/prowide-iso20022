pipeline {
    agent any
    tools {
        jdk "${params.JDK_TOOL}"
    }
    stages {
        stage ('Clone') {
            steps {
                catchError(buildResult: 'FAILURE') {
                    checkout([
                        $class: 'GitSCM',
                        userRemoteConfigs: [[credentialsId: CREDENTIALS_ID, url: 'git@github.com:prowide/prowide-iso20022.git']],
                        branches: [[name: CHECKOUT_BRANCH]]
                    ])
                }
            }
        }
        stage('Build') {
            steps {
                catchError(buildResult: 'FAILURE') {
                    sh 'java -version'
                    sh './gradlew clean build --no-daemon --max-workers 2'
                }
            }
        }
    }
    post {
        failure {
            script {
                slackSend(channel: "#jenkins-integrator", token: "${params.SLACK_TOKEN}", color: 'danger', message: "Pipeline: ${currentBuild.fullDisplayName} failed!")
            }
        }
    }
}