# The Regex API

In Java, regular expressions can be evaluated with the aid of the Regex API. It is basically a tool that can be used to perform sophesticated pattern matching operations. Regex is a concept heavily explored in data science and database. The character sequence is a set of characters. A pattern is used to find matches in other character sequences. Thus, we can specify a regular expression that represents a general form that can match several different specific character sequences. <br />
There are two classes that we can use for regex - `Pattern` and `Matcher`. Refer to the examples and the discussion further for better clarity. <br />
A great place to learn and experiment with regular expressions is <a href="https://regex101.com/">Regex 101</a>. It is important to know that regex is an universal language scheme applicable for all the languages in a similar way.


## Pattern

- We use this class to define a regular expression. There are no constructors here. The factory method `compile()` is called. The `pattern` here is the regular expression that we want to use.
```java
Pattern pattern(CharSequence pattern)
```
- Refer to the first program for better clarity.


## Matcher

- We use this class to define an input string for the purpose of matching. There are no constructors, again. 
- The `matches()`returns true if gitthe match occurs.
- The `find()` returns true for every occurence of the pattern that it can match in the input string.


## Programs

It is highly recommended to look at the <a href="regex.md">Regex</a> markdown file to understand what kind of patterns can we create with it. Regex is an intricate and extensive subject in itself. More support guides should definitely be referred to for learning about constructions of patterns. 
1. `BasicCharacterPatternMatcher.java`: Performs the most elementary regex pattern matching operation for a character pattern.
1. `BasicStringPatternMatcher.java`: Performs the most elementary regex pattern matching operation for a string pattern.
1. `OccurenceFinder.java`: Finds the number of occurences of a simple pattern using regex.
1. `AlternateMetacharacter.java`: Illustrates the use of the pipe character.
1. `MetaEscapeMatcher.java`: Illustrates the use of the dot character.
1. `ZeroOneQuantifier.java`: Illustrates the use of the question mark character.
1. `ZeroMoreQuantifier.java`: Illustrates the use of the star character.
1. `OneMoreQuantifier.java`: Illustrates the use of the plus character.