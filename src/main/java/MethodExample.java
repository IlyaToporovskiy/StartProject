public class MethodExample {


  public static int summOperation(int a, int b ){
    return a+b;
  }
  public static boolean newsBlock(boolean a, boolean b, boolean c){
    return a&&b&&c;
  }
  public static void meesageBlock(){
    System.out.println("Вот такие дела");
  }
  public static void main(String[] args) {
    System.out.println(summOperation(12,25));
    boolean d,c,v;
    d=false;
    c=true;
    v=false;
    System.out.println(newsBlock(d,v,c));
    meesageBlock();
  }
}
