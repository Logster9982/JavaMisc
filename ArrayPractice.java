public class ArrayPractice{
  public static void main (String[] args) {
    String[] theBeatles = {"Paul", "John", "George", "Ringo"};
    for (int x = 0; x < theBeatles.length; x++) {
      System.out.println(theBeatles[x]);
    }
    
    
    
    String[] rainbow = new String[7];
    rainbow[0] = "red";
    rainbow[1] = "orange";
    rainbow[2] = "yellow";
    rainbow[3] = "green";
    rainbow[4] = "blue";
    rainbow[5] = "indigo";
    rainbow[6] = "violet";
    for (int x = 0; x < 7; x++) {
      System.out.println(rainbow[x]);
    }
  }
}