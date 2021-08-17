package lambda_and_stream;

public class TraineeWithLambda {

    Calculate calculate = (int a, int b, char x) -> {
        switch (x) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '/':
                return a / b;
            case '*':
                return a * b;
            default:
                return 0;
        }

    };
    double result = calculate.calc(1, 3, '+');
    double result1 = calculate.calc(1, 3, '*');
    double result2 = calculate.calc(1, 3, '/');
    double result3 = calculate.calc(1, 3, '-');
    double result4 = calculate.calc(1, 3, 'D');

    public void print(){
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

}

interface Calculate{

    double calc(int a, int b, char x);

}