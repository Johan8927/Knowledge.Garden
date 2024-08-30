## this = this est un opérateur et comme tout opérateur, il retourne une valeur

## Import et export de modules=

Exporter des fonctionnalités
Pour commencer et afin d'utiliser les fonctionnalités d'un module, on devra les exporter. Pour cela, on utilisera l'instruction export.

---

## destructuring=

L'affectation par décomposition (destructuring en anglais) est une expression JavaScript qui permet d'extraire (unpack en anglais) des données d'un tableau ou d'un objet grâce à une syntaxe dont la forme ressemble à la structure du tableau ou de l'objet.

---

## promesse =

Une promesse est un objet renvoyé par une fonction asynchrone et qui représente l'état courant de l'opération.

---

## l'API fetch =

fetch est une façon très simple (beaucoup moins verbeuse que XMLHttpRequest) de faire des requêtes HTTP et permet d'améliorer la performance d'un site dans certains cas.

---

## Async/await

Il existe une syntaxe spéciale pour travailler avec les promesses d’une manière plus confortable, appelée “async/await”. Elle est étonnamment facile à comprendre et à utiliser.

## Le mot-clé async devant une fonction a deux effets:

Fait en sorte qu’elle retourne toujours une promesse.
Permet l’utilisation de await dans celle-ci.
Le mot-clé await devant une promesse fait en sorte que JavaScript attende jusqu’à ce que cette promesse se règle, puis:

Si c’est une erreur, l’exception est générée – comme si throw error était appelé à cet endroit précis.
Sinon, il renvoie le résultat.
Ensemble, ils fournissent un cadre idéal pour écrire du code asynchrone facile à lire et à écrire.

Avec async/await, nous avons rarement besoin d’écrire promise.then/catch, mais nous ne devons pas oublier qu’ils sont basés sur des promesses, parce que parfois (par exemple dans le scope le plus externe) nous devons utiliser ces méthodes. De plus, Promise.all est très utile lorsque l’on attend plusieurs tâches simultanément.

---

## Destructuration=

L'affectation par décomposition (destructuring en anglais) est une expression JavaScript qui permet d'extraire (unpack en anglais) des données d'un tableau ou d'un objet grâce à une syntaxe dont la forme ressemble à la structure du tableau ou de l'objet.

let a, b, rest;
[a, b] = [10, 20];

console.log(a);
// Expected output: 10

console.log(b);
// Expected output: 20

[a, b, ...rest] = [10, 20, 30, 40, 50];

console.log(rest);
// Expected output: Array [30, 40, 50]

## Ces expressions utilisant des littéraux pour les objets ou les tableaux permettent de créer simplement des données regroupées. Une fois créées, on peut les utiliser de n'importe quelle façon, y compris comme valeur renvoyée par une fonction.

## destructuration d'un tableau=

const toto = ["un", "deux", "trois"];

// sans utiliser la décomposition

const un = toto[0];
const deux = toto[1];
const trois = toto[2];

// en utilisant la décomposition

const [un, deux, trois] = toto;

---

## exemple de destructuration =

const user = {
firstName: "Johan",
lastName: "Bertrand"
}

const {firstName, lastName, age = 23 } = user
console.log(firstName)
console.log(lastName)
console.log(age)

const city = "Annecy"

const otherUser = {
firstName,
city
}

---

function addPerturbation(key, {
longitude, latitude, text: texte, startDate: dateDebut, endDate: dateFin,
type = 'default', heureDebut = '00:00', heureFin = '12:00'
} = {}) {
data[key] = {longitude, latitude, texte, dateDebut, dateFin, type, heureDebut, heureFin};
}

addPerturbation('1234',
{
longitude: 23.34,
latitude: 23.45,
text: "123",
startDate: "2021-01-02",
endDate: "2023-01-02"
});

addPerturbation('default');

console.log(data);

---

## promise=

Une promesse est un objet renvoyé par une fonction asynchrone et qui représente l'état courant de l'opération
L'objet Promise (pour « promesse ») est utilisé pour réaliser des traitements de façon asynchrone. 

Une promesse représente une valeur qui peut être disponible maintenant, dans le futur voire jamais.
-

Une Promise est dans un de ces états :

pending (en attente) : état initial, la promesse n'est ni tenue, ni rompue ;
fulfilled (tenue) : l'opération a réussi ;
rejected (rompue) : l'opération a échoué
---

![alt text](image-7.png)

exemple=
-

function wait(delay, myCallbackFunction){
setTimeout(() => {
console.log("dans ma fonction wait")

        const user = {
            firstName: "Alban"
        }

        myCallbackFunction(user, "oisdhfqshdfoiqldsf")
    }, delay)

}

console.log("afficher coucou chose après 3s")
wait(5000, (user, str) => {
console.log("coucou")
console.log(user)
console.log(str)
})

async function waitWithPromise(delay){
return new Promise((maFonctionQuandToutSePasseBien, reject) => {
setTimeout(() => {
console.log("after delay")

            const user = {
                firstName: "Alban"
            }

            reject("Mon serveur est down")
            //maFonctionQuandToutSePasseBien(user)
        }, delay)
    })

}

console.log("afficher coucou chose après 3s")
waitWithPromise(5000).then((user) => {
console.log("coucou")
console.log(user)
}).catch((e) => {
console.log("Ca a fail")
console.log(e)
}).finally(() => {
console.log("c'est fini")
})

try {
const user = await waitWithPromise(5000)
console.log("salut")
console.log(user)
} catch(e){
console.log("ça a pas marché")
}

const myUser = await waitWithPromise(5000).catch(e => console.log("ça a pas marché non plus"))

//  fonction qui prend un nombre indéfini de paramètre et les affiche dans la console
--
function display(...args) {
    for (const arg of args) {
        console.log(arg);
    }
}=>

------

Import/export=
---------------

import {fonction} from './fichier.js';
fonction();

export {fonction} from './fichier.js';

fonction de default = 1 seule par dossier
-------
// avec accolade
import{ default as nyan }  from './functions.js';
nyan();

=>
// sans acolade
import nyan from './fonction.js';
nyan();

-----

Promises=
---------

Une promesse est un objet (Promise) qui représente la complétion ou l'échec d'une opération asynchrone. La plupart du temps, on « consomme » des promesses et c'est donc ce que nous verrons dans la première partie de ce guide pour ensuite expliquer comment les créer.

En résumé, une promesse est un objet qui est renvoyé et auquel on attache des callbacks plutôt que de passer des callbacks à une fonction. Ainsi, au lieu d'avoir une fonction qui prend deux callbacks en arguments :

function faireQqc() {
  return new Promise((successCallback, failureCallback) => {
    console.log("C'est fait");
    // réussir une fois sur deux
    if (Math.random() > 0.5) {
      successCallback("Réussite");
    } else {
      failureCallback("Échec");
    }
  });
}

const promise = faireQqc();
promise.then(successCallback, failureCallback);

Cette dernière forme est ce qu'on appelle un appel de fonction asynchrone. Cette convention possède différents avantages dont le premier est le chaînage.
----------

-------------

Grâce à des fonctions plus modernes et aux promesses, on attache les callbacks aux promesses qui sont renvoyées. On peut ainsi construire une chaîne de promesses :


exemple=
--
faireQqc()
  .then(function (result) {
    return faireAutreChose(result);
  })
  .then(function (newResult) {
    return faireUnTroisiemeTruc(newResult);
  })
  .then(function (finalResult) {
    console.log("Résultat final : " + finalResult);
  })
  .catch(failureCallback);

-----------

Composition=
--
Promise.resolve() et Promise.reject() sont des méthodes qui permettent de créer des promesses déjà tenues ou rompues.

Promise.all() et Promise.race() sont deux outils de composition qui permettent de mener des opérations asynchrones en parallèle.

On peut lancer des opérations en parallèles et attendre qu'elles soient toutes finies de cette façon :



Promise.all([func1(), func2(), func3()]).then(
  ([resultat1, resultat2, resultat3]) => {
    /* où on utilise resultat1/2/3 */
  },
);

-----------

Une promesse
--
 est un objet JavaScript qui produira une valeur à un moment donné dans le futur. Cela s'applique généralement aux opérations asynchrones.

Dans les applications, les opérations asynchrones sont très fréquentes. Il peut s'agir de requêtes API, de traitements de données différés et bien plus encore.

Au lieu de devoir bloquer l'exécution du code jusqu'à ce que les données soient chargées, vous pouvez les définir comme des promesses, afin que l'exécution du code se poursuive avec d'autres parties du code. Et lorsque les promesses sont remplies, vous pouvez utiliser les données qu'elles contiennent.

Vous pouvez en apprendre davantage sur les promesses dans cet article simplifié .

Dans certains cas, une promesse est tenue, dans d'autres, elle échoue. Comment gérez-vous le résultat de chaque résultat ?

Pour le reste de cet article, nous allons comprendre les méthodes then, catchet finallydes promesses.

Les états des promesses en JavaScript
Une promesse a trois états :

en attente : la promesse est toujours en cours
accompli : la promesse est résolue avec succès et renvoie une valeur
rejeté : la promesse échoue avec une erreur
Les états accompli et rejeté ont un point commun : qu'une promesse soit accomplie ou rejetée, la promesse est réglée . Ainsi, un état réglé peut être soit une promesse accomplie, soit une promesse rejetée.

try...catch
---
L'instruction try...catch regroupe des instructions à exécuter et définit une réponse si l'une de ces instructions provoque une exception.

promise.then(value => {
 // use value for something
})

promise
  .then(value => {
    return value.anotherPromise()
  })
  .then(anotherValue => {
    // use this value
  })

  Vous pouvez utiliser la finallyméthode comme ceci :
  --------

let dataIsLoading = true;

promise
  .then(data => {
    // do something with data
  })
  .catch(error => {
   // do something with error
  })
  .finally(() => {
    dataIsLoading = false;
  })

catch = prendre
-----
fecth = récupérer

-----------------------

POUR RESUMER
----

async Function
-
Une fonction marquée avec le mot-clé async est une fonction asynchrone. Elle retourne automatiquement une promesse. Le mot-clé async permet d'utiliser await à l'intérieur de la fonction.

Syntaxe :



Ce que fait async :
------------

Retourne une Promesse : Une fonction async retourne toujours une promesse. Si la fonction retourne une valeur, cette valeur est automatiquement enveloppée dans une promesse résolue. Si la fonction lance une erreur, la promesse est rejetée avec cette erreur.
Permet d'utiliser await : À l'intérieur d'une fonction async, vous pouvez utiliser le mot-clé await pour attendre la résolution d'une promesse avant de continuer l'exécution du code.

Définition
async
----
Mettre le mot async devant une fonction lui donne l'instruction de retourner une promesse. Si une erreur apparaît pendant l'exécution, la promesse est rejetée. Si la fonction retourne une valeur, la promesse est résolue avec cette valeur. Et si une promesse est retournée, elle reste inchangée.

async function asyncFunction() {
 // équivaut à : return Promise.resolve('résultat');
 return 'résultat';
}

asyncFunction().then(console.log) // "résultat"

await Keyword
----
Le mot-clé await est utilisé pour attendre la résolution d'une promesse. Il ne peut être utilisé qu'à l'intérieur d'une fonction async.

await
Le mot-clé await ne peut être utilisé qu'à l'intérieur d'une fonction async. Il nous permet d'attendre que la promesse retourne son résultat (ou une erreur) pour continuer l'exécution du code.

Syntaxe :

javascript
Copier le code
const result = await someAsyncFunction();

Ce que fait await :
--

Attend la Résolution : Lorsque vous utilisez await,
---
 le code s'arrête jusqu'à ce que la promesse soit résolue (ou rejetée). Ensuite, la valeur résolue est retournée et assignée à la variable (ou l'erreur est lancée si la promesse est rejetée).
Rend le Code Plus Lisible : Utiliser await permet d'écrire du code asynchrone de manière séquentielle, ce qui le rend plus facile à comprendre que les chaînes de .then().
Exemple avec fetch
fetch est une API qui permet de faire des requêtes HTTP et retourne une promesse. Vous pouvez utiliser async et await pour gérer les requêtes HTTP de manière plus lisible.

Exemple de Code :

javascript
Copier le code
async function fetchData() {
    try {
        // Effectue une requête HTTP GET à l'URL spécifiée
        const response = await fetch('https://api.example.com/data');

        // Vérifie si la réponse est correcte (code HTTP 200)
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }

        // Parse la réponse JSON
        const data = await response.json();

        // Utilise les données récupérées
        console.log(data);
    } catch (error) {
        // Gère les erreurs éventuelles
        console.error('There was a problem with the fetch operation:', error);
    }
}

// Appelle la fonction
fetchData();
Explication du Code :

async function fetchData() : Déclare une fonction asynchrone.
await fetch('https://api.example.com/data') : Utilise await pour attendre la réponse de fetch. fetch retourne une promesse qui sera résolue avec un objet Response.
if (!response.ok) : Vérifie si la réponse a un code de statut HTTP correct (200-299). Si ce n'est pas le cas, une erreur est lancée.
await response.json() : Attends que la réponse soit convertie en JSON. response.json() retourne une promesse qui sera résolue avec les données JSON.
console.log(data) : Utilise les données récupérées.
catch (error) : Attrape et gère les erreurs potentielles qui peuvent survenir lors de la requête ou du traitement des données.

Voici une liste de règles importantes à retenir sur async await:
----

les fonctions async retournent une promesse.
les fonctions async utilisent une Promise implicite pour retourner un résultat. Même si une promesse n'est pas retournée explicitement, la fonction async fait en sorte que le code soit passé par une promesse.
await bloque l'exécution du code à l'intérieur d'une fonction async. Il permet de s'assurer que la prochaine ligne soit exécutée quand la promesse est résolue. Donc si du code asynchrone est déjà en train de s'exécuter, await n'aura pas d'effet sur lui.
il peut y avoir plusieurs await à l'intérieur d'une fonction async.
Il faut bien faire attention lors de l'utilisation d'await dans une boucle, car le code peut facilement s'exécuter de manière séquentielle au lieu d'être executé en parallèle.
await est toujours utilisé pour une seule promesse.

async function = asynchrone, une fonction qui s'exécute a un moment données
-------
await = pour attendre l'xécution a placer dans une const
--------
fetch = lancer, jeter une URL
--------
catch = utiliser pour "prendre", géré les erreurs
--------

-------

Différences entre JSON et JavaScript Object
-----
Comme son nom l'indique, JSON est plus ou moins un object JavaScript, cependant il y a des différences. Tout d'abord, comme expliqué dans la spécification, "JSON est un format texte facilitant l'échange de données structurées entre tous les langages de programmation". Il est donc universel et non pas limité à JavaScript. En fait, il ne fait pas du tout partie de JavaScript, il est simplement dérivé de la façon dont les objets JavaScripts sont écrits.

L'autre différence majeure est dans le type de données que JSON peut stocker. JSON accepte les valeurs suivantes :

Objet
Array
Nombre
Chaîne de caractères
true
false
null

Par conséquent, il n'y a pas de méthodes ou autres fonctionnalités dans JSON, il n'y a que du texte. Et c'est bien ainsi, car c'est ce qui en fait un format universel d'échange de données.
-----------

Comment stocker JSON ?
JSON étant du texte, on peut le stocker où l'on veut. Dans une base de données, dans un fichier texte, un stockage client (cookies ou localStorage) ou via son propre format de fichier qui utilise l'extension .json (qui est en gros un fichier texte avec une extension .json).

Utiliser JSON.stringify()
---------
Admettons que votre application construise des données d'une manière ou d'une autre. Pour conserver ces données quelque part, elles doivent être converties en une chaîne de caractères (string) JSON valide. Vous pouvez le faire avec JSON.stringify() :

let myNewJSON = JSON.stringify(myJSON, null, '\t');

Utiliser JSON.parse()
-------
À l'inverse, si vous recevez du JSON et que vous voulez l'utiliser dans votre JavaScript, vous pouvez utiliser la méthode JSON.parse() :

let myNewJSON = JSON.parse(myJSON);

SPA ?
-
Ce sont les initiales de Single Page Applications. Ce sont des applis dans lesquelles il n’y a qu’une page html et le contenu de cette page change en fonction des actions de l’utilisateur. C’est différent du modèle ou il y a plusieurs pages html. En général, on utilisera des frameworks comme Angular, Vue ou React pour créer ce genre d’applications web.

RTA ?
-
RTA ça veut dire Real Time Applications, ce sont les applications en temps réel, ce sont ces applications qui ont besoin de se mettre à jour super fréquemment.



