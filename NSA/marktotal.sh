read -p "Enter mark1 :" m1;
read -p "Enter mark1 :" m2;
read -p "Enter mark1 :" m3;
t=$(($m1+$m2+$m3));
a=$(echo $t/3 | bc -l)
echo "Total mark : $t";
echo "Average mark : $a";





