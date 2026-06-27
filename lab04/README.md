# Lab 04 - Test-Driven Development (FizzBuzz)

Auteur : Omar (travail individuel)

## Resume

Implementation de FizzBuzz en Java en suivant le cycle TDD (Rouge -> Vert -> Refactor), avec le fichier de test FizzbuzzTest.java fourni au prealable.

## Groupes de commits (5 au total)

1. d2abb51 - RED : fizzbuzz(n) retourne null partout. 10 tests failed / 0 passed.
2. 9307cd9 - GREEN : cas de base (return String.valueOf(n)). 3 tests passed / 7 failed.
3. 76a0750 - GREEN : logique Fizz ajoutee (n % 3 == 0). 7 tests passed / 3 failed.
4. e4fe8f6 - GREEN : logique Buzz et FizzBuzz ajoutee (n % 5, n % 15). 9 tests passed / 1 failed.
5. 7b59e2a - GREEN + REFACTOR : liste fizzbuzz(start,end) implementee, logique simplifiee. 10/10 tests passed.

## Execution des tests

javac -cp lib/junit-platform-console-standalone-1.10.2.jar -d bin lib/Fizzbuzz.java test/FizzbuzzTest.java
java -jar lib/junit-platform-console-standalone-1.10.2.jar -cp bin --select-class fizzbuzz.fizzbuzz.test.FizzbuzzTest

## Resultat final

10 tests found, 10 tests successful, 0 tests failed