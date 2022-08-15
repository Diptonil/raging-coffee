# Annotations

- At a core level, this concept introduced in JDK 5 is used similar to a metadata provision. It enables us to embed supplemental information in a source file.
- It can be said as a tag representing metadat in different sophesticated ways.
- It does not change the actions or semantics of a program. This information that we have can be used for development or deployment. It might be processed using a source-code generator.
- Annotations cannot have an `extends` clause when being defined. They extend the `Annotation` super-interface within `java.lang.annotations`.
- Most of the important annotation methods that have been discussed ahead is contained in `AnnotatedElement` interface.
- To define an annotation:
  ```java
  @interface MyAnnotation {
    String information();
    int degree();
  }
  ```
Annotations strictly have methods inside that are generally used as variables when they're being utilised. They begin with a `@interface`.
- Annotations can be used to annotate just about anything - classes, enums, methods (even the `main()`), fields, parameters and even other annotations. Annotation member methods are used like fields in this context. The way they are used is:
  ```java
  @MyAnnotation(information = "Annotation example.", degree = 69)
  public static void someMethod() {
    ...
  }
  ```
- It must be noted that all fields defined must compulsorily be used.
- Multiple annotations may be used with any unit (class, method, etc.).


## Retention Policies

- A retention policy determines the time at which an annotation would get discarded. There are three types - `SOURCE`, `CLASS`& `RUNTIME`.
- These policies are encapsulated within `java.lang.annotation.RetentionPolicy` class. Since these classes are available within the sub-package of `java.lang.annotation`, they cannot be used without an import. That sub-package must be imported, or the rest of it's components.
- A retention policy may be set up for an annotation using the `@Retention` annotation.
- The policies may be described as:
  - `SOURCE`: Annotation retained only up till the source file and discarded during compilation.
  - `CLASS`: Annotation is retained in the source file as well as the `.class` files. It is not available through the runtime in the JVM, though.
  - `RUNTIME`: Annotation available through the runtime in JVM as well as the `.class` file.
The default policy that implicitly gets used everytime an annotation is defines is `CLASS`. The first program illustrates the use of an example annotation.


## Reflection

- Reflection is the feature that allows the annotated information about a class to be available at runtime.
- Since it relates to runtime, the retention policy should also be set to `RUNTIME` for it to work.
- There are many ways to use Reflection. We would use the Class Reflection here. The `java.lang` package has a `Class` that we can use to get hold of a class that we want to analyse for annotations and metadata. The `getClass()` returns a `Class` (the class that the invoking object belongs to). Once we have the class stored in `Class`, we may use `getMethod()` that returns a `Method` of the invoking `Class` object.
- To store information about the annotation after we drill down the details of the classes and methods, finally, we can either use the annotation that we defined as the datatype to store the annotated information that we would extract, or we may opt to use the `Annotation` class as the datatype to store the annotated data. The latter is helpful in case when we do not know the annotation that we has been used to annotate a class or a method or whatever. The former is helpful in case we only want the information within the annotation and we already know the annotation used.
- `getAnnotation()` is the method used to get the data of the invoking object (may be `Class` or `Method`). We use the `toString()` on the `Annotation` object to get the data as a String finally. However, if we use a known annotation, we can refer to the data simply by using `invokingAnnotationObject.memberMethod()` for as many number of methods it has.
- The form of `getMethod()` gets somewhat warped with certain unconventional and unencountered elements such as `datatype.'class'` which is a form that is not too often encountered in mainstream programming. Those are basically the `Class` objects of the respective datatypes. This is dealt more comprehensively under Generics. 
- The programs below prove the case that the use of `Annotation` class is much more convenient than the annotation reference.
- A major application of Reflection technique is Checker Class.


## Default Values in Annotations

At times we want to define annotations that have default values. In such cases, while using them, we don't need to explicitly metion their data unless we want to overload the defaults. In such cases, we use default values.


## Marker Annotations

- Marker Annotations are special annotations that exist just to *mark* an item. It has no members. Its presence as an annotation is sufficient.
- The annotations, when used on any unit, are left without any braces or just with `()`. Both are acceptable (the former more conventional).
- These annotations can be checked by a Checker Class using the `isAnnotationPresent()`.


## Single-Member Annotations

- Some annotations may have only one field. Or else only one normal field and other fields would all be default. They're called Single Member Annotations.
- The single field should compulsorily be names as `value()`. While using the annotation, instead of mentioning the field name, we may reduce verbosity and simply write:
  ```java
  @SomeAnnotation(69)
  class SomeJazz {
    ...
  }
  ```
- The purpose behind these annotations is that their names should be sufficient for users to know the kind of values that would go in. If names aren't that clear, it is best to stick to normal forms.


## Built-In Annotations

- There are many but almost all are very specific. There are ten that are general. Five of them are from `java.lang`: `@Override`, `@Deprecated`, `@FunctionalInterface`, `@SafeVarargs`, `@SuppressWarnings`. Five are from `java.lang.annotations`: `@Retention`, `@Documented`, `@Target`, `@Repeatable` and `@Inherited`. It is important to understand that the use of these annotations are purely informational and is not to be considered as binding. They are just special because they issue compile-time warnings if something that they go against happens.
- `@Retention`: Used to denote the retention policy for another annotation. Used only as an annotation to other annotations.
- `@Documented`: Used as a marker annotation to tell a tool that an annotation is yet to be documented. Used only as an annotation to other annotations.
- `@Target`: Used on an annotation to specify the targets that the annotation is meant to be used on. This takes only one parameter - ann array of `ElementType` constants. An annotation can be used on anything as long as it is not annotated by `@Target`. It is often good to explicitly specify the scope for which an annotation is to be used. Used only as an annotation to other annotations.
- `@Repeatable`: Used for repeating annotations. Used only as an annotation to other annotations.
- `@Inherited`: This causes the annotations applied on a superclass be inherited by the subclasses. So we do not need to specify the same annotations that we use for the superclass for the subclass as well. Used only as an annotation to other annotations. 
- `@Override`: Used to make sure that a method from the superclass is actually overriden (like a special marker annotation). It also helps to specify at one glance to a reviewer or programmer that a certain method is actually overriding the superclass method. Compile-time errors are generated if a labelled method doesn't actually override. Used on subclass methods.
- `@Deprecated`: States that the labelled declaration is obsolete and not recommended for use. Can be used to segregate legacy code from a modern implementation of a given API.
- `@FunctionalInterface`: States that an interface is *functional*. Compile-time error is generated is it is not. Functional interfaces are discussed in the Lambda section. Used only on interfaces.
- `@SafeVarargs`: States that no unsafe actions related to a varargs parameter occur. The methods must be static, final or private. Used for methods and constructors.
- `@SuppressWarnings`: States that any compiler-warnings for a certain section is to be silenced. The name of the warnings should be parameterized as Strings.


## The `ElementType` Constants

- `ANNOTATION_TYPE`: To apply to another annotation.
- `CONSTRUCTOR`: To apply to a constructor.
- `FIELD`: To apply to a field.
- `LOCAL_VARIABLE`: To apply to a local variable.
- `METHOD`: To apply to a method.
- `MODULE`: To apply to a module.
- `PACKAGE`: To apply to a package.
- `PARAMETER`: To apply to a parameter.
- `TYPE`: To apply to a class, interface or enum.
- `TYPE_USE`: To apply for type annotations (comes next).
- `TYPE_PARAMETER`: To apply for type paramter.


## Type Annotations

- Originally annotations were allowed only for declarations. From JDK 8, the scape has been expanded. Annotations can also be used in cases where a type is being used. They're called Type Annotations.
- We can now annotate this within a method, a cast, array levels, `throws`, etc.
- A Type Annotation must have ElementType.TYPE_USE as a target.
- Most marker annotations of such types can be effectively used.
- This feature seems very useless (probably the worst feature I have come across that seems to be just plain spamming of code). 


## Repeating Annotations

JDK 8 allowed annotations to be repeated on a same element. It must have the `@Repeatable` flag to it. This again seems very weird and a rather unpleasant addition. The use cases are yet to be explored. It has a container annotation and a repeatable annotation. The repeatable annotation, everytime used, can be kept track of by means of the container annotation that shall have an array of the repeatable annotations.


## Some Restrictions

- Annotations cannot inherit each other.
- Their member methods must accept no parameters.
- The methods must return either primitives, Strings, Classes, enums, legal arrays or some other annotation.
- Annotations cannot be generic.
- They cannot specify a `throws` clause.


## Programs

1. `SimpleAnnotation.java`: To show how basic annotations are created and used.
1. `ReflectiveAnnotation.java`: To illustate the simple use of obtaining the annotated data by a class at runtime. This process exclusively is done using the `Annotation` class under the assumption that we do not know anything about the annotation being used for any of the methods or classes or whatever. We just know the target class and its methods. This program draws annotation data of methods without any parameters passed.
1. `ReflectiveKnownAnnotation.java`: To illustate the simple use of obtaining the annotated data by a class at runtime. This process exclusively is done using the annotation class under the assumption that we know everything about the annotation being used for the methods or classes or whatever. We also know the target class and its methods. This program draws annotation data of methods with multiple parameters passed.
1. `AllAnnotation.java`: To illustrate extraction of all annotated data of class and methods separately at runtime. The `getAnnotations()` (note the plural form) method returns an array of `Annotations` of all the respective annotations that have been applied to the method or class.
1. `DefaultAnnotation.java`: To illustrate effectiveness of default annotations.
1. `MarkerAnnotation.java`: To illustrate effectiveness of marker annotations.
1. `SingleMemberAnnotation.java`: To illustrate effectiveness of single-member annotations using the normal as well as the form involving `default`s. The `Important` annotation is a good example of a well-written single-member annotation while `ScaleOfUsefulness` is not because it does not make sense to have a `comment` field and the value of the scale is unintuitive to the user. Moreover, the name is not too clear as well.
1. `TypeAnnotations.java`: Examplifying Type Annotations in a weird way.
1. `RepeatableAnnotation.java`: Examplifying Repeatable Annotations in a weird way.