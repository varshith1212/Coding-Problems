"""
input: 
3
[1,2,3]
output: 3 
as [1,2] => 1+2=3 which is minimum
"""

import sys
def smallest_pair(a, n) : 
	min = sys.maxsize
	secondMin = sys.maxsize 
	for j in range(n) :
		if (a[j] < min) :
			secondMin = min
			min = a[j]
		elif ((a[j] < secondMin) and
			a[j] != min) :
			secondMin = a[j]
	return (secondMin + min)
	
n = int(input())
arr = list(map(int,input().split()))
print(smallest_pair(arr, n))