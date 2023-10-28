#!/usr/bin/env groovy

def call(String message) {
    sh(librayResource('scripts/telnotif.sh $TEL_NOTIFIER_TOKEN $TEL_NOTIF_RECEIVER $message'))
    sh 'cargo build --release'
}