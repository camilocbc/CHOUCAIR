pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN"
    }

    stages {

            stage('test'){
                steps{
                    dir("Prueba"){
                        bat "mvn clean compile test"
                    }
                }
            }





        }
    }