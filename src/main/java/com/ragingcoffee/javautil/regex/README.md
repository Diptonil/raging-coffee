# The Regex API

In Java, regular expressions can be evaluated with the aid of the Regex API. It is basically a tool that can be used to perform sophesticated pattern matching operations. Regex is a concept heavily explored in data science and database. The character sequence is a set of characters. A pattern is used to find matches in other character sequences. Thus, we can specify a regular expression that represents a general form that can match several different specific character sequences. <br />
There are two classes that we can use for regex - `Pattern` and `Matcher`. Refer to the examples and the discussion further for better clarity.


## Pattern

- We use this class to define a regular expression. There are no constructors here. The factory method `compile()` is called. The `pattern` here is the regular expression that we want to use. The method transforms the string into a pattern for matching by the `Matcher`.
```java
Pattern pattern(CharSequence pattern)
```
- Refer to the first program for better clarity.


## Programs

1. `BasicPatternMatcher.java`: Performs the most elementary regex pattern matching operations.