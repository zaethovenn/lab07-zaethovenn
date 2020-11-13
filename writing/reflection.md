# Reflection zackery devers

## Using a fenced code block, please display the output from running the experiment

Please provide a fenced code block.

```bash
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
1280            0               0
2560            0               0
5120            0               0
10240           2               0
20480           3               2
40960           5               2
81920           3               1
163840          6               2

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
40960           1               1
81920           1               1
163840          4               4
```

## Using a fenced code block, please provide the output from running your test suite

Please provide a fenced code block.

```bash
> Task :test

labseven.TestResultsTable > testConstructResultsTableNotNull PASSED

labseven.TestResultsTable > testResultsTableContainsOneRow PASSED

labseven.TestResultsTable > testResultsTableContainsTwoRows PASSED

labseven.TestResultsTable > testResultsTableToStringDoesNotCrashWithTwoRows PASSED

labseven.TestResultsTable > testResultsTableContainsRatio PASSED

labseven.TestResultsTable > testResultsTableContainsRatioWithZeroValues PASSED

labseven.TestSinglyLinkedList > testConstructSinglyLinkedListNotNull PASSED

labseven.TestSinglyLinkedList > testConstructSinglyLinkedListCorrectInitialState PASSED

labseven.TestSinglyLinkedList > testSinglyLinkedListAfterAddFirst PASSED

labseven.TestSinglyLinkedList > testSinglyLinkedListAfterAddFirstAndRemoveFirst PASSED

labseven.TestSinglyLinkedList > testSinglyLinkedListAfterAddLast PASSED

labseven.TestSinglyLinkedList > testSinglyLinkedListAfterAddLastAndRemoveFirst PASSED

labseven.TestSinglyLinkedList > testSinglyLinkedListAfterAddFirstAddLast PASSED

labseven.TestSinglyLinkedList > testSinglyLinkedListAfterAddLastAddFirst PASSED

labseven.TestSinglyLinkedList > testSinglyLinkedListAfterAddFirstAddFirst PASSED

labseven.TestSinglyLinkedList > testSinglyLinkedListAfterAddLastAddLast PASSED

labseven.TestSinglyLinkedList > testToStringDoesNotReturnNull PASSED

labseven.TestSinglyLinkedList > testAddManyStringsToLinkedListWithAddFirst PASSED

labseven.TestSinglyLinkedList > testAddManyStringsToLinkedListWithAddLast PASSED

labseven.TestSinglyLinkedList > testAddManyStringsToLinkedListWithAddFirstAndAddLast PASSED

labseven.TestSinglyLinkedList > testAddManyStringsToLinkedListWithAddLastAndThenRemove PASSED

labseven.TestSinglyLinkedList > testAddManyStringsToLinkedListWithAddFirstAndThenRemove PASSED

BUILD SUCCESSFUL in 5s
```

## Why does the `SinglyLinkedList` contains a `Node` class inside of it?

Please provide a response to this question.

A SinglyLinkedList contains nodes because a singly linked list is full of nodes that contain the current position, the data inside it, and the next nodes location. The singly linked lists only go unidirectional so the nodes help you move fluidly between eachother.

## Why is the `Node` class "nested" inside of the `SinglyLinkedList<E>`?

Please provide a response to this question.

The node class is nested inside the SinglyLinkedList<E> because this is where you configure the node to work with the singlylinkedlist. when it is nested like this it is easier to call and use the data stored in the list.

## For the chosen input sizes, what is the efficiency of `toString`? Use both the results of your experiments and big Oh notation.

Please provide a response to this question.

## For the chosen input sizes, what is the efficiency of your implemented recursive method? Use both the results of your experiments and big Oh notation.

Please provide a response to this question.

## After completing this assignment, what is a task that you want to practice more? Why?

I want to practice the implementation of more complex algorithms into my programs. Complex algorithms are the crux of increadibly impressive and interesting programs spanning from Artificial intelligence to operating systems and they can be seen truly in every digital aspect of every day life. The ability to not only understand but excel in the creation and implementation of algorithms is the foundation of becoming a well rounded computer scientist.

## What challenges did you face during this assignment? How did you handle them?

It is challenging to figure out how to effectively build algorithms that handle the data given them and are able to run with the ideal effenciency. As with any new mathmatic subject, these algorithms will take practice to understand, yet after enough work, they will be easy to formulate and make efficient.

## After completing this assignment, what is one experience for which you are grateful?

I am definently greatful for the ability to learn about how to optimize algorithms. Algorithm optimization is crucial in building an intricite, efficient, and user friendly program. It is great to know that there are means of optimization and testing that optimization.

## If you worked in a team, please describe your team work experience. Specifically, please provide details on how to worked on this assignment as a team.

Please provide a response to this question.
