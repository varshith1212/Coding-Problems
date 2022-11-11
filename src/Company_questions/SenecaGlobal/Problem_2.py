set_1 = ['q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p',]
set_2 = ['a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l',]
set_3 = ['z', 'x', 'c', 'v', 'b', 'n', 'm', ]

shift = int(input())
sentence = input()

output = ""
for letter in sentence:
    #rint(letter)
    value = letter
    if letter in set_1:
        #print(set_1.index(letter))
        value = set_1[(set_1.index(letter) + shift)%len(set_1)]
    if letter in set_2:
        value = set_2[(set_2.index(letter) + shift)%len(set_2)]
    if letter in set_3:
        value = set_3[(set_3.index(letter) + shift)%len(set_2)]
    output += value 

print(output)