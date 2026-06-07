# SEG3503 – Lab 02 : Classes d'équivalence

## Exercice 1 – Tests manuels (user-registration-app)

L'application a été exécutée via `java -jar user-registration-app-0.1.0.jar` puis testée sur `http://localhost:8080/`.

| Cas de Test | Résultats Escomptés | Résultats Actuels | Verdict |
|-------------|--------------------|--------------------|---------|
| TC-R01 : Tous les champs valides remplis | Inscription réussie | Inscription réussie | ✅ Succès |
| TC-R02 : Champ UserName vide | Message d'erreur (champ requis) | Message d'erreur | ✅ Succès |
| TC-R03 : Email sans `@` | Message d'erreur (format invalide) | Message d'erreur | ✅ Succès |
| TC-R04 : Age = 0 | Inscription acceptée ou erreur selon spec | À vérifier | Non-concluant |
| TC-R05 : Age négatif | Message d'erreur | Message d'erreur | ✅ Succès |
| TC-R06 : Age = 999 (hors plage) | Message d'erreur | Message d'erreur | ✅ Succès |

> **Note** : Remplacer les résultats actuels par ceux observés lors de l'exécution réelle et joindre les captures dans `assets/`.

---

## Exercice 2 – Tests JUnit pour `nextDate`

### Tableau des cas de test

| TC | Entrée (y, m, d) | Sortie Escomptée (y, m, d) | Type |
|----|-------------------|---------------------------|------|
| 01 | 1700, 06, 20 | 1700, 06, 21 | OK |
| 02 | 2005, 04, 15 | 2005, 04, 16 | OK |
| 03 | 1901, 07, 20 | 1901, 07, 21 | OK |
| 04 | 3456, 03, 27 | 3456, 03, 28 | OK |
| 05 | 1500, 02, 17 | 1500, 02, 18 | OK |
| 06 | 1700, 06, 29 | 1700, 06, 30 | OK |
| 07 | 1800, 11, 29 | 1800, 11, 30 | OK |
| 08 | 3453, 01, 29 | 3453, 01, 30 | OK |
| 09 | 444, 02, 29 | 444, 03, 01 | OK (bissextile) |
| 10 | 2005, 04, 30 | 2005, 05, 01 | OK |
| 11 | 3453, 01, 30 | 3453, 01, 31 | OK |
| 12 | 3456, 03, 30 | 3456, 03, 31 | OK |
| 13 | 1901, 07, 31 | 1901, 08, 01 | OK |
| 14 | 3453, 01, 31 | 3453, 02, 01 | OK |
| 15 | 3456, 12, 31 | 3457, 01, 01 | OK |
| 16 | 1500, 02, 31 | `IllegalArgumentException` | Exception |
| 17 | 1500, 02, 29 | `IllegalArgumentException` | Exception (1500 non-bissextile) |
| 18 | -1, 10, 20 | `IllegalArgumentException` | Exception |
| 19 | 1458, 15, 12 | `IllegalArgumentException` | Exception |
| 20 | 1975, 06, -50 | `IllegalArgumentException` | Exception |

### Fichiers créés

- **`DateTest.java`** — 20 tests JUnit 5 explicites (un `@Test` par cas)
- **`DateNextDateOkTest.java`** — Tests JUnit 4 paramétrés pour TC01–TC15 (pas d'exception)
- **`DateNextDateExceptionTest.java`** — Tests JUnit 4 paramétrés pour TC16–TC20 (exception attendue)

### Capture d'exécution

![Résultats des tests](assets/tests_results.png)

---

## Structure du dépôt

```
seg3103_playground/
├── lab01/
└── lab02/
    ├── ecs/
    │   ├── Date.java
    │   ├── DateTest.java
    │   ├── DateNextDateOkTest.java
    │   └── DateNextDateExceptionTest.java
    ├── registration/
    │   └── user-registration-app-0.1.0.jar
    ├── assets/
    │   └── tests_results.png
    └── README.md
```
