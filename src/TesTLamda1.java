
     
public class TesTLamda1 {

  @FunctionalInterface
  interface OperationEntiere {
    long effectuer(int a, int b);
  }

  public long calculer(int a, int b, OperationEntiere operation) {
    return operation.effectuer(a, b);
  }

  public static void main(String[] args) {
	  TesTLamda1 calc = new TesTLamda1();
    OperationEntiere addition = (a, b) -> a + b;
    OperationEntiere soustraction = (a, b) -> a - b;

    System.out.println(calc.calculer(10, 5, addition));
    System.out.println(calc.calculer(10, 5, soustraction));
  }
}