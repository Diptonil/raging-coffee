# Annotations

- At a core level, this concept introduced in JDK 5 is used similar to a metadata provision. It enables us to embed supplemental information in a source file.
- It can be said as a tag representing metadat in different sophesticated ways.
- It does not change the actions or semantics of a program. This information that we have can be used for development or deployment. It might be processed using a source-code generator.
- Annotations cannot have an `extends` clause when being defined. They extend the `Annotation` super-interface within `java.lang.annotations`.
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


## Default Values in Annotations

At times we want to define annotations that have default values. In such cases, while using them, we don't need to explicitly metion their data unless we want to overload the defaults. In such cases, we use default values.


## Marker Annotations

- 


## Programs

1. `SimpleAnnotation.java`: To show how basic annotations are created and used.
1. `ReflectiveAnnotation.java`: To illustate the simple use of obtaining the annotated data by a class at runtime. This process exclusively is done using the `Annotation` class under the assumption that we do not know anything about the annotation being used for any of the methods or classes or whatever. We just know the target class and its methods. This program draws annotation data of methods without any parameters passed.
1. `ReflectiveKnownAnnotation.java`: To illustate the simple use of obtaining the annotated data by a class at runtime. This process exclusively is done using the annotation class under the assumption that we know everything about the annotation being used for the methods or classes or whatever. We also know the target class and its methods. This program draws annotation data of methods with multiple parameters passed.
1. `AllAnnotation.java`: To illustrate extraction of all annotated data of class and methods separately at runtime. The `getAnnotations()` (note the plural form) method returns an array of `Annotations` of all the respective annotations that have been applied to the method or class.
1. `DefaultAnnotation.java`: To illustrate default annotations.