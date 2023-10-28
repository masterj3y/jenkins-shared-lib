#!/usr/bin/env groovy

def call() {
    notif "Running Tests"
    sh 'cargo test'
}