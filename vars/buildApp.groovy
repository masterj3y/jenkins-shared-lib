#!/usr/bin/env groovy

def call() {
    notif "Building App"
    sh 'cargo build --release'
}