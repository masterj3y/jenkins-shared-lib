#!/usr/bin/env groovy
package github.masterj3y

class Docker implements Serializable {

    def script

    Docker(script) {
        this.script = script
    }

    def login() {
        script.notif "Logging in Docker"
        script.withCredentials(
                [script.usernamePassword(
                        credentialsId: 'nexus-docker',
                        usernameVariable: 'USER_NAME',
                        passwordVariable: 'PASSWORD')
                ]
        ) {
            script.sh "echo $script.PASSWORD | docker login -u $script.USER_NAME --password-stdin http://localhost:8083"
        }
        script.notif 'Logged in Docker'
    }

    def buildImage(String imageName) {
        script.sh "Building Image"
        script.sh "docker build -t $imageName ."
        script.sh "Image has been built"
    }

    def pushImage(String imageName) {
        script.sh "Pushing Image to repository"
        script.sh "docker push $imageName"
        script.sh "Image pushed to repository"
    }

    def logOut() {
        script.sh 'docker logout'
    }
}