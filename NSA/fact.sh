#!/bin/bash

read -p "Enter The Number: " a
i=1;
f=1;
while [ $i -le $a ] 
do
    f=`expr $f \* $i`
    # f=$(($f*$i));
    i=`expr $i + 1`
done
echo "Factorial is: "$f