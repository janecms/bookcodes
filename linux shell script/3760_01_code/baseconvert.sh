#!/bin/bash
#Filename: baseconvert.sh
#Description: Number base conversion

no=100
echo "Converting 100 from decimal to binary (base2)"
no=`echo "obase=2;$no" | bc`
echo Binary : $no

echo "Converting binary($no) to decimal"
no=`echo "obase=10;ibase=2;$no" | bc`
echo Number in decimal: $no



