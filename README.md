## Policy Number Challenge

#### This is a java progam that is run from the command line and takes a txt file as an input. It parses policy numbers formatted with underscores and pipes and checks their validity. The program will output the policy number and whether or not the number is valid. 

#### Dependencies : JDK17 

If you do not you jdk17 installed, you can run ```brew install openjdk@17``` in terminal.

To run: 

1. In terminal, navigate to the directory where this repo was cloned.
2. Compile java code using ```javac PolicyNumberChallenge.java```
3. Run the program using ```java PolicyNumberChallenge <{fileName}``` for example ```java PolicyNumberChallenge <validPolicyNums.txt```

Note: In an effort to reduce dependencies and make the submission more lightweight and easier to run, I chose to go with the one java file and run from terminal via the main input method
instead of a full spring/gradle application. The test cases/txt files I used when created the program are below and included in the repo. 

```intput.txt```

```validPolicyNums.txt```

```nonValidNums.txt```

```inelligiblePolicyNums.txt```
