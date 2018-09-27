public class ArrayDemo {
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
  public static void main(String[] args) {
    int [] test1 = {100,3952,34,1,6};
    printArray(test1);
  }
}
