#!/usr/bin/env groovy

def call(String message) {
    loadBashScript name: "telnotif.sh"
    echo $message
    def sendNotifCmd = './telnotif.sh $TEL_NOTIFIER_TOKEN $TEL_NOTIF_RECEIVER ' + "$message"
    sh sendNotifCmd
    sh 'cargo build --release'
}