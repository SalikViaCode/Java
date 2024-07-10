package Method.java;

public class NoParameterNoReturnType {
    void add(){
        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        NoParameterNoReturnType calc = new NoParameterNoReturnType();
        calc.add();
    }
}
