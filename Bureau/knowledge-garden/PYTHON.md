def is_even(num: int) -> bool:
    
    return num % 2 == 0

    La solution peut être un peu délicate. num % 2 renvoie déjà une valeur qui peut être utilisée comme bool, nous n'avons donc pas besoin de == 0. Mais pour les nombres pairs, num % 2 renverra 0, ce qui, dans la logique booléenne, signifie False. Vous devez donc utiliser l'opérateur not pour inverser la valeur bool, car la fonction doit retourner True pour les nombres pairs. Le code est le suivant 

    def is_even(num: int) -> bool:
                
    return not num % 2

<h2>compare et détermine les nombres positif negatif et 0:
    def determine_sign(num: int) -> str:
    if num == 0: return 'zero'
    if num > 0: return 'positive'
    return 'negative'</h2>

<h2>JEUX DE l'OIE: PYTHON:</h2>

https://gist.github.com/adrientetar/6660518

<H2>DIVISER </H2>
Déterminez le reste de la division de deux entiers positifs.
def find_remainder(dividend: int, divisor: int) -> int:
    # your code here
    remainder = dividend % divisor
    return remainder


print("Example:")
print(find_remainder(3, 2))

<h2>MODULO :   %</h2>pareil qu'en java

<h2>COMPARAISON:   ==</H2>

<h2>Renvoyer une chaîne de caractére</h2>

def backward_string(val: str) -> str:
    # your code here
    
    return val [::-1]


print("Example:")
print(backward_string("val"))


assert backward_string("val") == "lav"
assert backward_string("") == ""
assert backward_string("ohho") == "ohho"
assert backward_string("123456789") == "987654321"

print("The mission is done! Click 'Check Solution' to earn rewards!")

# Vous pouvez utiliser un pas négatif pour obtenir une liste inversée:

1
a = [1, 2, 3]
2
print(a[::-1])
Résultat :

[3, 2, 1]