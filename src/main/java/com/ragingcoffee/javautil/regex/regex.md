# Regex

In this section, various regular expression rules (common to all languages) would be noted. The use of metacharacters would be elucidated upon here.


## Basic Theory

- The basic theory of Regex is that a pattern string is matched *anywhere* in the input string (irrespective of it being a string or a character). This can be reviewed in `BasicCharacterPatternMatcher.java` and `BasicStringPatternMatcher.java`.


## Metacharacters

The Regex language supports metacharacters, which are special symbols that make pattern creation easier for us by specifying certain implied rules. Each character carries a special meaning and can drastically influence a pattern with their existence. So it becomes fairly easy to mistakenly use them as well. 

1. Alternate Metacharacter **(|)**: This gives a match if input contains a pattern separated by the pipe character. See `AlternateMetacharacter.java` for examples.
1. Meta Escape **(.)**: This gives a match for for *any* character (except a \n). The character, whatever it is, should just be there. See `MetaEscapeMatcher.java` for examples.
1. Zero or More Quantifier **(?)**: This gives a match if input contains a pattern with the character tagged with star zero or one time. See `ZeroOneQuantifier.java` for examples.
1. Zero or More Quantifier **(*)**: This gives a match if input contains a pattern with the character tagged with star zero or more times.  However, no matter how many characters get repeated, the count of the matches won't increase. the whole input would be treated as one itself. See `ZeroMoreQuantifier.java` for examples.
1. One or More Quantifier **(+)**: This gives a match if input contains a pattern with the character tagged with star one or more times.  However, no matter how many characters get repeated, the count of the matches won't increase. the whole input would be treated as one itself. See `OneMoreQuantifier.java` for examples.