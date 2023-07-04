#!/bin/bash
i=1
while [ $i -ne 0 ]
do
read -p "Enter Two Number: " a b
read -p "Enter Operator: " op
case $op in
    '+')
    echo $(($a + $b));;
    '-')
    echo $(($a - $b));;
    '*')
    echo $(($a * $b));;
    '/')
    echo $(($a / $b));;
 *)
 echo "Unsupported Operator"   
esac
read -p "Enter '0' to exit else enter '1' to continue: " i
# echo $i
done
