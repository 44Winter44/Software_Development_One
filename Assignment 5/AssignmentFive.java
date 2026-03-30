import java.util.Scanner;
public class AssignementFive {
      public static void main(String[] args) throws Exception {
    Scanner Sc = new Scanner (System.in);
//DEBUGING ASSIGMENT:

/*
Referencing your homework from https://github.com/melissachodziutko/CMPT-220/blob/main/Assignment%203/Debug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/

    System.out.println("Enter your first number to be added");
    int firstInput = Sc.nextInt();
    System.out.println("Enter your second number to be added");
    int secondInput = Sc.nextInt();
    //remember this method is returning, so we need to print it out
    System.out.println(add(firstInput,secondInput));

    System.out.println("im going to print out the word Dog now.");
    printDog();
    //EXAMPLE OVER!! MY WORK!!!
    //PROBLEM 3
    //Have the user enter a number and then I will have the function make the sum of the numbers.
    System.out.println ("Enter a number and I will tell you the sum of every other number:");
    int nums = Sc.nextInt();
    problemThree (nums);
    
    //PROBLEM 2
    //Have the user enter a number and I will tell them the factorial
    System.out.println("Enter a number and I will tell you the factorial: ");
    int fact = Sc.nextInt();
     problemTwo (fact);

Sc.nextLine();
     //PROBLEM 5
     //Have the user enter a string and I will reverse it.
     System.out.println ("Enter a string so I can reverse it");
     String string = Sc.nextLine ();
      problemFive (string);


//for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
//Now you get to do it! yay!!!!!
//please go a little more complex than just simple math/simple printing for the function
//feel free to google some inspiration though :)

//This one is the CREATE A FUNCTION PART
//This will be a number guessing game!!! You have to play this game three times because why not ;)
System.out.println ("You get to play this number guessing game three times!!");
System.out.println ("Guess a number out of 10.");
for (int i = 1; i < 4; i++){
System.out.println ("You are currently on game " + i + " out of 3.");
tries();
}
System.out.println ("You have played your 3 games of guessing the numbers, I hope you had fun.");
}




    public static int add(int zyx, int tuv){
        return(zyx + tuv);
    }

    public static void printDog(){
        System.out.println("Dog");
    }
//This is my work from here down:

    //PROBLEM 3
    public static void problemThree(int x){
    System.out.println ("Problem 3:");
    int number = x;
    int ending= -1;
    int ended = 0;
    for (int i = 0; number > i; i= i +2){
    ending = ending + 2;
    ended = ended + ending;
    }
      System.out.println (ended);
    }

    //PROBLEM 2
    public static void problemTwo (int x){
        System.out.println("Problem 2");
        int factor = 1;
        int adds = 0;
    for (int i = 0; i< x; i++) {
        adds = adds +1;
        factor = factor * adds;
    }
    System.out.println (factor);
    }

//PROBLEM 5
    public static void problemFive (String x){
        System.out.println("Problem 5");
        String reverse = "";
        String strings = x;
        for (int i = strings.length() - 1; i >= 0; i--) {
            reverse = reverse + strings.charAt(i);
    }
    System.out.println (reverse);
}

//CREATE YOUR OWN FUNCTION WORK
//This works by randomly picking a number out of the array. Then the user has to try to guess the number.
// The user gets to keep guessing till they get the number right. That's what this function does.
    public static void tries(){
        Scanner Sc = new Scanner (System.in);
    System.out.println ("Enter a number to guess the randomized number:");
int guess = Sc.nextInt ();
int[] numss = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int randomIndex = (int) (Math.random() * numss.length);
int answer = numss [randomIndex];
while (guess != answer){
System.out.println ("Enter a number to guess the randomized number:");  
guess = Sc.nextInt();   
}
System.out.println ("You guessed the number, it was " + answer +".");
    
}
    }
