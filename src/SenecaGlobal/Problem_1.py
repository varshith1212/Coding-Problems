#reading the input.
from operator import index


integer_list = input()

#Splittings the given sentence to words.
integer_list = list(integer_list.split(" "))

#function counts the number of times the integer is present.
def count_integer(integer):
    value = 0
    for int in integer_list:
        if(integer == int):
           value += 1 
    return value

#dictionary to keep track of the count of integers.
frequency_dictionary = dict()

for integer in integer_list:
    if(integer not in frequency_dictionary):
        frequency_dictionary[integer] = 1 #count_integer(integer) #frequency_dictionary
    else:
        frequency_dictionary[integer] = frequency_dictionary.get(integer) + 1

print(frequency_dictionary)

output = []
keys = list(frequency_dictionary.keys())
values = list(frequency_dictionary.values())

for iterate in range(len(values)):

    max_value = max(values)
    index_of_maxvalue = values.index(max_value)

    for num in range(max_value):
        output.append(keys[index_of_maxvalue])
    
    values.remove(max_value)
    keys.remove(keys[index_of_maxvalue])   

print(output)