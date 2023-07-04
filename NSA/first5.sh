#!/bin/bash

i=1
# while [ $i -le 5 ]
#  do 
# 	echo $i
# 	i=`expr $i + 1`
#  done
until [ $i -gt 5 ]
 do 
	echo $i
	i=`expr $i + 1`
 done

#  for i in 1 2 3 4 5
#  do 
# 	echo $i
#  done