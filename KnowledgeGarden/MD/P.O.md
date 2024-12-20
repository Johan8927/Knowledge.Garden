Attributs :
-----------
LES ATTRIBUTS PERMETTENT D'AJoUTER DES INFORMATIONS de metadonnées avec des classes, des méthodes , fonctions, propriétés et

 les constantes/Les attributs peuvent donc être considérés comme un langage de configuration intégré directement dans le code.
 -

-------------------------------

getters / setters :
----------------------
En gros ce sont des méthodes magique, fonctions magiquespréfixés par " __ "
Elles sont appelées automatiquement par le langage de programmation lors de certaines interactions avec les objets, sans que vous ayez besoin de les appeler explicitement dans votre code.

-------------------------------

methodes en p.o.o:
-------------

Fonctions à l'intérieur d'une classe
----
, On va pouvoir créer des méthodes dans nos classes dont le rôle va être d’obtenir ou de mettre à jour les valeurs de nos propriétés.
exemple :getNom(), setNom() et setPass().getNom()setNom() setPass() 

------------------------------

La classe: 
--------------
 est le moule { } qui sert à fabriquer les objets.
 --
  Le nombre d'objets que l'on peut créer à l'aide d'une classe est illimité. On appelle l'opération qui consiste à créer un objet instanciation et l'objet ainsi créé peut aussi être appelé instance de classe.

 ------------------------------

 Visibilité= " public " + $Valeur 
         ou = " protected " + $valeur
 -----------
 non- visibilité = " private "+ $Valeur
 ----------------
 méthode= fonctions - membres

 -------------------------


Objet:
-----
La programmation orientée objet consiste à modéliser informatiquement un ensemble d'éléments d'une partie du monde réel (que l'on appelle domaine) en un ensemble d'entités informatiques. Ces entités informatiques sont appelées objets.

 Il s'agit de données informatiques regroupant les principales caractéristiques des éléments du monde réel (taille, couleur, ...).
 -----


----------------

Abstraction :
-----------------
L'abstraction : La POO permet de créer des objets abstraits à partir du réel. Ses concepts se rapprochent donc des fonctionnalités utilisées par tout un chacun au quotidien.

---------------

l'héritage :
---------------

Le mot héritage est souvent utilisé dans un cadre de sucession ou de génétique. Il implique que les descendants possèdent une partie des gènes ou des biens de leurs ascendants.
Pour faire simple, c'est un mécanisme qui va permetttre, comme son nom l'indique,

 de transmettre toutes les méthodes d'une classe dite "mère" vers une autre dite "fille" et ainsi de suite.
 -

-----------------

Surcharge = Polymorphisme
------------------

En PHP, on dit qu’on « surcharge » une propriété ou une méthode d’une classe mère lorsqu’on la redéfinit dans une classe fille.
------------------

Pour surcharger une propriété ou une méthode, il va falloir la redéclarer en utilisant le même nom. Par ailleurs, si on souhaite surcharger une méthode, il faudra également que la nouvelle définition possède le même nombre de paramètres.

De plus, notez qu’on ne va pouvoir surcharger que des méthodes et propriétés définies avec des niveaux de visibilité public ou protected mais qu’il va être impossible de surcharger des éléments définis comme private puisque ces éléments n’existent / ne sont accessibles que depuis la classe qui les déclare.

---------------------------------

on définira généralement nos méthodes avec le mot clef public et nos propriétés avec les mots clefs protected ou private.
--------

Interface = " contrat " // Ont peut en mettre plusieurs suivant se d'ont l'ont as besoin pour nos classes.
être vivant = - il doit se nourrir
              - se reproduire

----------------

Les deux différences majeures entre les interfaces et les classes abstraites sont les suivantes :
-------

Une interface ne peut contenir que les signatures des méthodes ainsi qu’éventuellement des constantes mais pas de propriétés. Cela est dû au fait qu’aucune implémentation n’est faite dans une interface : une interface n’est véritablement qu’un plan ;
Une classe ne peut pas étendre plusieurs autres classes à cause des problèmes d’héritage. En revanche, une classe peut tout à fait implémenter plusieurs interfaces.

------------------------------

Autoload = fonction
__autoload — Tente de charger une classe indéfinie
__autoload(string $class): void
---------

L'autoload, c'est une méthode qui va s'occuper de faire ces chargements de fichiers dès qu'on utilise une classe. C'est à dire que lorsque l'on va instancier la classe Router, avec un new Router(), l'autoload va chercher s'il trouve le fichier associé, et l'inclure pour nous.

----------

le format fichier .Phar= archive en php
-----
Le format de fichier phar est composé de conteneur/manifeste/contenu/signature, et stocke les informations cruciales de ce qui est contenu dans l'archive phar dans son manifeste.

Le manifeste Phar est un format hautement optimisé qui permet la spécification fichier par fichier de la compression, des permissions et même des métadonnées utilisateur tels que l'utilisateur ou le groupe propriétaire. Toutes

--------

Composer c'est=
---------
Composer est un logiciel gestionnaire de dépendances libre écrit en PHP. Il permet à ses utilisateurs de déclarer et d'installer les bibliothèques dont le projet principal a besoin.

Composer est un gestionnaire de dépendances pour php. Les dépendances sont organisées au sein d'un "package" à ne pas confondre avec les "paquets"

--------------

derniére version de composer = v2.7.7

--------------
PSR DEF=
-----------

Petite piqûre de rappel : c’est un standard de programmation (ou “bonne pratique”) spécifique à PHP. L’idée est d’harmoniser les méthodes de développements.

On peut les regrouper en 4 grandes catégories :

Le chargement automatique : PSR-4
Les interfaces : PSR-3, PSR-6, PSR-11 …
HTTP ou la gestion des messages HTTP : PSR-7, PSR-15 …
Et les styles de codage : PSR-1, PSR-12.



