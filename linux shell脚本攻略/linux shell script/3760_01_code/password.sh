#!/bin/sh
#Filename: password.sh
echo -n "Enter password:"
stty -echo
read password
stty echo
echo
echo Password read.
echo Password is : $password
