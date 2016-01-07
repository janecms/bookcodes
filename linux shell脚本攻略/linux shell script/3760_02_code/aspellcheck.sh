#!/bin/bash 
#Filename: aspellcheck.sh
#Spell check using aspell
word=$1 

output=`echo \"$word\" | aspell list` 

if [ -z $output ]; then 
        echo $word is a dictionary word; 
else 
        echo $word is not a dictionary word; 
fi 
