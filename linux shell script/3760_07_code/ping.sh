#!/bin/bash
#Filename: ping.sh


for ip in 192.168.0.{1..254} ;
do
    	ping $ip -c2 &> /dev/null ;
	
	if [ $? -eq 0 ];
	then
		echo $ip is alive
	fi
     

done


