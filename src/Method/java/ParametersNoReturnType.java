package Method.java;

public class ParametersNoReturnType {
    void calc(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        ParametersNoReturnType calc = new ParametersNoReturnType();
        calc.calc(5,4);
    }
}
