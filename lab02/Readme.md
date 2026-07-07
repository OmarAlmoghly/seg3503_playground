# SEG3503 – Lab 02 : Classes d'équivalence

## Exercice 1

| Cas de Test | Résultats Escomptés | Résultats Actuels | Verdict |
|-------------|--------------------|--------------------|---------|
| TC-R01 : Tous les champs valides | accepted | ![TC-R01](assets/Screenshot 2026-06-07 033520.png) | Pass |
| TC-R02 : UserName vide | erreur UserName | ![TC-R02](assets/Screenshot 2026-06-07 033559.png) | Pass |
| TC-R03 : Email invalide | erreur Email | ![TC-R03](assets/Screenshot 2026-06-07 034323.png) | Pass |
| TC-R04 : Age = 0 | erreur Age | ![TC-R04](assets/Screenshot 2026-06-07 034528.png) | Pass |
| TC-R05 : Age négatif | erreur Age | ![TC-R05](assets/Screenshot 2026-06-07 034551.png) | Pass |
| TC-R06 : Age trop grand | erreur Age | ![TC-R06](assets/Screenshot 2026-06-07 034601.png) | Pass |
| TC-R07 : Tous vides | erreurs multiples | ![TC-R07](assets/Screenshot 2026-06-07 034630.png) | Pass |

## Exercice 2

| TC | Entrée (y, m, d) | Sortie Escomptée | Type |
|----|------------------|-----------------|------|
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
| 17 | 1500, 02, 29 | `IllegalArgumentException` | Exception |
| 18 | -1, 10, 20 | `IllegalArgumentException` | Exception |
| 19 | 1458, 15, 12 | `IllegalArgumentException` | Exception |
| 20 | 1975, 06, -50 | `IllegalArgumentException` | Exception |

### Fichiers créés

- **`DateTest.java`** — 20 tests JUnit 5 explicites
- **`DateNextDateOkTest.java`** — tests JUnit 4 paramétrés pour TC01–TC15
- **`DateNextDateExceptionTest.java`** — tests JUnit 4 paramétrés pour TC16–TC20