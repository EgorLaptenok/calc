import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        calc converter = new calc();
        String[] pop = {"+", "-", "/", "*"};
        String[] fixPop = {"\\+", "-", "/", "\\*"};
        Scanner nash = new Scanner(System.in);
        String kit = nash.nextLine();
        int actionIndex =-1;
        for (int i = 0; i < pop.length; i++ ) {
            if (kit.contains(pop[i])) {
                actionIndex = i;
                break;
            }
        }
            if (actionIndex ==-1){
                return;
            }
            String[] data = kit.split(fixPop[actionIndex]);
            if(calc.isRoman(data[0]) == calc.isRoman(data[1])) {
                int a, b;
                a = Integer.parseInt(data[0]);
                b = Integer.parseInt(data[1]);
                int result = 0;
                switch (pop[actionIndex]) {
                    case "+":
                        result = a+b;
                        break;
                    case "-":
                        result = a-b;
                        break;
                    case "*":
                        result = a*b;
                        break;
                    case "/":
                        result = a/b;
                        break;
                    default:
                }
                System.out.println(result);
            }else{
                System.out.println("los");
            }

        }
    }