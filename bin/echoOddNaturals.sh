#!/bin/bash
for (( num = 1; num <= 99; num+=2 ))
do
	echo $num
    if [ num%2 == 0 ]
    then
        echo num
    fi
done