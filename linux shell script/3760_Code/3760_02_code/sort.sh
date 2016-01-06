#!/bin/bash
#Filename: sort.sh
#Description: Check a file if sorted or not
sort -C file ;
if [ $? -eq 0 ]; then
	echo Sorted;
else
	echo Unsorted;
fi

# If we are checking numerical sort, it should be sort -nC
 
