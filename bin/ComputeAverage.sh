#!/bin/bash
read numLines

total=0
declare -a values[numLines]
for (( val = 0; val < numLines; val++ ))
do
	read values[$val]
  # echo "values: ${values[${#values[*]}-1]}"
	(( total+= ${values[${#values[*]}-1]} ))
done

average=$(bc <<< "scale=4;${total}/${#values[*]}")
# echo "elements: ${values[@]}"
# echo "size: ${#values[*]}"
# echo "summe: $total"
# echo "average: $average"
printf "%.3f" "$average"
