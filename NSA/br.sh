#!/bin/bash

i=1
while [ $i -le 5 ]
 do 
    if [ $i -eq 3 ]; then
    break
    fi
	echo $i
	i=`expr $i + 1`
 done