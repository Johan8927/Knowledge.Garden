``# Comment fonctionne HTTP :

* Toutes les transactions HTTP suivent le même format général. Chaque requête client et chaque réponse serveur comportent trois parties : la ligne de requête ou de réponse, une section d'en-tête et le corps de l'entité.
* Le client initie une transaction comme suit :
* Le client contacte le serveur et envoie une demande de document. Une demande GET peut avoir des paramètres d'URL et ces paramètres seront disponibles dans les journaux d'accès Web.
* OBTENIR /index.html?param=valeur HTTP/1.0
* Ensuite, le client envoie des informations d’en-tête facultatives pour informer le serveur de sa configuration et des formats de document qu’il acceptera.
* Agent utilisateur : Mozilla/4.06 Accepter : image/gif, image/jpeg, /
* Dans une requête POST, les données fournies par l'utilisateur suivront les en-têtes facultatifs et ne font pas partie du contenu de l'URL POST.

Il existe trois catégories principales de commandes SQL :

* Langage de manipulation de données (DML)
* Langage de définition de données (DDL)
* Langage de contrôle des données (DCL)

### Langage de manipulation de données (DML)

Comme son nom l'indique, le langage de manipulation de données traite de la manipulation des données. La plupart des instructions SQL les plus courantes, notamment SELECT, INSERT, UPDATE et DELETE, peuvent être classées comme des instructions DML. Les instructions DML peuvent être utilisées pour demander des enregistrements (SELECT), ajouter des enregistrements (INSERT), supprimer des enregistrements (DELETE) et modifier des enregistrements existants (UPDATE).

Si un attaquant réussit à « injecter » des instructions DML dans une base de données SQL, il peut violer la confidentialité (en utilisant des instructions SELECT), l’intégrité (en utilisant des instructions UPDATE) et la disponibilité (en utilisant des instructions DELETE ou UPDATE) d’un système.

* Les commandes DML sont utilisées pour stocker, récupérer, modifier et supprimer des données.
* SELECT - récupérer des données d'une base de données
* INSERT - insérer des données dans une base de données
* UPDATE - met à jour les données existantes dans une base de données
* DELETE - supprimer des enregistrements d'une base de données

---


| ID de l'utilisateur | prénom | nom de famille | département      | salaire  | auth_tan |  |
| ------------------- | ------- | -------------- | ----------------- | -------- | -------- | - |
| 32147               | Pauline | Travers        | Comptabilité     | 46 000 $ | P45JSI   |  |
| 89762               | Tobi    | Barnett        | Développement    | 77 000 $ | TA9LL1   |  |
| 96134               | Bob     | Franco         | Commercialisation | 83.700 $ | LO9S2V   |  |
| 34477               | Abraham | Holman         | Développement    | 50 000 $ | UU2ALK   |  |
| 37648               | John    | Forgeron       | Commercialisation | 64 350 $ | 3SL99A   |  |

UPDATE "employees"
SET "department" = 'Sales'
WHERE "first_name" = 'Bob' AND "last_name" = 'Barnett';


| **SELECT**   | Spécification des colonnes du résultat                                                                        |
| ------------ | --------------------------------------------------------------------------------------------------------------- |
| **FROM**     | Spécification des tables sur lesquelles porte l'ordre                                                          |
| **WHERE**    | Filtre portant sur les données (conditions à remplir pour que les lignes soient présentes dans le résultat) |
| **GROUP BY** | Définition d'un groupe (sous-ensemble)                                                                         |
| **HAVING**   | Filtre portant sur les résultats (conditions de regroupement des lignes)                                       |
| **ORDER BY** | Tri des données du résultat                                                                                   |

changer le service de Tobi Barnett department en « Sales » :

UPDATE employees SET department = 'Sales' WHERE first\_name = 'Tobi' AND last\_name = 'Barnett';

## Qu'est-ce que l'injection SQL ?

L'injection SQL (également appelée SQLi) est l'une des techniques de piratage Web les plus courantes. **Une attaque par injection SQL consiste à insérer ou « injecter » du code malveillant via l'entrée de requête SQL du client vers l'application.** Si elle n'est pas traitée correctement, l'injection SQL peut avoir de graves conséquences sur l'intégrité et la sécurité des données.

Les injections SQL peuvent se produire lorsque des données non filtrées provenant du client, telles que des données saisies dans un champ de recherche, pénètrent dans l'interpréteur SQL de l'application elle-même. Si une application ne parvient pas à nettoyer correctement les données saisies par l'utilisateur (à l'aide d'instructions préparées ou similaires) ou à filtrer les données saisies en fonction de caractères spéciaux, les pirates peuvent manipuler l'instruction SQL sous-jacente à leur avantage.
Par exemple, si les données saisies ne sont pas filtrées pour les métacaractères SQL tels que **--** (qui commente le reste de la ligne) ou **;** (qui termine une requête SQL), une injection SQL peut se produire.

## Conséquences de l'injection SQL

### Une attaque d'injection SQL réussie peut :

* Lire et modifier les données sensibles de la base de données
* Exécuter des opérations administratives sur la base de données
  * Audit d'arrêt ou SGBD
  * Tronquer les tables et les journaux
  * Ajouter des utilisateurs
* Récupérer le contenu d'un fichier donné présent sur le système de fichiers DBMS
* Envoyer des commandes au système d'exploitation

### Les attaques par injection SQL permettent aux attaquants de

* Usurper l'identité
* Altérer les données existantes
* Causer des problèmes de répudiation tels que l'annulation de transactions ou la modification de soldes
* Autoriser la divulgation complète de toutes les données du système
* Détruire les données ou les rendre indisponibles
* Devenir administrateur du serveur de base de données

---

Votre requête était : SELECT * FROM user_data WHERE first_name = 'John' and last_name = '' or '1' = '1'

Explication : Cette injection fonctionne, car or '1' = '1' est toujours évalué à true (le littéral de fin de chaîne pour '1 est fermé par la requête elle-même, vous ne devez donc pas l'injecter). Ainsi, la requête injectée ressemble essentiellement à ceci : SELECT * FROM user_data WHERE first_name = 'John' and last_name = '' or TRUE , qui sera toujours évalué à true, peu importe ce qui l'a précédé.

### 0 or 1 =1 ( paquet malicieu )

---

### Qu'est-ce que l'injection SQL de chaîne ?

Si une application crée des requêtes SQL simplement en concaténant des chaînes fournies par l'utilisateur à la requête, l'application est probablement très sensible à l'injection SQL de chaînes.
Plus précisément, si une chaîne fournie par l'utilisateur est simplement concaténée à une requête SQL sans aucune purification ni préparation, vous pourrez peut-être modifier le comportement de la requête en insérant simplement des guillemets dans un champ de saisie. Par exemple, vous pouvez terminer le paramètre de chaîne par des guillemets et saisir votre propre code SQL après cela.

---

### Qu'est-ce que le chaînage de requêtes SQL ?

Le chaînage de requêtes est exactement ce à quoi il ressemble. Avec le chaînage de requêtes, vous essayez d'ajouter une ou plusieurs requêtes à la fin de la requête réelle. Vous pouvez le faire en utilisant le métacaractère **;** . Un **;** marque la fin d'une instruction SQL ; il permet de démarrer une autre requête juste après la requête initiale sans même avoir besoin de démarrer une nouvelle ligne.

### ' OR 1=1; UPDATE employees SET salary = 190000 WHERE last_name = 'Smith'; --

met un paquet malicieu, modifie le salaire a 190000 du nom 'Smith', -- (met en commentaires le reste pour ne pas etre pris en compte)


---

## Compromettre la disponibilité

usersAprès avoir réussi à compromettre la confidentialité et l’intégrité dans les leçons précédentes, nous allons maintenant compromettre le troisième élément de la triade de la CIA : **la disponibilité** .

Il existe de nombreuses façons de compromettre la disponibilité. Si un compte est supprimé ou si son mot de passe est modifié, le propriétaire réel ne peut plus accéder à ce compte. Les attaquants peuvent également essayer de supprimer des parties de la base de données, voire de supprimer la base de données entière, afin de rendre les données inaccessibles. La révocation des droits d'accès des administrateurs ou d'autres utilisateurs est une autre façon de compromettre la disponibilité ; cela empêcherait ces utilisateurs d'accéder à des parties spécifiques de la base de données, voire à la base de données entière dans son ensemble.

' OR 1=1; DROP TABLE employees SET salary = 190000 WHERE last_name = 'Smith'; --

### POUR APPLIQUER UNE SECURITER POUR CONTRER LES INJECTIONS SQL : ORM / CONTROLE DES INPUT / REGEX

---

## Contournements d'authentification

Les contournements d'authentification se produisent de nombreuses façons, mais ils profitent généralement d'une faille dans la configuration ou la logique. Falsification pour obtenir les bonnes conditions.

---

JSON Web Token (JWT) est une norme ouverte (RFC 7519) qui définit un jeton Web compact
et un moyen autonome pour transmettre en toute sécurité
informations entre les parties sous forme d'objet JSON. Ces informations peuvent être
vérifié et approuvé car il est signé numériquement. Les JWT peuvent être signés à l'aide
une clé secrète (avec l'algorithme HMAC) ou une paire de clés publique/privée utilisant RSA.

Le jeton Web JSON est utilisé pour transporter des informations relatives à l'identité et
caractéristiques (revendications) d'un client. Ce « conteneur » est signé par le serveur
afin d'éviter qu'un client ne le falsifie afin de le modifier, par exemple,
l'identité ou toute caractéristique (exemple : changer le rôle de simple
utilisateur à administrateur ou modifier la connexion client). Ce jeton est créé pendant
authentification (est fournie en cas d'authentification réussie) et est
vérifié par le serveur avant tout traitement. Il est utilisé par une application
permettre à un client de présenter un jeton représentant sa « carte d'identité » (contenant
avec toutes les informations utilisateur le concernant) au serveur et permettre au serveur de vérifier
la validité et l'intégrité du jeton de manière sécurisée, tout cela dans un état sans état
et une approche portable (portable dans le sens où les technologies client et serveur peuvent
être différent, y compris également le canal de transport même si HTTP est le plus souvent utilisé)

## Structure d'un jeton JWT

Jetons un œil à la structure d’un jeton JWT :

![JWT](http://127.0.0.1:8080/WebGoat/images/jwt_token.png)

Le jeton est codé en base64 et se compose de trois parties :

* en-tête
* réclamations
* signature

L'en-tête et les revendications sont représentés par un objet JSON. L'en-tête décrit les opérations cryptographiques appliquées au JWT et éventuellement, des propriétés supplémentaires du JWT. Les revendications représentent un objet JSON dont les membres sont les revendications transmises par le JWT.

## JWT affirme que son utilisation est abusive

L'utilisation abusive des revendications JWT fait référence à la manipulation inappropriée ou non autorisée des revendications dans un jeton Web JSON (JWT). Un JWT est un moyen compact et autonome de représenter des informations entre deux parties. Il se compose de l'en-tête, de la charge utile (revendications) et de la signature.

L'utilisation abusive des réclamations JWT peut se produire de différentes manières :

* **Revendications non autorisées** : un utilisateur malveillant peut tenter d’ajouter des revendications non autorisées à un JWT pour accéder à certaines fonctionnalités ou ressources auxquelles il n’a pas droit. Par exemple, un utilisateur normal tente de modifier son JWT pour revendiquer des privilèges d’administrateur.
* **Falsification des revendications** : un attaquant peut tenter de modifier les valeurs des revendications existantes dans le JWT pour manipuler sa propre identité ou modifier ses autorisations. Par exemple, il modifie la revendication « user_id » pour se faire passer pour un autre utilisateur.
* **Revendications excessives** : un attaquant pourrait essayer d'inclure de nombreuses revendications inutiles ou fausses dans un JWT pour augmenter la taille du jeton et éventuellement perturber les performances du système ou provoquer d'autres problèmes.
* **Revendications d'expiration expirées ou modifiées** : si un attaquant peut modifier la revendication « exp » pour prolonger le délai d'expiration du jeton, il peut effectivement obtenir un accès au-delà de sa session prévue.
* **Attaques par relecture** : un attaquant peut tenter de réutiliser un JWT valide d'une ancienne session pour se faire passer pour l'utilisateur d'origine ou exploiter une fonctionnalité limitée dans le temps.
* **Manipulation de la revendication de clé** : dans certains cas, la revendication « kid » (ID de clé) peut être utilisée à mauvais escient, comme expliqué dans la réponse précédente. Un attaquant peut essayer de manipuler la revendication « kid » pour utiliser une clé différente pour la vérification de la signature.

Pour éviter toute utilisation abusive des revendications JWT, il est essentiel de mettre en œuvre des mécanismes de validation et de vérification appropriés côté client et côté serveur. Validez les revendications pour vous assurer qu'elles sont valides, autorisées et pertinentes par rapport au contexte de l'utilisateur. De plus, vérifiez toujours la signature du JWT pour garantir l'intégrité du jeton et le protéger contre toute falsification. Le respect des meilleures pratiques pour la mise en œuvre de JWT, la gestion sécurisée des clés et la rotation régulière des clés contribueront également à atténuer le risque d'utilisation abusive des revendications JWT.

## Authentification et obtention d'un jeton JWT

Une séquence de base pour obtenir un jeton est la suivante :

![diagramme jwt](http://127.0.0.1:8080/WebGoat/images/jwt_diagram.png)

Dans ce flux, vous pouvez voir que l'utilisateur se connecte avec un nom d'utilisateur et un mot de passe après une authentification réussie renvoyée par le serveur. Le serveur crée un nouveau jeton et le renvoie au client. Lorsque le client effectue un appel successif vers le serveur, il joint le nouveau jeton dans l'en-tête « Authorization ». Le serveur lit le jeton et valide d'abord la signature après une vérification réussie, le serveur utilise les informations du jeton pour identifier l'utilisateur.

### Réclamations

Le jeton contient des informations permettant d'identifier l'utilisateur et toutes les autres informations nécessaires au serveur pour répondre à la demande. Veillez à ne pas stocker d'informations sensibles dans le jeton et à toujours l'envoyer via un canal sécurisé.

![](https://www.clever-age.com/wp-content/uploads/sites/2/2023/10/csrf.png.webp)

---

![entrez la description de l'image ici](https://i.sstatic.net/bOHqZ.png)

## Codage Base64

L'encodage n'est pas vraiment de la cryptographie, mais il est largement utilisé dans toutes sortes de normes relatives aux fonctions cryptographiques. En particulier l'encodage Base64.

Le codage Base64 est une technique utilisée pour transformer tous les types d'octets en une plage spécifique d'octets. Cette plage spécifique correspond aux octets lisibles en ASCII. De cette façon, vous pouvez transférer plus facilement des données binaires telles que des clés secrètes ou privées. Vous pouvez même les imprimer ou les écrire. Le codage est également réversible. Ainsi, si vous disposez de la version codée, vous pouvez créer la version originale.

Sur Wikipédia, vous pouvez trouver plus de détails. En gros, il parcourt tous les octets et transforme chaque ensemble de 6 bits en un octet lisible (8 bits). Le résultat est que la taille des octets codés est augmentée d'environ 33 %.

<pre><font><font>Bonjour ==> SGVsbG8=</font></font><font></font><font><font>
0x4d 0x61 ==> TWE=</font></font></pre>

### Authentification de base

L'authentification de base est parfois utilisée par les applications Web. Elle utilise le codage base64. Il est donc important d'utiliser au moins le protocole TLS (Transport Layer Security ou plus communément appelé https) pour protéger les autres de la lecture du mot de passe du nom d'utilisateur envoyé au serveur.

<pre><font><font>$echo -n "monutilisateur:monmot de passe" | base64</font></font><font></font><font><font>
bXl1c2VyOm15cGFzc3dvcmQ=</font></font></pre>

L'en-tête HTTP ressemblera à :

<pre><font><font>Autorisation : Basic bXl1c2VyOm15cGFzc3dvcmQ=</font></font></pre>

---

mettre la signature à "none" pur ne pas avoir de signature dans la réponse

---

### Codage d'URL

Le codage d'URL est très utilisé lors de l'envoi de données de formulaire et de paramètres de requête au serveur. Les espaces n'étant pas autorisés dans une URL, ils sont alors remplacés par %20. Des remplacements similaires sont effectués pour d'autres caractères.

### Codage HTML

Le codage HTML garantit que le texte est affiché tel quel dans le navigateur et n'est pas interprété par le navigateur comme du HTML.

### UUEncode

Le codage Unix-2-Unix a été utilisé pour envoyer des pièces jointes aux courriers électroniques.

### Codage XOR

Le codage est parfois utilisé comme première technique d'obscurcissement simple pour stocker les mots de passe. IBM WebSphere Application Server, par exemple, utilise une implémentation spécifique du codage XOR pour stocker les mots de passe dans les fichiers de configuration. IBM recommande de protéger l'accès à ces fichiers et de remplacer le codage XOR par défaut par votre propre chiffrement personnalisé. Cependant, lorsque ces recommandations ne sont pas suivies, ces valeurs par défaut peuvent devenir une vulnérabilité.

---

## Hachage simple

Le hachage est un type de cryptographie qui est principalement utilisé pour détecter si les données d'origine ont été modifiées. Un hachage est généré à partir des données d'origine. Il est basé sur des techniques cryptographiques irréversibles. Si les données d'origine sont modifiées ne serait-ce que d'un octet, le hachage résultant est également différent.

D'une certaine manière, cela ressemble à une technique sûre. Cependant, ce n'est PAS et ne sera JAMAIS une bonne solution pour les mots de passe. Le problème ici est que vous pouvez générer des mots de passe à partir de dictionnaires et calculer toutes sortes de variantes à partir de ces mots de passe. Pour chaque mot de passe, vous pouvez calculer un hachage. Tout cela peut être stocké dans de grandes bases de données. Ainsi, chaque fois que vous trouvez un hachage qui pourrait être un mot de passe, il vous suffit de rechercher le hachage dans la base de données et de trouver le mot de passe.

Certains algorithmes de hachage ne doivent plus être utilisés : MD5, SHA-1. Pour ces hachages, il est possible de modifier la charge utile de manière à ce qu'elle aboutisse toujours au même hachage. Cela nécessite beaucoup de puissance de calcul, mais reste une option envisageable.

## Hachis salés

Les mots de passe simples ne doivent évidemment pas être stockés dans une base de données. Il en va de même pour les hachages simples. La [fiche de stockage des mots de passe de l'OWASP](https://cheatsheetseries.owasp.org/cheatsheets/Password_Storage_Cheat_Sheet.html) explique ce qu'il faut utiliser lorsque les informations relatives aux mots de passe doivent être stockées de manière sécurisée.

---

## Cryptage symétrique

Le chiffrement symétrique repose sur un secret partagé qui est utilisé à la fois pour le chiffrement et le déchiffrement. Par conséquent, les deux parties (impliquées dans l'échange de secrets) partagent la même clé.

Voici quelques exemples de protocoles :

* AES
* 3DES

## Cryptage asymétrique

Le chiffrement asymétrique est basé sur des principes mathématiques qui consistent en une paire de clés. Les deux clés sont généralement appelées clé privée et clé publique. La clé privée doit être très bien protégée et n'est connue que d'une seule partie. Toutes les autres personnes peuvent utiliser librement la clé publique. Un élément chiffré avec la clé privée peut être déchiffré par tous ceux qui possèdent la clé publique, et un élément chiffré avec la clé publique ne peut être déchiffré qu'avec la clé privée.

Voici quelques exemples de protocoles :

* RSA
* DSA

## HTTPS utilise à la fois des clés symétriques et asymétriques

Voici une brève description de ce qui se passe si vous ouvrez votre navigateur et accédez à un site https.

* Votre navigateur se connecte au serveur et obtient le certificat du serveur Web
* Votre navigateur vérifie s'il fait confiance à l'émetteur du certificat en vérifiant si le certificat de l'émetteur se trouve dans son magasin de confiance. Ce magasin de confiance est géré par les mises à jour du système d'exploitation et du navigateur. Et sur certains réseaux d'entreprise, il est géré par l'entreprise. À partir du certificat, le navigateur obtient la clé publique.
* Le navigateur génère alors des octets aléatoires qui serviront à générer une clé symétrique et chiffre celle-ci avec la clé publique du serveur. Ainsi, seul le serveur peut la déchiffrer.
* À la fin de ce processus, le navigateur et le serveur Web utiliseront la clé symétrique échangée (dans le processus d'échange de clé asymétrique) pour crypter et décrypter les messages envoyés dans les deux sens entre le navigateur et le serveur Web.

Les clés symétriques sont utilisées car elles peuvent être utilisées plus facilement avec de grands ensembles de données et nécessitent moins de puissance de traitement. Cependant, les informations sur ces pages ne sont destinées qu'à une compréhension de base de la cryptographie. Recherchez sur Internet des informations plus détaillées sur ces sujets.

---

Une signature est un hachage qui peut être utilisé pour vérifier la validité de certaines données. La signature peut être fournie séparément des données qu'elle valide ou, dans le cas de CMS ou de SOAP, elle peut être incluse dans le même fichier. (Lorsque certaines parties de ce fichier contiennent les données et d'autres contiennent la signature).

La signature est utilisée lorsque l'intégrité est importante. Elle est censée garantir que les données envoyées de la partie A à la partie B n'ont pas été altérées. La partie A signe donc les données en calculant le hachage des données et en cryptant ce hachage à l'aide d'une clé privée asymétrique. La partie B peut ensuite vérifier les données en calculant le hachage des données et en décryptant la signature pour comparer si les deux hachages sont identiques.

## Signatures RAW

Une signature brute est généralement calculée par la partie A comme suit :

* créer un hachage des données (par exemple un hachage SHA-256)
* crypter le hachage à l'aide d'une clé privée asymétrique (par exemple une clé RSA 2048 bits)
* (en option) encoder le hachage binaire crypté à l'aide du codage base64

La partie B devra également obtenir le certificat avec la clé publique. Il est possible que cet échange ait déjà eu lieu. Au moins 3 fichiers sont donc concernés : les données, la signature et le certificat.

## Signatures CMS

Une signature CMS est une méthode standardisée permettant d'envoyer des données + une signature + un certificat avec la clé publique, le tout dans un seul fichier, de la partie A à la partie B. Tant que le certificat est valide et non révoqué, la partie B peut utiliser la clé publique fournie pour vérifier la signature.

## Signatures SOAP

Une signature SOAP contient également des données, la signature et éventuellement le certificat. Le tout dans une seule charge utile XML. Des étapes spéciales sont nécessaires au calcul du hachage des données. Cela est dû au fait que le XML SOAP envoyé d'un système à un autre peut introduire des éléments supplémentaires ou des horodatages. De plus, la signature SOAP offre la possibilité de signer différentes parties du message par différentes parties.

## Signatures de courrier électronique

Envoyer des e-mails n'est pas très difficile. Vous devez remplir certaines données et les envoyer à un serveur qui les transmettra, et elles finiront par arriver à destination. Cependant, il est possible d'envoyer des e-mails avec un champ DE qui n'est pas votre propre adresse e-mail. Afin de garantir à votre destinataire que vous avez réellement envoyé cet e-mail, vous pouvez signer votre e-mail. Un tiers de confiance vérifiera votre identité et émettra un certificat de signature d'e-mail. Vous installez la clé privée dans votre application de messagerie et la configurez pour signer les e-mails que vous envoyez. Le certificat est émis sur une adresse e-mail spécifique et tous les autres destinataires de cet e-mail verront une indication que l'expéditeur est vérifié, car leurs outils vérifieront la signature à l'aide du certificat public émis par le tiers de confiance.

## PDF ou Word ou autres signatures

Les documents Adobe PDF et Microsoft Word sont également des exemples de documents qui prennent en charge la signature. La signature se trouve également à l'intérieur du même document que les données, ce qui permet de décrire ce qui fait partie des données et ce qui fait partie des métadonnées. Les gouvernements envoient généralement des documents officiels avec un PDF contenant un certificat.

---

## Les outils du marché

1. **Analyse statique du code (SAST)**
   Ces outils scannent le code source pour identifier les vulnérabilités avant même l’exécution de l’application.
   * SonarQube : Détecte les failles courantes comme les injections SQL ou les mauvaises pratiques de gestion des entrées.
   * Checkmarx : Spécialisé dans l’analyse statique pour divers langages et frameworks.
   * Fortify Static Code Analyzer : Connu pour sa précision dans les environnements complexes.
   * Avantages :
     * Analyse précoce pendant le développement.
     * Intégration facile dans les pipelines CI/CD.
   * Ressources :
     * [Introduction à SonarQube](https://www.sonarqube.org/)
     * [OWASP Guide : Static Analysis Tools](https://owasp.org/www-community/controls/Static_Code_Analysis)
2. **Analyse dynamique du code (DAST)**
   Ces outils testent les applications en cours d’exécution pour détecter les vulnérabilités exploitables.
   * OWASP ZAP (Zed Attack Proxy) : Permet de simuler des attaques sur une application web.
   * Burp Suite : Puissant scanner de sécurité, adapté pour tester les vulnérabilités complexes.
   * Avantages :
     * Identifie des failles qui ne sont visibles qu’en runtime.
     * Utile pour tester les environnements de production.
   * Ressources :
     * [Site officiel OWASP ZAP](https://www.zaproxy.org/)
     * [Documentation Burp Suite](https://portswigger.net/burp/documentation)
3. **Analyse des dépendances**
   Ces outils identifient les vulnérabilités dans les bibliothèques tierces et les composants utilisés.
   * OWASP Dependency-Check : Analyse les dépendances pour détecter celles qui sont vulnérables.
   * Snyk : Fournit des correctifs pour les dépendances vulnérables.
   * WhiteSource : Scanne les licences et les vulnérabilités de composants.
   * Avantages :
     * Suivi des versions des bibliothèques.
     * Alertes sur les vulnérabilités connues (CVE).
   * Ressources :
     * [OWASP Dependency-Check]((OWASP Dependency-Check Tool))
     * [Guide sur Snyk](https://snyk.io/)
4. **Tests d’intrusion automatisés**
   Ces outils simulent des attaques réelles pour évaluer la robustesse d’une application.
   * Metasploit : Utilisé pour simuler des attaques ciblées sur des failles connues.
   * Cobalt Strike : Populaire pour les évaluations offensives de sécurité.
   * Ressources :
     * [Introduction à Metasploit](https://www.metasploit.com/)
     * [OWASP Testing Guide : Penetration Testing](https://owasp.org/www-project-web-security-testing-guide/latest/3-The_OWASP_Testing_Framework/1-Penetration_Testing_Methodologies#pci-penetration-testing-guide)
5. **Outils de conformité et de gestion des secrets**
   Ces outils assurent que les pratiques de sécurité standard sont suivies et que les secrets (clés API, mots de passe) sont gérés correctement.
   * GitHub Secret Scanning : Détecte les secrets exposés dans les dépôts.
   * HashiCorp Vault : Gère et protège les secrets de manière centralisée.
   * TruffleHog : Recherche les informations sensibles dans les dépôts Git.
   * Ressources :
     * [HashiCorp Vault Guide](https://www.vaultproject.io/)
     * [GitHub Secret Scanning](https://docs.github.com/en/code-security)


---



## Qu'est-ce que la sérialisation

La sérialisation est  le processus de transformation d'un objet en un format de données qui  pourra être restauré plus tard. Les gens sériment souvent des objets  afin de les sauvegarder au stockage, ou d'envoyer dans le cadre de  communications. La désérialisation est l'inverse de ce processus prenant  des données structurées à partir d'un certain format, et leur  reconstruction en un objet. Aujourd'hui, le format de données le plus  populaire pour la sérialisation des données est JSON. Avant cela,  c'était XML.

```
a:4:i:0;i:132;i:1;s:7:7:i:2;s:4:4:"utilisateur"; i:3;s:32:"b6a8b3bea87fe0e05022f3c88bc960";
```

### Séquence native

De nombreux langages de programmation offrent  une capacité native à sérialisation d'objets. Ces formats natifs offrent  généralement plus de fonctionnalités que JSON ou XML, y compris la  personnalisation du processus de sérialisation. Malheureusement, les  caractéristiques de ces mécanismes de désérialisation natif peuvent être  réaménagées pour un effet malveillant lorsqu'ils fonctionnent sur des  données non fiables. Des attaques contre les désertimètres ont été  trouvées pour permettre des attaques par déni de service, de contrôle  d'accès et d'exécution de code à distance.

### Langues de programmation touchées connues

* PHP
* Python
* Ruby
* Java
* C
* C
