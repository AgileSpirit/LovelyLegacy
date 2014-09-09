LovelyLegacy est un kata

## Contexte

L'application se base sur Spring pour gérer son contexte.
Une première subtilité est que les développeurs ont jugé bon de proxyfier le contexte Spring avec une façade.
L'accès aux bean Spring se fait par délégation de la façade, à coups de ApplicationContext#getBean(..).
De fait, il n'y a donc pas d'Injection de Dépendances.
Evidemment, la façade est un Singleton, instanciée au niveau de la classe Service qui l'appelle.

## Exercice

Il s'agit de tester le Service en modifiant le moins de code initial possible.


## Contraintes

EnvironmentResource#getSystemBaseUrl