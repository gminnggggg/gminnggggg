package KoreanWave;

import java.util.Scanner;

public class Movie {
    public static void second_it(String str) throws InterruptedException, Exception {
        if ("1".equals(str)) {
            dra_mo();
            movie();
        } else if ("2".equals(str)) {
            Memo.memo();
            movie();
        } else if ("3".equals(str)) {
            KoreanWave.main(null);
        }
        
    }

    public static void movie() throws InterruptedException, Exception {
        Thread.sleep(1000);
        System.out.println("드라마, 영화에서의 한류");
        System.out.println("-------------------------");
        System.out.println("1. 드라마, 영화에서의 한류");
        System.out.println("2. 메모하기");
        System.out.println("3. 돌아가기");
        System.out.println("-------------------------\n");
        System.out.print(" 숫자을 입력하시오.");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        second_it(num);

        
    }

    public static void dra_mo() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("드라마, 영화에서의 한류");
        System.out.println("-------------------------");
        System.out.println("오징어 게임");
        System.out.println("설명 : 황동혁 감독이 제작한 넷플릭스 오리지널 한국 드라마. 2021년 9월 17일에 공개되었다. 456명의 사람들이 456억의 상금이 걸린 미스터리한 데스 게임에 초대되면서 벌어지는 이야기를 그린 서바이벌, 데스 게임 장르의 드라마이며 제목은 골목 놀이인 오징어에서 따 왔다. 2022년 6월 13일 시즌 2 제작이 결정됐다. 영화 기생충과 더불어 세계에서 엄청난 수익을 올리며 유명해진 한국 드라마다. 기생충이 사회에서 상류층과 하류층 사이의 허물 수 없는 벽을 표현했다면, 오징어 게임은 상대적으로 가난한 사람들이 돈과 출세를 위해 물불을 안 가리고 서로 경쟁하는 적자생존의 현장을 적나라하게 표현한 드라마다.\n");
        System.out.println("평가 : 포브스에서는 오징어 게임에 대해 무조건 봐야 될 드라마라며, '폴가이즈, 살인을 곁들인'이란 제목으로 소개하는 기사가 나왔다. 또한 '가장 기이하고 매혹적인 넷플릭스 작품 중 하나'라고 평한 포브스는 구슬치기 내용이 담긴 6화 '깐부'편을 '올해 본 TV 프로그램 에피소드 중 최고'라고 극찬했고, '뛰어난 연기, 기억에 남는 캐릭터, 창의적인 사건들로 가득한 강력한 작품'이라고도 평가했다. 이 밖에도 '신선한 아이디어를 스릴 넘치는 드라마로 승화시켰다'(디사이더), '단순한 놀라움 그 이상을 선사한다'(film-rezensionen.de), '감정적인 호소력을 준다는 점에서 여느 서바이벌 장르물과 다르다'(슬레이트) 등 여러 매체의 평론가들이 호평했다.");
        System.out.println("-------------------------");
        System.out.println("기생충");
        System.out.println("설명 : 2019년에 개봉한 봉준호 감독의 7번째 장편 영화. 상류층과 하류층, 두 가족의 만남을 다룬 대한민국의 블랙 코미디 가족 드라마 영화이다.");
        System.out.println("평가 : 로튼 토마토에서는 약 150여명의 평론가가 평가할 때까지 만장일치 Fresh로 신선도 100%를 유지했다. 이후로도 2022년 10월 기준 471여명 평론가가 평가한 시점까지 썩토 7개로 신선도 99%, 평점 9.40을 기록하고 있다. IMDb에서는 10월 19일부터 한국 영화 중 1위를 유지 중이다. 메타크리틱 Critics Pick The Best Movie of 2019에서는 2020년 1월 11일 기준 434.5점으로, 2위 작품인 원스 어폰 어 타임 인 할리우드와 142점의 차이를 내며 압도적 1위를 차지했으며 2010년대 통틀어 1위다. 한국에서 상영이 종료되고 북미에서도 2021년이 되어서도 IMDb에서 평점이 올랐다. 2022년 4월 5일 기준 IMDb TOP 250에서 35위에 올라 있는데, 이는 아시아 영화 순위 중에서 3위, 2010년대 개봉 영화 2위에 해당하는 높은 평점이다. RYM에서는 역대 영화 순위 20위를 기록 중이며 2010년대 개봉 영화 중에서는 1위를 기록중이다.");
        System.out.println("-------------------------");


        
    }
}
