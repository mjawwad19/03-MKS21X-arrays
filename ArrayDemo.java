public class ArrayDemo {
//0a. Make a function to print a 1D array of ints.
  public static void printArray(int[]ary){
    String arry = "";
    for (int i = 0; i < ary.length; i++){
      if (i != ary.length - 1) {
        arry += ary[i] + ", ";
      }
      else {arry += ary[i];};
    }
    System.out.print("["+arry + "]");
  }
// 0b. Make a function to print a 2d array of ints.
  public static void printArray(int[][]ary){
    String arry = "";
    int i;
    int j;
    for (i = 0; i < ary.length; i++){
      if (i == 0) {arry += "[";}
      for (j = 0; j < ary[i].length; j ++) {
        if (j == 0) {arry += "[";}
        if (j != ary[i].length - 1) {arry += ary[i][j] + ", ";}
        else {arry += ary[i][j] + "]";}
      }
        if (i != ary.length - 1) {arry += ", ";}
        else {arry += "]";}
      }
    System.out.print(arry);
  }
//1. Calculate and return how many zeros are in the parameter
//(a rectangular 2D array of integers)
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i = 0; i < nums.length; i++){
      for (int j = 0; j < nums[i].length; j ++) {
        if (nums[i][j] == 0) {count ++;}
      }
    }
    return count;
  }
/*2a. Modify a given 2D array of integer as follows:
Fill the of integers with 1's
EXCEPT when the i number is the same as the j number:

you must fill those with 3's instead.
*/
  public static void fill2D(int[][] vals){
    for (int i = 0; i < vals.length; i++){
      for (int j = 0; j < vals[i].length; j ++) {
        if (i == j) {vals[i][j] = 3;}
        else {vals[i][j] = 1;}
      }
    }
    printArray(vals);
  }
/*2b. Make a new 2d array the same dimensions as the given parameter.
Fill that array with with 1's, except where the value of the original array is negative:
you must fill those with 3's instead.

You may NOT modify the parameter vals.*/
  public static int[][] fill2DCopy(int[][] vals){
    int len = vals.length;
    int [][] valsCopy = new int [len][];
    for (int i = 0; i < len; i++) {
      valsCopy[i] = new int[vals[i].length];
      for (int j = 0; j < vals[i].length; j++) {
        valsCopy[i][j] = vals[i][j];
        if ((valsCopy[i][j]) < 0) {valsCopy[i][j] = 3;}
        else {valsCopy[i][j] = 1;}
      }
    }
    return valsCopy;
  }
//Tests
   public static void main(String[] args) {
      int [] test1 = {100,3952,34,1,6};
      int [][] test2 = {{0,0,-2,0},{32,0},{-4}};
      int [][] test3 = {{-104,0,-6,3},{32,-1},{-4}};

      printArray(test1);
      System.out.print("\n");
      printArray(test2);
      System.out.println(countZeros2D(test2));
      System.out.print("\n");
      fill2D(test2);
      System.out.print("\n");
      printArray(fill2DCopy(test3));
    }
}
