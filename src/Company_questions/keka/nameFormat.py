"""
input: dodda sai varshith
output: D.S.Varshith
"""

def name(s):
    l = s.split()
    new = ""
    for i in range(len(l)-1):
        s = l[i]
        new += (s[0].upper()+'.')
    new += l[-1].title()
    return new
s=input()
print(name(s))