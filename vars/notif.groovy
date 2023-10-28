#!/usr/bin/env groovy

def call(String message) {
    loadBashScript name: "telnotif.sh"
    def sendNotifCmd = './telnotif.sh $TEL_NOTIFIER_TOKEN $TEL_NOTIF_RECEIVER ' + "\"$message\""
    sh sendNotifCmd
}