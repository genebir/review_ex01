package org.song.myapp;

import java.util.ArrayList;
import java.util.List;

public class SongApp {


    public static void main(String[] args) {
        List<SongVO> songList = new ArrayList<SongVO>();

        SongController cont = new SongController();

        boolean energy = true;
        while (energy) {
            System.out.println("1) 입력  2) 재생 목록  3) 검색  4) 수정  5) 삭제  6) 종료");
            int choice = cont.sc.nextInt();
            switch (choice) {
                case 1: cont.addList(songList); break;
                case 2: cont.outList(songList); break;
                case 3: cont.searchList(songList); break;
                case 4: cont.modifyList(songList); break;
                case 5: cont.deleteList(songList); break;
                case 6:
                    System.out.println("종료합니다");
                    energy = false; break;
            }
        }
    }

}
