package Method.java;

public class NoParametersWithReturnType {
    int add(){
        int a = 10;
        int b = 20;
        return a+b;
    }
    public static void main(String[] args) {
        NoParameterNoReturnType calc = new NoParameterNoReturnType();
        calc.add();
    }
}
