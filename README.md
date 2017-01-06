#### Week 8 (Interfaces) Assignment
This week we are going to try and implement some variations to our dice that follow the SOLID principles.

##### This is the same template as last program so you will start by copying your code into this project and then adding your modifications.

You will need to create a `Die` `Interface`
Since you already have a class named `Die` you will need to rename it to something appropriate like `NumberedDie`

Once your program is free of errors after this change you will want to consider what the common interface is between all dice.

HINT HINT! they can be rolled and they have a value.

Your `Die` interface should have a method header for rolling dice similar to that which is in the new `NumberedDie` class. And a method header for getting the Die value. It is easier if you use the same names as `NumberedDie` for these.

First make `NumberedDie` implement your `Die` interface using the `implements` keyword

Now create two more classes that implement your `Die` interface for `Fudge` dice and `Loaded` dice.

A `Fudge` die has evenly distributed values for not numbers but `-` `0` `+`. They are called modifier dice because they augment the values of all the other dice by `+1` `-1` or `0`. That means that when you sum up your dice tray with different types of dice they can be included in your result by adding or subtracting these values from the whole. `Fudge` dice are usually 6 sided but for our program they can have any number of sides. You will have to determine how to make sure that the distribution of values on this kind of dice are even meaning that there are the same number of zeros as +1s and -1s for any even sided die.

A `Loaded` die has a greater probability that it will land on its "loaded" value which will be a new property you add to this class. When rolled you will have to determine how to make it land with greater probability on its loaded side.

##### Setup for Github
- Fork the repo to your personal account
- Clone your fork to your local computer
  - From Github Desktop
    - click the + on the top left
    - select clone then search for `CPT-163-27-F2015-Assignment-8-Interfaces-DiceTower` use the one under the section with your github name
  - From Command Line
    - Copy the `https` link from your fork on github.com (its below the settings button on the right hand side of the page)
    - run `git clone <copied url>` (this will create a folder the same name as the repo in the directory you ran this command)
- Create a branch on your fork of the Assignment-8 Repo using the format <github-name>/<feature_description>
  - From Github Desktop
    - Click the `Add a Branch` button (It should be the button next to the dropdown that says `master`)
    - Make sure you create your branch from master
  - From Command Line
    - run `git checkout -b <branch_name>`
- In Netbeans create a new project and set the __Project Directory__ to the folder that was created when you cloned your fork.
- Write Code!
- Create a commit
  - From Github Desktop
    - Select your fork and fill-in the commit summary
    - Click `Sync`
  - From Command Line
    - run `git add .`
    - run `git commit -m "<your commit message>"`
    - run `git push origin <your_branch_name>`
- Go to Github.com and open your PR by clicking on `Compare and Open Pull Request`
