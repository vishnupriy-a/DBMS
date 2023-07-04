#!/bin/bash
st_display()
{
    echo "Name:" $1;
    echo "Rollno:" $2;
    echo "class:" $3;
    echo "No of arguments:" $#;
}
st_read()
{
    read -p "Enter the Name ,rollno,class: " a b c
}
st_read
st_display $a $b $c 