# sp22-cs3060-hw

sp22: cs3060 homework

## Getting started

To make it easy for you to get started with GitLab, here's a list of recommended next steps.

Already a pro? Just edit this README.md and make it your own. Want to make it easy? [Use the template at the bottom](#editing-this-readme)!

## Add your files

- [ ] [Create](https://gitlab.com/-/experiment/new_project_readme_content:f322ccf988edb67df8b625cb991f6a03?https://docs.gitlab.com/ee/user/project/repository/web_editor.html#create-a-file) or [upload](https://gitlab.com/-/experiment/new_project_readme_content:f322ccf988edb67df8b625cb991f6a03?https://docs.gitlab.com/ee/user/project/repository/web_editor.html#upload-a-file) files
- [ ] [Add files using the command line](https://gitlab.com/-/experiment/new_project_readme_content:f322ccf988edb67df8b625cb991f6a03?https://docs.gitlab.com/ee/gitlab-basics/add-file.html#add-a-file-using-the-command-line) or push an existing Git repository with the following command:

```
cd existing_repo
git remote add origin https://gitlab.com/sanroy/sp22-cs3060-hw.git
git branch -M main
git push -uf origin main
```

## Integrate with your tools

- [ ] [Set up project integrations](https://gitlab.com/-/experiment/new_project_readme_content:f322ccf988edb67df8b625cb991f6a03?https://gitlab.com/sanroy/sp22-cs3060-hw/-/settings/integrations)

## Collaborate with your team

- [ ] [Invite team members and collaborators](https://gitlab.com/-/experiment/new_project_readme_content:f322ccf988edb67df8b625cb991f6a03?https://docs.gitlab.com/ee/user/project/members/)
- [ ] [Create a new merge request](https://gitlab.com/-/experiment/new_project_readme_content:f322ccf988edb67df8b625cb991f6a03?https://docs.gitlab.com/ee/user/project/merge_requests/creating_merge_requests.html)
- [ ] [Automatically close issues from merge requests](https://gitlab.com/-/experiment/new_project_readme_content:f322ccf988edb67df8b625cb991f6a03?https://docs.gitlab.com/ee/user/project/issues/managing_issues.html#closing-issues-automatically)
- [ ] [Enable merge request approvals](https://gitlab.com/-/experiment/new_project_readme_content:f322ccf988edb67df8b625cb991f6a03?https://docs.gitlab.com/ee/user/project/merge_requests/approvals/)
- [ ] [Automatically merge when pipeline succeeds](https://gitlab.com/-/experiment/new_project_readme_content:f322ccf988edb67df8b625cb991f6a03?https://docs.gitlab.com/ee/user/project/merge_requests/merge_when_pipeline_succeeds.html)

## Test and Deploy

Use the built-in continuous integration in GitLab.

- [ ] [Get started with GitLab CI/CD](https://gitlab.com/-/experiment/new_project_readme_content:f322ccf988edb67df8b625cb991f6a03?https://docs.gitlab.com/ee/ci/quick_start/index.html)
- [ ] [Analyze your code for known vulnerabilities with Static Application Security Testing(SAST)](https://gitlab.com/-/experiment/new_project_readme_content:f322ccf988edb67df8b625cb991f6a03?https://docs.gitlab.com/ee/user/application_security/sast/)
- [ ] [Deploy to Kubernetes, Amazon EC2, or Amazon ECS using Auto Deploy](https://gitlab.com/-/experiment/new_project_readme_content:f322ccf988edb67df8b625cb991f6a03?https://docs.gitlab.com/ee/topics/autodevops/requirements.html)
- [ ] [Use pull-based deployments for improved Kubernetes management](https://gitlab.com/-/experiment/new_project_readme_content:f322ccf988edb67df8b625cb991f6a03?https://docs.gitlab.com/ee/user/clusters/agent/)
- [ ] [Set up protected environments](https://gitlab.com/-/experiment/new_project_readme_content:f322ccf988edb67df8b625cb991f6a03?https://docs.gitlab.com/ee/ci/environments/protected_environments.html)

***




## Name
Homework 1 for CS 3060

# Description
## Program 1
The program starts with asking the user to type in 3 seperate lines of text. Before going to the next line, the user must hit enter. The lines get saved to a text file, gets read, and reports the number of characters present.

## Program 2
The program starts with asking the user for the name of a file. The program then uses several different regular expressions to read the file and check if the files contain the words "Python", "Ruby", "Haskell", "Skala". The program will output differently depending on what matches the regular expressions

## Program 3
This program contains a single function called "bar" which takes a single argument n. The function computes n^n without using the exponent operator. This program tests the number 4, 7, and 9.

## Program 4
This program prints the string "The 9-th multiple of integer n is x" except we replace n with integers 5 through 13 and we replace x with the value 9*n

## Program 5
This program is meant to simulate a coin toss. The program asks the user to pick a number between 15 and 30. The program uses a random number generator to simulate a coin toss and records the value in an array. After all the tosses have concluded, the program outputs the ratio between the number of heads and tails

## Program 6
This program has alot of details to explain. This program tracks the number of unique words in two text file stories. The program reads the files and keeps a running total of the amount of unque words present in the story. After the story concludes, it outputs the number of unique words and the third-most unique word and its frequency.

## Program 7
This part actually consists of two different programs, one in C and one in Ruby. Both programs simply output the string "Hello, class of CS 3060". Opening the executable file from the C program in a text editor shows unreadable text while the Ruby program doesn't even need a compilation step.




# Homework 2

## Task 1
The program takes a filename as an argument and checks whether the file contains any word with a capital letter and ends with a smaller letter. The program can be run with the following command

ruby task1.rb <searchFile.txt>

The <searchFile.txt> is the text file that the program checks for words with capital letters.

## Task 2

The program takes an array of strings and performs multiple different methods on the array such as 
- Uses the each method to print the last character of each string in the array

- Uses the select method to find all the strings in the array whose length are less than 4. This does not include strings whose length is 4.

- Uses the map method to build a new array where each string is changed to all uppercase versions of the strings.

- Uses the inject method to find the total length of all the strings combined. 

The program uses an array of 12 strings and passes that array into the function. 

## Task 3

This program has 2 functions present, function3A and function3B. The first function, function3A, calculates the fibonacci series iteratively. In this program, it has a preset parameter, 38, which means that function3A calculates the first 38 fibonacci numbers. the second function, function3B, does the same thing as the first function but instead of doing it iteratively, the function does it recursivly. At the end of the program, it uses Ruby's benhmarch library and compares the computation time between the 2 functions. As of testing the program, the computer being used was rather slow so the benchmark score was higher than other devices.

## task 4

In this program, we have example tree where one 'great grand-parent' is the root node where is branches out to many other grand-parents who branch out to other parents and eventually children. Part 1 of the program modifies the Tree class to recursivly create a tree using a hash but accepting a nested structure of hashes in the constructor. Part 2 of this program traverses the tree and counts the number of nodes.


## task 5

In this program, the code creates a random list of 50 shape objects using rand(). We have an abstract class called "Shape." Shape only has one attribute called "color". have two concrete classes called Octagon and Hexagon. After filling the list with the two random shape objects, we traverse the list and use polymorphism to calculate the total area of all the shape objects in the list, regardless of whether the object is a Octagon or a Hexagon. 

# Homework 3

## Task 1

In this program, we are taking 3 seperate inputs from the user. Each entry is seperated by pressing the 'Enter' key. After gathering the input, we save it to a file name "file.txt"

## Task 2

In this program, we are testing for file content. If the file content contains the words "cplus" or "ruby" then we output that the file is ok. If the file content contains "haskell" or "scala" then it outputs that the file is great. Otherwise it outputs that the file is uninteresting. 

## Task 3

In this program, we are looping through a set of number from 15 to 24. For each number we are outputting the cubic root of that number.

## Task 4

In this program, we are calculating something called a sum of powers where the base and the exponent are the same and we add up all the numbers from 1 to 10. We are are calculating 1^1 + 2^2 + 3^3 + . . . + 10^10. The final result equals 10405071317. We needed to use the 'Long' data type ot display the number.

## Task 5

In this program, we have a function called mySplit. The function taskes a string and a specific character and returns a list which is substrings of the original string from one instance of the specific character to the next.

## Task 6

In this program, we are collecting statistics on two different text stories. After reading and processing through the two stories, we print the number of unique words in story 1, then do the same for story 2, and find the fifth most frequent word in each story. I also counted the number of unique words present in both stories, and find the number of unique common words in both stories.

## Task 7

In this program, we take two lists of integers and make a list of tuples. Tuples are just lists with any data type in them. The returned list consists of lists made from the same index number of each list. So index 1 of each list gets made into a tuple. Same thing for index 2 and so on. If the lists passed in as arguments are unequal, then the function ignores the extra elements.

# Homework 4

## Task 1

In this program, we write a function foo which takes a list b of strings as input. For each string s in b,
foo uses the higher-order function map to compute the number of unique characters present in string s.
Finally, foo returns a new list containing these numbers.

## Task 2

In this program, we create a random list of 25 shape objects, then traverses the list
from start to end, and computes the total area of the shape objects. This program uses polymorphism to calculate the area. Shape is an abstract class which has only a "color" attribute whereas Circle class, and Hexagon class are concrete children of Shape class. I have a counter to keep track of the amount of Circles and Hexagons that the list creates to make sure it is generating the correct amount of shapes.

## Task 3

This program has 4 seperate parts to it.
The first part of task 3 has us take a webpage as an input and downloads it to a string. Once we have the string, we count the number of images and scripts present on the page.

The second part of the program does the same thing as part a but instead of doing one webpage it does the inputted webpage plus all the other embedded webpages and returns the number of images.

The third part of the program is counting how many webpages have more than 50 characters.

The last part is the same as part b except we take advantage of the parallel programming capabilities in Scala

# Homework 5

## Task 1

This program is simple. In this program we are simply printing a hello message with my name on it and saying that i am good.

## Task 2

In this program, we wrote a function that accepts a list of integers and returns another list which filters out the integers who aren't a multiple of 3 or 5. So integers like 10, 15, 21, and 25 would remain in the list. Integers like 2, 7, 16, and 29 would be filtered out.

## Task 3

In this program, we wrote a function which accepts a list of integers and returns a single integer x where x is the number of perfect squares in the list.

## Task 4

In this program we wrote a function named toDigitList which accepts a single integer. When the integer gets passed into the function, each digit of the integer gets turned into a string and returned. This only works with integers greater than 0. If the integer passed in is 0, then the function will return a list with one integer, 0.

# Homework 6

## Task 1 - 3 parts

In part 1 of task 1, we are writing a function which takes 2 integers as input and returns the sum of all the even numbers in between those 2 integers. We use foldl to complete these task.

In part 2, we write a function which takes a word as input and returns a tuple with variables (c1, c2). c1 counts the number of vowels and c2 counts the number of consonants

In part 3, we write a function which takes a list of strings as input and counts how many strings have lengths less than 4.

# Task 2 - 3 parts

In this task we are referring to the user defined types CARD and HAND in the textbook

In part 1 of task 1 we write a function which takes 2 cards as input and returns which card has the higher value. If there is a tie then either card is returned.

In part 2, we write a function which takes a hand as input and computes the product of all the values of the cards in that hand

In part 3, we write a function similar to part but instead of return the card with the higher value, we return the hand with the higher value

# Task 3 - 3 parts

In this task we are creating 2 different data types: SONG and ALBUM

In part 1 of task 3, we are creating 3 song variables which set attributes in each song

In part 2, we are creating the album data type. Once the data type is made, we create an album variable and store those 3 songs in the album.

In part 3, we are writing a function called contains which takes a song and album as input. In the function we test if the song passed in is in the album that was passed and returns True or False.



## Project status
This project is currently finished but some of the code could be written cleaner and nicer. 

