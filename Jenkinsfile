pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven_3_6_3') {
                    sh 'mvn clean install'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3_6_3') {
                    sh 'mvn test'
                }
            }
        }

        stage('Generate HTML report') {
            steps {
                cucumber buildStatus: "STABLE",
                        fileIncludePattern: '**/site/serenity/index.html',
                        indexReportDirectory: 'target'
            }

        }
    }
}