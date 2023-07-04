read -p "Enter a  number: " a;
t=$a;
r=0;
while [ $t -ne 0 ]
do
	d=$(($t%10))
	r=$(($r*10+$d));
	t=$(($t/10));
done
echo "$r";
