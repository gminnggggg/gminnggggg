package KoreanWave;

import java.io.*;
import java.util.Scanner;

public class Memo {
    public static void memo() throws InterruptedException, Exception {
        Scanner scanner = new Scanner(System.in);
        File newFile = new File("/Users/gmin/Desktop/한국외국어대학교/2-2/객체지향프로그래밍/KoreanWave/memo.txt");

        if(!newFile.exists()) {
            newFile.createNewFile();
        }
        FileWriter fw = new FileWriter(newFile);
        System.out.println("메모할 내용을 입력하세요 : ");
        String s = scanner.nextLine();
        fw.write(s);
        fw.close();
    }
    

}
