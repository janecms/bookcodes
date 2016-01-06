#!/bin/bash
#Filename: multi_cast_window.sh
# Description: Multi-cast window popups

IP_LIST="192.168.0.5 192.168.0.3 192.168.0.23"
USER="username"

COMMAND='export DISPLAY=:0 ; zenity --info --text "This is a message" '
for host in $IP_LIST;
do
	ssh $USER@$host  "$COMMAND" &
done
