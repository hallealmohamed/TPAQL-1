# Tests Unitaires TP1 - Couverture du Code

Ce projet contient une suite d'exercices pour pratiquer les tests unitaires avec différents critères de couverture de code.

## Structure du Projet

```
TP1/
├── LineCoverageTest/     # Tests pour la couverture des lignes
├── BranchCoverageTest/   # Tests pour la couverture des branches
└── ConditionCoverageTest/ # Tests pour la couverture des conditions
```

## Exercices

### Exercice 1: Palindrome
- Classe: `Palindrome`
- Méthode: `isPalindrome(String s)`
- Objectif: Vérifier si une chaîne est un palindrome
- Tests à implémenter:
  - Cas null (exception)
  - Chaîne vide
  - Palindrome simple ("kayak")
  - Palindrome avec espaces ("Esope reste ici et se repose")
  - Non-palindrome

### Exercice 2: Anagram
- Classe: `Anagram`
- Méthode: `isAnagram(String s1, String s2)`
- Objectif: Vérifier si deux chaînes sont des anagrammes
- Tests à implémenter:
  - Cas null (exception)
  - Chaînes de longueurs différentes
  - Anagrammes simples ("chien", "niche")
  - Anagrammes avec espaces
  - Non-anagrammes

### Exercice 3: BinarySearch
- Classe: `BinarySearch`
- Méthode: `binarySearch(int[] array, int element)`
- Objectif: Recherche binaire dans un tableau trié
- Tests à implémenter:
  - Tableau null (exception)
  - Tableau vide
  - Élément présent au début
  - Élément présent au milieu
  - Élément présent à la fin
  - Élément absent

### Exercice 4: QuadraticEquation
- Classe: `QuadraticEquation`
- Méthode: `solve(double a, double b, double c)`
- Objectif: Résoudre une équation du second degré
- Tests à implémenter:
  - a = 0 (exception)
  - Delta < 0 (pas de solution)
  - Delta = 0 (une solution)
  - Delta > 0 (deux solutions)

### Exercice 5: RomanNumeral
- Classe: `RomanNumeral`
- Méthode: `toRoman(int n)`
- Objectif: Convertir un nombre en chiffres romains
- Tests à implémenter:
  - n < 1 (exception)
  - n > 3999 (exception)
  - Nombres simples (1, 5, 10)
  - Nombres avec soustraction (4, 9, 40)
  - Nombres complexes (3999)

### Exercice 6: FizzBuzz
- Classe: `FizzBuzz`
- Méthode: `fizzBuzz(int n)`
- Objectif: Implémenter le jeu FizzBuzz
- Tests à implémenter:
  - n <= 1 (exception)
  - Divisible par 3 ("Fizz")
  - Divisible par 5 ("Buzz")
  - Divisible par 15 ("FizzBuzz")
  - Autres nombres

## Critères de Couverture

### Couverture des Lignes
- Vérifie que chaque ligne de code est exécutée au moins une fois
- Utilise `Run ... with Coverage` dans IntelliJ IDEA
- Mode: Tracing

### Couverture des Branches
- Vérifie que chaque branche conditionnelle est exécutée
- Inclut les branches if/else, switch, boucles
- Mode: Branches

### Couverture des Conditions
- Vérifie que chaque condition est évaluée à vrai et à faux
- Plus strict que la couverture des branches
- Mode: Tracing

## Notes
- Les tests doivent être organisés selon les critères de couverture
- Documenter les cas où différents critères donnent les mêmes tests
- Signaler les bugs trouvés dans le code original
- Proposer des corrections si nécessaire 
