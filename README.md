# My Project
# SP1-08LambdasAndStream

**Description:** Java (Maven) project with **Lambdas & Streams** exercises (Java 8+) to practice functional programming concepts: filtering, mapping, sorting, method references, and custom functional interfaces. Organized by levels and exercises, with simple `Main` classes to run each solution.

---

## 📌 Exercise statement

This project covers **Lambdas & Stream API** fundamentals and practical usage:

- Filtering and transforming collections with `stream()`
- Sorting with lambdas and comparators
- Printing with lambdas and **method references**
- Creating and using **Functional Interfaces**
- Applying functional patterns to mixed lists (Strings and numbers)

---

## 🗂️ Project structure

src/
└─ main/
└─ java/
├─ level01/
│ ├─ exercise01/ (Main)
│ ├─ exercise02/ (Main)
│ ├─ exercise03/ (Main)
│ ├─ exercise04/ (Main)
│ ├─ exercise05/ (Main, PiValueProvider)
│ ├─ exercise06/ (Main)
│ ├─ exercise07/ (Main)
│ └─ exercise08/ (Main, StringReverser)
└─ level02/
├─ exercise01/ (Main)
├─ exercise02/ (Main)
├─ exercise03/ (Main, FloatOperation)
└─ exercise04/ (Main)

---

## ✨ Features

- Stream filtering by condition (contains letter, length rules, prefix rules)
- Stream transformations and joining output (`Collectors.joining`)
- Sorting Strings by length (shortest → longest / longest → shortest)
- Printing collections using:
  - lambda expressions
  - method references
- Custom functional interfaces:
  - `PiValueProvider` for returning PI value
  - `StringReverser` for reversing text
  - `FloatOperation` for arithmetic operations with lambdas
- Mixed list operations (text + numbers) with:
  - custom sort strategies
  - “contains e” prioritization
  - character replacement (`a` → `4`)
  - numeric-only filtering

---

## 🛠 Technologies

- **Java 21** (Eclipse Adoptium / OpenJDK)
- **Maven** (`pom.xml`)
- **IntelliJ IDEA**
- **Git + GitHub** (push from terminal / IntelliJ terminal)

> Note: Maven commands depend on having `mvn` available. If not, run directly from IntelliJ.

---

## 🚀 Installation and Execution

### 1) Clone the repository
```bash
git clone <YOUR_REPO_URL>
cd SP1-08LambdasAndStream
) Run from IntelliJ (recommended)

Open the project root (folder that contains pom.xml)

Navigate to the exercise you want to run

Right click Main.java → Run

3) Run from terminal (PowerShell)

You can compile and run using Maven (if configured) or plain javac/java.

Option A — Maven (if you added exec plugin):

▶️ Exercises and how to execute them
✅ Level 1 · Exercise 01 — Filter strings containing "o"

Goal: Return list of strings containing the letter 'o' and print.

java -cp out level01.exercise01.Main
✅ Level 1 · Exercise 02 — Filter strings containing "o" and length > 5
Goal: Return list of strings containing 'o' and with more than 5 letters.


java -cp out level01.exercise02.Main
✅ Level 1 · Exercise 03 — Print months with a lambda
Goal: Create list of months and print each element using a lambda.


java -cp out level01.exercise03.Main
✅ Level 1 · Exercise 04 — Print months with method reference
Goal: Same as Exercise 03 but using a method reference.


java -cp out level01.exercise04.Main
✅ Level 1 · Exercise 05 — Functional Interface: PI value
Goal: Create functional interface PiValueProvider with method getPiValue() returning a double.


java -cp out level01.exercise05.Main
✅ Level 1 · Exercise 06 — Sort strings shortest → longest (mixed list)
Goal: Create list containing numbers and strings, then sort strings shortest to longest.


java -cp out level01.exercise06.Main
✅ Level 1 · Exercise 07 — Sort strings longest → shortest
Goal: Same list as Exercise 06, but sort longest to shortest.


java -cp out level01.exercise07.Main
✅ Level 1 · Exercise 08 — Functional Interface: reverse string
Goal: Create functional interface StringReverser with method reverse(String) returning the reversed string using a lambda.


java -cp out level01.exercise08.Main
✅ Level 2 · Exercise 01 — Names starting with "A" and exactly 3 letters
Goal: Filter a list of names that start with 'A' and have exactly 3 letters.


java -cp out level02.exercise01.Main
✅ Level 2 · Exercise 02 — Integers to "o/e" comma-separated string
Goal: Convert list of integers into a comma-separated string:

prefix "e" if even

prefix "o" if odd
Example: (3,55,44) → "o3, o55, e44"


java -cp out level02.exercise02.Main
✅ Level 2 · Exercise 03 — Functional Interface for float operations
Goal: Create functional interface FloatOperation with method operacio() returning float, and inject behavior for:

sum, subtraction, multiplication, division


java -cp out level02.exercise03.Main
✅ Level 2 · Exercise 04 — Mixed list transformations
Goal: Create a list containing text and numbers and apply:

Sort alphabetically by first character (charAt(0))

Put strings containing "e" first, others after (inline lambda)

Replace all 'a' with '4'

Show only numeric elements (even if stored as String)

java -cp out level02.exercise04.Main

🧪 Tests
This project is focused on console exercises and does not include automated tests (JUnit) at this stage.

📸 Demo
Not applicable (console output project).

🧩 Technical decisions and notes
The Stream API is used to express logic declaratively:

filter(...) for conditions

map(...) for transformations

sorted(...) + Comparator for ordering

collect(...) for building new collections or formatted strings

Functional Interfaces are kept small and focused, to practice how lambdas bind to a single abstract method.

The project is structured by level/exercise to match the bootcamp delivery format and make evaluation easier.



