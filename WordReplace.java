import java.util.Scanner;
public class WordReplace {
/**
  WordReplace is a story maker where the user inputs words which get added to a story they do not know

  Logan A.
  Block 2
  Last Update: 06/10/2021
**/
  public static void main(String[] args) {
   storyTime(); // This is so the menu can read it. It is that workaround I mentioned
  }
  public static void storyTime() {
    String a; // This program is reaching the basics of java here. It just adds what the user inputted to a story.
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    String j;
    int choice;
    Scanner in = new Scanner(System.in);
    System.out.print("Type an activity: ");
    a = in.nextLine();
    System.out.print("Type an adjective: ");
    b = in.nextLine();
    System.out.print("Type an item: ");
    c = in.nextLine();
    System.out.print("Type an activity: ");
    d = in.nextLine();
    System.out.print("Type an activity: ");
    e = in.nextLine();
    System.out.print("Type an adjective: ");
    f = in.nextLine();
    System.out.print("Type an item: ");
    g = in.nextLine();
    System.out.print("Type an color: ");
    h = in.nextLine();
    System.out.print("Type an color: ");
    i = in.nextLine();
    System.out.print("Type an adjective: ");
    j = in.nextLine();
    System.out.print("Would you like story one or two? Type \"1\" or \"2\" ");
    if (!in.hasNextInt()) {
      String word = in.next();
      System.err.println(word + " does not appear to be a number. If what you entered was a number, pleace contact me so I can bugfix.");
      storyTime(); } //Breakage protection
    choice = in.nextInt();
    if (choice == 1) {
      System.out.println("I’m gonna be brutally honest here, I’m not a fan of " + a); // The reason these all are seperate print statements was purely because it made development easier when there was a problem. 
      System.out.print(". It is way too " + b);
      System.out.print(" for me and the " + c);
      System.out.print(" involved is far too much. They really should make it easier for people like me. When I was younger, I mainly did activities like " + d);
      System.out.print(" which does not compare to " + a);
      System.out.print(". Now, " + e);
      System.out.print(" on the other hand, I can totally get behind! It is " + f);
      System.out.print(" and the " + g);
      System.out.print(" keeps it fresh the whole time! I don't know why the color of the teams are " + h);
      System.out.print(" VS " + i);
      System.out.print(", but it just keeps the game more " + f);
      System.out.print(".");
      System.out.println(" ");
  } else if (choice == 2) {
      System.out.println("What the heck happened to " + a);
      System.out.print("!? It was sooo much " + b);
      System.out.print("! Everyone knew how much the " + c);
      System.out.print(" enhanced the user experience for those involved. Nowadays, people are just playing " + d);
      System.out.print(" and " + e);
      System.out.print(", which are so much less " + f);
      System.out.print("! The use of the " + g);
      System.out.print(" is really not what I would call groundbreaking, and for crying out loud, why are the colors " + h);
      System.out.print(" VS " + i);
      System.out.print("!? They make no sense! Overall, it still is " + f);
      System.out.print(" though, let's not get me wrong.");
      System.out.println(" ");

  } else {
      System.out.println("An error occured in the selection, please try again");
    }
  }
}