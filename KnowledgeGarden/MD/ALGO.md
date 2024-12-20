<h2>println (fonction(élément a print))


<h2>Une fonction get... qui prend un tableau en paramètre :
</h2>
boolean getMax (int board[]) {

<h2> ==</h2>
Compare deux éléments

<h2>board.lenght :</h2>
Affiche tous les éléements d'un tableau


Opérateur	              Expression
! (not)	                ! true
! (not)	                ! false
&& (and)	            true && true
&& (and)	            true && false
&& (and)	            false && false
!= (not equal)	        true != true
!= (not equal)      	true != false
!= (not equal)	        false != false
== (equal)	true == true
== (equal)	true == false
== (equal)	false == false



# Vous devez écrire une fonction qui recevra un entier positif et retournera : "Fizz" si le nombre est divisible par 3 (3, 6, 9 ...) sinon convertir le nombre donné en une chaîne de caractères(2 -> "2").

def checkio(num: int) -> str: 

    if not num % 3:
        return "Fizz"
    else:
        return str(num)




    En mathématiques, une itération désigne l'action de répéter un processus.

----------------

Algo de tri=
-
--------------------------
Le tri par séléction = 
-
2 boucles "for", une pour parcourir le tableau 
-
la 2e boucle parcourt le tableau non comparé pour le comparé au nouveau tableau sans la valeur séléctionneé avant
-
Le tri par sélection (ou tri par extraction) est un algorithme de tri par comparaison
-
                 public class SelectionSort implements SortAlgorithm {
    @Override
    public void sort(ObservableArray array) {


        for (int i = 0; i < array.getLength() - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.getLength(); j++) {
                if (array.get(j) < array.get(index)) {
                    index = j;
                }
            }

            array.swap(i, index);
        }

    }
    }

------------

Le tri par insertion =
-
Le tri par insertion considère chaque élément du tableau et l'insère à la bonne place parmi les éléments déjà triés.
-
Le tri par insertion d’un tableau de nombres de taille n consiste à le parcourir et à le trier au fur et à mesure pour que les éléments soient dans l’ordre croissant. Le tri par insertion se fait sur place.
-
Ainsi, à l’étape k, les k–1 premiers éléments du tableau sont triés et on insère le k-ième élément à sa place parmi les k premiers éléments.
-
![img_2.png](../../MD/img_2.png)

----------------

La sort()méthode trie un tableau par ordre croissant.
-
Cette méthode trie les tableaux de chaînes par ordre alphabétique et les tableaux d'entiers par ordre numérique.
-
Algo de tri rapide=
-
![img_3.png](../../MD/img_3.png)

-----------

algo de tri par tas=
-

![img_4.png](../../MD/img_4.png)




récursivité =
-
Une fonction récursive est une fonction qui s’appelle elle-même.
-
---------------

la courbe du Dragon=
-
![img_5.png](../../MD/img_5.png)

-----------

Fractales=
-
répétitions à l'infini de plus en plus petits d'un objet
-

Courbe de Kosh=
-

![img_6.png](../../MD/img_6.png)

![img_7.png](../../MD/img_7.png)

-------

C'est quoi un HashMap en Java ?
-
La classe HashMap<K,V> est une implantation particulière de table (K est le type des clés, et V le type des valeurs). La fonction de recherche de clé est réalisée en un temps presque constant, grâce à l'utilisation d'une fonction dite de hachage, qui transforme la clé en un entier.
-

Méthode pour déssiner dans une frame=
-

![img_8.png](../../MD/img_8.png)
