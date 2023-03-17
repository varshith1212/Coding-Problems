from posixpath import split

#reading the input.
sentence = input()

#Splittings the given sentence to words.
words = list(sentence.split(" "))

"""
Function check_vowels takes the input a string word, 
counts the number of vowels in it and 
returns 'even' if it has even number of vowels otherwise 'odd' 
"""
def check_vowels(word):

    vowels = ['a', 'e', 'i', 'o', 'u']
    vowel_count = 0 #variable carries the count of the vowels
    
    for letter in word:
        if(letter in vowels):
            vowel_count +=1
    
    #checking the vowel_count if its even or odd
    if(vowel_count % 2 == 0):
        return "even"
    else:
        return "odd"


score = 0 #initialzing the score to zero

#Calculating the score of the word.
for word in words:
    if(check_vowels(word) == "even"):
        score += 2
    else:
        score += 1

print(score)