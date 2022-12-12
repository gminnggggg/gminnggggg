package KoreanWave;

import java.util.Scanner;
import java.io.IOException;

public class KoreanWave {

    public static void start() {
        System.out.println("한류");
        System.out.println("-------------------------");
        System.out.println("1. 한류의 어원");
        System.out.println("2. 음악에서의 한류");
        System.out.println("3. 드라마, 영화에서의 한류");
        System.out.println("4. 메모하기");
        System.out.println("5. 종료하기");
        System.out.println("-------------------------\n");
        System.out.print(" 숫자을 입력하시오 : ");
    }


    public static void judge(String str) throws Exception {
        first_item j = new first_item();
        if ("1".equals(str)) {
            j.mean();
            main(null);
        } else if ("2".equals(str)) {
            j.music();
        } else if ("3".equals(str)) {
            j.movie();
        } else if ("5".equals(str)) {
            j.fin();
        } else if ("4".equals(str)) {
            j.memo();
        } else {
            throw new IOException("잘못된 항목입니다.");
        }
    }

    public static void main(String[] args) throws InterruptedException, Exception {
        Thread.sleep(1000);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            start();
            String start_str = scanner.nextLine();
            try {
                judge(start_str);
                break;
            } catch (IOException e) {
                System.out.println("항목이 존재하지 않거나 파일이 존재하지 않습니다.");
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("항목이 존재하지 않거나 파일이 존재하지 않습니다.");
                Thread.sleep(1000);
            }
            
        
        }
        
        scanner.close();

    
}
}