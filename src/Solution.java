import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("연산 종류를 선택하세요");
            System.out.println("1.더하기");
            System.out.println("2.빼기");
            System.out.println("3.곱하기");
            System.out.println("4.나누기");
            System.out.println("0.종료");

            double num = sc.nextDouble();

            if (num ==0) {
                break;
            }
            else {
                if (num > 4)
                {
                    System.out.println("연산 종류를 잘못 선택했습니다.");
                    continue;
                }

                System.out.println("첫 번째 숫자를 입력하고 엔터를 누르세요");
                double num1 = sc.nextDouble();

                System.out.println("두 번째 숫자를 입력하고 엔터를 누르세요");
                double num2 = sc.nextDouble();

                if (num == 1) {
                    double result1 = num1 + num2;
                    System.out.println("더하기 값 : " +  result1);
                }

                if (num == 2) {
                    double result2 = num1 - num2;
                    System.out.println("빼기 값 : " + result2);
                }

                if (num == 3) {
                    double result3 = num1 * num2;
                    System.out.println("곱하기 값 : " + result3);
                }

                if (num == 4) {
                    double result4 = num1 / num2;
                    System.out.println("나누기 값 : " + result4);
                }
            }
            System.out.println("계산기를 종료합니다.");
            System.out.println("==================");
        }
    }
}