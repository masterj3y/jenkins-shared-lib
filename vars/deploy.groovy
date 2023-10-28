#!/usr/bin/env groovy

def deploy(String imageName) {
    loginInDocker()
    buildDockerImage(imageName)
    pushDockerImage(imageName)
}