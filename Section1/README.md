# Java Programming Fundamentals

## Section 1 - Getting Started

We are going to learn how to write our very first program in Java to print `Hello, World!` on the terminal.
Below is the structure of our solution:

```bash
.
└───HelloWorld
    ├───.vscode
    ├───bin
    ├───lib
    └───src
```

We are going to create our source code in `src` folder.

### Compilation

From your root solution folder (`HelloWord`), run the below command which will compile source code to `bin` folder

```bash
javac src/App.java -d bin
```

### Run the program

```bash
# Switch to bin directory
cd bin
#Run java application .class
java App
# Output
Hello, World
```
