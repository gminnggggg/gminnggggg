package KoreanWave;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class first_item {
    public void mean() throws IOException{
        Scanner scanner_m = new Scanner(new File("/Users/gmin/Desktop/한국외국어대학교/2-2/객체지향프로그래밍/KoreanWave/koreanwave.txt"));
        System.out.println(scanner_m.nextLine());
        scanner_m.close();
    }

    public void music() throws Exception {
        Music.start();
    }

    public void movie() throws InterruptedException, Exception {
        Movie.movie();
    }

    public void fin() {
        System.out.println("\n프로그램을 종료합니다");
        return;
    }

    public void memo() throws InterruptedException, Exception {
        Memo.memo();
        KoreanWave.main(null);
    }
}
