
<h2>USE mydb;</h2> A chaque fois qu'on se connecte pour réutiliser la base de données!!!

<h2>CLÉS PRIMAIRE:</h2>
La clé primaire est l'un des outils principaux des bases de données (BDD) relationnelles. Elle permet d'identifier de façon unique chaque enregistrement d'une table. De plus, les clés primaires mettent en relation les différentes tables dans la base de données. Elle vérifie l'Unicité de la colonne.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h2>CLÉS SECONDAIRE:</H2>

Une clé secondaire est formée d'une ou de plusieurs colonnes.Plusieurs tableau peuvent avoir une même clé secondaire. Un attribut de clé secondaire peut être nul. Elle vérifie que les valeurs soit les mêmes que pour la clés primaire.

Pour mettre en relation différentes tables entre elles, on utilise des clés primaires et des clés étrangères. Une clé primaire est une colonne ou un groupe de colonnes qui identifie de manière unique chaque enregistrement dans une table. Elle permet d’assurer l’intégrité des données en garantissant qu’il n’y a pas de doublons ou de valeurs manquantes.

Une clé étrangère est une colonne qui est liée à une clé primaire d’une autre table. Elle permet de créer une relation entre deux tables en associant les enregistrements d’une table à ceux d’une autre. Les clés étrangères sont utilisées pour représenter les relations entre les données et pour permettre aux utilisateurs d’accéder à des informations qui sont stockées dans différentes tables.

Il existe plusieurs façons de lier des tables entre elles. Voici les principales méthodes utilisées :

Jointure interne : cette méthode permet de combiner les enregistrements de deux tables en fonction des valeurs des colonnes communes. Les enregistrements qui ne correspondent pas sont exclus de la requête.
Jointure externe : cette méthode permet de combiner les enregistrements de deux tables en fonction des valeurs des colonnes communes, mais elle inclut également les enregistrements qui ne correspondent pas dans les résultats.
Jointure gauche ou droite : cette méthode permet de combiner les enregistrements de deux tables en fonction des valeurs des colonnes communes, mais elle inclut également tous les enregistrements de l’une des tables, même s’ils ne correspondent pas à ceux de l’autre table.
Jointure croisée : cette méthode permet de combiner tous les enregistrements de deux tables pour créer une table temporaire qui contient toutes les combinaisons possibles des enregistrements.

<h2>REQUETE:</h2>
SELECT "NOMCOLONNE"

INSERT
UPDATE
DELETE

FROM "NOMTABLEAU"

JOIN/INNERJOIN/ECT: exécute les différentes jointures/conditions avant le "SELECT" dans l'ordre d'exécution




https://www.youtube.com/watch?v=Pgx0RMKg7bo
https://www.youtube.com/watch?v=Ecv0PEOvLq0

+----------------------+
|     Utilisateur      |
+----------------------+
           |
           v
+----------------------+       +---------------------+
|   Client Web (UI)    | <---- | Serveur Web (Back-End) |
|  (Navigateur)        |       | (Application Server)   |
+----------------------+       +---------------------+
                                    |
                                    v
                            +-------------------+
                            |  Base de Données  |
                            +-------------------+




Client (Navigateur) 
       |
       | HTTP/HTTPS
       |
Serveur Web (ex: Apache, Nginx)
       |
       | 
       | Exécute le code serveur (ex: PHP, Node.js, Python)
       |
       | 
Serveur d'application (ex: Django, Express, Laravel)
       |
       | Communique avec
       |
Serveur de Base de Données MySQL
       |
       | Stocke et récupère
       |
Base de Données (tables : Joueurs, Jeux, Scores, etc.)

<H2>INNER JOIN : requête SQL</H2>
Nous allons maintenant voir comment construire la requête SQL INNER JOIN. 

La requête se décompose en 3 parties :

‍SELECT et FROM permettent de choisir quelles informations sont extraites depuis la table de référence, 
‍INNER JOIN est le type de jointure utilisée,
‍ON définit la clé de jointure (ID_film).
SELECT colonnes 1, colonnes 2, …
FROM table1
INNER JOIN table2
ON clé de jointure
INNER JOIN : exemple d’utilisation
Voici la requête SQL qui a permis d’obtenir le tableau présenté précédemment :

SELECT ID_film, Nom_du_film, Annee_de_sortie, Note_IMDB
FROM Cinema
INNER JOIN Acteurs
ON Cinema.ID_film = Acteurs.ID_film
INNER JOIN exemple
Tu remarques qu’il manque l’ID_film 4 de la table Cinema, correspondant au film Titanic. En effet, il n’existe pas de correspondance entre à l’ID_film 4 dans la table Acteurs. La nouvelle table ne contient pas l’acteur Tom Hanks car il n’est associé à aucun film.

C’est logique : INNER JOIN ne garde que les lignes qui font l’objet d’une intersection.

<H2>LEFT JOIN</H2>
LEFT JOIN : définition
Cette instruction réalise une jointure entre deux tables en gardant toutes les informations de la table de gauche. Les données de la table de droite sont associées à la table de gauche seulement si leur clé correspond.

Remarque : Quand on dit “à gauche” et “à droite”, on fait référence à l’ordre d’apparition des tables après la clause ON : table_gauche.attribut = table_droite.attribut. 

LEFT JOIN appartient à la famille des jointures OUTER JOIN. Si un enregistrement ne se situe pas dans la table de droite mais qu’il existe la table de gauche, alors on trouve la valeur NULL dans le dataset final. 


Contrairement à un INNER JOIN, un LEFT JOIN préserve les données de la table de gauche, même en l’absence de correspondance.

Jointure SQL LEFT JOIN
LEFT JOIN : requête SQL
La requête LEFT JOIN se construit ainsi :

SELECT et FROM permettent de choisir quelles informations sont extraites depuis la table de référence. 
LEFT JOIN est le type de jointure SQL
ON définit la clé de jointure (ID_film)
SELECT colonnes 1, colonnes 2, …
FROM table1
LEFT JOIN table2
ON clé de jointure
LEFT JOIN : Exemple d’utilisation
Nous allons garder les mêmes tables qu’au début de l’article. Nous allons appliquer la requête SQL LEFT JOIN sur ces deux tables.

SELECT *
FROM cinema
LEFT JOIN acteurs
ON cinema.id_film = acteurs.id_film
‍
Remarque : l’étoile derrière la clause SELECT signifie “tout sélectionner”.

LEFT JOIN exemple
Ici, tous les enregistrements de la table Cinema sont présents. Cependant, comme aucun acteur est associé à l’ID_film 4 (Titanic), on trouve des valeurs NULL.

Tu remarques également que Tom Hanks ne figure pas dans cette nouvelle table. C’est normal car la table de référence est la table de gauche, c’est à dire la table Cinema.

LEFT JOIN sans intersection
‍
Cette jointure est un LEFT JOIN auquel on retire les enregistrements qui correspondent à la table de droite. Ainsi, on ne garde que les données de la table de gauche qui n’ont aucune correspondance avec la table de droite.

Jointure SQL LEFT JOIN sans intersection
SELECT colonnes 1, colonnes 2, …
FROM table1
LEFT JOIN table2
ON condition
WHERE table2.id IS NULL
RIGHT JOIN
RIGHT JOIN: définition
Cette requête SQL réalise une jointure en gardant toutes les informations de la table de droite. S’il n’y a pas de correspondance avec la table de gauche, la cellule de l’information manquante contient la valeur NULL. Il s’agit d’un OUTER JOIN aussi.

Jointure SQL RIGHT JOIN
RIGHT JOIN: Requête SQL
La requête SQL RIGHT JOIN se décompose de la manière suivante :

SELECT et FROM permettent de choisir quelles informations sont extraites depuis la table de référence. 
RIGHT JOIN est le type de jointure SQL
ON définit la clé de jointure (ID_film)
SELECT colonnes 1, colonnes 2, …
FROM table1
RIGHT JOIN table2
ON condition
RIGHT JOIN : Exemple d’utilisation
Faisons un RIGHT JOIN des tables Cinema et Acteurs :

SELECT *
FROM Cinema
RIGHT JOIN Acteurs
ON Cinema.ID_film = Acteurs.ID_film
RIGHT JOIN exemple 
Ici, comme la table Cinéma ne contient aucun film de Tom Hanks, la ligne contient des valeurs NULL.

RIGHT JOIN sans intersection

Cette jointure est juste le RIGHT JOIN auquel on retire les enregistrements de la table de Gauche. Ainsi, on ne garde que les lignes de la table de droite qui n’ont aucune correspondance avec la table de gauche.

Jointure SQL RIGHT JOIN sans intersection
SELECT colonnes 1, colonnes 2, …
FROM table1
RIGHT JOIN table2
ON condition
WHERE table1.id IS NULL
FULL JOIN
FULL JOIN : définition
Le FULL JOIN va réaliser une jointure totale entre deux tables. On va prendre les enregistrements de toutes les tables et les mettre dans la table de résultat. Les cellules qui n’auront pas de correspondance dans les deux tables en auront pour valeur : NULL.

Cette jointure n'exclut aucune donnée, ni à droite ni à gauche. Elle appartient également à la famille des OUTER JOIN.

Jointure SQL FULL JOIN
FULL JOIN: requête SQL
La requête se construit de la manière suivante :

SELECT et FROM permettent de choisir quelles informations sont extraites depuis la table de référence. 
FULL JOIN est le type de jointure SQL
ON définit la clé de jointure
SELECT colonnes 1, colonnes 2, …
FROM table1
FULL JOIN table2
ON condition
FULL JOIN : exemple d’utilisation
Pour réaliser une jointure FULL JOIN de nos deux tables, la requêt SQL sera :

SELECT *
FROM Cinema
FULL JOIN Acteurs
ON Cinema.id_film = Acteurs.id_film
Voici le résultat :

FULL JOIN exemple
Ici, la table contient tous les enregistrements des deux tables, qu’il y ait une correspondance ou non.

Bravo ! Tu connais les principales jointures SQL ! Pour apprendre à les maîtriser, télécharge le programme de nos formations et inscris toi à notre prochaine session !

NATURAL JOIN
NATURAL JOIN: définition
NATURAL JOIN permet de joindre deux tables à condition qu’il existe deux colonnes qui portent le même nom et qui contiennent des données du même type.

La jointure NATURAL JOIN a la particularité de ne pas utiliser la clause ON dans sa requête SQL. Cette jointure cherche automatiquement une clé entre les colonnes des deux tables. Si elle la trouve, elle associe les données sur la base de cette clé, sinon un NULL apparaît. 

NATURAL JOIN : requête SQL
La requête se construit de la manière suivante :

SELECT et FROM permettent de choisir quelles informations sont extraites depuis la table de référence.
NATURAL JOIN est le type de jointure SQL
SELECT colonnes 1, colonnes 2, …
FROM table1
NATURAL JOIN table2
NATURAL JOIN : exemple d’utilisation
Appliquons maintenant cette jointure à notre exemple :

SELECT *
FROM cinema
NATURAL JOIN acteurs
On obtient le résultat suivant :

NATURAL JOIN exemple
Ici, on trouve le même résultat que la jointure INNER JOIN. Pourtant, la jointure NATURAL JOIN n’a pas eu besoin de clause ON. Elle a déduit que la colonne ID_film était la clé de jointure car le nom et le type de donnée de cette colonne sont les mêmes dans les deux tables.


En savoir plus sur la formation SQL

<H2>CROSS JOIN</H2>
CROSS JOIN : définition
CROSS JOIN est une jointure assez particulière. Elle réalise un produit cartésien entre les données de deux tables. 

Késako ? C’est facile : si la table A possède 10 lignes et que la table B possède 10 lignes alors la table issue de la jointure aura 100 lignes.

‍
Ainsi, chaque ligne de la table A est associée à toutes les lignes de la table B.

Jointure SQL CROSS JOIN
Ici, on n’utilise pas de clé de jointure. Toutes les lignes sont associées avec celles de l’autre table.

CROSS JOIN : requête SQL
Voici de quoi se compose la commande SQL :

SELECT et FROM permettent de choisir quelles informations sont extraites depuis la table de référence. 
CROSS JOIN est le type de jointure SQL
SELECT colonnes 1, colonnes 2, …
FROM table1
CROSS JOIN table2
CROSS JOIN : exemple d’utilisation
Appliquons maintenant cette jointure avec notre exemple de cinéma :

SELECT *
FROM acteurs
CROSS JOIN cinema
On obtient le résultat suivant :

CROSS JOIN exemple
Tu peux remarquer que chaque ligne de la table Cinema a été associée à chaque ligne de la table Acteurs. C’est parce que la table de gauche (Cinema) correspond à la table A sur le schéma ci-dessus.

Remarque : l’intégralité de la table n’est pas présente, elle contient 30 lignes. C’est logique car 5*6 = 30.

<H2>UNION JOIN</H2>
UNION JOIN : définition

Le UNION JOIN réalise le même travail que la jointure FULLJOIN mais il s’utilise avec des tables qui ont les mêmes colonnes. Pour mieux comprendre nous allons introduire une nouvelle table « acteurs FR » qui réunit des acteurs français.

Tables "Acteurs"
La jointure SQL UNION permet de créer une table unique qui réunit toutes les données des deux tables mais à la différence d’un FULL JOIN, la table finale n’a pas de doublons.

UNION JOIN : requête SQL
SELECT et FROM permettent de choisir quelles informations sont extraites depuis la table de référence 
UNION définit le type de jointure SQL
SELECT et FROM permettent de choisir quelles informations sont extraites depuis la deuxième table.
SELECT colonnes 1, colonnes 2, …
FROM table1
UNION
SELECT colonnes 1, colonnes 2, …
FROM table2
UNION JOIN : exemple d’utilisation
Appliquons maintenant cette jointure avec notre exemple de cinéma :

SELECT *
FROM Acteurs_USA
UNION
SELECT *
FROM Acteurs_FR
On obtient le résultat suivant :

UNION JOIN exemple
La table qui résulte de cette jointure contient tous les enregistrements des deux tables. L’opération est la même que pour le FULL JOIN mais le résultat ne contient pas de NULL ni de doublons. Pour les tables où les colonnes portent les mêmes noms, on préférera l’UNION.

SELF JOIN
SELF JOIN : définition
Le SELF JOIN est une jointure qui est faite sur elle-même. Cela revient à réaliser une jointure sur deux tables identiques.

Jointure SQL SELF JOIN
Ces jointures sont utilisées lorsqu’une table possède une clé primaire et une clé étrangère à la fois. Nous allons prendre une nouvelle table pour expliquer cette jointure.


Voici la table « Employees » :

Table "Employees"
Cette table donne la liste des employés. Sa clé primaire correspond à l’ID_employee.

La colonne ID_manager indique qui est le manager de l’employé en question. 

Concrètement, Antoine est le manager de Yves et Yves est le manager de Marc.


Autrement dit, ID_employee est la clé primaire et ID_manager est la clé étrangère. La jointure SELF JOIN va permettre de mettre en évidence le manager de chaque employé.

‍

‍

SELF JOIN :requête SQL
Ici, la requête est plus compliquée car il faut dupliquer la table avant de pouvoir réaliser la jointure SELF JOIN :

SELECT sélectionne et renomme les colonnes de la table,
FROM définit la table de référence et la renomme afin de bien dissocier les deux tables.
JOIN applique la jointure sur la table dupliquée, qui est renommée également,
ON définit la clé de jointure
SELECT table1.clé_primaire,
       table1.colonne1,
       table1.clé_étrangère,
       table2.colonne1 as Table2colonne1,
 
FROM Table table1
JOIN Table table2
ON table1.clé_étrangère = table2.clé_primaire
SELF JOIN : exemple d’utilisation
Voici la requête appliquée à notre exemple :

SELECT Employees.ID_employee,
Employees.Nom,
Managers.Nom,

FROM Employees

LEFT JOIN Employees as Managers
ON Employees.ID_manager = Managers.ID_manager
 Remarque : « as » sert à renommer la table et les colonnes pour ne pas se perdre dans la nouvelle table.

Ici, nous avons réalisé une jointure SELF JOIN par le biais d’une jointure LEFT JOIN. Il est tout à fait possible de réaliser la même opération avec d’autres types de jointures.

 

Le résultat de la requête SQL est le suivant :

SELF JOIN exemple



<h2>SELECT SUM(PLACES)</H2>
FROM SALLES
JOIN CINEMAS ON idCINEMAS=CINEMAS_idCINEMAS
WHERE CINEMAS.NOMS = 'Megarama';
 FAIT LA SOMME DE TOUTE LES SALLES D'un cinema
 --------------------------------------------------------------------------------


SELECT DISTINCT SALLES.*
FROM SALLES
JOIN SEANCE ON idSALLES=SALLES_idSALLES
JOIN FILMS ON SEANCE.FILMS_idFILMS = idFILMS
JOIN FILMS_has_ACTEURS ON FILMS_has_ACTEURS.FILMS_idFILMS = idFILMS
JOIN ACTEURS ON ACTEURS_idACTEURS = idACTEURS
WHERE NOMSPRENOMS IN ('Bruce Willis', 'Harrison Ford');
Liste des toutes les salles avec un film ayant Bruce Willis ou Harrison Ford dans son casting

Tous les cinémas qui ont passé ou vont passer star wars
SELECT CINEMAS.NOMS
FROM SEANCE
JOIN CINEMAS ON SEANCE.CINEMAS_idCINEMAS = CINEMAS.idCINEMAS
JOIN FILMS ON SEANCE.FILMS_idFILMS = FILMS.idFILMS
WHERE FILMS.TITRE = 'Star Wars'


<H2>Les champs</H2> sont les composants qui fournissent la structure d'une table. Vous ne pouvez pas avoir de table sans champs.

<H2>Le concept de bases de données relationnelles</H2>  basé sur le principe que les données sont stockées dans des tables qui sont liées entre elles par des relations. Une base de données relationnelle est donc une collection de tables qui sont interconnectées entre elles pour représenter les données de manière organisée et cohérente. Les tables sont composées de lignes (appelées enregistrements) et de colonnes (appelées champs) qui contiennent les informations à stocker.


<H2>EVITER LA REDONDANCE DES DONNÉES:
 SELECT DISTINCT</H2>

AVG() pour calculer la moyenne d’un set de valeur. Permet de connaître le prix du panier moyen pour de chaque client
COUNT() pour compter le nombre de lignes concernées. Permet de savoir combien d’achats a été effectué par chaque client
MAX() pour récupérer la plus haute valeur. Pratique pour savoir l’achat le plus cher
MIN() pour récupérer la plus petite valeur. Utile par exemple pour connaître la date du premier achat d’un client
SUM() pour calculer la somme de plusieurs lignes. Permet par exemple de connaître le total de tous les achats d’un client

Qu’est-ce que START TRANSACTION dans MySQL ?
Les bases de données MySQL prennent en charge les transactions de base de données en fournissant des instructions pour initier ces transactions. Il nous donne les requêtes intégrées suivantes : "START TRANSACTION / BEGIN" : cette requête déclenche le début d’une transaction. "COMMIT" : cette requête permet aux modifications apportées à la base de données de devenir permanen


<H2>UPDATE FILMS</H2>
SET BUDGET = BUDGET+ 10000000


WHERE idFILMS = 4;

Ajouter 1 000 000 au budget du film que vous avez créé

----------------------------

Augmenter de 5% le budget de tous les films:

Pour avoir le droit de mofifier les colonnes:

<h2>SET SQL_SAFE_UPDATES = 0;</h2>
-----------------------------------------------

<h2>USE mydb;</h2>
DELETE FROM SEANCE
WHERE FILMS_idFILMS = 3;
DELETE FROM FILMS
WHERE idFILMS =3;

--------------------------------

<h2>SQL= cohérence des données(lent processus)
-------------------------------------------------


NoSQL(NOT ONLY SQL) (vitesse et oprimisation)= meilleure organisation des données, meilleure performances, peut compléter le SQL et perd la possibilité de chercher plusieurs critéres et la redondance des données</h2>

<h2>ROLLBACK</H2>
permet de revenir en arriére
