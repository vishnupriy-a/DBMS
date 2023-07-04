#!/bin/bash
read -p "Enter Age: " n
echo $n

if [ $n -ge 18 ]; then
	echo "Person is eligible for voting"
else
 	echo "Person is not eligible for voting"
fi
