#!/bin/bash

token=$1
chat_id=$2
message=$3

curl --fail -X POST \
	-H 'Content-Type: application/json' \
	-d '{ "chat_id": "'$chat_id'", "text": "'$message'"}' \
	https://api.telegram.org/bot$token/sendMessage

if [ $? -eq 0 ]; then
	echo "notif has been sent successfully"
else
	echo "sending notif failed"
fi


