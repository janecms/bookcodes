#!/bin/bash
#Description: Fetch gmail tool


#username="PUT_USERNAME_HERE"
#password="PUT_PASSWORD_HERE"

SHOW_COUNT=5
echo 

curl -s -u "$username":"$password" --silent "https://mail.google.com/mail/feed/atom" | \
tr -d '\n' | sed 's:</entry>:\n:g' |\
 sed 's/.*<title>\(.*\)<\/title.*<author><name>\([^<]*\)<\/name><email>\([^<]*\).*/Author: \2 [\3] \nSubject: \1\n/' | \
 head -n $(( $SHOW_COUNT * 3 ))

