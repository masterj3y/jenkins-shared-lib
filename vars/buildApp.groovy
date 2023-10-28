#!/usr/bin/env groovy

def call(String message) {
    sh './telnotif $TEL_NOTIFIER_TOKEN $TEL_NOTIF_RECEIVER $message'
    sh 'cargo build --release'
}