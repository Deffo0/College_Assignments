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

# the main script.
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
    i = 0
    while i < no_sets:
        container.append(set(input("Enter the set (ex:a b c...): ").strip().split(" "),universe))
        for j in container[i].elements:
            if (j not in universe and j != ""):
                print("This set is not a subset from universe, enter it again.")
                container.pop(i)
                i -= 1
                break
        i += 1

    # loop until the user said stop:
    valid_operations = ["intersection","union","complement"]
    stop = False
    while not stop:
        # make the user choose the operation:
        operation = input("Enter the operation you want to perform on those sets (only: intersection or union or complement): ").lower()
        while operation not in valid_operations:
            operation = input("Invalid operation, enter the operation you want to perform on those sets (only: intersection or union or complement): ").lower()

        # make the user choose sets which he wants to apply the operation on:
        wanted_indexes = input("Enter indexes of sets you want to apply the operation on (ex: 1 2 ...): ").strip().split(" ")
        while not all([(x.isnumeric() and int(x) <= len(container)) for x in wanted_indexes]):
            wanted_indexes = input(
                "Invalid index, enter indexes of sets you want to apply the operation on (ex: 1 2 ...): ").strip().split(" ")
        wanted_indexes = [(int(x)-1) for x in wanted_indexes]

        # bring the sets upon to the entered indexes:
        sub_container = [container[i] for i in wanted_indexes]
        sets = [x.elements for x in sub_container]

        # switch in the three operation:
        if operation == "union":
            print(sub_container[0].union(sets[1:]))
        elif operation == "intersection":
            print(sub_container[0].intersection(sets[1:]))
        elif operation == "complement" and len(sets) == 1 :
            print(sub_container[0].complement())
        else:
            print("Invalid choose of sets cooresponding to the operation")

        # ask the user if he wants to continue or no:
        decision = input("Do you want to stop? (ex: yes/no): ").strip().lower()
        while decision != "yes" and decision != "no":
            decision = input("Invalid input, do you want to stop? (ex: yes/no): ").strip().lower()
        if decision == "yes":
            stop = True
        elif decision == "no":
            stop = False
