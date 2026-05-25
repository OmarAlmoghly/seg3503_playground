# SEG3503 — Lab 1

Nom : Omar Almoghly
Email : oalmo045@uottawa.ca
GitHub : https://github.com/OmarAlmoghly/seg3503_playground


## Structure du dépôt

```
seg3503_playground/
├── README.md
└── lab1/
    ├── newmath_java/
    │   ├── src/
    │   │   ├── Newmath.java
    │   │   └── Main.java
    │   ├── test/
    │   │   └── NewmathTest.java
    │   ├── lib/
    │   │   └── junit-platform-console-standalone-1.7.1.jar
    │   └── bin/
    │       ├── compile
    │       ├── run
    │       └── test
    └── newmath_ex/
        ├── lib/
        │   └── newmath_ex.ex
        ├── test/
        │   └── newmath_ex_test.exs
        └── mix.exs
```

### Voici le code source de — 'Newmath.java'

```java
public class Newmath {

  public static int div(int a, int b) {
    if ( b == 0 ) {
      throw new ArithmeticException("Attempt to divide by zero.");
    }
    return a / b;
  }

  public static void main( String[] args ) {
    int result = Newmath.div( 6, 2 );
    System.out.println(result);
  }

}
```

### Voici le code source de — 'Main.java'

```java
public class Main {

  public static void main( String[] args ) {

    printToScreen("Newmath (type 'exit' to exit program)");

    while (true) {

      printToScreen("Numerator: " , false);
      String numeratorInput = System.console().readLine();

      if ("exit".equals(numeratorInput)) {
        break;
      }

      printToScreen("Demoninator: " , false);
      String denominatorInput = System.console().readLine();

      int numerator = Integer.parseInt(numeratorInput);
      int denominator = Integer.parseInt(denominatorInput);

      int result = Newmath.div(numerator, denominator);
      printToScreen(String.format("%d / %d = %d", numerator, denominator, result));
    }
  }

  private static void printToScreen(String message) {
    printToScreen(message, true);
  }

  private static void printToScreen(String message, boolean newline) {
    if (message != null) {
      System.out.print(message);
      if (newline) {
        System.out.println("");
      }
    }
  }

}
```

### Tests de — 'NewmathTest.java'

```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class NewmathTest {

    @Test
    void div_ok() {
        assertEquals(2, Newmath.div(4, 2));
    }

    @Test
    void div_by_zero() {
      assertThrows(
        ArithmeticException.class,
        () -> Newmath.div(4, 0)
      );
    }

}
```

### Exécuter Java

```bash
cd lab1/newmath_java
./bin/run
```

### Tester Java (JUnit)

```bash
cd lab1/newmath_java
./bin/test
```

### Screenshot — Java run
<!-- Colle ici ton screenshot de ./bin/run -->

### Screenshot — Java test
<!-- Colle ici ton screenshot de ./bin/test -->

---

## Elixir

### Voici le code source de — 'newmath_ex.ex'

```elixir
defmodule NewmathEx do
  @moduledoc """
  A module for doing new math.
  """

  @doc """
  Divide the numerator (num) by the denominator (dem)

  ## Examples

      iex> NewmathEx.div(10, 4)
      {:ok, 2.5}

  """
  def div(_num, 0), do: {:error, "Cannot divide by zero"}
  def div(num, dem), do: {:ok, num / dem}
end
```

### Tests — 'newmath_ex_test.exs'

```elixir
defmodule NewmathExTest do
  use ExUnit.Case
  doctest NewmathEx

  describe "div/1" do
    test "ok" do
      assert NewmathEx.div(4, 2) == {:ok, 2}
    end

    test "by zero" do
      assert NewmathEx.div(4, 0) == {:error, "Cannot divide by zero"}
    end
  end
end
```

### Exécuter Elixir (IEx shell)

```bash
cd lab1/newmath_ex
./bin/run
# ou
iex -S mix
```

Dans le shell IEx :

```elixir
NewmathEx.div(10, 4)   # => {:ok, 2.5}
NewmathEx.div(4, 0)    # => {:error, "Cannot divide by zero"}
```

### Tester Elixir (ExUnit)

```bash
cd lab1/newmath_ex
./bin/test
# ou
mix test
```

### Screenshot — Elixir run
<!-- Colle ici ton screenshot de iex -S mix -->

### Screenshot — Elixir test
<!-- Colle ici ton screenshot de mix test -->