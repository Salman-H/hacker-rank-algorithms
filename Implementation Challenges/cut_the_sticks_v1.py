#!/bin/python

"""
PROBLEM
-------
You are given sticks, where the length of each stick is a positive integer. 
A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.

Given the length of N sticks, print the number of sticks that are left before each subsequent cut operations.

Note: For each cut operation, you have to recalcuate the length of smallest sticks (excluding zero-length sticks).


INPUT FORMAT
------------
The first line contains a single integer N.
The next line contains N integers: a0, a1,...aN-1 separated by space, where ai represents the length of the ith stick.


OUTPUT FORMAT
-------------
For each operation, print the number of sticks that are cut, on separate lines.


CONSTRAINTS
-----------
	1 =< N <= 1000
	1 =< ai <= 1000
	
	
SAMPLE INPUT
------------
6
5 4 4 2 2 8


SAMPLE OUTPUT
-------------
6
4
2
1

"""

import sys


# read n
n = int(raw_input().strip())

# read the list
arr = map(int,raw_input().strip().split(' '))


while len(arr) is not 0:
	# sort arr
	arr.sort()

	# get smallest stick
	smallest = arr[0]
	
	# cut all sticks with smallest sticks
	for i, stick in enumerate(arr):
		arr[i] = stick - smallest
		
	print len(arr)
		
	# remove 0s from arr
	arr = filter(lambda stick: stick != 0, arr)
