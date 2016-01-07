#!/bin/bash
#Name: pcpu_usage.sh
#Description: Script to calculate cpu usage by processes for 1 hour

SECS=3600
#Change the SECS to custom seconds

STEPS=$(( $SECS / 60 ))

echo Watching CPU usage... ;

for((i=0;i<STEPS;i++))
do
	ps -eo comm,pcpu | tail -n +2 >> /tmp/cpu_usage.$$
	sleep 60
done

echo
echo CPU eaters :

cat /tmp/cpu_usage.$$ | \
awk '
{ process[$1]+=$2; } 
END{ 
	for(i in process) 
	{ 
		print i, process[i] ; 
	} 

   }' | sort -nrk 2 | head | cut -d" " -f1

