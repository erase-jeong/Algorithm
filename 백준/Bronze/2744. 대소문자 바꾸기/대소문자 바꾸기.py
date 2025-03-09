word=input()
converted_word=""
for char in word:
    if char.isupper():
        converted_word+=char.lower()
    elif char.islower():
        converted_word+=char.upper()

print(converted_word)