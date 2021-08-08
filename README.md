# Java Fundamentals

## Getting Started

Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

```bash
.
└───HelloWorld
    ├───.vscode
    ├───bin
    ├───lib
    └───src
```

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

We are going to create our source code in `src` folder.

## Compilation

From your root solution folder (`HelloWord`), run the below command which will compile source code to `bin` folder

```bash
javac src/App.java -d bin
```

## Run the program

```bash
# Switch to bin directory
cd bin
#Run java application .class
java App
# Output
Hello, World
```

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
