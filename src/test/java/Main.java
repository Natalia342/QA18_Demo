public class Main {
    public static void main(String[] args) {
        Calculator.print();

        Calculator calcul = new Calculator();
        calcul.a = 8;
        calcul.b = 10;
        calcul.action = '+';
        calcul.res = "=";

        calcul.calc(5,9,'*');
    }
}