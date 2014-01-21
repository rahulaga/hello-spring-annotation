#HelloSpringAnnotation

Copyright (C) 2014 Rahul Agarwal

Sample bean wirings using Spring (4.x) and corresponding JUnit tests

HelloWorld becomes multi-lingual here and based on a specific language Greeter implementation it saysHello.

Note that all beans have the `@Component` annotation. There are two ways the beans are scanned:
- In XML `<context:component-scan base-package="com.irahul"/>`
- In `TestHelloWorldSpringNoXML` via annotation 

`HelloWorldSpring` is a simple POJO
`spring-beans.xml` defines the componet scan

`TestHelloWorldSpring`, `TestHelloWorldSpringIntegrationCustomBean` load the above context in two different ways and load the `TestGreeter`

`TestHelloWorldSpringNoXml` uses no XML at all