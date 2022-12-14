# BasicJava
<hr>
Now that you've familiarized yourself with Java a bit, you decided you really wanted to try and find an internship working with Java. After applying, you were sent the following code challenge:

# Objectives:
<hr>
<ul>
    <li>Implement the Basic 13 algorithms in java.</li>
    <li>Practice Array and ArrayList.</li>
    <li> Practice loops.</li>
</ul>
<h2>Tasks:</h2>
<hr>
<p>Solve the below challenges. Use either an Array or ArrayList when an array is necessary, depending on what you think is appropriate. 
The class name should be BasicJava; you will need to create methods for each of the tasks below and test them in the main method.</p>

<h3>Print odd numbers between 1-255</h3>
<p>Write a method that prints all the odd numbers from 1 to 255.</p>
<h3>Print Sum</h3>
<p>Write a method that prints the numbers from 0 to 255, but this time print the sum of the numbers that have been printed so far. 
For example, your output should be something like this:</p>
<ul>
    <li>New number: 0 Sum: 0</li>
    <li>New number: 1 Sum: 1</li>
    <li>New number: 2 Sum: 3</li>
    <li>New number: 3 Sum: 6</li>
    <li>...</li>
    <li>New number: 255 Sum: ___</li>
</ul>
<p>Do NOT use an array to do this exercise.</p>
<h3>Iterating through an array</h3>
<p>Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen. 
Being able to loop through each member of the array is extremely important.</p>
<h3>Finding Max</h3>
<p>Write a method (sets of instructions) that takes any array and prints the maximum value in the array. 
Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.</p>
<h3>Get Average</h3>
<p>Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an array [2, 10, 3], your method should print an average of 5. 
Again, make sure you come up with a simple base case and write instructions to solve that base case first, then test your instructions for other complicated cases.</p>
<h3>Array with Odd Numbers</h3>
<p>Write a method that creates an array 'y' that contains all the odd numbers between 1 and 255. 
When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].</p>
<h3>Greater Than Y</h3>
<p>Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. 
For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there are two values in the array that are greater than 3).</p>
<h3>Square the values</h3>
<p>Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. 
When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].</p>
<h3>Eliminate Negative Numbers</h3>
<p>Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. 
When the method is done, x should have no negative values, say [1, 5, 10, 0].</p>
<h3>Max, Min, and Average</h3>
<p>Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array, the minimum value in the array, and the average of the values in the array. 
The returned array should be three elements long and contain: [max, min, avg]</p>
<h3>Shifting the Values in the Array</h3>
<p>Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front. 
For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last number is 0. 
The method does not need to wrap around the values shifted out of bounds.</p>

<hr>
<h3>FizzBuzz</h3>
<p>Given an integer n, return a string array answer (1-indexed) where: </p>
<ul>
    <li>answer[i] == "FizzBuzz" if i is divisible by 3 and 5.</li>
    <li>answer[i] == "Fizz" if i is divisible by 3.</li>
    <li>answer[i] == "Buzz" if i is divisible by 5.</li>
    <li>answer[i] == i (as a string) if none of the above conditions are true.</li>
</ul>
