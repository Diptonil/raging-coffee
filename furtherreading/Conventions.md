# Conventions

The general structure of a Java file should, according to the Google Style Guide, follow certain rules so as to conform to standards of enterprise-level Java projects as well as Open-Source projects. The whole manifest can be summed up into this following list of guidelines as stated below.


## Source file structure

- Follow the Egyptian brackets conventions over the C-style braces convention.
- Lines must be left in this order:
  ```
  // Package statements

  // Static import statements

  // Non-static import statements

  // Class code (exactly one top-level declaration)
  ```
- Blank Line conventions:
  - A blank line may be used for logical subsectioning.
  - A blank line is compulsory between consecutive members in a source file.
  - Avoid multiple blank lines.
- Space conventions:
  - Apply space after every keyword and an opening/ closing parenthesis.
  - No spaces between the type and the class for generics.
- Import conventions:
  - No wildcards allowed.
  - Static imports and non-static imports are spaced by a line. Avoiding static imports would be the best, in any case. Static import is not used for static nested classes. They are imported with normal imports.
  Example for static imports:
        import static java.lang.Math.*;
        // We can use sqrt() or max() instead of Math.sqrt() or Math.max().
  Example for non-static imports:
        import java.io.PrintStream;
  - Imported names should appear in ASCII order.
- Braces are used with for, if, else, while, etc. control statements even when the body is empty or has just one statement.
- Methods/ constructors of a class that share the same name appear in a single contiguous group with no other members in between.
- Only one statement per line.
- Code column limit is 100 characters. Anything exceeding that needs to be line-wrapped.
- A switch case statement, except enum switch cases, must have compulsory default cases.


## Line Wrapping

- Upon a line-wrap, the indent space is compulsorily 4 spaces in the next line.


## Comments

- Apply one space after or before `//` in any cases. Multiple spaces are allowed but unnecessary.
- Tab-aligning comments should be avoided.
- Comment switch case fall-throughs.


## Identifiers

- Variables/ methods use camelCase. Class/ interfaces use PascalCase. Public constant names are LIKE_THIS while private final variables may be likeThis.
- A test class name always ends with a Test. Example: `HashtableIdealityTest`.
- Package names use only lowercase letters and digits. Not even underscores.
- Multiple variable declarations per line is prohibited (except a for loop header).
- Local variables are not habitually declared at the start of their containing block or block-like construct. Instead, local variables are declared close to the point they are first used (within reason), to minimize their scope.
- Array variables are declared as `Type[] name`, not `Type name[]`.
- Long data-type literals are always written as `123456789L` and never `123456789l` to avoid confusion with 1.
