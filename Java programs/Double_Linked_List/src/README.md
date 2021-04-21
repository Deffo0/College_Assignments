Create a class DoubleLinkdList that implements ILinkedList interface.

# Input Format

First line contains a comma-separated list of the linkedlist elements.
The following line contains a keyword of the operation required to perform on the list.
The number and the contents of the following lines depend on the keyword:

+ add: Followed by 1 line containing the element to insert to the end of the list.
+ addToIndex: Followed by 2 lines, the first contains the insertion index and the second contains the insertion value.
+ get: Followed by 1 line containing the index of the requried element.
+ set: Followed by 2 lines, the first contains the index and the second contains the value of the new value.
+ clear: Not followed by additional lines.
+ isEmpty: Not followed by additional lines.
+ remove: Followed by 1 line containig the index of the element.
+ sublist: Followed by 2 lines, the first has the starting index and the second has the ending index of the sublist.
+ contains: Followed by 1 line, containing the the element we test for exisitence.
# Constraints

Assume the list contains only integer values for this problem.

# Output Format

For keywords add, addToIndex, set, clear, and remove it is required to print the list elements after the operations.

For get: print the retrieved element.
For isEmpty, contains: print "True" or "False".
For sublist: print the elements of the sublist.

+ Sample Input 0

[]
add
10
+ Sample Output 0

[10]
+ Sample Input 1

[40, 98, 36, 83, 25, 64, 36, 10, 31, 70]
addToIndex
3
67
+ Sample Output 1

[40, 98, 36, 67, 83, 25, 64, 36, 10, 31, 70]
+ Sample Input 2

[1, 2]
isEmpty
+ Sample Output 2

False
+ Sample Input 3

[6, 89, 85, 33, 18]
set
0
69
+ Sample Output 3

[69, 89, 85, 33, 18]
+ Sample Input 4

[26, 30, 16, 84, 24, 29, 80, 27, 17, 30, 20, 65, 41, 70, 25, 65, 67, 45, 82, 80]
get
16
+ Sample Output 4

67
+ Sample Input 5

[51, 60, 86, 13, 34, 90, 34, 94]
size
+ Sample Output 5

8
+ Sample Input 6

[58, 1, 26, 62, 27, 86, 71, 61, 99, 39, 10, 75, 93, 70, 77, 61, 82, 31]
contains
31
+ Sample Output 6

True
+ Sample Input 7

[13]
contains
69
+ Sample Output 7

False
+ Sample Input 8

[31, 87, 81, 100, 70, 26, 36, 28, 88, 66, 65, 8, 41]
sublist
6
8
+ Sample Output 8

[36, 28, 88]
+ Sample Input 9

[74, 59, 23, 89, 38, 73, 62, 22, 29]
clear
+ Sample Output 9

[]
+ Sample Input 10

[1, 5, 4, 2, 1, 4]
get
6
+ Sample Output 10

Error