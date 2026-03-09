import java.util.Scanner;
public class Quiz{
public static void main(String[] args) throws Exception {
Scanner input =new Scanner (System.in);
//Quiz game to figure out what animal you are based on your day to day choices.
//The five animals will be a snake, lion, otter, beaver, and golden retriever
//This quiz will ask the user questions and sort them into a category based off of
//their answers to the multiple choice quiz questions.

//Lets start by having the user enter their name and a guess at what they think 
//they will be.
System.out.println ("");
System.out.println ("Welcome to this mini quiz, where I your little friend, Nova will ask you questions and you will answer.\n" +
 "I will then use your answer to figure out what animal category you fall into.\n"+
  "The five different categories are the Snake, Lion, Otter, Bever, and golden retriever.");
System.out.println ("");
System.out.println ("For each question type in the letter of the answer you most identify with.");
System.out.println ("For this quiz please enter your name");
String name = input.nextLine();
String nameOne = name;


//There will be an error later and if the user can't solve the error with answering a question in three
//tries they will have to star the quiz over again. Because if I have to code this all the user has to suffer too
//heheheh ;)
boolean die = true;

//Variables that will store the info about the points leading to the different types
//of animals that someone can be
int Lion = 0;
int Otter = 0;
int Beaver = 0;
int Snake = 0;
int Golden = 0;

while (die){
//Restarting the variables for question answers in case the user can't solve the error (Because apparently 
// if they are declared in the while it will give me an error when I try to use the vareable outside
//the error).
Lion = 0;
Otter = 0;
Beaver = 0;
Snake = 0;
Golden = 0;



int i = 0;
while (i==0){
    //This is where the quiz really starts. Here is the first question.
System.out.println ("When starting a project, you prefer to:\n" + //
        "A) Make a detailed plan first\n" + //
        "B) Gather people and collaborate\n" + //
        "C) Jump in and figure it out as you go\n" + //
        "D) Take charge and set clear goals\n" + //
        "E) Observe quietly and act strategically");
        String Qone = input.nextLine();
if (Qone.equals ("A") || Qone.equals ("a")){
    Beaver = Beaver +1;
    i++;
}else if (Qone.equals ("B") || Qone.equals ("b")){
    Golden = Golden +1;
    i++;
}else if (Qone.equals ("C") || Qone.equals ("c")){
    Otter = Otter +1;
    i++;
}else if (Qone.equals ("D") || Qone.equals ("d")){
    Lion = Lion +1;
    i++;
}else if (Qone.equals ("E") || Qone.equals ("e")){
    Snake = Snake +1;
    i++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}

while (i==1){
//Now that question one has been done next is question two.
    System.out.println ("Your workspace is usually:\n" + //
        "A) Jump in and figure it out as you go\n" + //
        "B) Observe quietly and act strategically\n" + //
        "C) Organized and structured\n" + //
        "D) Comfortable and welcoming\n" + //
        "E) Take charge and set clear goals");
String Qtwo = input.nextLine();
if (Qtwo.equals ("A") || Qtwo.equals ("a")){
    Otter = Otter +1;
    i++;
}else if (Qtwo.equals ("B") || Qtwo.equals ("b")){
    Snake = Snake +1;
    i++;
}else if (Qtwo.equals ("C") || Qtwo.equals ("c")){
    Beaver = Beaver +1;
    i++;
}else if (Qtwo.equals ("D") || Qtwo.equals ("d")){
    Golden = Golden +1;
    i++;
}else if (Qtwo.equals ("E") || Qtwo.equals ("e")){
    Lion = Lion +1;
    i++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}



while (i==2){
     //This is for question three
 System.out.println ("Deadlines make you feel:\n" + //
          "A) Calculated and calm\n" + //
          "B) Motivated to win\n" + //
          "C) Energized but a bit chaotic\n" + //
          "D) Concerned about the team\n" + //
          "E) Focused and methodical");
String Qthree = input.nextLine();
if (Qthree.equals ("A") || Qthree.equals ("a")){
    Snake = Snake +1;
    i++;
}else if (Qthree.equals ("B") || Qthree.equals ("b")){
    Lion = Lion +1;
    i++;
}else if (Qthree.equals ("C") || Qthree.equals ("c")){
    Otter = Otter +1;
    i++;
}else if (Qthree.equals ("D") || Qthree.equals ("d")){
    Golden = Golden +1;
    i++;
}else if (Qthree.equals ("E") || Qthree.equals ("e")){
    Beaver  = Beaver +1;
    i++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}

while (i==3){
    //Here is question four.
        System.out.println ("At a party, you are most likely to:\n" + //
        "A) Lead activities or conversations\n"+ //
        "B) Make sure everyone feels included\n" + //
        "C) Observe people from the sidelines\n" + //
        "D) Talk with a small group about meaningful topics\n" + //
        "E) Be the life of the party");
String Qfour = input.nextLine();
if (Qfour.equals ("A") || Qfour.equals ("a")){
    Lion = Lion +1;
    i++;
}else if (Qfour.equals ("B") || Qfour.equals ("b")){
    Golden = Golden +1;
    i++;
}else if (Qfour.equals ("C") || Qfour.equals ("c")){
    Snake = Snake +1;
    i++;
}else if (Qfour.equals ("D") || Qfour.equals ("d")){
    Beaver = Beaver +1;
    i++;
}else if (Qfour.equals ("E") || Qfour.equals ("e")){
    Otter = Otter +1;
    i++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}


while (i==4){
    //Question 5
System.out.println ("Friends describe you as:\n" + //
        "A) Reliable and detail-oriented\n" + //
        "B) Loyal and caring\n" + //
        "C) Fun and energetic\n" + //
        "D) Confident and bold\n" + //
        "E) Mysterious and insightful");
String Qfive = input.nextLine();
if (Qfive.equals ("A") || Qfive.equals ("a")){
    Beaver = Beaver +1;
    i++;
}else if (Qfive.equals ("B") || Qfive.equals ("b")){
    Golden = Golden +1;
    i++;
}else if (Qfive.equals ("C") || Qfive.equals ("c")){
    Otter = Otter +1;
    i++;
}else if (Qfive.equals ("D") || Qfive.equals ("d")){
    Lion = Lion +1;
    i++;
}else if (Qfive.equals ("E") || Qfive.equals ("e")){
    Snake = Snake +1;
    i++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}

while (i==5){
    //Question 6 
System.out.println ("When meeting new people, you:\n" + //
        "A) Listen more than you speak\n" + //
        "B) Take control of the interaction\n" + //
        "C) Crack jokes immediately\n" + //
        "D) Ask thoughtful questions\n" + //
        "E) Smile and connect warmly");

String Qsix = input.nextLine();
if (Qsix.equals ("A") || Qsix.equals ("a")){
    Snake = Snake +1;
    i++;
}else if (Qsix.equals ("B") || Qsix.equals ("b")){
    Lion= Lion +1;
    i++;
}else if (Qsix.equals ("C") || Qsix.equals ("c")){
    Otter = Otter +1;
    i++;
}else if (Qsix.equals ("D") || Qsix.equals ("d")){
    Beaver = Beaver +1;
    i++;
}else if (Qsix.equals ("E") || Qsix.equals ("e")){
    Golden = Golden +1;
    i++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}

while (i==6){
    // Question 7 
System.out.println ("What matters most to you?\n" + //
        "A) Power and strategy\n" + //
        "B) Relationships and harmony\n" + //
        "C) Accuracy and quality\n" + //
        "D) Success and achievement\n" + //
        "E) Enjoyment and freedom");

String Qseven = input.nextLine ();
if (Qseven.equals ("A") || Qseven.equals ("a")){
    Snake = Snake +1;
    i++;
}else if (Qseven.equals ("B") || Qseven.equals ("b")){
    Golden = Golden +1;
    i++;
}else if (Qseven.equals ("C") || Qseven.equals ("c")){
    Beaver = Beaver +1;
    i++;
}else if (Qseven.equals ("D") || Qseven.equals ("d")){
    Lion = Lion +1;
    i++;
}else if (Qseven.equals ("E") || Qseven.equals ("e")){
    Otter = Otter +1;
    i++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}

while (i==7){
    //Question 8
System.out.println ("Your biggest strength is:\n" + //
        "A) Organization\n" + //
        "B) Creativity\n" + //
        "C) Perception\n" + //
        "D) Leadership\n" + //
        "E) Compassion");

String Qeight = input.nextLine ();
if (Qeight.equals ("A") || Qeight.equals ("a")){
    Beaver = Beaver +1;
    i++;
}else if (Qeight.equals ("B") || Qeight.equals ("b")){
    Otter = Otter +1;
    i++;
}else if (Qeight.equals ("C") || Qeight.equals ("c")){
    Snake = Snake +1;
    i++;
}else if (Qeight.equals ("D") || Qeight.equals ("d")){
    Lion = Lion +1;
    i++;
}else if (Qeight.equals ("E") || Qeight.equals ("e")){
    Golden = Golden +1;
    i++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}

//You are half way through the questions
System.out.println (" Hey, Nova here, you are over halfway done with this quiz, you only have 7 more questions to answer.");

while (i==8){
    //Question 9
System.out.println ("Your biggest weakness might be:\n" + //
        "A) Impatience\n" + //
        "B) Difficulty saying no\n" + //
        "C) Being overly guarded\n" + //
        "D) Perfectionism\n" + //
        "E) Lack of focus");

String Qnine = input.nextLine ();
if (Qnine.equals ("A") || Qnine.equals ("a")){
    Lion = Lion +1;
    i++;
}else if (Qnine.equals ("B") || Qnine.equals ("b")){
    Golden = Golden +1;
    i++;
}else if (Qnine.equals ("C") || Qnine.equals ("c")){
    Snake = Snake +1;
    i++;
}else if (Qnine.equals ("D") || Qnine.equals ("d")){
    Beaver = Beaver +1;
    i++;
}else if (Qnine.equals ("E") || Qnine.equals ("e")){
    Otter = Otter +1;
    i++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}

while (i==9){
    //Question 10
System.out.println ("When conflict arises, you:\n" + //
        "A) Look for facts and solutions\n" + //
        "B) Try to keep the peace\n" + //
        "C) Avoid it or lighten the mood\n" + //
        "D) Confront it directly\n" + //
        "E) Wait for the right moment to act");

String Qten = input.nextLine ();
if (Qten.equals ("A") || Qten.equals ("a")){
    Beaver = Beaver +1;
    i++;
}else if (Qten.equals ("B") || Qten.equals ("b")){
    Golden = Golden +1;
    i++;
}else if (Qten.equals ("C") || Qten.equals ("c")){
    Otter = Otter +1;
    i++;
}else if (Qten.equals ("D") || Qten.equals ("d")){
    Lion = Lion +1;
    i++;
}else if (Qten.equals ("E") || Qten.equals ("e")){
    Snake = Snake +1;
    i++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}

while (i==10){
    //Question 11
System.out.println ("Under pressure, you tend to:\n" + //
        "A) Become quiet and calculating\n" + //
        "B) Take control\n" + //
        "C) Get scattered or restless\n" + //
        "D) Support others emotionally\n" + //
        "E) Work harder and double-check details");

String Qeleven = input.nextLine ();
if (Qeleven.equals ("A") || Qeleven.equals ("a")){
    Snake = Snake +1;
    i++;
}else if (Qeleven.equals ("B") || Qeleven.equals ("b")){
    Lion = Lion +1;
    i++;
}else if (Qeleven.equals ("C") || Qeleven.equals ("c")){
    Otter = Otter +1;
    i++;
}else if (Qeleven.equals ("D") || Qeleven.equals ("d")){
    Golden = Golden +1;
    i++;
}else if (Qeleven.equals ("E") || Qeleven.equals ("e")){
    Beaver = Beaver +1;
    i++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}

while (i==11){
    //Question 12
System.out.println ("You make decisions based on:\n" + //
        "A) What seems exciting\n" + //
        "B) How people will feel\n" + //
        "C) Long-term advantage\n" + //
        "D) Logic and evidence\n" + //
        "E) What will produce results");

String Qtwelve = input.nextLine ();
if (Qtwelve.equals ("A") || Qtwelve.equals ("a")){
    Otter = Otter +1;
    i++;
}else if (Qtwelve.equals ("B") || Qtwelve.equals ("b")){
    Golden = Golden +1;
    i++;
}else if (Qtwelve.equals ("C") || Qtwelve.equals ("c")){
    Snake = Snake +1;
    i++;
}else if (Qtwelve.equals ("D") || Qtwelve.equals ("d")){
    Beaver = Beaver +1;
    i++;
}else if (Qtwelve.equals ("E") || Qtwelve.equals ("e")){
    Lion = Lion +1;
    i++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}

while (i==12){
    //Question 13
System.out.println ("Risk-taking for you is:\n" + //
        "A) Only when odds are favorable\n" + //
        "B) Something to minimize\n" + //
        "C) Worth it if others benefit\n"  + //
        "D) Necessary for success\n" + //
        "E) Thrilling" );

String Qthirteen = input.nextLine ();
if (Qthirteen.equals ("A") || Qthirteen.equals ("a")){
    Snake = Snake +1;
    i++;
}else if (Qthirteen.equals ("B") || Qthirteen.equals ("b")){
    Beaver = Beaver +1;
    i++;
}else if (Qthirteen.equals ("C") || Qthirteen.equals ("c")){
    Golden = Golden +1;
    i++;
}else if (Qthirteen.equals ("D") || Qthirteen.equals ("d")){
    Lion = Lion +1;
    i++;
}else if (Qthirteen.equals ("E") || Qthirteen.equals ("e")){
    Otter = Otter +1;
    i++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}

while (i==13){
    //Question 14
System.out.println ("Your ideal weekend is:\n" + //
        "A) Completing projects or organizing\n" + //
        "B) Spending time with loved ones\n" + //
        "C) Adventures and fun activities\n" + //
        "D) Pursuing goals or competitions\n" + //
        "E) Quiet time planning or recharging");
String Qfourteen = input.nextLine ();
if (Qfourteen.equals ("A") || Qfourteen.equals ("a")){
    Beaver = Beaver +1;
    i++;
}else if (Qfourteen.equals ("B") || Qfourteen.equals ("b")){
    Golden = Golden +1;
    i++;
}else if (Qfourteen.equals ("C") || Qfourteen.equals ("c")){
    Otter = Otter +1;
    i++;
}else if (Qfourteen.equals ("D") || Qfourteen.equals ("d")){
    Lion = Lion +1;
    i++;
}else if (Qfourteen.equals ("E") || Qfourteen.equals ("e")){
    Snake = Snake +1;
    i++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}

while (i==14){
    //Question 15
System.out.println ("Which statement sounds most like you?\n" + //
        "A) “Fun matters.”\n" + //
        "B) “Details matter.”\n" + //
        "C) “Winning matters.”\n" + //
        "D) “People matter.”\n" + //
        "E) “Timing matters.”");

String Qfifteen = input.nextLine ();
if (Qfifteen.equals ("A") || Qfifteen.equals ("a")){
    Otter = Otter +1;
    i++;
}else if (Qfifteen.equals ("B") || Qfifteen.equals ("b")){
    Beaver = Beaver +1;
    i++;
}else if (Qfifteen.equals ("C") || Qfifteen.equals ("c")){
    Lion = Lion +1;
    i++;
}else if (Qfifteen.equals ("D") || Qfifteen.equals ("d")){
    Golden = Golden +1;
    i++;
}else if (Qfifteen.equals ("E") || Qfifteen.equals ("e")){
    Snake = Snake +1;
    i++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}

System.out.println ("Congratulations, you just finished the quiz, lets look at the results.");


//now that all the questions have been answered based on what people answered and how many points they 
//have in each category will determine what type of animal they are, and they will be told the 
//personality type that they fit into and as well as a breif description about it.
System.out.println ("");
System.out.println ("Congratulations, you just finished the quiz, lets look at the results.");
System.out.println ("Hi *0^@ here, lets look at your results, what animal/personality type are you?");
//That out print is for a break to make it look nicer, I wonder what one people will get.

//They must answer one more question before they can continue
System.out.println ("Error here.");
System.out.println ("ERROR HERE!!!!");
System.out.println ("ErRoR hErE!.!.1.<!");
//If the user gets the question wrong three times they have to restart completely!!!
    System.out.println ("In order to get your results please answer the following question correctly. What is the name of the bot that has been talking to you?");
String error = input.nextLine ();
boolean k = true;
int count = 3;
while (k || count > 0){ //NEED TO FIX THIS PART
    System.out.println ("In order to get your results please answer the following question correctly. What is the name of the bot that has been talking to you?");
    if (error.equals ("Nova")|| error.equals ("nova")){
        System.out.println ("You got it right and fixed the error, you are about to figure out your animal/personality type.");
        k = false;
        die = false;
break;
    }else {
        count = count - 1;
        System.out.println ("Try again you got it wrong if you get it wrong " + count + " more times you will never know your results." );
        error = input.nextLine ();
    }
}
if (count == 0){
    System.out.println ("ERRRRRROOOOOOORRRRRR!!!");
    System.out.println ("Full system crash restart all!!");
    System.out.println ("Answer questions again to get your result.");
    System.out.println ("Bettr luck next time!!!!!");
    System.out.println ("TRY AGAIN!!!!!");
    }
}



System.out.println ("");
//This one is going to be a very big if elses with many varying if else parts (So tedious) :(
//Figured out how to make it more simple, just find the animals by which ones has a greater
// number than the rest.
//At that point the person will be given their one of five animals and personality traits
// based off of that.

//This is the start of the results part (Yay almost done!!!!!!!)

if ((Beaver> Golden)&& (Beaver> Otter)&& (Beaver >Lion)&& (Beaver > Snake)){
    //Describe Beaver Personality
    System.out.println ("You are a Beaver!!!");
    System.out.println ("");
    System.out.println ("Core traits: Organized, dependable, detail-oriented, cautious\n" + //
                "Loves structure, planning, and accuracy\n" + //
                "Hardworking and reliable\n" + //
                "Prefers clear expectations\n" + //
                "May struggle with perfectionism or overthinking\n" + //
                "Motivation: Security, quality, stability\n" + //
                "Strengths: Precision, persistence, responsibility");
    System.out.println ("Possible Negative Traits:\n" + //
                "Perfectionistic\n" + //
                "Overly critical of mistakes\n" + //
                "Slow to make decisions\n" + //
                "Resistant to change\n" + //
                "Can become stressed by disorder or uncertainty\n" + //
                "May focus too much on details and miss the big picture");
}else if ((Golden> Beaver)&& (Golden > Otter)&& (Golden> Lion)&& (Golden > Snake)){
    //Describe Golden Retriever personality
        System.out.println ("You are a Golden Retriever!!!");
    System.out.println ("");
    System.out.println ("Core traits: Loyal, kind, patient, relationship-focused\n" + //
                "Warm and empathetic\n" + //
                "Team player who values harmony\n" + //
                "Trustworthy and dependable\n" + //
                "May avoid conflict or put others first too often\n" + //
                "Motivation: Connection, belonging, helping others\n" + //
                "Strengths: Compassion, loyalty, encouragement");
    System.out.println ("Possible Negative Traits:\n" + //
                "Avoids conflict even when necessary\n" + //
                "People-pleasing tendencies\n" + //
                "Difficulty setting boundaries\n" + //
                "Can be overly trusting\n" + //
                "May sacrifice their own needs for others\n" + //
                "Sometimes indecisive when trying to keep everyone happy");
}else if ((Otter> Beaver)&& (Otter>Golden)&&(Otter>Lion)&&(Otter>Snake)){
    //Describe Otter personality
        System.out.println ("You are a Otter!!!");
    System.out.println ("");
    System.out.println ("Core traits: Playful, energetic, creative, spontaneous\n" + //
                "Loves fun, variety, and social interaction\n" + //
                "Big-picture thinker\n" + //
                "Inspires others with enthusiasm\n" + //
                "May struggle with follow-through or organization\n" + //
                "Motivation: Enjoyment, freedom, excitement\n" + //
                "Strengths: Creativity, optimism, adaptability");
    System.out.println ("Possible Negative Traits:\n" + //
                "Easily distracted\n" + //
                "Poor follow-through on tasks\n" + //
                "Disorganized or messy\n" + //
                "Impulsive decision-making\n" + //
                "Talks more than listens\n" + //
                "May struggle with routines or responsibilities");
}else if ((Lion>Beaver)&& (Lion>Golden)&& (Lion>Otter)&& (Lion>Snake)){
    //Describe Lion personality
        System.out.println ("You are a Lion!!!");
    System.out.println ("");
    System.out.println ("Core traits: Confident, decisive, goal-driven, assertive\n" + //
                "Natural leader who takes charge\n" + //
                "Focused on results and efficiency\n" + //
                "Competitive and ambitious\n" + //
                "May seem intimidating or impatient\n" + //
                "Motivation: Achievement, success, control\n" + //
                "Strengths: Leadership, courage, decisiveness");
    System.out.println ("Possible Negative Traits:\n" + //
                "Can be controlling or domineering\n" + //
                "Impatient with slower people\n" + //
                "Competitive to a fault\n" + //
                "May overlook others’ feelings\n" + //
                "Can appear arrogant or intimidating\n" + //
                "Sometimes rushes decisions without enough input");
}else if ((Snake>Beaver)&& (Snake > Golden)&& (Snake>Otter)&&(Snake>Lion)){
    //Decribe Snake personality
        System.out.println ("You are a Snake!!!");
    System.out.println ("");
    System.out.println ("Core traits: Observant, calm, analytical, strategic\n" + //
                "Thinks before acting\n" + //
                "Reads people and situations carefully\n" + //
                "Independent and self-controlled\n" + //
                "May appear reserved or mysterious\n" + //
                "Motivation: Advantage, insight, long-term outcomes\n" + //
                "Strengths: Strategy, patience, perception");
    System.out.println ("Possible Negative Traits:\n" + //
                "Secretive or hard to read\n" + //
                "Distrustful of others\n" + //
                "Overly calculating\n" + //
                "May manipulate situations to their advantage\n" + //
                "Keeps emotions hidden\n" + //
                "Can seem distant or unapproachable");
}else if ((Beaver==Golden)&& (Beaver> Otter)&& (Beaver >Lion)&& (Beaver > Snake)){
    int j=0;
while (j==1){
       //Tie breaker question
    System.out.println("You have a tie answer this question to break it.");
    System.out.println ("In a crisis, you are most likely to:\n" + //
                "A) Create a careful plan\n" + //
                "B) Support and reassure people");
                String Qtie = input.nextLine ();
if (Qtie.equals ("A") || Qtie.equals ("a")){
    Beaver = Beaver +1;
    j++;
}else if (Qtie.equals ("B") || Qtie.equals ("b")){
    Golden = Golden +1;
    j++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}
}else if ((Beaver==Otter)&&(Beaver> Golden)&& (Beaver >Lion)&& (Beaver > Snake)){
    int j=0;

while (j==1){
        //Tie breaker question
        System.out.println("You have a tie answer this question to break it.");
    System.out.println ("In a crisis, you are most likely to:\n" + //
                "A) Create a careful plan\n" + //
                "B) Keep spirits high");
                 String Qtie = input.nextLine ();
if (Qtie.equals ("A") || Qtie.equals ("a")){
    Beaver = Beaver +1;
    j++;
}else if (Qtie.equals ("B") || Qtie.equals ("b")){
    Otter = Otter +1;
    j++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}
}else if ((Beaver==Lion)&&(Beaver> Golden)&& (Beaver> Otter)&& (Beaver > Snake)){
    //Tie breaker question
    int j=0;
while (j==1){
        //Tie breaker question
        System.out.println("You have a tie answer this question to break it.");
    System.out.println ("In a crisis, you are most likely to:\n" + //
                "A) Create a careful plan\n" + //
                "B) Take command immediately");
    String Qtie = input.nextLine ();
if (Qtie.equals ("A") || Qtie.equals ("a")){
    Beaver = Beaver +1;
    j++;
}else if (Qtie.equals ("B") || Qtie.equals ("b")){
    Lion = Lion +1;
    j++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}
}else if ((Beaver==Snake)&&(Beaver> Golden)&& (Beaver> Otter)&& (Beaver >Lion)){
    int j=0;
while (j==1){
        //Tie breaker question
        System.out.println("You have a tie answer this question to break it.");
    System.out.println ("In a crisis, you are most likely to:\n" + //
                "A) Create a careful plan\n" +
                "B) Assess quietly before acting");
      String Qtie = input.nextLine ();
if (Qtie.equals ("A") || Qtie.equals ("a")){
    Beaver = Beaver +1;
    j++;
}else if (Qtie.equals ("B") || Qtie.equals ("b")){
    Snake = Snake +1;
    j++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}
}else if ((Golden==Otter)&&(Golden> Beaver)&& (Golden> Lion)&& (Golden > Snake)){
    int j=0;
while (j==1){
       //Tie breaker question
       System.out.println("You have a tie answer this question to break it.");
    System.out.println ("In a crisis, you are most likely to:\n" + //
                "A) Support and reassure people\n" + //
                "B) Keep spirits high");
    String Qtie = input.nextLine ();
if (Qtie.equals ("A") || Qtie.equals ("a")){
    Golden = Golden +1;
    j++;
}else if (Qtie.equals ("B") || Qtie.equals ("b")){
    Otter = Otter +1;
    j++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}
}else if ((Golden==Lion)&&(Golden> Beaver)&& (Golden > Otter)&& (Golden > Snake)){
    int j=0;
while (j==1){
        //Tie breaker question
        System.out.println("You have a tie answer this question to break it.");
    System.out.println ("In a crisis, you are most likely to:\n" + //
                "A) Support and reassure people\n" + //
                "B) Take command immediately");
    String Qtie = input.nextLine ();
if (Qtie.equals ("A") || Qtie.equals ("a")){
    Golden = Golden +1;
    j++;
}else if (Qtie.equals ("B") || Qtie.equals ("b")){
    Lion = Lion +1;
    j++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}
}else if ((Golden==Snake)&&(Golden> Beaver)&& (Golden > Otter)&& (Golden> Lion)){
    int j=0;
while (j==1){
        //Tie breaker question
        System.out.println("You have a tie answer this question to break it.");
    System.out.println ("In a crisis, you are most likely to:\n" + //
                "A) Support and reassure people\n" + //
                "B) Assess quietly before acting");
    String Qtie = input.nextLine ();
if (Qtie.equals ("A") || Qtie.equals ("a")){
    Golden = Golden +1;
    j++;
}else if (Qtie.equals ("B") || Qtie.equals ("b")){
    Snake = Snake +1;
    j++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}
}else if ((Otter==Lion)&&(Otter> Beaver)&& (Otter>Golden)&&(Otter>Snake)){
    int j=0;
while (j==1){
        //Tie breaker question
        System.out.println("You have a tie answer this question to break it.");
    System.out.println ("In a crisis, you are most likely to:\n" + //
                "A) Keep spirits high\n" + //
                "B) Take command immediately");
    String Qtie = input.nextLine ();
 if (Qtie.equals ("A") || Qtie.equals ("a")){
    Otter = Otter +1;
    j++;
}else if (Qtie.equals ("B") || Qtie.equals ("b")){
    Lion = Lion +1;
    j++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}
}else if ((Otter==Snake)&&(Otter> Beaver)&& (Otter>Golden)&&(Otter>Lion)){
    int j=0;
while (j==1){
       //Tie breaker question
       System.out.println("You have a tie answer this question to break it.");
    System.out.println ("In a crisis, you are most likely to:\n" + 
                "A) Keep spirits high\n" +
                "B) Assess quietly before acting");
    String Qtie = input.nextLine ();
if (Qtie.equals ("A") || Qtie.equals ("a")){
    Otter = Otter +1;
    j++;
}else if (Qtie.equals ("B") || Qtie.equals ("b")){
    Snake = Snake +1;
    j++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}
}else if ((Lion==Snake)&&(Lion>Beaver)&& (Lion>Golden)&& (Lion>Otter)){
    int j=0;
while (j==1){
       //Tie breaker question
        System.out.println("You have a tie answer this question to break it.");
    System.out.println ("In a crisis, you are most likely to:\n" + //
                "A) Take command immediately\n" + //
                "B) Assess quietly before acting");
    String Qtie = input.nextLine ();
if (Qtie.equals ("A") || Qtie.equals ("a")){
    Lion = Lion +1;
    j++;
}else if (Qtie.equals ("B") || Qtie.equals ("b")){
    Snake = Snake +1;
    j++;
}else
    System.out.println ("Invalid response entered please re-enter your answer, remember only enter one letter either, a, b, c, d, or e.");
}

//Repeat to break the tie
if ((Beaver> Golden)&& (Beaver> Otter)&& (Beaver >Lion)&& (Beaver > Snake)){
    //Describe Beaver Personality
        System.out.println ("You are a Beaver!!!");
    System.out.println ("");
    System.out.println ("Core traits: Organized, dependable, detail-oriented, cautious\n" + //
                "Loves structure, planning, and accuracy\n" + //
                "Hardworking and reliable\n" + //
                "Prefers clear expectations\n" + //
                "May struggle with perfectionism or overthinking\n" + //
                "Motivation: Security, quality, stability\n" + //
                "Strengths: Precision, persistence, responsibility");
    System.out.println ("Possible Negative Traits:\n" + //
                "Perfectionistic\n" + //
                "Overly critical of mistakes\n" + //
                "Slow to make decisions\n" + //
                "Resistant to change\n" + //
                "Can become stressed by disorder or uncertainty\n" + //
                "May focus too much on details and miss the big picture");
}else if ((Golden> Beaver)&& (Golden > Otter)&& (Golden> Lion)&& (Golden > Snake)){
    //Describe Golden Retriever personality
        System.out.println ("You are a Golden Retriever!!!");
    System.out.println ("");
    System.out.println ("Core traits: Loyal, kind, patient, relationship-focused\n" + //
                "Warm and empathetic\n" + //
                "Team player who values harmony\n" + //
                "Trustworthy and dependable\n" + //
                "May avoid conflict or put others first too often\n" + //
                "Motivation: Connection, belonging, helping others\n" + //
                "Strengths: Compassion, loyalty, encouragement");
    System.out.println ("Possible Negative Traits:\n" + //
                "Avoids conflict even when necessary\n" + //
                "People-pleasing tendencies\n" + //
                "Difficulty setting boundaries\n" + //
                "Can be overly trusting\n" + //
                "May sacrifice their own needs for others\n" + //
                "Sometimes indecisive when trying to keep everyone happy");
}else if ((Otter> Beaver)&& (Otter>Golden)&&(Otter>Lion)&&(Otter>Snake)){
    //Describe Otter personality
        System.out.println ("You are a Otter!!!");
    System.out.println ("");
    System.out.println ("Core traits: Playful, energetic, creative, spontaneous\n" + //
                "Loves fun, variety, and social interaction\n" + //
                "Big-picture thinker\n" + //
                "Inspires others with enthusiasm\n" + //
                "May struggle with follow-through or organization\n" + //
                "Motivation: Enjoyment, freedom, excitement\n" + //
                "Strengths: Creativity, optimism, adaptability");
    System.out.println ("Possible Negative Traits:\n" + //
                "Easily distracted\n" + //
                "Poor follow-through on tasks\n" + //
                "Disorganized or messy\n" + //
                "Impulsive decision-making\n" + //
                "Talks more than listens\n" + //
                "May struggle with routines or responsibilities");
}else if ((Lion>Beaver)&& (Lion>Golden)&& (Lion>Otter)&& (Lion>Snake)){
    //Describe Lion personality
        System.out.println ("You are a Lion!!!");
    System.out.println ("");
    System.out.println ("Core traits: Confident, decisive, goal-driven, assertive\n" + //
                "Natural leader who takes charge\n" + //
                "Focused on results and efficiency\n" + //
                "Competitive and ambitious\n" + //
                "May seem intimidating or impatient\n" + //
                "Motivation: Achievement, success, control\n" + //
                "Strengths: Leadership, courage, decisiveness");
    System.out.println ("Possible Negative Traits:\n" + //
                "Can be controlling or domineering\n" + //
                "Impatient with slower people\n" + //
                "Competitive to a fault\n" + //
                "May overlook others’ feelings\n" + //
                "Can appear arrogant or intimidating\n" + //
                "Sometimes rushes decisions without enough input");
}else if ((Snake>Beaver)&& (Snake > Golden)&& (Snake>Otter)&&(Snake>Lion)){
    //Decribe Snake personality
        System.out.println ("You are a Snake!!!");
    System.out.println ("");
    System.out.println ("Core traits: Observant, calm, analytical, strategic\n" + //
                "Thinks before acting\n" + //
                "Reads people and situations carefully\n" + //
                "Independent and self-controlled\n" + //
                "May appear reserved or mysterious\n" + //
                "Motivation: Advantage, insight, long-term outcomes\n" + //
                "Strengths: Strategy, patience, perception");
    System.out.println ("Possible Negative Traits:\n" + //
                "Secretive or hard to read\n" + //
                "Distrustful of others\n" + //
                "Overly calculating\n" + //
                "May manipulate situations to their advantage\n" + //
                "Keeps emotions hidden\n" + //
                "Can seem distant or unapproachable");
}else{
    System.out.println (nameOne + ", you have inclonclusive results.\n" + 
    "Your personality equals more than two personality types.\n"+ 
    " Please take the quiz again. I hope you enjoyed it and with this next try you will get conclusive results.");
}

}
System.out.println ("");
System.out.println (nameOne + ", thank you for taking my personality quiz.\n" +
"I hope you enjoyed it and it allowed you to learn a lot more about yourself and your personality.");
//Finally finished the if else, if they have more than two personality types after the tie breaker question they will get an error message telling the 
//user to take the quiz again and hopefully they will get more conclusive results.
}
}
