
Comment tester la bonne configuration et la communication entre deux machines (Dans la vraie vie et pas sur Cisco Packet Tracer)?

// en testant dans un terminal avec la commande "ping"

Différence clé entre le modèle TCP/IP et OSI.
----

TCP/IP est un modèle pratique qui répond à des défis de communication spécifiques et repose sur des protocoles standardisés.
-------

En revanche, OSI sert de framework complet et indépendant du protocole, conçu pour englober diverses méthodes de communication réseau.
----



O.S.I = Open Système Interconnection
---------


-------------

Une interface réseau aura une IP dans le plan d’adressage du réseau 1 et l’autre interface réseau aura une IP dans le plan d’adressage du réseau 2.
---

Qu’est ce qu’une API (et plus spécifiquement une API REST)?

// API REST se concentre sur la gestion et la manipulation des ressources via des représentations transférées entre un client et un serveur, de manière sans état

Qu’est ce que le protocole HTTP ?

// Le HTTP intervient également dans les API REST, une solution permettant de contrôler les services Web

// HTTP est un protocole qui permet de récupérer des ressources telles que des documents HTML. Il est à la base de tout échange de données sur le Web. C'est un protocole de type client-serveur, ce qui signifie que les requêtes sont initiées par le destinataire

Quelles sont les méthodes disponibles avec le protocole HTTP ?

// Le CRUD, CREATE READ UPDATE ET DELETE

Quelle est la différence entre le protocole HTTP et le protocole HTTPS ?

// Le HTTPS permet une naviguation sécurisé "S"

Qu’est ce qu’un Bearer token ?

// une méthode d'authentification des utilisateurs en passant un jeton d'accès (également appelé « jeton du porteur ») dans les en-têtes de requête.

Une explication des différents types d’enregistrement DNS

// es enregistrements de type A et AAAA permettent de mapper des FQDN à des adresses IP, les enregistrements PTR font le contraire : ils mappent les adresses IP aux noms de domaine.

Une brève description de ce que vous avez fait pour chaque route de l’activité

// ...

Quels sont les protocoles qui ont été remplacés par SSH ?

// SSH (Secure Shell) a remplacé plusieurs protocoles et méthodes plus anciens qui étaient utilisés pour accéder à des systèmes distants de manière non sécurisée. Voici les principaux protocoles qui ont été remplacés par SSH :
-------------

1. 
   Telnet permettait une connexion à distance à des systèmes, mais sans chiffrement. Cela signifiait que toutes les informations, y compris les identifiants et les mots de passe, étaient transmises en clair sur le réseau, ce qui rendait les connexions vulnérables aux attaques de type interception.

2.
   Rlogin (Remote Login) était un autre protocole de connexion à distance non sécurisé, utilisé principalement dans les systèmes Unix pour permettre à un utilisateur de se connecter à un autre ordinateur. Comme Telnet, Rlogin ne chiffrait pas les données transmises, exposant les informations sensibles.

3. RSH (Remote Shell)
   RSH permettait l'exécution de commandes sur des systèmes distants. Comme Telnet et Rlogin, RSH ne chiffrait pas les informations, laissant les connexions vulnérables à l'interception.

4. FTP (File Transfer Protocol)
   Bien que FTP soit spécifiquement utilisé pour le transfert de fichiers, il était aussi non sécurisé, transmettant les identifiants et les fichiers en clair. SSH a remplacé FTP avec SFTP (SSH File Transfer Protocol), qui chiffre toutes les communications.

5. RCP (Remote Copy Protocol)
   RCP permettait la copie de fichiers entre systèmes distants, mais ne chiffrait pas les communications. SFTP et SCP (Secure Copy Protocol, basé sur SSH) sont des alternatives sécurisées à RCP.

6. Berkeley r-utilities
   Ces utilitaires (rlogin, rsh, rcp) étaient populaires dans les environnements Unix, mais ils n'offraient aucune protection de la vie privée ou de la sécurité. SSH est devenu la solution sécurisée et standard dans les environnements Unix/Linux pour remplacer ces outils.
   Quelles sont les différents modes d’utilisation de SSH (notamment au niveau de la sécurité)?

Quelles sont les différents modes d’utilisation de SSH (notamment au niveau de la sécurité)?
--------
Pourquoi SSH a remplacé ces protocoles :
--
Chiffrement des données : SSH chiffre toutes les données transmises, protégeant ainsi les informations sensibles.
------
Authentification sécurisée : SSH supporte une authentification forte, comme les clés publiques/privées, offrant un niveau de sécurité bien supérieur aux mots de passe envoyés en clair.
-----------
Protection contre les attaques : SSH est conçu pour protéger contre les attaques de type interception, falsification et usurpation.
----------
En résumé, SSH a remplacé les protocoles comme Telnet, Rlogin, RSH, FTP, RCP, et d'autres, en offrant une solution sécurisée pour l'accès et les transferts de données à distance.
-------
Comment est établie une connection SSH entre un client et un serveur avec la méthode la plus sécurisé (faites un schéma)
------

// La connexion SSH (Secure Shell) est une méthode sécurisée pour accéder à un serveur à distance. La méthode la plus sécurisée pour établir une connexion SSH utilise l'authentification par clé publique/privée. Voici les étapes détaillées, accompagnées d'un schéma conceptuel.

Étapes de la connexion SSH sécurisée (clé publique/privée) :
Génération des clés :

Le client génère une paire de clés : une clé privée (qui reste sur le client) et une clé publique (qui sera copiée sur le serveur).
Déploiement de la clé publique :

Le client envoie sa clé publique au serveur, qui l'ajoute à son fichier ~/.ssh/authorized_keys. Ce fichier contient toutes les clés publiques autorisées à se connecter au serveur.
Demande de connexion :

Le client initie la connexion SSH en envoyant une demande au serveur.
Challenge cryptographique :

Le serveur génère un challenge aléatoire (un message crypté) à l'aide de la clé publique du client et l'envoie au client.
Déchiffrement du challenge :

Le client déchiffre le message avec sa clé privée. Comme la clé privée n'est jamais envoyée sur le réseau, elle reste secrète. Le client renvoie la réponse déchiffrée au serveur.
Validation par le serveur :

Le serveur vérifie si la réponse du client correspond au challenge initialement envoyé. Si la réponse est correcte, cela prouve que le client possède la clé privée correspondante à la clé publique autorisée.
Établissement de la session chiffrée :

Une fois l'authentification validée, une session sécurisée et chiffrée est établie. Toutes les communications entre le client et le serveur sont alors cryptées.

Schéma explicatif
--------

![img_15.png](img_15.png)

![img_16.png](img_16.png)

------------

ls = affiche la position dans les dossier

cd = pour se balader dasn les dossier

pwd = indique le dossier courant

cp = opérande de fichier manquant /Copier la SOURCE vers DEST ou plusieurs SOURCEs vers RÉPERTOIRE

mkdir = Créer le ou les RÉPERTOIREs s'ils n'existent pas.

touch = crée un dossier

mv = Renommer SOURCE en DEST, ou déplacer le ou les SOURCEs vers RÉPERTOIRE

cat = Concaténer les FICHIERs vers la sortie standard.

less = commande Unix permettant de visualiser un fichier texte page par page (sans le modifier

find = trouver un dossier

grep = Chercher des MOTIFS dans chaque FICHIER.

scp = copie les fichiers ou les répertoires entre un système local et un système distant ou entre deux systèmes distants.

rsync = logiciel libre de synchronisation à distance

vim = Vim est un éditeur de texte, c'est-à-dire un logiciel permettant la manipulation de fichiers texte

nano = éditeur de texte

-------------

---------------

PHP-FPM (FastCGI Process Manager) et NGINX sont essentiels pour la construction de sites web haute performance basés sur PHP. Voici comment ils fonctionnent ensemble et leurs rôles dans l’interaction entre votre code, le serveur et le client (utilisateur) :

NGINX : Agit comme un serveur web ou un serveur proxy inverse. Il gère les demandes HTTP entrantes et sert des fichiers statiques tels que HTML, CSS ou JavaScript. Il transmet également les requêtes de contenu dynamique (comme des scripts PHP) à PHP-FPM.

PHP-FPM : Il s’agit d’une implémentation FastCGI spécialement conçue pour PHP. Lorsque NGINX reçoit une demande pour un fichier PHP, il transmet la requête à PHP-FPM, qui traite le code PHP et renvoie le résultat (généralement HTML) à NGINX.
-
Flux d’interaction :

Un utilisateur fait une demande pour accéder à une page PHP (par exemple, la page d’accueil) de votre site web.
NGINX reçoit cette requête et détermine qu’elle implique un script PHP. Il transmet la requête à PHP-FPM via le protocole FastCGI.
PHP-FPM exécute le code PHP, souvent en interaction avec des bases de données ou d’autres services.
Après que PHP-FPM termine d’exécuter le code, il envoie le contenu résultant (comme du HTML rendu) à NGINX.
NGINX fournit ce contenu au navigateur de l’utilisateur.
Cette séparation des responsabilités entre NGINX (traitement des demandes et réponses) et PHP-FPM (traitement des scripts PHP) permet d’optimiser les performances, notamment pour les sites à fort trafic, et assure une meilleure sécurité grâce à l’isolement des processus.
PHP-FPM (FastCGI Process Manager) et NGINX sont essentiels pour la construction de sites web haute performance basés sur PHP. Voici comment ils fonctionnent ensemble et leurs rôles dans l’interaction entre votre code, le serveur et le client (utilisateur)
--------

NGINX : Agit comme un serveur web ou un serveur proxy inverse. Il gère les demandes HTTP entrantes et sert des fichiers statiques tels que HTML, CSS ou JavaScript. Il transmet également les requêtes de contenu dynamique (comme des scripts PHP) à PHP-FPM.

PHP-FPM : Il s’agit d’une implémentation FastCGI spécialement conçue pour PHP. Lorsque NGINX reçoit une demande pour un fichier PHP, il transmet la requête à PHP-FPM, qui traite le code PHP et renvoie le résultat (généralement HTML) à NGINX.

----------

![img_17.png](img_17.png)

![img_18.png](img_18.png)

---------------
Quelles sont les problématiques qui vont survenir par rapport à la gestion des différents code source (notamment par rapport à la diversité des technologies)?
----

// le server ne peut pas tout convertir (compatibilité)

efficace. Cependant, il ne gère pas directement l'exécution de certaines technologies côté serveur comme PHP, Python, Ruby, Node.js, etc. Pour chaque technologie, il faut configurer des modules ou des outils externes qui serviront d'intermédiaires :

PHP : Nginx utilise PHP-FPM (FastCGI Process Manager) pour traiter les scripts PHP.
Node.js : Vous devrez configurer un proxy inverse pour que Nginx transfère les requêtes à l'application Node.js, qui a son propre serveur.
Python : Vous pouvez utiliser uWSGI ou Gunicorn en conjonction avec Nginx.
Ruby on Rails : Utilisation de Puma ou Passenger avec Nginx.
Problème potentiel : Mal gérer ces interactions peut provoquer des erreurs de configuration ou des problèmes de performance, par exemple des latences dans les proxys ou une mauvaise gestion des sessions.

Pour configurer deux sites web sur la même machine en utilisant Nginx, vous pouvez attribuer des ports différents à chaque site. Voici un guide étape par étape pour configurer un site sur le port 80 et un autre sur le port 81.

Étape 1 : Installer Nginx (si ce n'est pas déjà fait)
Si Nginx n'est pas installé, vous pouvez l'installer avec la commande suivante (pour les systèmes basés sur Debian/Ubuntu) :

Conclusion
-
La gestion de différents codes sources et technologies sur un serveur Nginx nécessite une configuration soignée pour éviter les conflits, maintenir des performances optimales et assurer la sécurité. Les outils comme la conteneurisation (Docker), la gestion des proxys inverses, l'optimisation des ressources, et la centralisation des logs sont essentiels pour réussir dans ce type de configuration complexe.
-----

sudo apt update
-------
sudo apt install nginx
--------------
Étape 2 : Configurer le premier site sur le port 80
Créer un répertoire pour votre premier site web :

sudo mkdir -p /var/www/site1
-----------
sudo chown -R $USER:$USER /var/www/site1
------
Créer un fichier de configuration pour le site 1 : Ouvrez un nouveau fichier de configuration pour votre premier site :


sudo nano /etc/nginx/sites-available/site1
-------------
Ajoutez la configuration suivante pour que le site fonctionne sur le port 80 :


server {
listen 80;
server_name site1.com www.site1.com;

    root /var/www/site1;
    index index.html;

    location / {
        try_files $uri $uri/ =404;
    }

Activer le site 1 : Créez un lien symbolique pour activer le site :


sudo ln -s /etc/nginx/sites-available/site1 /etc/nginx/sites-enabled/
------------
Redémarrez Nginx pour appliquer les modifications :



sudo systemctl restart nginx
-------------
Étape 3 : Configurer le deuxième site sur le port 81
Créer un répertoire pour votre deuxième site web :

sudo mkdir -p /var/www/site2
------------
sudo chown -R $USER:$USER /var/www/site2
-------------
Créer un fichier de configuration pour le site 2 : Ouvrez un nouveau fichier de configuration pour le deuxième site :


sudo nano /etc/nginx/sites-available/site2
-------------------

Activer le site 2 : Créez un lien symbolique pour activer le site :


sudo ln -s /etc/nginx/sites-available/site2 /etc/nginx/sites-enabled/
----------
Redémarrez Nginx :


sudo systemctl restart nginx
--------------------
Étape 4 : Configuration des fichiers /etc/hosts (facultatif, pour les tests locaux)
Si vous testez localement et que vous voulez accéder à vos sites en utilisant des noms de domaine fictifs (comme site1.com et site2.com), vous pouvez modifier le fichier /etc/hosts pour mapper ces noms à localhost :


sudo nano /etc/hosts
-------------
Ajoutez ces lignes :

Copier le code

127.0.0.1 site1.com
-
127.0.0.1 site2.com
-----------------

-nano .ssh authorized/key
- ls -al = liste tous les dossier mêmes les cachées
- ufw = unbuntu firewall 
- sudo ufw allow 80
- sudo ufw allow 81

sudo nano /etc/nginx/sites-available/"site" = pour config le fichier
--

----------

config fichier de server !!
----------

enlever listen default ...
---