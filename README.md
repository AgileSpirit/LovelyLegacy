## Présentation du Kata

LovelyLegacy est un kata de code dont l'enjeu est de se confronter à des problématiques courantes liées à la mise en
oeuvre de tests unitaires ou de refactoring sur une application Java legacy avec une couverture de code nulle.

Le kata LovelyLegacy s'inspire d'un cas réel de Système Informatique critique, rencontré réellement en entreprise.

## Consigne

L'exercice consiste à tester unitairement la fonction *EnvironmentService#getSystemBaseUrl()* tout en modifiant ou
instrumentant le moins possible le code existant.

## Contexte

Il faut bien garder à l'esprit que le code fourni ne représente qu'une partie du système total, qui ne comporte aucun
test automatisé, et que, par conséquent, chaque modification de l'existant peut avoir un impact non maîtrisé sur
l'ensemble de l'application.

Par ailleurs, un proxy d'entreprise avec un Nexus / Archiva paranoïaque mal configuré, et un administrateur système en
vacances (real life !) vous empêchent d'utiliser des libs telles que Mockito, EasyMock, PowerMock et autres frameworks
de Mocking.

## Présentation de l'application

D'un point de vue fonctionnel, le service *EnvironmentService#getSystemBaseUrl()* permet de récupérer l'URL de base d'un
serveur avec lequel doit communique notre application.

Sur le plan technique, l'application est basé sur le framework d'intégration Spring auquel est "en partie" délégué la
gestion du contexte applicatif.

En partie seulement car les développeurs qui ont repris et maintiennent l'application, n'étant pas ceux à l'origine du
projet et ne maîtrisant pas Spring, ont jugé bon de proxyfier le contexte Spring avec une façade (un Singleton). L'accès
aux beans Spring se fait donc par délégation à la façade, à coups de ApplicationContext#getBean(..).

De fait, il n'y a donc pas d'Injection de Dépendances.

## Livrable attendu

A la fin de l'exercice, on s'attend à avoir une couverture de code de 100% pour la méthode
*EnvironmentService#getSystemBaseUrl()*.

## Pistes

1. Exécutez le programme Main.java, à la racine du projet pour vérifier que le projet est bien configuré
2. Crééez le répertoire de sources *src/test/java*
3. Crééez la classe de test *fr.agilespirit.lovelylegacy.application.EnvironmentServiceTest*
4. Résolvez le problème :-)

Bon kata !

