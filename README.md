<img src="hkbu.png" width="80%" style="align:center; margin-y: 40px;margin-top: 50px"/>

## COMP2026 Problem Solving using Object Oriented Programming


# Practical Test 2

<div style="text-align:center; width:100%; display:block; margin-bottom:10px; font-size: 1.5em">
Quiz Date: 20/11/2021, 3:00pm-5:00pm<br>
Duration: 120 minutes<br>
</div>



<div style="width:70%; display:block; left:auto; right:auto; margin: auto; align:center; border: 1px solid; padding: 10px; font-size: 1.2em; padding: 50px;">

<h2> Instructions</h2>

<ul>
<li>Create a new IntelliJ project, and name it as “XXXXXXXX_ptest2” where “XXXXXXXX” is your student ID.  Save all your work in this project. </li>
<li>For submission, zip the src folder, rename the zip file to “XXXXXXXX_ptest2.zip” where “XXXXXXXX” is your student ID.  Submit this zip file to Moodle. </li>
<li>You should ensure that all your answers are included in the zip file you have submitted. No submissions would be accepted after the end of the Practical Test. </li>
<li>The duration for this Practical Test is 2 hours. </li>
<li>This is a open books, open notes test. <b>You are not supposed to make any communication with other people during the test. </b></li>
<li>Total marks: 120 (marking out of 80, with 40 marks as bonus) </li>
<li>All programs that you submit must contain comments with proper indentation. </li>
<li>All methods of <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/String.html">String class</a> can be used. <b>Unless stated in the question</b>, API that has been taught at Lab/Lecture (e.g. <code>ArrayList</code>,<code>Scanner</code>,<code>ThreadLocalRandom</code> can be used too.</li>
<li>Follow the output of the program as given by the sample program.</li>
<li><b>Warning: cheating in practical test fail the course directly and your case will be recorded by the University.</b></li>
<li>Google, check lecture notes, read stackoverflow are allowed. Asking questions on forum, texting in WhatsApp, using online IDE are not allowed.</li>
</ul>

</div>

---

<style>


        @page {
            size: A4;
                @top-center {
        font-family: sans-serif;
        font-weight: bold;
        font-size: 2em;
        content: counter(page);
        } 
        }    


/* body  {
    counter-reset: page;
} */
    @media print {
     hr { page-break-before: always; } /* page-break-after works, as well */

     
    }
    .ss  ol {
        list-style-type: lower-roman;
    }
    ans {
        display: inline ;font-weight: bold; color: blue;
        /* display:none; */
    }
    ans:before {
        content: "☑️";
        /* display:none; */
    }
  
    body {
        counter-reset: h3counter;
    }
    div.question {
        display: block;
        vertical-align: top;
    }
    h3:before {
        content: "Q" counter(h3counter) " ";
        font-weight: bold;
        counter-increment: h3counter;
    }
    h3 {
        margin-bottom: 10px;
    }
    code {
        background-color: rgba(200, 200, 200, 0.2);
    }
    .vscode-light pre {
        background-color: rgba(200, 200, 200, 0.2);
    }
    .hljs-number {
        color: initial;
        font-weight: bold;
    }
</style>




<div class=question>



### Let's make some sandwiches (40%)

In this question you are required to complete the program by carefully inspecting the file [SandwichTest.java](SandwichTest.java) and complete the program inside [SandwichRelatedClass.java](SandwichRelatedClass.java) as intended. The output of the program is given below. You are not allowed to change the class `Food` and `SandwichTest`.

#### 1. `Sauce` Class

`Sauce` has a private final String called name. Sauce objects can be mixed. When two sauces mix together, it forms a *new* sauce.  For example, BBQ sauce mixed with Masala become a new compound sauce BBQ-Masala or Masala-BBQ. Meanwhile, the original sauce will not be affected, i.e. BBQ sauce will still be BBQ sauce, Masala sauce will still be Masala sauce. When two compound sauces mix together, duplicated ingredients will be counted only once. For example, 
> BBQ-Masala + Icecream-Honey = BBQ-Masala-Icecream-Honey 
> 
> BBQ-Masala + Masala-Honey = BBQ-Masala-Honey
> 
> BBQ-Masala-Honey = Masala-BBQ-Honey = Honey-Masala-BBQ

When a sauce is printed, the ingredients of the sauce is connected with "-" symbol. 

Read `testMixingSauce()` and the output to understand more about the behavior of Sauce. You must not create any public method other than it is necessary. You must not create any additional variables inside this class. You can create as many private method as you wish.

#### 2. `Food` and `Sandwich` Class

A `Sandwich` can have any number (including 0) of `Food` objects in it. A sandwich may have no sauce or just one sauce. There are two different types of Food: Meat and Vegetable. Meat must be cooked before added to a sandwich. Vegetable cannot be cooked. The printing format of a sandwich is 
`<food1> <food2> <food3> ... sandwich` or `<food1> <food2> <food3> ... sandwich with <saucename> sauce`

The same food object cannot be added to the sandwich twice. See the output below for clarification.



```txt
Test Mixing Sauce
----------------
chili-vinegar
chili-vinegar-salt
chili-vinegar-salt

Test Make Sandwich
----------------
Print these foods out: Sausage, Cabbage
The meat is not cooked yet!
1: sandwich
2: Sausage sandwich
3: Sausage Cabbage sandwich
4: Sausage Cabbage Beef sandwich
You can't add the same food twice!
5: Sausage Cabbage Beef sandwich
6: Sausage Cabbage Beef Beef sandwich
Sausage Cabbage Beef Beef sandwich with chili-vinegar-salt sauce for $90
```

---

### Paper-Scissors-Rock again (50%)

We are redesigning paper-scissors-rock game in OO approach. Try to complete the tasks stated in the file [PaperScissorsRockClass.java](PaperScissorsRockClass.java). Note the following rules:
* You cannot add new fields to `PaperScissorsRockClass`
* You cannot modify the method `runApp()` and `main()`
* You cannot use `ArrayList` or `List` in this question
* You can reuse the code in practical test 1 if you think it is useful. See [PaperScissorsRock.java](PaperScissorsRock.java)
* Be careful of the name of each computer player. 



 **Expected output**
<pre>
In two players game - Step 1
Enter 1 for Paper, 2 for Scissor, 3 for Rock: <span style="color:blue">5</span>
Invalid input

Enter 1 for Paper, 2 for Scissor, 3 for Rock: <span style="color:blue">abc</span>
Invalid input

Enter 1 for Paper, 2 for Scissor, 3 for Rock: <span style="color:blue">1</span>
Kevin plays Paper
Step 2
Computer #1 plays Rock
Step 3
Kevin wins!

Group game
------------
Round 1
----------------
Computer #2 plays Paper
Computer #3 plays Rock
Computer #4 plays Paper
Computer #5 plays Scissor
Computer #6 plays Paper
Computer #7 plays Rock
Round 2
----------------
Computer #2 plays Rock
Computer #3 plays Scissor
Computer #4 plays Scissor
Computer #5 plays Paper
Computer #6 plays Rock
Computer #7 plays Scissor
Round 3
----------------
Computer #2 plays Rock
Computer #3 plays Paper
Computer #4 plays Paper
Computer #5 plays Rock
Computer #6 plays Paper
Computer #7 plays Paper
Round 4
----------------
Computer #2 is out
Computer #3 plays Paper
Computer #4 plays Scissor
Computer #5 is out
Computer #6 plays Scissor
Computer #7 plays Paper
Round 5
----------------
Computer #2 is out
Computer #3 is out
Computer #4 plays Scissor
Computer #5 is out
Computer #6 plays Paper
Computer #7 is out

Final Result
--------------
Computer #2 is out
Computer #3 is out
Computer #4 wins
Computer #5 is out
Computer #6 is out
Computer #7 is out</pre>

---
### File System (30%)

You are about to create a virtual file system which contains two important components `File` and `Folder`. A folder may be empty, i.e., nothing inside. A folder may also contain any number of files. A folder may also contain another folder. Each folder and file has its own name. Any file and folder under the same folder must have a unique name. You are given the file [FileSystem.java](FileSystem.java) to begin with. Write your code inside [Folder.java](Folder.java).

The demo program [demo.jar](demo.jar) is provided to you to understand program output.





</div>