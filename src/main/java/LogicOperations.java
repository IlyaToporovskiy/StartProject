public class LogicOperations {
//  static boolean A,B,C,D;

  public static void main(String[] args) {
    boolean A,B,C,D;

    /* & -логическое И
    A B
    + +  = + true
    - +  = - false
    - -  = - false
     */
//    System.out.println("логическое И ="+ (A&B));
//    System.out.println("логическое И ="+ (D&B));
//    System.out.println("логическое И ="+ (A&C));


    /* && -логическое упрощенное И , если выражение A = false то дальше не вычисляется
     */
//    System.out.println("логическое упрощенное И = "+ (A&&B&&C));
//    System.out.println("логическое упрощенное И = "+ (A&&C));



    /* | -логическое  ИЛИ ,
    + +  = + true
    - +  = + true
    - -  = - false
     */
//    System.out.println("логическое  ИЛИ = "+ (A|C));
//    System.out.println("логическое  ИЛИ = "+ (A|B));
//    System.out.println("логическое  ИЛИ = "+ (D|B));

    /* | -логическое упрощенное ИЛИ , если выражение A = true то дальше не вычисляется
     */
//    System.out.println("логическое упрощенное ИЛИ = "+ (A||B));

    A=true;
    B=false;
    C=true;
    D=false;
    /* ^ -логическое исключающие ИЛИ ,
    - +  = + true
    + +  = - false
    - -  = - false
    */

//    System.out.println("логическое исключающие ИЛИ = "+ (A^B));
//    System.out.println("логическое исключающие ИЛИ = "+ (A^C));
//    System.out.println("логическое исключающие ИЛИ = "+ (D^B));

    /* ! - логическое отрицание ,
    A=true B=false
    !A   = - false
    !B   = + true
    */
    System.out.println("логическое отрицание = "+ (!A));
    System.out.println("логическое отрицание = "+ (!B));
  }

}
