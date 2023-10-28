#!/usr/bin/env groovy

def call(String message) {
    notif "Building App"
    sh 'cargo build --release'
}