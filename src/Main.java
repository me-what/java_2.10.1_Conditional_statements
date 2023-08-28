public class Main {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 4;
        if (num1 > num2) {
            System.out.println("Первое число больше второго \n");
        }

        int numb1 = 6;
        int numb2 = 8;
        if(numb1>numb2){
            System.out.println("Первое число больше второго");
        }
        else if(numb1<numb2){
            System.out.println("Первое число меньше второго");
        }
        else{
            System.out.println("Числа равны");
        }
        System.out.println();

        int number1 = 8;
        int number2 = 6;
        if(number1 > number2 && number1>7){ // true
            System.out.println("Первое число больше второго и больше 7 \n");
        }

        int num = 8;
        switch(num){
            case 1:
                System.out.println("число равно 1");
                break;
            case 8:
                System.out.println("число равно 8");
                num++;
                break;
            case 9:
                System.out.println("число равно 9");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");
        }
        System.out.println();

        int num5 = 3;
        int output = 0;
        switch(num5){

            case 1:
                output = 3;
                break;
            case 2:
            case 3:
            case 4:
                output = 6;
                break;
            case 5:
                output = 12;
                break;
            default:
                output = 24;
        }
        System.out.println(output + "\n"); // 6

        int x=3;
        int y=2;
        int z = x<y? (x+y) : (x-y);
        System.out.println(z+"\n"); // 1

        int a = 10;
        if (a <= 0) if (a == 5) a++; else a--;
        System.out.println(a+"\n"); // 10

        int a2 = 10;
        if (a2 <= 0) { // false
            if (a2 == 5 ) {
                a2++;
            }
            else {
                a2--;
            }
        }
        System.out.println("второй пример: " + a2 + "\n"); // 10

        int a3 = 10;
        if (a3 >= 0) if (a3 == 10) if (a3<=70) a3++; else a3--;
        System.out.println("третий пример: " + a3 +"\n"); // 11

        int a4 = 10;
        if (a4 >= 0) if (a4 == 10) if (a4<=9) a4++; else a4--;
        System.out.println("четвертый пример: " + a4 +"\n"); // 9


        int a5 = 5;
        switch(a5){
            case 4:
                a5++;
            case 5:
                a5++;
            case 6:
            case 7:
            case 8:
                a5++;
                break;
            case 9:
                a5++;
                break;
            default:
                a5++;
        }
        System.out.println(a5); // 7
    }
}