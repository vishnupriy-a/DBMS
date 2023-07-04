#!/bin/bash
read -p "Enter OS Name:" os
echo $os

case $os in
	"Windows")
	echo "Favourite OS";;
	"Linux")

	echo "Not Favourite OS";;
	"Mac OS")
	echo " Not Favourite OS";;
*)
echo "OS not in the List";
esac
