#!/bin/bash
read -p "enter 1st value" n
echo $n

read -p "enter 2nd value" m
echo $m
if [ $n -eq $m ]; then
echo "2 numbers are equal"

elif [ $n -gt $m ]; then
	echo "1st number is greater"
else
 	echo "2nd number is greater"
fi
