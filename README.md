# Manifold Example Project
## Why?
To play with [Manifold](http://manifold.systems/) from scratch and see how it works.

For a full feature example, see the official [manifold-sample-project](https://github.com/manifold-systems/manifold-sample-project).

## What?
Currently, we have 3 examples in that project:
1. JSON Schema Manifold
1. Properties Manifold
1. String Templating

To see, how it could look inside your code, see [MainApp.java](src/main/java/de/grayc/example/manifold/MainApp.java) for examples.

## How?
1. Install IntelliJ plugin for Manifold and restart IDE
1. Create empty maven project
1. Add manifold dependency:
    ```xml
        <dependency>
            <groupId>systems.manifold</groupId>
            <artifactId>manifold-all</artifactId>
            <version>${manifold.version}</version>
        </dependency>
    ```
1. Configure the compiler plugin:
    ```xml
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.0</version>

                <configuration>
                    <encoding>UTF-8</encoding>
                    <compilerArgs>
                        <arg>-Xplugin:Manifold strings</arg>
                    </compilerArgs>

                    <annotationProcessorPaths>
                        <path>
                            <groupId>systems.manifold</groupId>
                            <artifactId>manifold-all</artifactId>
                            <version>${manifold.version}</version>
                        </path>
                    </annotationProcessorPaths>

                </configuration>
            </plugin>
        </plugins>
    </build>
    ```
1. Create some JSON schemas or properties
1. Write your code and access the types via autocompletion.