#!/bin/bash

#Filename: generate_album.sh
#Description: Create a photoalbum using images in current directory

echo "Creating album.."
mkdir -p thumbs
cat <<EOF > index.html
<html>
<head>
<style>

body 
{
	width:470px;
	margin:auto;
	border: 1px dashed grey;
	padding:10px;
}

img
{
	margin:5px;
	border: 1px solid black; 

}
</style>
</head>
<body>
<center><h1> #Album title </h1></center>
<p>
EOF

for img in *.jpg;
do
	convert "$img" -resize "100x" "thumbs/$img" 
	echo "<a href=\"$img\" ><img src=\"thumbs/$img\" title=\"$img\" /></a>" >> index.html
done

cat <<EOF >> index.html

</p>
</body>
</html>
EOF

echo Album generated to index.html

