#!/bin/bash
#Filename: rename.sh
#Desc: Rename jpg files
count=0;
for img in *.jpg;
do
new=image-$count.${img##*.}
echo "Renaming $img to $new";
mv "$img" "$new";
let count++
done 
