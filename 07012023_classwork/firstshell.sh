#! /bin/bash
echo "Hello Everyone"
greetings="Good Afternoon"
name="Bill Gates"
echo $greetings $name

#Mathematical Operation
result=$((5+6))
echo $result

#Read input from user
echo "Please enter a number"
read num
echo "Please enter another number"
read num1
result=$((num+num1))
echo "Adition of two numbers give result--"$result

if [ $num -gt $num1 ]
then
echo $num is greater than $num1
elif [ $num -lt $num1 ]
then
echo  $num is less than $num1
elif [ $num -eq $num1 ]
then
echo $num is equal to $num1
fi
echo "****************************************************"
#Use of loop
for i in {1..6}
do
    echo $i
done

echo "************************while loop example**************"
x=1
while[ $x -le 10 ]
        do
                echo $x
                (( x+=1 ))
done
