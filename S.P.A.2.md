node.js = framework de front
-----
Vue.js = framework basé sur node
-----------------

![img_4.png](img_4.png)

     <v-for="item in services" :key="item.id" = pour boucler un tableau en s.p.a


     v-for="(service, index) in services" :key="index"
     v-for="(item, key) in service" :key="key">{{key}}: {{item}} = boucler sur un objet en s.p.a
-------


      <router-link to="/">Home</router-link><br>
      <router-link to="/about">About</router-link><br>
      <router-link to="/villes">Cities</router-link><br>
      <router-link to="/ville">City</router-link>
    </nav>

    <!-- Le composant <router-view> va rendre le composant correspondant à la route actuelle -->
    <router-view></router-view>
-----------
    
      <Cities /> = affiche Cities et a mettre a la fin du template
--------------------------------------

Vue
-
Vue dispose de bons outils de test et d’une documentation raisonnable. La communauté est petite mais cela peut fonctionner comme un avantage puisque les changements ne sortent pas aussi souvent qu’Angular ou React ; nécessitant moins de mise à jour générale du code.

Vanilla JavaScript
----
Vanilla JavaScript est là pour une raison. Bien qu’il ne soit pas une bibliothèque, avec de nombreux changements récents, il est devenu un outil solide pour le développement.


JavaScript Vanilla contre JavaScript :
-------

Alors que Vanilla JavaScript fait référence à la forme pure du langage,
---------------
JavaScript, dans un sens plus large,
englobe le langage ainsi que diverses bibliothèques (telles que jQuery) et frameworks (comme React, Angular ou Vue).
-------

Placer fetchData dans le bon cycle de vie du composant : La fonction fetchData doit être appelée dans le hook created ou mounted du cycle de vie du composant pour s'assurer qu'elle est exécutée correctement lors du chargement du composant.
----------