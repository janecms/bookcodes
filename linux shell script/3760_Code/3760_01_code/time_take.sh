#!/bin/bash
#Filename: time_take.sh
start=$(date +%s)
#commands;
#statements;
# Example command used is sleep 1

sleep 1

end=$(date +%s)
difference=$(( end - start))
echo Time taken to execute commands is $difference seconds.

