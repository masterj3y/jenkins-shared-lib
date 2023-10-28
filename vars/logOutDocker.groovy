#!/usr/bin/env groovy

import github.masterj3y.Docker

def call() {
    return new Docker(this).logOut()
}