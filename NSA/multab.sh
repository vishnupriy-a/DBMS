#!/bin/bash

mul()
{
    for((i=0;i<=10;i++))
    {
        echo $i "* 2 =" $(($i*2))
    }
}
mul