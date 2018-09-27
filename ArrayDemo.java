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
    int row;
    int column;
    for (row = 0; row < ary.length; row++){
      for (column = 0; column < ary[row].length; column ++) {
        if (column == 0) {
          arry += "[";
        }
        if (column != ary[row].length - 1) {
          arry += ary[row][column] + ", ";
        }
        else {
          arry += ary[row][column] + "]";
        }}
        arry += ", "; }
    System.out.print(arry);
  }

  public static void main(String[] args) {
    int [] test1 = {100,3952,34,1,6};
    int [][] test2 = {{100,3952},
                     {34,1},
                     {6}};
    printArray(test1);
    System.out.print("\n");
    printArray(test2);
  }
}
