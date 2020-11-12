# cs101f2020-lab07

## DUE: November 12 by 3pm

[![Actions Status](../../workflows/build/badge.svg)](../../actions)

## Table of Contents

- [Objectives](#objectives)
- [Introduction](#introduction)
- [Continuous Learning](#continuous-learning)
- [Program Requirements](#program-requirements)

- [Expected Program Output](#expected-program-output)

- [System Commands](#system-commands)

  - [Using Docker](#using-docker)
  - [Using Gradle](#using-gradle)

- [Using GitHub Actions CI](#using-github-actions-ci)

- [Reporting Problems](#reporting-problems)

- [Receiving Assistance](#receiving-assistance)

- [Lab Assessment](#lab-assessment)

## Objectives

You will complete a programming project using source code provided in the textbook and by the course instructor, in addition to your own, ultimately implementing a framework for experimentally evaluating methods of a `SinglyLinkedList`. Specifically, you will implement and test several methods of a node-based data structure and then implement your own recursive method on a `SinglyLinkedList` data structure. Then, you will conduct experiments to evaluate the efficiency of its `toString` method and your developed recursive method. You will also practice creating a data table and calculating an order-of-growth ratio, honing your ability to analytically and empirically evaluate the worst-case time complexity of an algorithm. Finally, you will continue to learn how to use JUnit to implement and test a data structure and use an automated grading tool to assess your progress towards correctly completing the entire project.

## Introduction

Designed for use with [GitHub Classroom](https://classroom.github.com/) and [GatorGrader](https://github.com/GatorEducator/gatorgrader/), this repository contains the starter files for a laboratory assignment seven in a Data Abstraction introductory computer science class that uses the Java programming language. 

This assignment requires a programmer to implement and test a benchmarking framework that supports the empirical evaluation of the `SinglyLinkedList`'s method that produces a textual representation of its contained data and a recursive method of a programmer's choice. Please note that this assignment will also require you to read and use Java classes that contain a test suite. Specifically, the programmer is responsible for learning how to run and extend a test suite written in the JUnit testing framework, as explained in Section 1.9\. As verified by [Checkstyle](https://github.com/checkstyle/checkstyle), the source code for all of the Java classes must adhere to all of the requirements in the [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html).

The programmer completing this assignment is also responsible for writing a multiple-paragraph reflection, stored in the file `writing/reflection.md`, that explains the challenges that you faced and the solutions you developed. This is a Markdown file that should adhere to the standards described in the [Markdown Syntax Guide](https://guides.github.com/features/mastering-markdown/). Don't forget that your `writing/reflection.md` file should adhere to the Markdown standards established by the [Markdown linting tool](https://github.com/markdownlint/markdownlint).

## Continuous Learning

If you have not done so already, please read all of the relevant [GitHub Guides](https://guides.github.com/) that explain how to use many of the features that GitHub provides. In particular, please make sure that you have read the following GitHub guides: [Mastering Markdown](https://guides.github.com/features/mastering-markdown/), [Hello World](https://guides.github.com/activities/hello-world/), and [Documenting Your Projects on GitHub](https://guides.github.com/features/wikis/). Each of these guides will help you to understand how to use both [GitHub](http://github.com) and [GitHub Classroom](https://classroom.github.com/).

Students who want to learn more about how to use [Docker](https://www.docker.com) should review the [Docker Documentation](https://docs.docker.com/). Students are also encouraged to review the documentation for their text editor, which is available for text editors like [Atom](https://atom.io/docs) and [VS Code](https://code.visualstudio.com/docs). You should also review the [Git documentation](https://git-scm.com/doc) to learn more about how to use the Git command-line client. In addition to talking with the instructor and technical leader for your course, students are encouraged to search [StackOverflow](https://stackoverflow.com/) for answers to their technical questions.

To do well on this assignment, you should also read Section 1.5.2 to learn more about iteration constructs. You should further review Sections 4.1 to 4.3, focusing on the content that explains the steps of both an analytical and an empirical evaluation of an algorithm. Please read all of the content and study all of the technical diagrams and source code segments in Section 3.2\. Finally, please refer to Section 5.1 to see examples of recursive functions.

## Program Requirements

There are many "TODO" markers inside of the provided Java source code. Ultimately, it is your responsibility to read each of these and provide the required Java source code

In this assignment, you will implement, test, and experimentally study a complete implementation of the `SinglyLinkedList` data structure. Some of the missing source code in the provided implementation can be found in Code Fragments 3.14 and 3.15 in the textbook. Please recall that the source code in the textbook does not adhere to the Checkstyle standards and thus you will have to improve the source code from Code Fragments 3.14 and 3.15.

Next comes a creative component. After you complete implementation of the `SinglyLinkedList` data structure, you need to implement a recursive method of your choice using `SinglyLinkedList`. You may just decide to implement one of the `SinglyLinkedList` existing methods as a recursive function, for instance, adding to the front or the end of the `SinglyLinkedList` could be done using a recursive method. Alternatively, you may decide to implement a new functionality, such as searching `SinglyLinkedList` or reversing it. Additionally, section 5.1 provides some other examples of recursive functions. This recursive method should be added to the `SinglyLinkedList` class.

Once the program runs and the tests pass, please reflect on this process. You should write your reflections in a file called `writing/reflection.md`. To complete this assignment part, you should write one paragraph that reports on your experiences. Your `writing/reflection.md` file should have answers to the questions about the `SinglyLinkedList`'s implementation, testing, and experimental evaluation; please provide your data table in a Markdown-based fenced code block. Here are some of the technical questions that you should aim to answer during the completion of this laboratory assignment:

1. For the chosen input sizes in the results table, can you characterize the performances of the `toString` and your recursive methods? Using your results table, how can you tell if each of these methods is fast or not?

2. Using the Big-Oh notation, what is the worst-case time complexity for the `toString` method? What about your recursive method?

3. Why is the `SinglyLinkedList` designed to contain both a `Node` class and object inside of it?

## System Commands

This project invites students to enter system commands into a terminal window. This assignment uses [Docker](https://www.docker.com) to deliver programs, such as `gradle` and the source code and packages needed to run [GatorGrader](https://github.com/GatorEducator/gatorgrader), to a students' computer, thereby eliminating the need for a programmer to install them on their development workstation.

### Using Docker

Once you have installed [Docker Desktop](https://www.docker.com/products/docker-desktop), you can use the following `docker run` command to start `gradle grade` as a containerized application, using the [DockaGator](https://github.com/GatorEducator/dockagator) Docker image available on [DockerHub](https://cloud.docker.com/u/gatoreducator/repository/docker/gatoreducator/dockagator).

```bash
docker run --rm --name dockagator \
  -v "$(pwd)":/project \
  -v "$HOME/.dockagator":/root/.local/share \
  gatoreducator/dockagator
```

The aforementioned command will use `"$(pwd)"` (i.e., the current directory) as the project directory and `"$HOME/.dockagator"` as the cached GatorGrader directory. Please note that both of these directories must exist, although only the project directory must contain something. Generally, the project directory should contain the source code and technical writing of this assignment, as provided to a student through GitHub. Additionally, the cache directory should not contain anything other than directories and programs created by DockaGator, thus ensuring that they are not otherwise overwritten during the completion of the assignment. To ensure that the previous command will work correctly, you should create the cache directory by running the command `mkdir $HOME/.dockagator`.

If you are running your program on a Windows Operating System, you should run the following command instead, replacing the word "user" with the username of your machine:

```bash
docker run --rm --name dockagator -v "%cd%":/project -v "C:\Users\user/.dockagator":/root/.local/share gatoreducator/dockagator
```

Here are some additional commands that you may need to run when using Docker:

- `docker info`: display information about how Docker runs on your workstation
- `docker images`: show the Docker images installed on your workstation
- `docker container list`: list the active images running on your workstation
- `docker system prune`: remove many types of "dangling" components from your workstation
- `docker image prune`: remove all "dangling" docker images from your workstation
- `docker container prune`: remove all stopped docker containers from your workstation
- `docker rmi $(docker images -q) --force`: remove all docker images from your workstation

### Using Gradle

Since the above `docker run` command uses a Docker image that, by default, runs `gradle grade` and then exits the Docker container, you may want to instead run the following command so that you enter an "interactive terminal" that will allow you to repeatedly run commands within the Docker container.

In Linux and Mac OS:

```bash
docker run -it --rm --name dockagator \
  -v "$(pwd)":/project \
  -v "$HOME/.dockagator":/root/.local/share \
  gatoreducator/dockagator /bin/bash
```

In Windows OS (replace `user` with your machine's username):

```bash
docker run -it --rm --name dockagator -v "%cd%":/project -v "C:\Users\user/.dockagator":/root/.local/share gatoreducator/dockagator /bin/bash
```

Once you have typed this command, you can use the [GatorGrader tool](https://github.com/GatorEducator/gatorgrader) in the Docker container by typing the command `gradle grade` in your terminal. Running this command will produce a lot of output that you should carefully inspect. If GatorGrader's output shows that there are no mistakes in the assignment, then your source code and writing are passing all of the automated baseline checks. However, if the output indicates that there are mistakes, then you will need to understand what they are and then try to fix them.

You can also complete several important Java programming tasks by using the `gradle` tool. For instance, you can compile (i.e., create bytecode from the program's source code if it is correct) the program using the command `gradle build`. Here are some other commands that you can type:

- `gradle grade`: run the [GatorGrader](https://github.com/GatorEducator/gatorgrader) tool to check your work
- `gradle clean`: clean the project of all the derived files
- `gradle check`: check the quality of the code using Checkstyle
- `gradle build`: create the bytecode from the Java source code
- `gradle run`: run the Java program in the command-line
- `gradle cleanTest`: clean the JUnit test suite of derived files
- `gradle test`: run the JUnit test suite and display the results
- `gradle tasks`: display details about the Gradle system

To run one of these commands, you must be in the main (i.e., "home base") directory for this assignment where the `build.gradle` file is located.

## Expected Program Output

Typing the command `gradle run` in the terminal window should produce output similar to the one below, except the reported timing and ratio values will vary.

```bash
> Configure project :
Configured GatorGradle 0.5.1

> Task :run
Starting a campaign of experiments with toString ...
  Running round 0 with input size 10
  Running round 1 with input size 20
  Running round 2 with input size 40
  Running round 3 with input size 80
  Running round 4 with input size 160
  Running round 5 with input size 320
  Running round 6 with input size 640
  Running round 7 with input size 1280
  Running round 8 with input size 2560
  Running round 9 with input size 5120
  Running round 10 with input size 10240
  Running round 11 with input size 20480
  Running round 12 with input size 40960
  Running round 13 with input size 81920
  Running round 14 with input size 163840
... Finishing a campaign of experiments with toString

Results of an experiment campaign
Size (#)        Timing (ms)     Ratio (#)
10              0               0
20              0               0
40              0               0
80              0               0
160             0               0
320             0               0
640             0               0
1280            1               0
2560            1               1
5120            1               1
10240           2               2
20480           3               2
40960           4               1
81920           3               1
163840          13              4

Starting a campaign of experiments with recursive ...
  Running round 0 with input size 10
  Running round 1 with input size 20
  Running round 2 with input size 40
  Running round 3 with input size 80
  Running round 4 with input size 160
  Running round 5 with input size 320
  Running round 6 with input size 640
  Running round 7 with input size 1280
  Running round 8 with input size 2560
  Running round 9 with input size 5120
  Running round 10 with input size 10240
  Running round 11 with input size 20480
  Running round 12 with input size 40960
  Running round 13 with input size 81920
  Running round 14 with input size 163840
... Finishing a campaign of experiments with recursive

Results of an experiment campaign
Size (#)        Timing (ms)     Ratio (#)
10              0               0
20              0               0
40              0               0
80              0               0
160             0               0
320             0               0
640             0               0
1280            0               0
2560            1               0
5120            0               0
10240           1               0
20480           1               1
40960           2               2
81920           2               1
163840          3               2
```

## Using GitHub Actions CI

This assignment uses [GitHub Actions CI](https://github.com/features/actions) to automatically run [GatorGrader](https://github.com/GatorEducator/gatorgrader) every time you commit to your GitHub repository. The checking will start as soon as you have accepted the assignment -- thus creating your own private repository. If you do not see either a yellow ● or a green ✔ or a red ✗ in your listing of commits, then please contact the instructor.

## Reporting Problems

If you have found a problem with this assignment's provided source code or documentation, then you can go to the [Computer Science 101 Fall 2020 Lab 07](https://github.com/allegheny-computer-science-101-f2020/lab07-solution) repository and [raise an issue](https://github.com/allegheny-computer-science-101-f2020/lab07-solution/issues). If you have found a problem with the [GatorGrader tool](https://github.com/GatorEducator/gatorgrader) and the way that it checks your assignment, then you can also [raise an issue](https://github.com/GatorEducator/gatorgrader/issues) in that repository. To ensure that your issue is properly resolved, please provide as many details as is possible about the problem that you experienced. If you discover a problem with the assignment sheet for this project, then please raise an issue in the GitHub repository that provides the assignment sheets for your course.

Whenever possible, individuals who find, and use the appropriate GitHub issue tracker to correctly document, a mistake in any aspect of this assignment will receive free [GitHub stickers](https://octodex.github.com/) and extra credit towards their grade for the project.

## Receiving Assistance

If you are having trouble completing any part of this project, then please talk with either the course instructor or a student technical leader during the lab session. Alternatively, you may ask questions in the Slack workspace for this course. Finally, you can schedule a meeting during the course instructor's office hours.

## Lab Assessment

The grade that a student receives on this assignment will have the following components:

- **Percentage of Correct GatorGrader Checks [up to 70% of the lab grade]**: Students are encouraged to repeatedly try to implement a Java program that passes all of GatorGrader's checks by, for instance, creating a program that produces the correct output. Students should also repeatedly revise their technical writing to ensure that it also passes all of GatorGrader's checks about, for instance, the length of its content and its appropriate use of Markdown.

- **GitHub Actions CI Build Status [up to 10% of the lab grade]**: Since additional checks on the source code and/or technical writing may be encoded in GitHub Actions CI's actions and, moreover, all of the GatorGrader checks are also run in GitHub Actions CI, students will receive a checkmark grade if their last before-the-deadline build passes and a green ✔ appears in their GitHub commit log instead of a red ✗. As with the previous grading component, students are encouraged to repeatedly revise their source code and technical writing in an attempt to get their GitHub Actions CI build to pass.

- **Mastery of Technical Writing [up to 10% of the lab grade]**: Students will also receive a portion of their grade when the responses to the technical writing questions presented in the `writing/reflection.md` reveal a mastery of both writing skills and technical knowledge. To receive a checkmark grade, the submitted writing should have correct spelling, grammar, and punctuation in addition to following the rules of Markdown and providing technically accurate answers. Students are encouraged to ask the course instructor or a student technical leader to use the GitHub issue tracker to provide feedback on their mastery of technical writing skills. All members of the team are expected to contribute to the reflection document.

- **Mastery of Technical Knowledge and Skills [up to 10% of the lab grade]**: Students will receive a part of their grade when their GitHub repository reveals that they have mastered all of the technical knowledge and skills developed during the completion of this project. As a part of this grade, the instructor will assess aspects of the project including, but not limited to, the use of effective source code comments and Git commit messages. Students are encouraged to ask the course instructor or a student technical leader to use the GitHub issue tracker to provide feedback on how well their work demonstrates mastery of the assignment's technical knowledge and skills. All members of the team are expected to contribute to the technical implementation of the lab.

All grades for the assignments in this course will be reported through Canvas. Feedback on lab assignments will be provided through a student's GitHub repository using the comment in the "Feedback" pull request.
