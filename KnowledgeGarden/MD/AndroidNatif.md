## 

Lis ça y'as tout  (JetpackCompose)

### https://developer.android.com/develop/ui/compose/tutorial?hl=fr

---

🔑 Les points clés à retenir :

* Vous pouvez voir Jetpack Compose comme une opportunité de repenser vos applications et d’adopter des bonnes pratiques modernes, tout en gardant à l’esprit les principes fondamentaux de Clean Architecture.
* Jetpack en utilisant Compose sont au final très proches des framework web comme React ou Vue.js.
* Le principe de *Separation of Concerns* reste fondamental
* L’état doit être prévisible et unidirectionnel
* La testabilité doit être considérée dès le début
* Les composants doivent être découplés et réutilisables
* *La Clean Architecture* n’est pas un cadre rigide mais un guide adaptable

---

![](https://android.pickle-forge.app/_astro/architecture-compose-2.DqJh82vd_2s15N.webp)

****Définition du principe de séparation des responsabilités**En génie logiciel, la séparation des responsabilités est un **principe qui consiste à séparer la programmation, le contenu et le design pour supprimer les dépendances et accélérer le développement web****.*

# 

Architecture MVVM avec Compose

L’architecture MVVM sous Android se traduit par l’utilisation de `ViewModel` pour gérer l’état de l’UI et faire le liens avec les données.

![](https://android.pickle-forge.app/_astro/architecture-mvvm.BXROM-BD_JLvm9.webp)

Les `viewModels` sont des classes gérées par le système Android, elles sont les particularités suivantes :

* Elles sont conservées lors des changements de configuration (rotation de l’écran)
* Elles sont détruites lorsqu’elles ne sont plus utilisées (fin de l’activité ou du fragment, etc.)
* Elles sont utilisées pour gérer l’état de l’UI
* Elles sont indépendantes de la couche UI
* Les viewModels vous donne accès à un coroutineScope pour gérer des tâches asynchrones dans son cycle de vie (`viewModelScope`)
* Elles ne peuvent pas être instanciées directement, elles doivent être créées via un `ViewModelProvider`

Pour respecter la logique MVVM vos `ViewModel` doivent :

* Être indépendants de la couche UI
  * Les `viewModels` sont faits pour être `observés` par les composants de l’UI et non liés fortements à eux.
  * Les `viewModels` ne doivent pas contenir de références à des vues (TextView, Button, etc.)
* Proposer des fonctions pour modifier l’état de l’UI
  * La vue ne doit pas pouvoir modifier directement l’état du `viewModel`, elle doit passer par des fonctions dédiées.

---

### Un **mock** en programmation est un **objet simulé** qui imite le comportement d'un objet réel dans un contexte précis, souvent utilisé dans le cadre de **tests unitaires**. Il permet de **remplacer des dépendances externes** ou complexes afin de tester une partie isolée du code.

---

### Le bloc `setContent` définit la mise en page de l'activité dans laquelle les fonctions modulables sont appelées. Les fonctions modulables ne peuvent être appelées qu'à partir d'autres fonctions modulables.

---

### @Composable ( rend une fonction modulable pour le front )

### @Preview ( permet de voir la fonction en preview )

### Rappel Jetpack compose permet de faire du front...

---

# Scaffold

Permet de mettre en page et d'afficher les composants:

Dans Material Design, un échafaudage est une structure fondamentale qui fournit une plate-forme standardisée pour les interfaces utilisateur complexes. Il rassemble différentes parties de l'UI, telles que les barres d'application et les boutons d'action flottants, ce qui donne aux applications un aspect cohérent.

---

${order.price} = composant avec kotlin

---

POJO (Java ou Kotlin(**Plain Old Java Object**) = classe servant à contenir des données

var (Kotlin) = variable simple

val (Kotlin) = constante

---

[#](https://android.pickle-forge.app/c/ressources/aide-kotlin/#les-listes)Les listes

**kotlin=**

```
//Liste de string
val myList = listOf("Hello", "World", "Kotlin")

//Liste de nombres
val myNumberList = listOf(1, 2, 3, 4, 5)

// Si vous voulez une liste mutable
val myMutableList = mutableListOf("Hello", "World", "Kotlin")
```

Et si vous voulez déclarer une liste explicitement

**kotlin=**

```
val myList:List<String> = listOf("Hello", "World", "Kotlin")
```

---

**Comment fonctionne un émulateur Android ?**

**Un émulateur Android est un périphérique virtuel Android (AVD, Android Virtual Device) qui représente un périphérique Android spécifique.** **Vous pouvez utiliser un émulateur Android en tant que plate-forme cible pour exécuter et tester vos applications Android sur votre PC****.**

### Android Emulator

Un **émulateur Android** simule un appareil Android sur votre ordinateur. Un téléphone peut être appelé "appareil physique", tandis qu'un émulateur est un "appareil virtuel".

---

### Appareil virtuel Android (AVD, **Android Virtual Device)**

Un **appareil virtuel Android**, ou **AVD**, est une configuration qui définit le téléphone, la tablette, l'appareil Android Wear, le téléviseur ou l'appareil Android Automotive que vous souhaitez simuler dans un **Android Emulator**.

---

### "var" ne peut pas etre null contrairement au java, donc ont met un "?" pour indiquer que cette variable est parfois null:

```
fun main() {
    val otherClassInstance = OtherClass()
    println(otherClassInstance.myVar?)
}

//On a rajouté un signe "?" derrière notre type.
//Cela indique au compilateur que cette variable est parfois "null"
class OtherClass(var myVar:String? = null)

```

---

```
//On donne un nom explicite "responseData" au lieu de "it"
myNetworkResponse?.let { responseData ->
    //La fonction `let` permet de unwrap 🌮 votre variable
    saveNetworkResponseToDataBase(responseData)
}

```

### On a vu la fonction `let` mais il en existe d’autres pour gérer les optionnels et le `null safety`

---

## modifier . Il permet de modifier la taille, la mise en page et l'apparence du composable, ou d'ajouter des interactions de haut niveau (par exemple, pour rendre un élément cliquable). Vous pouvez les enchaîner pour créer des composables plus riches.

```
Composable
fun MessageCard(msg: Message) {
    // Add padding around our message
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(R.drawable.profile_picture),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                // Set image size to 40 dp
                .size(40.dp)
                // Clip image to be shaped as a circle
                .clip(CircleShape)
        )

        // Add a horizontal space between the image and the column
        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(text = msg.author)
            // Add a vertical space between the author and message texts
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = msg.body)
        }
    }
}
  
```

---

### Utiliser une colonne

### La fonction [`Column`](https://developer.android.com/reference/kotlin/androidx/compose/foundation/layout/package-summary?hl=fr#Column(androidx.compose.ui.Modifier,androidx.compose.foundation.layout.Arrangement.Vertical,androidx.compose.ui.Alignment.Horizontal,kotlin.Function1)(androidx.compose.ui.Modifier,androidx.compose.foundation.layout.Arrangement.Vertical,androidx.compose.ui.Alignment.Horizontal,kotlin.Function1)) vous permet d'organiser les éléments verticalement. Ajoutez `Column` à la fonction `MessageCard`.

### Vous pouvez utiliser [`Row`](https://developer.android.com/reference/kotlin/androidx/compose/foundation/layout/package-summary?hl=fr#Row(androidx.compose.ui.Modifier,androidx.compose.foundation.layout.Arrangement.Horizontal,androidx.compose.ui.Alignment.Vertical,kotlin.Function1)(androidx.compose.ui.Modifier,androidx.compose.foundation.layout.Arrangement.Horizontal,androidx.compose.ui.Alignment.Vertical,kotlin.Function1)) pour organiser les éléments horizontalement et [`Box`](https://developer.android.com/reference/kotlin/androidx/compose/foundation/layout/package-summary?hl=fr#Box(androidx.compose.ui.Modifier)) pour empiler des éléments.

### Un [LazyRow](https://developer.android.com/reference/kotlin/androidx/compose/foundation/lazy/package-summary#lazyrow) est une liste à défilement horizontal qui compose et présente uniquement les éléments actuellement visibles. Il est similaire à un Recyclerview horizontal dans le système d'affichage Android classique.

---

// Affichage d'une icone Dwitch
Text("Dwitch", style = MaterialTheme.typography.titleLarge)
Spacer(modifier = Modifier.height(16.dp))
// Affichage des commandes et des datesKotlin est un langage développé par [Jetbrains](https://android.pickle-forge.app/c/ressources/aide-kotlin/), Jetbrains développe des environnements de développement pour pratiquement tous les langages les plus utilisés.

Kotlin en lui même est un langage **fonctionnel** et **orienté objet**. Là où java est 100% **orienté objet**, Kotlin permet plus de liberté d’utilisation et est ce qu’on appelle un langage moderne.

Il est bien moins verbeux que Java. Permet de faire moins d’erreur, produit des programmes plus stables, et est plus flexible.

Un exemple pour créer un POJO (ceux qui connaissent en Java sinon renseignez-vous c’est un principe de base) en Kotlin :

**kotlin=**

Et voila, cette ligne de code vous permet de créer une classe avec tout les getters, setters, `equals()`, `hashCode()`, `toString()` et `copy()`.

![Gradle](https://cdn.iconscout.com/icon/free/png-128/gradle-1-285287.png)

Gradle est un système d'automatisation de build open-source qui s'appuie sur les concepts d'Apache Ant et d'Apache Maven. Il introduit un langage spécifique au domaine (DSL) basé sur Groovy au lieu du XML utilisé par Apache Maven pour déclarer la configuration du projet.

Gradle a été conçu pour les constructions multi-projets, qui peuvent devenir très volumineuses.

Il supporte les builds incrémentiels en déterminant intelligemment quelles parties de l'arborescence de compilation sont à jour.

Gradle peut :

* Construire des classes par réflexion de code
* Exécuter des scripts / du code
* Ecrire dans des fichiers
* Déployer des builds
* Faire le CI
* Gérer les dépendances
* Exécuter les tests
* Faire le café quand un build a réussi
* Build ton programme automatiquement quand l'ISS passe au dessus de ta tête.

![](https://media.giphy.com/media/U56UKYAO8ToW8ycuDe/giphy.gif)

**Les possibilités sont infinies**

> **Note 📝:** Vous pouvez voir Gradle comme un genre de `NPM` ou `Composer`, mais en beaucoup beaucoup plus complet et complexe. Le principe de base reste d'ajouter des dépendances à votre programme, de gérer tout cela et de compiler l'ensemble de la manière la plus efficace possible.

🤓 **Gradle** intervient seulement à la compilation et pas au run, il n'est donc pas possible que Gradle agisse sur le programme une fois que celui ci est lancé

## 

## [#](https://android.pickle-forge.app/c/ressources/aide-kotlin/#kotlin-et-le-typage)Kotlin et le typage

Kotlin est un langage fortement typé.

Pour déclarer une variable en Kotlin

**kotlin=**

```
//On précise le type ici
val myHelloWorldStringVariable:String = "Hello there"

//Version alternative :
//L'inférence de type permet d'éviter d'expliciter le type
val myHelloWorldStringVariable = "Hello there"
```

> On peut déclarer une variable en dehors de toute fonction ou classe, ce qui n’est pas possible en `Java`

---

Voici le code équivalent en `Java`

**java=**

```
 public class HelloWorld {
     String myHelloWorldStringVariable = new String("Hello there");

     public static void main(String[] args) {
         System.out.println("Hello world!");
     }
 }
```

## [#](https://android.pickle-forge.app/c/ressources/aide-kotlin/#les-variables)Les variables

Pour déclarer une variable on peut utiliser 2 mots clés : `val` et `var`

Question

Chercher la différence entre les deux mots clés `val` et `var` en Kotlin

### [#](https://android.pickle-forge.app/c/ressources/aide-kotlin/#les-listes)Les listes

**kotlin=**

```
//Liste de string
val myList = listOf("Hello", "World", "Kotlin")

//Liste de nombres
val myNumberList = listOf(1, 2, 3, 4, 5)

// Si vous voulez une liste mutable
val myMutableList = mutableListOf("Hello", "World", "Kotlin")
```

Et si vous voulez déclarer une liste explicitement

**kotlin=**

```
val myList:List<String> = listOf("Hello", "World", "Kotlin")
```

Question

Que signifie les `<>` dans la déclaration de la liste ? Comment s’appelle ce concept ?

### [#](https://android.pickle-forge.app/c/ressources/aide-kotlin/#optional--null-safety-)Optional & Null safety 🌮

Attention on arrive à un endroit légèrement difficile. Du moins c’est pas commun sur les langages que vous avez vu jusqu’à aujourd’hui.

En kotlin on ne peut pas avoir une valeur `null` dans une variable. Contrairement au `Java`. En Java on peut faire ca :

**java=**

```
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    OtherClass otherClass = null;
    //Ici j'obtiens le fameux "Null pointer exception" lors du runtime
    System.out.print(otherClass.myVar);
  }
}

public class OtherClass {
 	String myVar = new String("Hello");
}
```

🚫 Si je lance ce code en Java, il va compiler (**Buildtime**) sans problème. Mais lorsque que je vais lancer mon programme (**Runtime**) il va planter.

Ce qui est pas top, car je ne vois le problème qu’au moment ou l’utilisateur va lancer le programme.

#### [#](https://android.pickle-forge.app/c/ressources/aide-kotlin/#essayons-en-kotlin)Essayons en Kotlin

Ajoutez dans votre fichier (`main.kt`) de test le code suivant :

**kotlin=**

```
fun main() {
    val otherClassInstance = OtherClass()
    println(otherClassInstance.myVar)
}

class OtherClass(var myVar:String = null)
```

Question

Que se passe-t’il lorsque vous compilez ?

🚫 C’est impossible. En Kotlin si on indique pas **explicitement** qu’une variable peut contenir une valeur `null` alors c’est impossible de `build`.

#### [#](https://android.pickle-forge.app/c/ressources/aide-kotlin/#comment-on-indique-cela-alors-)Comment on indique cela alors ?

Si je voulais que le *build time* passe sur mon code Kotlin, il faudrait que je modifie en faisant cela :

**kotlin=**

```
fun main() {
    val otherClassInstance = OtherClass()
    println(otherClassInstance.myVar?)
}

//On a rajouté un signe "?" derrière notre type.
//Cela indique au compilateur que cette variable est parfois "null"
class OtherClass(var myVar:String? = null)
```

Non seulement cela compile, mais au runtime cela ne plante pas, même si votre variable est `null`.

#### [#](https://android.pickle-forge.app/c/ressources/aide-kotlin/#comment-g%C3%A9rer-ce-comportement-)Comment gérer ce comportement ?

Souvent dans votre code vous allez devoir indiquer au programme que vous n’êtes pas certain qu’il y aura une valeur *non null* dans une variable à un instant T (Ex: je récupère une donnée du réseau)

Dans ce genre de cas, vous allez devoir `unwrap 🌮` la variable, c’est en gros “Découvrir” ce qu’il y a dedans, et suivant ce que vous trouverez, exécutez tel ou tel code.

Si je prend l’exemple du réseau, imaginez le code suivant

**kotlin=**

```
//Je vais stocker la réponse hypothétique du réseau dans ma variable
var myNetworkResponse:String? = null

//Ici j'appelle le réseau, et il renvoi une valeur (ou PAS)
myNetworkResponse = networkCall()

//Je veux récuperer la réponse du réseau si il y en a unne
myNetworkResponse?.let {
    //La fonction `let` permet de unwrap 🌮 votre variable
    //Elle produit une valeur non optionnel "it" par defaut
    saveNetworkResponseToDataBase(it)
    //"it" est certain d'exister, et est non null
}
```

Question

Selon vous quelle est la signature de la fonction `networkCall` ? Ecrivez la et faites valider par l’enseignant.

* Cette fonction n’existe pas, on vous demande à partir du code ci-dessus d’imaginer sa signature
* Le même exemple mais avec le nommage explicite de la donnée `unwrap 🌮`
  **kotlin=**
  ```
  //On donne un nom explicite "responseData" au lieu de "it"
  myNetworkResponse?.let { responseData ->
      //La fonction `let` permet de unwrap 🌮 votre variable
      saveNetworkResponseToDataBase(responseData)
  }
  ```

On a vu la fonction `let` mais il en existe d’autres pour gérer les optionnels et le `null safety`

Pour en apprendre plus [voici un lien vers la documentation Kotlin qui explique ce comportement et comment l’utiliser au mieux.](https://kotlinlang.org/docs/reference/null-safety.html)

Question

Comment pourriez vous faire pour exécuter du code dans le cas ou la valeur de l`unwrapping 🌮` est effectivement `null`, pour déclencher un nouvel appel réseau par exemple ? Trouvez l’opérateur adéquat et inscrivez le code d’exemple complété dans un ficher.

### [#](https://android.pickle-forge.app/c/ressources/aide-kotlin/#attention--%EF%B8%8F)Attention ⚠️

A l’inverse vous pouvez forcer le compilateur à ignorer qu’une variable est potentiellement `null`

Grâce au symbole `!!` : il est à éviter le plus possible car il force le compilateur à ne pas vérifier si cette variable est vide avant de l’utiliser.

Cela peut être pratique pour éviter l’`unwrapping 🌮` et donc quelques lignes de code, mais c’est aussi très dangereux car le comportement est imprévisible.

**kotlin=**

```
//On bourrine. Mais si le network plante, le programme plante.
saveNetworkResponseToDataBase(myNetworkResponse!!)
```

![](https://android.pickle-forge.app/_astro/poutine.Df3yv1KA_14ecB.webp)

## [#](https://android.pickle-forge.app/c/ressources/aide-kotlin/#les-fonctions)Les fonctions

En Kotlin vous pouvez déclarer des fonctions n’importe où dans votre programme. Une fonction peut aussi être dans une variable, comme en `javascript`.

**kotlin=**

```

fun myFunction()

fun myFunction(): String {
    return "Hello World"
}

//Type inference, Kotlin devine que la fonction sera de type string.
//On utilise également la syntaxe simplifiée pour une fonction ici
fun myFunction() = "Hello world"

//Avec un parametre, les parametres doivent-etre typé
fun numberOfCharactersInString(inputString: String): Int {
    return parameter.length
}

fun greetUser(name: String, lastname:String, city:String) {
    println("Hello $name $lastname, you live in $city")
}

//Lambda dans une variable
var myVariable = {
        println("Hello")
    }

//On peut aussi passer des parametres
var myVariable:(name: String) -> Unit = {name ->
    println("Hello $name")
}


//Fonction anonyme ex 1
val square = fun(x: Int) = x * x

//Fonction anonyme ex 2
val greetings = fun(name: String) = "Hello $name"
```

Puisque Kotlin est aussi un langage fonctionnel, il est important de bien comprendre comment et quand utiliser des fonctions. Nous verrons tout au long de l’introduction différents moyens d’utiliser les fonctions et variables.

> La syntaxe pour concatener une `string` est `+` ou à l’intérieur des double quote vous pouvez utiliser `"Je concatene avec $maVariable"`. Et pour accéder a une propriété de votre variable : `"Je concatene avec ${maVariable.maProp}"`

### [#](https://android.pickle-forge.app/c/ressources/aide-kotlin/#appeler-une-fonction)Appeler une fonction

Il existe plusieurs façon d’appeler une fonction en Kotlin, notamment au niveau des paramètres.

Dans le langage les paramètres sont nommés, même si on est pas obligé de préciser le nom du paramètre c’est très utile pour s’y retrouver.

**kotlin=**

```
numberOfCharactersInString("Hello"); //5
//J'appelle ma fonction en précisant le nom des parametres
numberOfCharactersInString(inputString = "Hello")
```

## [#](https://android.pickle-forge.app/c/ressources/aide-kotlin/#control-flow-if-for-when)Control flow (`if`, `for`, `when`)

Je ne vais pas paraphraser [la documentation qui fait très bien son boulot ici](https://kotlinlang.org/docs/reference/control-flow.html).

> Questions
>
> * Quel est l’équivalent du `switch` en kotlin ?
> * Créez un tableau de `string` et affichez chaque valeur dans la sortie console. Faites valider par l’enseignant.

## [#](https://android.pickle-forge.app/c/ressources/aide-kotlin/#les-classes)Les classes

Kotlin est aussi un langage objet, on déclare une classe qui possède une propriété comme ceci :

**kotlin=**

```
//Le constructeur est dans la signature de la classe entre ()
class MyClass(val myProperty:String?)

//Pour instancier cette classe
val myClassInstance = MyClass("hello")
```

Ou

**kotlin=**

```
class MyClass {
    var myVar:String? = null

    constructor(myVarValue: String?){
        myVar = myVarValue
    }
}
```

Sans propriété :

**kotlin=+**

```
class MyClass
```

---

Voici le code équivalent en `Java`

**java=**

```
class MyClass {

    String myProperty;

    public MyClass(String myProperty){
        this.myProperty = myProperty;
    }
}
```

Il est très rapide et concis de créer une classe en Kotlin. Et puisque c’est un langage assez malin il y a pas mal de raccourcis sous forme de mot clés.

### [#](https://android.pickle-forge.app/c/ressources/aide-kotlin/#les-classes-de-donn%C3%A9es)Les classes de données

Un concept qui n’existe pas partout, les `data class` sont en fait un type de classe dédié au stockage de la donnée.

La différence avec les classes normales est que le compilateur va vous créer automatiquement des fonctions utilitaires sur vos `data class`.

Les fonctions automatiquement générées :

* `equals()`
* `toString()`
* `hashCode()`
* `copy()`
* `...`

> [Retrouvez la documentation sur les data class](https://kotlinlang.org/docs/reference/data-classes.html)

Exemple de `data class`

**kotlin=**

```
data class User(val name: String, val age: Int, val gender: Gender)

val myUser = User(name = "Roger", age = 21, gender = Gender.MALE)

//To string est généré automatiquement donc tout va bien
println(myUser)
```

Encore une fois on remarque qu’un mot clé du langage va nous permettre de gagner du temps sur le développement tout en gardant des concepts standards.

> Remarquez le type `Gender`, c’est un `enum` en Kotlin vous pouvez utiliser ce genre de variable pour définir un set de valeur prédéfini pour un objet.

## [#](https://android.pickle-forge.app/c/ressources/aide-kotlin/#classes-enum)Classes `Enum`

Très simple a comprendre mais redoutablement efficace pour construire un programme très robuste, les classes `enum` permettent de lister des valeurs possibles d’un type donné.

Exemple avec notre `Gender`

**kotlin=**

```
enum class Gender {
    FEMALE,
    MALE,
    OTHER
}
```

Cela permet d’éviter d’hardcoder des valeurs et d’éviter d’utiliser des constantes `String` qui sont fastidieuses à travailler et génératrice d’erreur.

**kotlin=**

```
data class User(val name: String, val age: Int, val gender: Gender)

val user1 = User(name = "Roger", age = 21, gender = Gender.FEMALE)
```

Ainsi toute variable ayant le type `Gender` ne pourra prendre qu’une des 3 valeurs de l’`enum` possible.

## [#](https://android.pickle-forge.app/c/ressources/aide-kotlin/#les-mots-cl%C3%A9s)Les mots clés

`Companion, Object, Lateinit, let, with, run` ne représentent qu’une partie émergée de l’iceberg.

Kotlin est un langage avec beaucoup de mots-clés 🔑 🔑 🔑 , [en voici une référence](https://kotlinlang.org/docs/reference/keyword-reference.html).

## [#](https://android.pickle-forge.app/c/ressources/aide-kotlin/#que-faire-maintenant-)Que faire maintenant ?

Pour apprendre et maitriser un nouveau langage, il n’y a pas de solution simple.

**Il faut vous entrainer**

Un lien pour apprendre de la meilleure manière le Kotlin :

[https://play.kotlinlang.org/koans/overview](https://play.kotlinlang.org/koans/overview)

---

## Mots-clés difficiles﻿

Les jetons suivants sont toujours interprétés comme des mots-clés et ne peuvent pas être utilisés comme identifiants :

* `as`
  * est utilisé pour [les conversions de types](https://kotlinlang.org/docs/typecasts.html#unsafe-cast-operator) .
  * spécifie un [alias pour une importation](https://kotlinlang.org/docs/packages.html#imports)
* `as?`est utilisé pour [les moulages de type sûrs](https://kotlinlang.org/docs/typecasts.html#safe-nullable-cast-operator) .
* `break` [termine l'exécution d'une boucle](https://kotlinlang.org/docs/returns.html) .
* `class`déclare une [classe](https://kotlinlang.org/docs/classes.html) .
* `continue` [passe à l'étape suivante de la boucle englobante la plus proche](https://kotlinlang.org/docs/returns.html) .
* `do`commence une [boucle do/while](https://kotlinlang.org/docs/control-flow.html#while-loops) (une boucle avec une postcondition).
* `else`définit la branche d'une [expression if](https://kotlinlang.org/docs/control-flow.html#if-expression) qui est exécutée lorsque la condition est fausse.
* `false`spécifie la valeur « false » du [type booléen](https://kotlinlang.org/docs/booleans.html) .
* `for`commence une [boucle for](https://kotlinlang.org/docs/control-flow.html#for-loops) .
* `fun`déclare une [fonction](https://kotlinlang.org/docs/functions.html) .
* `if`commence une [expression if](https://kotlinlang.org/docs/control-flow.html#if-expression) .
* `in`
  * spécifie l'objet en cours d'itération dans une [boucle for](https://kotlinlang.org/docs/control-flow.html#for-loops) .
  * est utilisé comme opérateur infixe pour vérifier qu'une valeur appartient à [une plage](https://kotlinlang.org/docs/ranges.html) , une collection ou une autre entité qui [définit une méthode « contient »](https://kotlinlang.org/docs/operator-overloading.html#in-operator) .
  * est utilisé dans [des expressions](https://kotlinlang.org/docs/control-flow.html#when-expressions-and-statements) ayant le même but.
  * marque un paramètre de type comme [contravariant](https://kotlinlang.org/docs/generics.html#declaration-site-variance) .
* `!in`
  * est utilisé comme opérateur pour vérifier qu'une valeur n'appartient PAS à [une plage](https://kotlinlang.org/docs/ranges.html) , une collection ou une autre entité qui [définit une méthode « contient »](https://kotlinlang.org/docs/operator-overloading.html#in-operator) .
  * est utilisé dans [des expressions](https://kotlinlang.org/docs/control-flow.html#when-expressions-and-statements) ayant le même but.
* `interface`déclare une [interface](https://kotlinlang.org/docs/interfaces.html) .
* `is`
  * vérifie qu'une [valeur a un certain type](https://kotlinlang.org/docs/typecasts.html#is-and-is-operators) .
  * est utilisé dans [des expressions](https://kotlinlang.org/docs/control-flow.html#when-expressions-and-statements) ayant le même but.
* `!is`
  * vérifie qu'une [valeur n'a PAS un certain type](https://kotlinlang.org/docs/typecasts.html#is-and-is-operators) .
  * est utilisé dans [des expressions](https://kotlinlang.org/docs/control-flow.html#when-expressions-and-statements) ayant le même but.
* `null`est une constante représentant une référence d'objet qui ne pointe vers aucun objet.
* `object`déclare [une classe et son instance en même temps](https://kotlinlang.org/docs/object-declarations.html) .
* `package`spécifie le [package pour le fichier actuel](https://kotlinlang.org/docs/packages.html) .
* `return` [renvoie de la fonction englobante la plus proche ou de la fonction anonyme](https://kotlinlang.org/docs/returns.html) .
* `super`
  * [fait référence à l'implémentation de superclasse d'une méthode ou d'une propriété](https://kotlinlang.org/docs/inheritance.html#calling-the-superclass-implementation) .
  * [appelle le constructeur de la superclasse à partir d'un constructeur secondaire](https://kotlinlang.org/docs/classes.html#inheritance) .
* `this`
  * fait référence au [récepteur actuel](https://kotlinlang.org/docs/this-expressions.html) .
  * [appelle un autre constructeur de la même classe à partir d'un constructeur secondaire](https://kotlinlang.org/docs/classes.html#constructors) .
* `throw` [lance une exception](https://kotlinlang.org/docs/exceptions.html) .
* `true`spécifie la valeur « true » du [type booléen](https://kotlinlang.org/docs/booleans.html) .
* `try` [commence un bloc de gestion des exceptions](https://kotlinlang.org/docs/exceptions.html) .
* `typealias`déclare un [alias de type](https://kotlinlang.org/docs/type-aliases.html) .
* `typeof`est réservé à une utilisation future.
* `val`[déclare une propriété](https://kotlinlang.org/docs/properties.html) en lecture seule ou [une variable locale](https://kotlinlang.org/docs/basic-syntax.html#variables) .
* `var`[déclare une propriété](https://kotlinlang.org/docs/properties.html) mutable ou [une variable locale](https://kotlinlang.org/docs/basic-syntax.html#variables) .
* `when`commence une [expression when](https://kotlinlang.org/docs/control-flow.html#when-expressions-and-statements) (exécute l'une des branches données).
* `while`commence une [boucle while](https://kotlinlang.org/docs/control-flow.html#while-loops) (une boucle avec une précondition).

## Mots-clés souples﻿

Les jetons suivants agissent comme des mots-clés dans le contexte dans lequel ils sont applicables, et ils peuvent être utilisés comme identifiants dans d'autres contextes :

* `by`
  * [délègue l'implémentation d'une interface à un autre objet](https://kotlinlang.org/docs/delegation.html) .
  * [délègue l'implémentation des accesseurs d'une propriété à un autre objet](https://kotlinlang.org/docs/delegated-properties.html) .
* `catch`commence un bloc qui [gère un type d'exception spécifique](https://kotlinlang.org/docs/exceptions.html) .
* `constructor`déclare un [constructeur primaire ou secondaire](https://kotlinlang.org/docs/classes.html#constructors) .
* `delegate`est utilisé comme [cible du site d'utilisation d'annotation](https://kotlinlang.org/docs/annotations.html#annotation-use-site-targets) .
* `dynamic`fait référence à un [type dynamique](https://kotlinlang.org/docs/dynamic-type.html) dans le code Kotlin/JS.
* `field`est utilisé comme [cible du site d'utilisation d'annotation](https://kotlinlang.org/docs/annotations.html#annotation-use-site-targets) .
* `file`est utilisé comme [cible du site d'utilisation d'annotation](https://kotlinlang.org/docs/annotations.html#annotation-use-site-targets) .
* `finally`commence un bloc qui [est toujours exécuté lorsqu'un bloc try se termine](https://kotlinlang.org/docs/exceptions.html) .
* `get`
  * déclare le [getter d'une propriété](https://kotlinlang.org/docs/properties.html#getters-and-setters) .
  * est utilisé comme [cible du site d'utilisation d'annotation](https://kotlinlang.org/docs/annotations.html#annotation-use-site-targets) .
* `import` [importe une déclaration d'un autre package dans le fichier courant](https://kotlinlang.org/docs/packages.html) .
* `init`commence un [bloc d'initialisation](https://kotlinlang.org/docs/classes.html#constructors) .
* `param`est utilisé comme [cible du site d'utilisation d'annotation](https://kotlinlang.org/docs/annotations.html#annotation-use-site-targets) .
* `property`est utilisé comme [cible du site d'utilisation d'annotation](https://kotlinlang.org/docs/annotations.html#annotation-use-site-targets) .
* `receiver`est utilisé comme [cible du site d'utilisation d'annotation](https://kotlinlang.org/docs/annotations.html#annotation-use-site-targets) .
* `set`
  * déclare le [setter d'une propriété](https://kotlinlang.org/docs/properties.html#getters-and-setters) .
  * est utilisé comme [cible du site d'utilisation d'annotation](https://kotlinlang.org/docs/annotations.html#annotation-use-site-targets) .
* `setparam`est utilisé comme [cible du site d'utilisation d'annotation](https://kotlinlang.org/docs/annotations.html#annotation-use-site-targets) .
* `value`avec le `class`mot clé déclare une [classe en ligne](https://kotlinlang.org/docs/inline-classes.html) .
* `where`spécifie les [contraintes pour un paramètre de type générique](https://kotlinlang.org/docs/generics.html#upper-bounds) .

## Mots-clés modificateurs﻿

Les jetons suivants agissent comme des mots-clés dans les listes de modificateurs de déclarations et peuvent être utilisés comme identifiants dans d'autres contextes :

* `abstract`marque une classe ou un membre comme [abstrait](https://kotlinlang.org/docs/classes.html#abstract-classes) .
* `actual`désigne une implémentation spécifique à une plate-forme dans [des projets multiplateformes](https://kotlinlang.org/docs/multiplatform-expect-actual.html) .
* `annotation`déclare une [classe d'annotation](https://kotlinlang.org/docs/annotations.html) .
* `companion`déclare un [objet compagnon](https://kotlinlang.org/docs/object-declarations.html#companion-objects) .
* `const`marque une propriété comme une [constante de compilation](https://kotlinlang.org/docs/properties.html#compile-time-constants) .
* `crossinline`interdit [les retours non locaux dans un lambda passé à une fonction en ligne](https://kotlinlang.org/docs/inline-functions.html#returns) .
* `data`demande au compilateur de [générer des membres canoniques pour une classe](https://kotlinlang.org/docs/data-classes.html) .
* `enum`déclare une [énumération](https://kotlinlang.org/docs/enum-classes.html) .
* `expect`marque une déclaration comme [spécifique à la plateforme](https://kotlinlang.org/docs/multiplatform-expect-actual.html) , en attendant une implémentation dans les modules de la plateforme.
* `external`marque une déclaration comme implémentée en dehors de Kotlin (accessible via [JNI](https://kotlinlang.org/docs/java-interop.html#using-jni-with-kotlin) ou en [JavaScript](https://kotlinlang.org/docs/js-interop.html#external-modifier) ).
* `final`interdit [de passer outre un membre](https://kotlinlang.org/docs/inheritance.html#overriding-methods) .
* `infix`permet d'appeler une fonction en utilisant [la notation infixe](https://kotlinlang.org/docs/functions.html#infix-notation) .
* `inline`indique au compilateur d' [intégrer une fonction et les lambdas qui lui sont transmis sur le site d'appel](https://kotlinlang.org/docs/inline-functions.html) .
* `inner`permet de faire référence à une instance de classe externe à partir d'une [classe imbriquée](https://kotlinlang.org/docs/nested-classes.html) .
* `internal`marque une déclaration comme [visible dans le module actuel](https://kotlinlang.org/docs/visibility-modifiers.html) .
* `lateinit`permet d'initialiser une [propriété non nullable en dehors d'un constructeur](https://kotlinlang.org/docs/properties.html#late-initialized-properties-and-variables) .
* `noinline`désactive [l'inlining d'un lambda passé à une fonction en ligne](https://kotlinlang.org/docs/inline-functions.html#noinline) .
* `open`permet [de sous-classer une classe ou de remplacer un membre](https://kotlinlang.org/docs/classes.html#inheritance) .
* `operator`marque une fonction comme [surchargeant un opérateur ou implémentant une convention](https://kotlinlang.org/docs/operator-overloading.html) .
* `out`marque un paramètre de type comme [covariant](https://kotlinlang.org/docs/generics.html#declaration-site-variance) .
* `override`marque un membre comme une [substitution d'un membre de superclasse](https://kotlinlang.org/docs/inheritance.html#overriding-methods) .
* `private`marque une déclaration comme [visible dans la classe ou le fichier actuel](https://kotlinlang.org/docs/visibility-modifiers.html) .
* `protected`marque une déclaration comme [visible dans la classe actuelle et ses sous-classes](https://kotlinlang.org/docs/visibility-modifiers.html) .
* `public`marque une déclaration comme [visible n'importe où](https://kotlinlang.org/docs/visibility-modifiers.html) .
* `reified`marque un paramètre de type d'une fonction en ligne comme [accessible au moment de l'exécution](https://kotlinlang.org/docs/inline-functions.html#reified-type-parameters) .
* `sealed`déclare une [classe scellée](https://kotlinlang.org/docs/sealed-classes.html) (une classe avec sous-classement restreint).
* `suspend`marque une fonction ou un lambda comme étant en suspension (utilisable comme [coroutine](https://kotlinlang.org/docs/coroutines-overview.html) ).
* `tailrec`marque une fonction comme [récursive terminale](https://kotlinlang.org/docs/functions.html#tail-recursive-functions) (permettant au compilateur de remplacer la récursivité par l'itération).
* `vararg`permet [de passer un nombre variable d'arguments pour un paramètre](https://kotlinlang.org/docs/functions.html#variable-number-of-arguments-varargs) .

## Identifiants spéciaux﻿

Les identifiants suivants sont définis par le compilateur dans des contextes spécifiques et peuvent être utilisés comme identifiants réguliers dans d'autres contextes :

* `field`est utilisé à l'intérieur d'un accesseur de propriété pour faire référence au [champ de sauvegarde de la propriété](https://kotlinlang.org/docs/properties.html#backing-fields) .
* `it`est utilisé à l'intérieur d'un lambda pour [faire référence à son paramètre de manière implicite](https://kotlinlang.org/docs/lambdas.html#it-implicit-name-of-a-single-parameter) .

![](https://android.pickle-forge.app/_astro/content-negociation.EsZTDjii_Z2adqtX.webp)

---
