import java.util.Scanner;                 // Scanner 클래스를 가져옵니다.

public class Main {
    public static void main(String[] args) {

        System.out.println("점수를 입력하세요");
        Scanner sc = new Scanner(System.in); // Scanner 클래스의 인스턴스를 생성합니다.
        String inputValue = sc.nextLine();   // 입력한 내용이 inputValue에 저장됩니다.

        System.out.println(inputValue);

    }
}