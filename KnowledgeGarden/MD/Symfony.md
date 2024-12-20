Qu'est-ce que la doctrine ?
-
Doctrine ORM est un mappeur objet-relationnel (ORM) pour PHP qui fournit une persistance transparente pour les objets PHP. Il utilise le modèle Data Mapper en son cœur, visant à une séparation complète de votre logique de domaine/métier de la persistance dans un système de gestion de base de données relationnelle.
-
L'avantage de Doctrine pour le programmeur est la possibilité de se concentrer sur la logique métier orientée objet et de ne s'inquiéter de la persistance que comme d'un problème secondaire. Cela ne signifie pas que la persistance est minimisée par Doctrine 2, mais nous pensons qu'il y a des avantages considérables pour la programmation orientée objet si la persistance et les entités sont séparées.
-
------------------------
Que sont les entités ?
-
Les entités sont des objets PHP qui peuvent être identifiés à travers de nombreuses requêtes par un identifiant unique ou une clé primaire. Ces classes n'ont pas besoin d'étendre une classe de base abstraite ou une interface.
-
Une entité contient des propriétés persistantes. Une propriété persistante est une variable d'instance de l'entité qui est enregistrée et récupérée dans la base de données par les capacités de mappage de données de Doctrine.
-
Une classe d'entité ne doit pas être finale ni en lecture seule, bien qu'elle puisse contenir des méthodes finales ou des propriétés en lecture seule.
-

-----------

![img_28.png](images/img_28.png)

-------
![img_29.png](images/img_29.png)

---------------

"dd" = "echo" pour afficher les résultats (dumb & die)
-
-----------------

persist = attache à la mémoire doctrine
-
flush = applique les changements de doctrine
-
![img_30.png](../MD/img_30.png)

------------

commandes pour commencer le crud symfony :
-
Oublie pas de changer l'url de la database
-

php bin/console make:entity = crée une classe à migré sur la db
-
php bin/console make:crud = crée le crud complet (controller)
-
php bin/console make:auth = crée l'authentification
-
php bin/console make:user = crée la sécurité pour le user
-
php bin/console make:migation = crée les requêtes migration des entités en table dans la db
-
php bin/console doctrine:migrations:migrate = effectue la migration sur la db
-
php bin/console make:form = crée un formulaire (html, css, et la classe formulaire)
-
--------------------
denyAccessUnlessGranted = méthode intégrée à Symfony, cela vérifie si un utilisateur est authentifié avant d'exécuter une action spécifique.
-
--------------
php bin/console make:voter = crée un fichier depermission permettant la configuration de la modération
-
------------------
kernel.php = coeur de l'application(point d'entrée)
-
index.php = fichier qui instancie kernel
-
--------------
$entityManager = l'Entity Manager qui fournit des fonctions que l'on manipule pour créer, éditer, rechercher et supprimer nos objets métiers ; le Data Mapper qui s'occupe d'effectuer les requêtes auprès du système de gestion de base de données sélectionné (généralement MySQL).
-




