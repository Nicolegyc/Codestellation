public class HarmonicFn {
  public static void main(String[] args){
    int n; // a positive integer

    System.out.print("Enter a positive integer n: ");
    n = TextIO.getlnInt();
    Double H = 0.0;
    for (double i = 1; i <= n; i++) {
      H = H + 1/i;
    }
    System.out.println("H(" + n + ")=1/1 + 1/2 + 1/3 + ..." + "1/" + n + "=" + H);
  }
}
