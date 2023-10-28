#!/usr/bin/env groovy

import github.masterj3y.Docker

def call(String imageName) {
    return new Docker(this).buildImage(imageName)
}