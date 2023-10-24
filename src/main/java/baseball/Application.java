package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;


public class Application {
    static List<Integer> computer;  // 컴퓨터 랜덤값
    static List<Integer> user;      // 사용자 입력값
    static int strike;              // strike 수
    static int ball;                // ball 수
    static int digitNumber;         // 대상값 자릿수
    public static void main(String[] args) {
        digitNumber = 3;  // 대상값 자릿수 설정(3자리)

        while (true) {
            // 게임 시작
            startGame();

            // 게임이 끝났을 때 재시작 여부 결정
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            String userString = Console.readLine();
            if (!restartGame(userString)) {
                break;
            }
        }
    }

    private static void startGame() {
        System.out.println("숫자 야구 게임을 시작합니다.");

        // 컴퓨터 랜덤값 입력
        computer = new ArrayList<>();
        inputComputer();

        while (true) {
            strike = 0;
            ball = 0;

            // 사용자 랜덤값 입력
            System.out.print("숫자를 입력해주세요 : ");
            String userString = Console.readLine();
            user = new ArrayList<>();
            inputUser(userString);
            // 값 비교
            compareValue();
            // 힌트값 출력
            printHint();

            if (isAnswer()) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                break;
            }
        }
    }

    private static void inputComputer() {
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1,9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
    }

    private static void inputUser(String userString) {
        if (!isCorrectInput(userString)) {
            throw new IllegalArgumentException();
        }
        for (String str : userString.split("")) {
            int num = Integer.parseInt(str);
            if (user.contains(num)) {
                throw new IllegalArgumentException();
            }
            user.add(num);
        }
    }

    private static boolean isCorrectInput(String userString) {

    }

    private static void compareValue() {

    }

    private static void printHint() {

    }

    private static boolean isAnswer() {
        //return ;
    }

    private static boolean restartGame(String userString) {
        //return ;
    }
}
