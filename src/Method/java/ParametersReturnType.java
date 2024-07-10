package Method.java;

public class ParametersReturnType {
    int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        ParametersReturnType calc = new ParametersReturnType();
        int sum = calc.add(5,4);
        System.out.println(sum);
    }
}
