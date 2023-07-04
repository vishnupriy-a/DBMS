#!/bin/bash
read -p "enter 1st value" n
echo $n

read -p "enter 2nd value" m
echo $m
read -p "enter 3rd value" o
echo $o
if [ $n -gt $m ] && [ $n -gt $o ]; then
echo "1st number is greater"

elif [ $m -gt $n ] && [ $m -gt $o ]; then
	echo "2nd number is greater"
else
 	echo "3rd number is greater"
fi
