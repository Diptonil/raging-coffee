# The Java Logging API

At times when code written inadvertently runs into all sorts of issues that are hard to debug just by reading it or Googling the error message (or at times when the output is seemingly unjustified), we may try to manually print out the results at certain points where we thing the code might be at fault. Such points in a program are called *breakpoints*. However, at times using multiple print statements might be unfeasible because they are too much of work with a very ineffective result. <br />
This is one of the many uses of setting up a *logging architecture* within the codespace. It performs a job similar to the manual console printing, but in a more elegant way as well as tackling a lot of other features. The reason why logging is an important need can be given as:
- **Elegance in managing errors**: Logging to console is a good way to deal with errors by using sophesticated tools given in an API as opposed to the bulk usage of populating the codebase with unnecessary console print statements. Moreover, that is a sign of extreme novice programming.
- **To know the state of running applications**: Logs can be produced continuously upon being triggered by certain events and stored in a file to be viewed separately. This gives an idea of the frequently used parts of the application as well as stress-points, if any.
- **Categorising events**: Logs may be used to categorise events by coding them with levels of fine, info, config, error and severe situations. This can be used to class certain events that we want to keep an eye on or even may need to work on later.
- **Tagging parts of code**: Certain parts of code might need to be tagged in their execution. We can use comments to tag certain parts of code that we need to work on *in the source*. However, to make such markers in the runtime, logging might be helpful.<br />
To understand and apply JUL (Java Utility Logging) succinctly, the following discussion shall prove to be sufficient and complete.


## Significance of Singleton Design Pattern

- The `Logger` class is based on the Singleton design pattern (look at the `designpatterns` section for more info on this). The Java logging architecture can *primarily* be built with the `Logging` class, Handler classes and the `Level` class (there can be a lot more variations and additions, which is relative to the kind of project being made). We have `LogManager` for overall global record-keeping of the logs, Formatters for presenting log summary in different forms.
- The Singleton design pattern is significant to this discussion because throughout the whole course of the runtime, the `Logger` class is expected to respond to the logging calls made by the system and generate a corresponding `LogRecord`, which is the entity that gets streamed. Now, it is important to note that throughout the whole runtime, the state of the `Logger` object does not undergo any change in its attributes or behaviours. It is the `Handler` that is responsible to stream out the logs at different locations at different times.
- Basically, the singleton design pattern states that no matter how many times an object is made, the reference to the previously existing object (which is always just one in number throughout the runtime) is returned. The reason is efficient utilization of memory, since useless instantiation of objects is not really needed when one object capable of fulfilling that same utility already exists.
- This is why the design of a logger is singleton.


## Logging Architecture

- **Logger**: The main entity on which applications make logging calls. A Logger object is used to log messages for a specific system or application component.
- **LogRecord**: Used to pass logging requests between the logging framework and individual log handlers.
- **Handler**: Exports `LogRecord` objects to a variety of destinations including memory, output streams, consoles, files, and sockets. A variety of Handler subclasses exist for this purpose. Additional Handlers may be developed by third parties and delivered on top of the core platform.
- **Level**: Defines a set of standard logging levels that can be used to control logging output. Programs can be configured to output logging for some levels while ignoring output for others.
- **Filter**: Provides fine-grained control over what gets logged, beyond the control provided by log levels. The logging APIs support a general-purpose filter mechanism that allows application code to attach arbitrary filters to control logging output.
- **Formatter**: Provides support for formatting `LogRecord` objects. This package includes two formatters: `SimpleFormatter` and `XMLFormatter`, for formatting log records in plain text or XML respectively. As with Handlers, additional Formatters may be developed by third parties.


## Defined Levels of Logging

- The `Level` class in the API is used to deal with the classification of the log message levels.
- The `log(Level level, String logMessage)` method takes in the first parameter as a constant from the `Level` class.
- The log messages generated may be classed at different levels. The general classsification of the constants is:
    - **Level.SEVERE** (value: 1000): Indicates some serious failure.
    - **Level.WARNING** (value: 900): Potential problem. 
    - **Level.INFO** (value: 800): General Info.
    - **Level.CONFIG** (value: 700): Configuration Info.
    - **Level.FINE** (value: 500): General developer info.
    - **Level.FINER** (value: 400): Detailed developer info.
    - **Level.FINEST** (value: 300): Specialized developer info.
- Instead of using the constants in the `log()` method, we may use specialised methods as well like: `severe(String logMessage)`, `info(String logMessage)`, `finer(String logMessage)`, etc.
- By default, a `Logger` object is set to handle just the severe, warning and info log messages. This means that if we try to display any message with levels lower than specified, the console won't display it. For this, we need to do either of this:
    - Create a configuration file to specify how the outputs are to be shown. This is recommended for larger projects with more standard rules
    - Use a `Handler`. This is recommended mostly for localised use in which alteration of global logging configuration is acceptable.


## Analyzing Log Messages

- We can change the format in which the logs come out with the use of Formatters.
- By default, we can see the following fields with the use of the `SimpleFormatter`:
    - Date and time
    - Source
    - Method
    - Log level
    - Message


## Handlers

We use Handlers explicitly in our programs when we want to override the global specifications (if any) to set up customised log rules for a particular source file (which may be helpful in case a particular file has a penchant for erring or has been written with uncertainties). here are some Handlers:
- **StreamHandler**: A simple handler for writing formatted records to an OutputStream.
- **ConsoleHandler**: A simple handler for writing formatted records to `System.err`.
- **FileHandler**: A handler that writes formatted log records either to a single file, or to a set of rotating log files. The object is created with the following parameters: file path (starting from the `java` directory in `src/main`), file size, file counts, boolean if we want to append logs to old log file. Using this doesn't mean the default log handling behaviour would change. Formatting is in XML by default.
- **SocketHandler**: A handler that writes formatted log records to remote TCP ports.
- **MemoryHandler**: A handler that buffers log records in memory. When the internal buffer is full, new LogRecords start overwriting the oldest ones in the buffer. When a certain trigger event occurs, the LogRecord's in the internal buffer are flushed to a target Handler which will write the LogRecords to an external system. For instance, when a LogRecord of some minimum log level is logged, the whole buffer of LogRecord's could get pushed.<br />
To use a Handler, we just instantiate it, set the required properties to it and then set the `Handler` to the `Logger` object. Check out the second program.


## Configuration File

The configuration file for a particular project is used to specify certain observed conventions and configurations that the project observes. It can be thought of as a settings file for the entire project. <br />
Since the logging architecture that we would choose to use would be general for all the source files of the projects (with certain exceptions that can easily be resolved with the use of Handlers in required classes), we can just specify the type of settings with respect to logs in here in the `java.util.logging.config.file`.
- To set the logging level to a custom amount, use `java.util.logging.ConsoleHandler.level = FINER`.


## Formatters

They are used to alter the format of the logs to be put out by the Handlers. They are attached to the Handlers itself. By default, the `SimpleFormatter` is attached to the `ConsoleHandler` and the `XMLFormatter` is attached to the `FileHandler`. We may easily change this behaviour. Examples have been given in programs.
- The `XMLFormatter` formats in XML. The logs are displayed in manner of: date and time, sequence in which logs appeared, level, occurring class and method and error message. It can be useful at times when the logs are parsed automatically using some tool for monitoring.
- The `SimpleFormatter` is used more often due to its readability and ease fo comprehension. 
- We may also choose to use our self-made custom formatters in case we need our logs to be more specific and customised (in cases when a certain project convention is being followed). An example has been given as well.


## Filters

- They are used to act as a keep for permitting the logs to be passed out to the output stream that the handler manages. They are responsible to allow or reject logs that flow through. We generally make use of `Filter`s only when we need to limit the logs from spamming a particular stream (via the Handler). This is especially useful when logs get generated but get handled by different handlers and are expected to be handled in different ways. An example is shown in the programs in this directory.
- It is an interface, not a class. It is the only interface used in this API.


## LogRecords

- `LogRecord` is each individual log entry that gets handled by the handlers, filters, etc.
- All log operations done by overriding certain methods of the filters and formatters are done on these objects.
- There are methods like `getMessage()`, `getLevel()`, `getParameters()`, `getMillis()`, et cetera for getting the associated values from the object.


## Pros of the Default Logging API

- We do not need to worry about any external dependencies.
- Learning other fancier frameworks like Log4J, Logback, etc. for projects not needing such architectures is not needed.
- Very simple & lightweight to implement and learn. gets the job done with just the right amount of tools.


## Cons of the Default Logging API

- Logging frameworks offer way too many advantages at a granular level to overlook in the development journey of a large-scale project. Whatever the Java Utility Logging API can do, the others can do as well - better, even.
- The default Java logger is extremely outdated and does not have integrations with modern practices.
- Formatting can only be done for XML. No support for YAML, HTML and JSON formats, which is a big problem.
- No in-built pattern support for customising logs. Instead of having to rely on the framework to do the heavy-lifting in that regard, programmers need to resort to tradiational use of Strings or Regex to manipulate the messages.


## Programs

1. `SimpleLogger.java`: Exhibit the simplest use case of console logging functionality using the standard and specialised log methods for severe, warning and info levels. This does not print out to any log files, of course.
1. `ConsoleHandlerLogger.java`: Create and display logs to the console upto the finest level by using a `Handler`.
1. `DisabledDefaultLogger.java`: In the previous example, we see that the logs of the levels SEVERE, WARNING and INFO appear twice. This means that apart from the Handler that we are making, some default Handler is also running alongside. This would lead to more resource usage and unwanted cluttering. This behaviour is due to the default console Handler being attached to the parent of all loggers. We need to set this exact behaviour of using parent handlers off. This way is described here.
1. `FileHandlerLogger.java`: Create and display logs to a file (`logs.txt`) upto the finest level by using a `Handler`.
1. `BufferToConsoleHandlerLogger.java`: Create and display logs to a file (`logs.txt`) in this same directory upto the finest level by using a `Handler` only when the buffer is full and thus the logs get flushed to the file only when a certain level of log occurs (as parametrized in the constructor of `MemoryHandler`), upto the number of logs to fetch that had been defined.
1. `XMLFormattedConsoleLogger.java`: Set the console to display logs in the XML format, as opposed to the traditional way.
1. `SimpleFormattedFileLogger.java`: Set the logfile to display logs in the traditional format, as opposed to the XML way.
1. `CustomFormattedLogger.java`: Extend the `Formatter` class and override a certain `format()` method to customise log messages.
1. `CustomFilteredLogger.java`: Assuming a case where a logger has two handlers attached - one to the console and another to a file. The goal is to log only to the console if the String "FILE:" is not present in the log. If it is present, logs go both ways.