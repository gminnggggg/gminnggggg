package KoreanWave;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class Music {

    public static void second_item(String str) throws InterruptedException, Exception {
        if ("1".equals(str)) {
            kpop();
            Thread.sleep(1000);
            start();
        } else if ("2".equals(str)) {
            kpop_history();
            Thread.sleep(1000);
            start();
        } else if ("4".equals(str)) {
            kpop_back();
            Thread.sleep(1000);
        } else if ("3".equals(str)) {
            Memo.memo();
            start();
        } else {
            throw new IOException("잘못된 항목입니다.");
        }
        
    }
    public static void start() throws Exception {
        Thread.sleep(1000);
        Scanner scanner_start = new Scanner(System.in);
        while (true) {
        System.out.println("음악에서의 한류");
        System.out.println("-------------------------");
        System.out.println("1. K-pop이란?");
        System.out.println("2. K-pop의 역사");
        System.out.println("3. 메모하기");
        System.out.println("4. 돌아가기");
        System.out.println("-------------------------\n");
        System.out.print(" 숫자을 입력하시오.");
        String str = scanner_start.nextLine();
        try {
            second_item(str);
            break;
        } catch (IOException e) {
            System.out.println("항목이 존재하지 않거나 파일이 존재하지 않습니다.");
            Thread.sleep(1000);
        }
    }
        scanner_start.close();


    }
    public static void kpop() throws IOException, InterruptedException {
        Thread.sleep(1000);
        Scanner scanner_f = new Scanner(new File("/Users/gmin/Desktop/한국외국어대학교/2-2/객체지향프로그래밍/KoreanWave/kpop.txt"));
        System.out.println(scanner_f.nextLine());
        scanner_f.close();
    }
    public static void kpop_history() throws InterruptedException {
        y_1990 y1990 = new y_1990();
        y_2000 y2000 = new y_2000();
        y_2010 y2010 = new y_2010();
        y_2020 y2020 = new y_2020();

        Thread.sleep(1000);
        System.out.println("한류의 역사");
        System.out.println("-------------------------");
        y1990.GetYear();
        y1990.GetContent();
        System.out.print("1990년대의 kpop 가수는 이러합니다.");
        y1990.GetMem();
        System.out.println("-------------------------");
        y2000.GetYear();
        y2000.GetContent();
        System.out.print("2000년대의 kpop 가수는 이러합니다.");
        y2000.GetMem();
        System.out.println("-------------------------");
        y2010.GetYear();
        y2010.GetContent();
        System.out.print("2010년대의 kpop 가수는 이러합니다.");
        y2010.GetMem();
        System.out.println("-------------------------");
        y2020.GetYear();
        y2020.GetContent();
        System.out.print("2020년대의 kpop 가수는 이러합니다.");
        y2020.GetMem();
        System.out.println("-------------------------");

    }

    public static void kpop_back() throws InterruptedException, Exception {
        KoreanWave.main(null);
    }


}



