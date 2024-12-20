PHP :
-------

PHP (Hypertext Preprocessor) est un langage de script open source largement utilisé pour le développement web côté serveur. Il est particulièrement adapté pour le développement web et peut être intégré directement dans le code HTML.

Back End :
----------------

Le back end fait référence à la partie du développement web qui se concentre sur ce qui se passe sur le serveur. Cela inclut la gestion de la base de données, la logique de l'application, et la gestion des requêtes et des réponses HTTP. Les technologies couramment utilisées pour le développement back end incluent PHP, Python, Ruby, Java, et .NET.

Front End :
---------------

Le front end concerne tout ce qui est affiché dans le navigateur de l'utilisateur. C'est la partie visible et interactive d'un site web ou d'une application web. Les technologies front end incluent HTML, CSS, et JavaScript, ainsi que des frameworks comme React, Angular, et Vue.js.

Navigateur :
-------------

Un navigateur est un logiciel permettant d'afficher les pages web sur Internet. Les exemples de navigateurs incluent Google Chrome, Mozilla Firefox, Safari, et Microsoft Edge. Le navigateur interprète le code HTML, CSS et JavaScript pour afficher les pages web de manière compréhensible pour l'utilisateur.

Langage Client :
---------------

Un langage client (ou langage côté client) est exécuté sur le navigateur de l'utilisateur. Il est principalement utilisé pour la création de l'interface utilisateur et pour rendre les pages web interactives. JavaScript est le principal langage client utilisé dans le développement web.

Langage Serveur :
---------------------

Un langage serveur (ou langage côté serveur) est exécuté sur le serveur web. Il est utilisé pour gérer la logique de l'application, interagir avec la base de données, et générer du contenu dynamique qui est envoyé au client. PHP, Python, Ruby, Java et .NET sont des exemples de langages serveurs.

Protocole HTTP :
---------------------

Le protocole HTTP (HyperText Transfer Protocol) est le protocole utilisé pour transférer des données sur le web. Il définit la structure des messages et les méthodes que les navigateurs et les serveurs web utilisent pour échanger des informations. Les méthodes HTTP courantes incluent GET, POST, PUT, et DELETE.

Serveur WEB :
--------------

Un serveur web est un logiciel qui gère les requêtes HTTP envoyées par les navigateurs, traite ces requêtes et renvoie les réponses appropriées (comme des pages HTML, des fichiers, ou des données). Apache, Nginx, et Microsoft IIS sont des exemples populaires de serveurs web.

Apache :
-------

Apache HTTP Server est un serveur web open source et gratuit, développé et maintenu par la Apache Software Foundation. Il est l'un des serveurs web les plus utilisés dans le monde et supporte une variété de modules et de configurations pour répondre aux besoins des développeurs.

-----------



URL DU SITE = https://github.com/Johan8927/JOHAN.PHP.git
---------------------

----------


// Afficher les informations PHP :
phpinfo();
-------

intval — Retourne la valeur numérique entière équivalente d'une variable
----------------------

https://www.univ-orleans.fr/iut-orleans/informatique/intra/tuto/php/FastPHP.pdf

FILTER_SANITIZE = méthode de trie pour filtrer et ajouter une protection
filter_has_var = trie les wariables
VALIDATE_EMAIL = if(filter_var($email, FILTER_VALIDATE_EMAIL)=== false){
    echo = "adresse e-mail invalide";
} else {
VÉRIFIE LE @
---------------

enctype= multipart/form-data = Aprés méthode "POST" pour prendre en compte le format fichier envoyé.
-------------

isset() renverra false lors de la vérification d'une variable de valeur null 
--------

https://www.youtube.com/watch?v=fIOidjf1y5I
-------------

var_dump() 
------------
affiche les informations structurées d'une variable, y compris son type et sa valeur. Les tableaux et les objets sont explorés récursivement, avec des indentations, pour mettre en valeur leur structure.
----------------
//ajout valeurs à la fin d'un tableau= array_push($tableau);
//ajout au début du tableau= array_unshift($tableau);

-----------------------------

//supprimer des valeurs a la fin du tableau= array_pop($tableau);
//supprimer au début du tableau=array_shift($tableau);
// recup la valeur de fin du tableau = echo($tableau);
--------------------------

Méthode de reecho
-----------

Les méthodes magiques sont des méthodes spéciales qui écrasent l'action par défaut de PHP quand certaines actions sont réalisées sur un objet

-------------------

constantes Toujours en majuscule
----------------------

Une constante est un identifiant (un nom) qui représente une valeur simple. Comme son nom le suggère, cette valeur ne peut jamais être modifiée durant l'exécution du script (sauf les constantes magiques). Les constantes sont sensibles à la casse. Par convention, les constantes sont toujours en majuscule.

--------------------------

Boucle foreach=
-----------------

La structure de langage foreach fournit une façon simple de parcourir des tableaux. foreach ne fonctionne que pour les tableaux et les objets, et émettra une erreur si vous tentez de l'utiliser sur une variable de type différent ou une variable non initialisée. Il existe deux syntaxes :
 

$arr = array(1, 2, 3, 4);
foreach ($arr as &$value) {
    $value = $value * 2;
}
// $arr vaut maintenant array(2, 4, 6, 8)
unset($value); // Détruit la référence sur le dernier élément

----------------

Do while=
-----
do-while Les boucles sont très similaires aux whileboucles, sauf que l'expression de vérité est vérifiée à la fin de chaque itération au lieu du début. La principale différence avec whileles boucles classiques est que la première itération d'une do-whileboucle est garantie de s'exécuter (l'expression de vérité n'est vérifiée qu'à la fin de l'itération), alors qu'elle ne s'exécute pas nécessairement avec une whileboucle classique (l'expression de vérité est vérifiée au début de chaque itération, si elle est évaluée correctement falsedès le début, l'exécution de la boucle se terminerait immédiatement).


---------------

Cookies ¶
----------
PHP supporte les cookies HTTP de manière transparente. Les cookies sont un mécanisme d'enregistrement d'informations sur le client, et de lecture de ces informations. Ce système permet d'identifier et de suivre les visiteurs. Vous pouvez envoyer un cookie avec la fonction setcookie() ou setrawcookie(). Les cookies font partie des en-têtes HTTP, ce qui impose que setcookie() soit appelée avant tout affichage de texte. Ce sont les mêmes limitations que pour header(). Vous pouvez utiliser les fonctions de bufferisation de sortie pour retarder l'affichage de votre script tant que vous n'avez pas décidé d'envoyer un cookie ou des en-têtes.

-------------------------

" . " = affectation
---------

php artisan make:migration create_"nomdelaTable"
------------

modéle deja créer pour le recup commande

------

SSH
---
ssh-keygen

~ ❯ ssh-keygen                                                                                                                                                                 09:10:36
Generating public/private ed25519 key pair.
Enter file in which to save the key (/home/rodolphe-delory/.ssh/id_ed25519): 
Enter passphrase (empty for no passphrase): 
Enter same passphrase again: 
Your identification has been saved in /home/rodolphe-delory/.ssh/id_ed25519
Your public key has been saved in /home/rodolphe-delory/.ssh/id_ed25519.pub
The key fingerprint is:
SHA256:g1w8/HAWTzjThe-delory@rodolphe-delory-HP-CNA-102


The key's randomart image is:

        +--[ED25519 256]--+
        |         ..o..   |
        |    . .o  +o .  |
        |   . . .+o..
        |     .ooS=.+     |
        |        +.+ =    |
        |         B = .   |
        |       .o..     |
        |       +**Eoo    |
        +----[SHA256]-----+


cat /home/rodolphe-delory/.ssh/id_ed25519.pub                                                                                                                              09:12:17
authorized_keys  id_ed25519       =>id_ed25519.pub 




---------------------

usage : git remote [-v | --verbose]
   ou : git remote add [-t <branche>] [-m <master>] [-f] [--tags | --no-tags] [--mirror=<fetch|push>] <nom> <url>
   ou : git remote rename [--[no-]progress] <ancien> <nouveau>
   ou : git remote remove <nom>
   ou : git remote set-head <nom> (-a | --auto | -d | --delete | <branche>)
   ou : git remote [-v | --verbose] show [-n] <nom>
   ou : git remote prune [-n | --dry-run] <nom>
   ou : git remote [-v | --verbose] update [-p | --prune] [(<groupe> | <distante>)...]
   ou : git remote set-branches [--add] <nom> <branche>...
   ou : git remote get-url [--push] [--all] <nom>
   ou : git remote set-url [--push] <nom> <nouvelle-URL> [<ancienne-URL>]
   ou : git remote set-url --add <nom> <nouvelle-URL>
   ou : git remote set-url --delete <nom> <url>
depuis github cloner le projet avec le lien SSH puis entrez la commande suivante sur le main du projet:
main* ❯ git remote set-url origin git@github.com:rmMoumenCampusNum/REZ_GAMES.git

--------

git reset --hard HEAD^  =  Annuler une fusion déjà complétée
-----


Les 10 meileurs I.A =
--------

-chatgpt
-google bard
-midjourney
-claude.a.i
-Dall-e
-firefly

-----------

	
ChatGPT
Générateur de Texte
0€ / mois

 Être rappelé
	
Google Bard
Générateur de Texte
0€ / mois

 Être rappelé
	
Midjourney
Design
8€ / mois

 Être rappelé
	
Claude.ai
Générateur de Texte
0€ / mois

 Être rappelé
	
Dall-e
Design
0€ / mois

 Être rappelé
	
Firefly
Design
0€ / mois

 Être rappelé
	
LLMA 2
Générateur de Texte
0€ / mois

 Être rappelé
Notion AI
0€ / mois
	
LLMA 2
0€ / mois
BM Watson, Google Cloud AI Platform, Microsoft Azure AI et Amazon Web Services.

I.A pour developpeur
--------------
GitHub Copilot
Tabnine
DeepCode
Kite
Replit Ghostwriter 
IntelliCode 