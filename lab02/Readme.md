# SEG3503 – Lab 02 : Classes d'équivalence

## Exercice 1 – Tests manuels (user-registration-app)

L'application a été exécutée via :

Puis testée sur `http://localhost:8080/`.

| Cas de Test | Entrée | Résultats Escomptés | Résultats Actuels | Verdict |
|-------------|--------|--------------------|--------------------|---------|
| TC-R01 : Tous les champs valides | UserName=OmarAlmoghly, FirstName=john, LastName=doe, Email=john@test.com, Age=25 | Inscription réussie | "Congratulations john doe! You are now a member of our site." | ✅ Succès |
| TC-R02 : UserName vide | UserName vide, reste valide | Erreur sur UserName | "Wrong UserName format - Size of UserName must be between 6 and 12" | ✅ Succès |
| TC-R03 : Email invalide (sans @) | Email=johntest.com | Erreur sur Email | "Wrong Email format" | ✅ Succès |
| TC-R04 : Age = 0 | Age=0 | Erreur (age invalide) | "must be greater than or equal to 18" | ✅ Succès |
| TC-R05 : Age négatif | Age=-5 | Erreur (age invalide) | "must be greater than or equal to 18" | ✅ Succès |
| TC-R06 : Age trop grand | Age=999 | Erreur (age invalide) | "must be less than or equal to 64" | ✅ Succès |
| TC-R07 : Tous les champs vides | Tout vide | Erreurs sur tous les champs | "Wrong UserName format", "Wrong Email format", "Age is mandatory", "Wrong Postal Code format" | ✅ Succès |

### Screenshots

**TC-R01 – Succès inscription**
![TC-R01](assets/Screenshot 2026-06-07 033520.png)

**TC-R02 – UserName vide**
![TC-R02](assets/Screenshot 2026-06-07 033559.png)

**TC-R03 – Email invalide**
![TC-R03](assets/Screenshot 2026-06-07 034323.png)

**TC-R04 – Age = 0**
![TC-R04](assets/Screenshot 2026-06-07 034528.png)

**TC-R05 – Age négatif**
![TC-R05](assets/Screenshot 2026-06-07 034551.png)

**TC-R06 – Age trop grand**
![TC-R06](assets/Screenshot 2026-06-07 034601.png)

**TC-R07 – Tous les champs vides**
![TC-R07](assets/Screenshot 2026-06-07 034630.png)

---

## Exercice 2 – Tests JUnit pour `nextDate`

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

