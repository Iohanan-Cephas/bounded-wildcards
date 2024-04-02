# Bounded Wildcards
This program was an example to help me fixing the way to use the wildcard type in a simple way.

### Problem 1
Here we have a script that is going to return the sum of the areas of a list of figures using generics types.

### Problem 2
Now, a script that copies the elements of a list to another one who can be more generic than the first.

Below, we have the diagram of the wrapper types to aid in understanding the script 'Problem (2)' and to help grasp the Get/Put Principle as well.
|Wrapper types||
|--|--|
|Object
|l|
|l|
|l|
|~~~~~~~~~~~>|Character|
|l|
|l|
|l|
|~~~~~~~~~~~>|Boolean|
|l|
|l|
|l|
|~~~~~~~~~~~>|Number|
||l|
||l|
||l|
||~~~~~~~~~~~>Integer
||l|
||l|
||l|
||~~~~~~~~~~~>Byte
||l|
||l|
||l|
||~~~~~~~~~~~>Long
||l|
||l|
||l|
||~~~~~~~~~~~>Short
||l|
||l|
||l|
||~~~~~~~~~~~>Float
||l|
||l|
||l|
||~~~~~~~~~~~>Double
||