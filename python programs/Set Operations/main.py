# authors: Moamen gharip & Ahmed Adel
# build the class set:
class set:
    def __init__(self,content:list,univ:list):
        self.elements = content
        self.universe_set = univ

    def union(self,sets:list):
        res = list(self.elements)
        for i in sets:
            res = res + i
        car = []
        [car.append(x) for x in res if x not in car]
        return car

    def intersection(self,sets:list):
        res = self.elements
        for  i in sets:
            res = [x for x in res if x in i]
        return res

    def complement(self):
        res = [x for x in self.universe_set if x not in self.elements ]
        return res

# the main script:
if __name__ == '__main__':
    universe = input("Enter the universe (ex:a b c ...): ")

    # turn the entered text into list and remove duplicates from it:
    universe = universe.strip().split(" ")
    carry = []
    [carry.append(x) for x in universe if x not in carry]
    universe = carry

    # take the number of sets from the user then take those sets:
    no_sets = input("Enter the number of sets: ")

    # check for validality of the input:
    while not no_sets.isnumeric():
        no_sets = input("Invalid input, Enter the number of sets: ")

    no_sets = int(no_sets)

    container =[]
    for i in range(no_sets):
        container.append(set(input("Enter the set (ex:a b c...): ").strip().split(" "),universe))

        for i in container[i].elements:
            if i not in universe:
                print("This set is not a subset from universe, enter it again.")
                container.pop(i)
                no_sets += 1
                break

    # make the user choose the operation:
    valid_operations = ["intersection","union","complement"]
    operation = input("Enter the operation you want to perform on those sets (only: intersection or union or complement): ").lower()
    while operation not in valid_operations:
        operation = input("Invalid operation, enter the operation you want to perform on those sets (only: intersection or union or complement): ").lower()

    sets = [x.elements for x in container]
    # switch in the three operation:
    if operation == "union":
        print(container[0].union(sets[1:]))
    elif operation == "intersection":
        print(container[0].intersection(sets[1:]))
    elif operation == "complement" and len(sets) == 1 :
        print(container[0].complement())
    else:
        print("Invalid chhose of sets cooresponding to operation")
