<h2>Commandes Git :</h2>

Commandes GIT de base
<h2>Git config</h2>
L’une des commandes git les plus utilisées est git config. On l’utilise pour configurer les préférences de l’utilisateur : son adresse email, l’algorithme utilisé pour diff, le nom d’utilisateur et le format de fichier etc. Par exemple, la commande suivante peut être utilisée pour définir le mail d’un utilisateur:
<h2>git config --global user.email sam@google.com</h2>
<h2>Git init</h2>
Cette commande est utilisée pour créer un nouveau dépôt GIT :
<h2>git init</h2>
<h2>Git add</h2>
La commande git add peut être utilisée pour ajouter des fichiers à l’index. Par exemple, la commande suivante ajoutera un fichier nommé temp.txt dans le répertoire local de l’index:
git add temp.txt
<h2>Git clone</h2>
La commande git clone est utilisée pour la vérification des dépôts. Si le dépôt se trouve sur un serveur distant, utilisez:
git clone alex@93.188.160.58:/chemin/vers/dépôt
Inversement, si une copie de travail d’un dépôt local doit être créée, utilisez:
<h2>git clone /chemin/vers/dépôt</h2>
<h2>Git commit</h2>
La commande git commit permet de valider les modifications apportées au HEAD. Notez que tout commit ne se fera pas dans le dépôt distant.
git commit –m “Description du commit”
<h2>Git status</h2>
La commande git status affiche la liste des fichiers modifiés ainsi que les fichiers qui doivent encore être ajoutés ou validés. Usage:
<h2>git status</h2>
<h2>Git push</h2>
Git push est une autre commandes GIT de base. Un simple push envoie les modifications locales apportées à la branche principale associée :
git push origin master
<h2>Git checkout</h2>
La commande git checkout peut être utilisée pour créer des branches ou pour basculer entre elles. Par exemple nous allons créer une branche:
command git checkout -b <nom-branche>
Pour passer simplement d’une branche à une autre, utilisez:
<h2>git checkout <nom-branche></h2>
<h2>Git remote</h2>
Cette commande remote permet à un utilisateur de se connecter à un dépôt distant. La commande suivante répertorie les dépôts distants actuellement configurés:
<h2>git remote –v</h2>
Cette commande permet à l’utilisateur de connecter le dépôt local à un serveur distant:
git remote add origin <93.188.160.58>
Branche git
La commande git branch peut être utilisée pour gérer les branches Git. Pour lister toutes les branches présentes dans le dépôt, utilisez:
git branch
Pour supprimer une branche:
git branch –d <nom-branche>
<h2>Git pull</h2>
Pour fusionner toutes les modifications présentes sur le dépôt distant dans le répertoire de travail local, la commande pull est utilisée. Usage:
<h2>git pull</h2>
obtenir tous les changements sur github
<h2>Git merge</h2>
La commande git merge est utilisée pour fusionner une branche dans la branche active. Usage:
git merge <nom-branche>
<h2>Git diff</h2>
La commande git diff permet de lister les conflits. Pour visualiser les conflits d’un fichier, utilisez
<h2>git diff --base <nom-fichier></h2>
La commande suivante est utilisée pour afficher les conflits entre les branches à fusionner avant de les fusionner:
<h2>git diff <branche-source> <branche-cible></h2>
Pour simplement énumérer tous les conflits actuels, utilisez:
<h2>git diff</h2>
<h2>Git tag</h2>
Le marquage est utilisé pour marquer des commits spécifiques avec des poignées simples. Un exemple peut être:
<h2>git tag 1.1.0 <insert-commitID-here></h2>
<h2>Git log</h2>
L’ exécution de cette commande génère le log d’une branche. Un exemple de sortie :
commit 15f4b6c44b3c8344caasdac9e4be13246e21sadw 
Author: Alex Hunter <alexh@gmail.com> 
Date: Mon Oct 1 12:56:29 2016 -0600
<h2>Git reset</h2>
Pour réinitialiser l’index et le répertoire de travail à l’état du dernier commit, la commande git reset est utilisée :
<h2>git reset --hard HEAD</h2>
<h2>Git rm</h2>
Git rm peut être utilisé pour supprimer des fichiers de l’index et du répertoire de travail. Usage:
<h2>git rm nomfichier.txt</h2>
<h2>Git stash</h2>
L’une des moins connues, git stash aide à enregistrer les changements qui ne doivent pas être commit immédiatement. C’est un commit temporaire. Usage:
<h2>git stash</h2>
<h2>Git show</h2>
Pour afficher des informations sur tout fichier git, utilisez la commande git show . Par exemple:
<h2>git show</h2>
<h2>Git fetch</h2>
<h2>Git fetch </h2>permet à un utilisateur d’extraire tous les fichiers du dépôt distant qui ne sont pas actuellement dans le répertoire de travail local. Exemple d’utilisation:
<h2>git fetch origin</h2>
<h2>Git ls-tree</h2>
Pour afficher un fichier arborescent avec le nom et le mode de chaque élément, et la valeur SHA-1 du blob, utilisez la commande git ls-tree . Par exemple:
<h2>git ls-tree HEAD</h2>
<h2>Git cat-file</h2>
À l’aide de la valeur SHA-1, affichez le type d’un fichier à l’aide de la commande git cat-file . Par exemple:
<h2>git cat-file –p </h2>
<h2>Git grep</h2>
<h2>Git grep</h2> permet à un utilisateur de rechercher dans les arbres de contenu des expressions et / ou des mots. Par exemple, pour rechercher www.hostinger.com dans tous les fichiers, utilisez:
<h2>git grep "www.hostinger.com"</h2>
<h2>Gitk</h2>
Gitk est l’interface graphique du dépôt local. Vous pouvez l’appeler en exécutant:
gitk
<h2>Git instaweb</h2>
Avec la commande git instaweb , un serveur Web peut être exécuté par interface avec le dépôt local. Qui redirige directement vers un serveur web. Par exemple:
<h2>git instaweb –httpd=webrick</h2>
<h2>Git gc</h2>
Pour optimiser le dépôt en supprimant les fichiers inutiles et les optimiser, utilisez:
<h2>git gc</h2>
<h2>git archive</h2>
La commande git archive permet à un utilisateur de créer un fichier zip ou tar contenant les composants d’un arbre du dépôt. Par exemple:
<h2>git archive --format=tar master</h2>
<h2>Git prune</h2>
Via la commande git prune , les fichiers qui n’ont pas de pointeurs entrants seront supprimés. Usage:
<h2>git prune</h2>
<h2>Git fsck</h2>
Pour effectuer une vérification d’intégrité du système de fichiers git, utilisez la commande git fsck . Tous les fichiers corrompus seront identifiés:
<h2>git fsck</h2>
<h2>Git rebase</h2>
La commande git rebase est utilisée pour la réapplication des commits sur une autre branche. Par exemple:
<h2>git rebase master</h2>


<h2>La différence entre git et GitHub :</h2>
GitHub facilite la collaboration en utilisant git. C’est une plateforme qui peut contenir des dépôts de code dans un stockage dans le cloud afin que plusieurs développeurs puissent travailler sur un même projet et voir les modifications des autres en temps réel :
La Propriété et le Coût de git vs GitHub
Comme ils sont si étroitement liés, il serait logique que git et GitHub soient détenus par la même société. Au contraire, git est un logiciel open source, tandis que GitHub appartient à Microsoft.

Les platesformes open source – y compris git et WordPress – sont libres d’utilisation, de modification et de distribution.

Le modèle de tarification de GitHub est différent, mais il offre un plan gratuit intéressant. En fait, toutes les fonctionnalités de base de GitHub sont gratuites pour tout le monde (dans le passé, l’abonnement Individual Pro était de 7 $ par mois). Pour les équipes, les prix commencent à 4 $ par utilisateur et par mois. Vous pouvez également consulter les options de tarification Enterprise pour les groupes plus importants qui ont besoin de fonctionnalités plus avancées.

<h2>EN GROS GIT=COMMANDES VIA TERMINAL créer par Linus thorvald
GITHUB= site (serveur), qui utilise les commandes GIT</h2>

<h2>Qu’est ce que la Staging Area ?</h2>
La Staging Area est une zone de stockage temporaire pour les données qui ont été extraites de différentes sources de données brutes (de structures et de formats différents). Dans cette zone, les données sont souvent nettoyées, normalisées, enrichies et structurées de manière à faciliter leur traitement ultérieur.

En effet, la Staging Area sert de zone tampon pour le traitement des données, elle permet de:

Stocker temporairement les données extraites de différentes sources de données avant de les transformer et de les charger dans le système de destination;
Nettoyer et normaliser les données pour éliminer les doublons, les incohérences, les valeurs manquantes ou erronées, etc.;
Appliquer des règles de validation et de qualité pour s’assurer que les données sont complètes, précises et cohérentes;
Appliquer des transformations pour changer le format, la structure et les valeurs des données pour les adapter aux exigences du système de destination;
Permettre des contrôles de cohérence et de conformité des données avant leur chargement définitif dans le système de destination.

<h2>$ git branch </h2>[nom-de-branche]
Crée une nouvelle branche

<h2>$ git checkout</h2> [nom-de-branche]
Bascule sur la branche spécifiée et met à jour le répertoire de travail

<h2>créer une branche: command git checkout -b 
nom-branche></h2>



JOHAN TOKEN=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


<h2>Ctrl+shift+P = ouverture recherche extensions sur vs.code</h2>