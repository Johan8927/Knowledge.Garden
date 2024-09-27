en Java, tout est objet à l’exception des types primitifs (nombres entiers, nombres à virgule flottante, etc.) qui ont cependant leurs variantes qui héritent de l'objet Object (Integer, Float, Double, etc.).
----
les classes 1ere lettre en Majuscule
-
Ligne d’impression
-
System.out.println() peut imprimer sur la console :
-

System est une classe de la bibliothèque de base fournie par Java
--
out est un objet qui contrôle la sortie
-------

println() est une méthode associée à cet objet qui reçoit un seul argument
------

System.out.println("Hello, world!");
// Résultat : Bonjour, tout le monde 


Compilation de Java
En Java, lorsque nous compilons un programme, chaque classe individuelle est convertie en un fichier de classe . , qui est connu comme le code d’octet.

La JVM (machine virtuelle Java)
-
est utilisée pour exécuter le code d’octets.

# Compiler le fichier de classe :
javac hello.java

# Exécuter le fichier compilé :
Espaces
Les espaces, y compris les espaces et les nouvelles lignes, entre les instructions sont ignorés.

System.out.println(« Exemple d’énoncé »);
-

System.out.println(« Another statement »);
-

Relevés
En Java, une instruction est une ligne de code qui exécute une tâche et se termine par un ;.

System.out.println("Java Programming ☕️");
-
main() Méthode
--
En Java, chaque application doit contenir une méthode main(), qui est le point d’entrée de l’application. Toutes les autres méthodes sont appelées à partir de la méthode main().
--

La signature de la méthode est public static void main(String[] args) { }. Elle accepte un seul argument : un tableau d’éléments du type String.
-

public class Personne {

public static void main(String[] args) {

    System.out.println("Hello, world!");





Une classe représente un concept unique.

Un programme Java doit avoir une classe dont le nom est le même que celui du nom de fichier du programme.
-

Dans l’exemple, la classe Person doit être déclarée dans un fichier de programme nommé Person.java.

Une classe représente un concept unique.

Un programme Java doit avoir une classe dont le nom est le même que celui du nom de fichier du programme.

Dans l’exemple, la classe Person doit être déclarée dans un fichier de programme nommé Person.java.

public class Personne {

public static void main(String[] args) {

    System.out.println("Je suis une personne, pas un ordinateur.");

}

}

---------------

Primitive Data Types
--
Java’s most basic data types are known as primitive data types and are in the system by default.

The available types are as follows:

int
char
boolean
byte
long
short
double
float
null is another, but it can only ever store the value null.



int age = 28;
--
char grade = 'A';
-
boolean late = true;
-
byte b = 20;
-
long num1 = 1234567;
-
short no = 10;
-
float k = (float)12.5;
-
double pi = 3.14;
-
String = "blabla";
-

-----------

Increment and Decrement Operators
The increment operator, (++), can increase the value of a number-based variable by 1 while the decrement operator, (--), can decrease the value of a variable by 1.

int numApples = 5;
-
numApples++; // Value is now 6

int numOranges = 5;
-
numOranges--; // Value is now 4

public void 


    "public class Person {
// state of an object


int age;
String name;

// behavior of an object


public void set_value() {

age = 20;

name = "Robin";

}
public void get_value() {

System.out.println("Age is " + age);

System.out.println("Name is " + name);

}

// main method
-

public static void main(String [] args) {

// creates a new Person object

Person p = new Person();

    // changes state through behavior
    p.set_value();
}
}

------

Méthode du constructeur en Java
-
Les classes Java contiennent une méthode de constructeur qui est utilisée pour créer des instances de la classe.
---

Le constructeur porte le nom de la classe. Si aucun constructeur n’est défini, un constructeur vide par défaut est utilisé.
----------

---------------


L'opérateur logique NOT est représenté par !. Cet opérateur nie la valeur d'une expression booléenne.
-

----------------
Opérateur ET
---
L'opérateur logique AND est représenté par &&. Cet opérateur renvoie truesi les boolean expressions des deux côtés de l'opérateur sont égales true; sinon, il renvoie false.
-

L'opérateur OU
-------
L'opérateur logique OR est représenté par ||. Cet opérateur renvoie truesi au moins une des booleanexpressions comparées possède une true valeur ; sinon, il renvoie false.
------
L'opérateur "double"
-
Le mot clé double est un type de données qui peut stocker des nombres fractionnaires de 1,7e−308 à 1,7e+308 .
-----------

-
Systemest une classe Java intégrée qui contient des outils utiles pour nos programmes.
-------
outest l'abréviation de « sortie ».
-----
printlnest l'abréviation de « ligne d'impression ».
------

Compilation = Nous avons un fichier : Welcome.java . Nous compilons avec la commande :
Le terminal n'affiche aucune erreur , ce qui indique une compilation réussie.

javac Welcome.java = compile deux fichier
--
Nous avons maintenant deux fichiers :

Welcome.java , notre fichier original avec la syntaxe Java.
---------
Welcome.class , notre fichier compilé avec bytecode Java, prêt à être exécuté par la machine virtuelle Java.
---------
Nous pouvons exécuter la classe compilée avec la commande :
-
java Welcome
------


-----------

![img_1.png](img_1.png)

Les programmes Java ont au moins une classe et une main()méthode.
-
Chaque classe représente une idée du monde réel.
-
La main()méthode exécute les tâches du programme.
-
Les commentaires Java ajoutent un contexte utile aux lecteurs humains.
-
Java possède des espaces, des accolades et des points-virgules.
-
Les espaces blancs permettent aux humains de lire facilement le code.
-
Les accolades marquent la portée d'une classe et d'une méthode.
-
Les points-virgules marquent la fin d’une déclaration.
-
Java est un langage compilé.
-
La compilation détecte les erreurs dans notre code.
-
Les compilateurs transforment le code en une classe exécutable.
-

Le chartype de données est utilisé pour stocker un seul caractère. Le caractère doit être entouré de guillemets simples, comme « A » ou « c » :
-

char myGrade = 'B';

System.out.println(myGrade);

----------------

Ajout ( +=)
-
Soustraction ( -=)
-
Multiplication ( *=)
-
Division ( /=)
-
Module ( %=)
-
------------

== (strictement égal)
----
!= (non égal)
-
.equals() = (strictement égal)
-

public class Song {

public static void main(String[] args){

String line1 = "Nah nah nah nah nah nah nah nah nah yeah";

String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";

String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";

System.out.println(line1 .equals (line2));

System.out.println(line2 .equals(line3));

}       
}

------------------

final variables = (constante, valeur qu'on ne peut changer aprés la déclaration)
-

-----------

Math. ceil() 
-
convertit le nombre en l'entier le plus proche supérieur ou égal au nombre donné ; si un entier est passé en argument, le résultat de Math. ceil() sera le même entier, mais comme Math. ceil() renvoie une valeur double, l'entier sera typé en double.5
--
------------------
En Java, la classe Scanner permet à un utilisateur d’écrire du texte et au programme de lire ce texte.
-
La fonction nextLine() en Java renvoie la valeur dans la chaîne, elle renvoie la ligne actuelle qui a été ignorée.
-

Attributs = valeurs dans une classe
-
-----------
toString() = renvoie la sortie souhaitée sur l’objet.
-
Cela dépend de votre implémentation.
-

------------

break
-
L'instruction break permet de terminer la boucle en cours ou l'instruction switch ou label en cours et de passer le contrôle du programme à l'instruction suivant l'instruction terminée.
-
------------
super = super est utilisé afin d'appeler ou d'accéder à des fonctions définies sur l'objet parent,
---
pour appeler un constructeur de superclasse
---------
----------------

yield=
-

Le mot clé yield nous permet de quitter une expression switch en renvoyant une valeur qui devient la valeur de l'expression switch . Cela signifie que nous pouvons attribuer la valeur d'une expression switch à une variable.
-----------------------------
--------------------

Le Switch/Case 
-
est une structure conditionnelle en Java qui vous permet de sélectionner un ensemble d’instructions à exécuter en fonction de la valeur d’une variable. Il s’agit en fait d’une instruction très similaire à l’instruction if de Java, à la différence qu’il offre une syntaxe plus comprimée qui permet d’exprimer facilement plusieurs conditions.
-
![img_2.png](img_2.png)

Méthode abstraite : Oblige chaque sous-classe à définir son propre calcul de protection.
-

----------------
L'annotation @Override indique en effet que la méthode est héritée de la classe mère ou d'une interface.
-
--------------

Les énumérations permettent de définir un ensemble fini de constantes, chacune d'entre-elles est séparée des autres par une virgule.
-
---------