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
        script.notif "Building Image"
        script.sh "docker build -t $imageName ."
        script.notif "Image has been built"
    }

    def pushImage(String imageName) {
        script.notif "Pushing Image to repository"
        script.sh "docker push $imageName"
        script.notif "Image pushed to repository"
    }

    def logOut() {
        script.sh 'docker logout'
        script.notif 'Logged out of Docker'
    }
}