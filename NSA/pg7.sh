#!/bin/bash
echo "my script name is" $0
echo "my first argument is" $1
echo "My second argument is:" $2
echo "Pid of script is:" $$
echo "Total number of arguments:" $#
echo "All arguments:" $*
echo "All arguments:'" $@
echo "Last written code" $?



