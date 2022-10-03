# Exceptions

Exceptions are unexpected situations that happen while a Java program is being run which can disrupt the proper functioning of the application. It only occurs at run-time and is hence a Runtime Error. The few examples of exceptions are:
- Resource allocation problems or memory issues (`ResourceAllocationException`).
- Inability to reference files (`FileNotFoundException`).
- Attempting to access the inaccessible (`NullPointerException`).
- Division by zero (`ArithmeticException`) and many more.


## Errors

The classes `Exception` and `Error` both are subclasses of the class `Throwable`. Errors are nothing but catastrophic events arising out of the runtime of a program that cannot usually be handled by our programs (we cannot as such program our application to handle them easily). It might be something that has to do with the runtime itself. It is not an anomaly like an Exception, but something more deliberate that can happen due to faulty programming or poor design.


## Exception Resolution: `try-catch-finally`

The `try-catch-finally` mechanism is Java's way of handling exceptions. The try-block traps any exception that arises, the catch-block, upon the occurence of the exception that it catches, executes the code within it. This provides a failsafe mechanism. The finally-block ensures that whatever is inside that block gets executes, notwithstanding the said exception coming into existence or not.


## Why Even Use `finally`?

Code written after the `catch` block is bound to be executed no matter what, even if it is not under a `finally` block. This begs the question as to why `finally` is even used. One answer is that it helps in the process of cleaning up resources. The real answer, however, is the fact that at times within a try block, something goes terribly wrong. That mistake causes an `Error`, instead of an `Exception`. When that happens, the code after the catch block (and the catch block itself since it is not made for `Error`s) is not executed. However, if `finally` is present, it will get executed. This is the actual reason of using this keyword.


## Pokémon Exception Handling

The style in which a single catch block is used to handle all exceptions of the `Exception` class instead of specific exceptions separately using multiple catch blocks is known as Pokémon Exception Handling. <br />
This style of programming is generally refrained from to ensure total control of code. If there are chances of potentially undiscovered errors or cases that may break the code in unprecedent ways that are not yet known, this might serve some purpose. Avoid this as much as possible. Only use it when it utter doubt.


## Programs

1. `BasicExceptionHandler.java`: Use of `try-catch` to illustrate basic exception handling.