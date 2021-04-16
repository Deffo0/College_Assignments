#Input Format

First line contains a comma-separated list of the board dimenstions(rows, colums). The board rows are then printed in order. Next line contains the team indetifier. Last line contains the minimum area for an element.

#Constraints

Dimensions of the photo will be between 1 and 50 elements. Minimum area for an element will be between 1 and 10000 inclusive.

#Output Format

Comma-separated list of points of team locations.

#Sample Input 0

15, 15
8D88888J8L8E888
88NKMG8N8E8JI88 
888NS8EU88HN8EO 
LUQ888A8TH8OIH8 
888QJ88R8SG88TY 
88ZQV88B88OUZ8O 
FQ88WF8Q8GG88B8 
8S888HGSB8FT8S8
8MX88D88888T8K8
8S8A88MGVDG8XK8
M88S8B8I8M88J8N
8W88X88ZT8KA8I8
88SQGB8I8J88W88
U88H8NI8CZB88B8
8PK8H8T8888TQR8
8
9

#Sample Output 0

[(1, 17), (3, 3), (3, 10), (3, 25), (5, 21), (8, 17), (9, 2), (10, 9), (12, 23), (17, 16), (18, 3), (18, 11), (18, 28), (22, 20), (23, 26), (24, 15), (27, 2), (28, 26), (29, 16)]

#Sample Input 1

6, 8
33JUBU33
3U3O4433
O33P44NB
PO3NSDP3
VNDSD333
OINFD33X
3
16

#Sample Output 1

[(4, 5), (13, 9), (14, 2)]
