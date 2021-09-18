Formatter Framework For TextConversion and Validation

Author: Gaurav Arya
Date: Sep 18, 2021

The Formatter Framework provides the following functionality:
1. A generic Formatter Interface with functions to convert String to Objects, and validate the Strings.
2. Two Implementations of the Formatter Interface in the form of NumberFormatter and DateFormatter.


Under src/main/java

The Formatter interface can be found in the com.formatter.service.intf package
he Implementations can be found in the  com.formatter.service.impl package
The Implementations may use some utilities  from the com.formatter.service.utils package

The custom objects for different Input types can be found in the com.formatter.data.model package

The com.formatter.app.Examples Class instantiates these formatters and demonstrates some examples.



The test cases can be found in the src/test/java/  inside the com.formatter.test package

The Project is built with Maven.
Use `mvn clean install` to build the project and generate the JAR.

The Jar file can be found inside the folder called target.

To run the examples, use the command, java -jar <jar-filename>.jar
 
