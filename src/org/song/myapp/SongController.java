package org.song.myapp;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class SongController {

    Scanner sc = new Scanner(System.in);
    public void addList(List<SongVO> list) {
        System.out.println("노래 제목을 입력하세요");
        String title = sc.next();
        System.out.println("가수 이름을 입력하세요");
        String singer = sc.next();
        System.out.println("노래 장르를 입력하세요");
        String genre = sc.next();

        list.add(new SongVO(title, singer, genre));
    }

    public void outList(List<SongVO> list) {
        for(SongVO vo : list) {
            System.out.println(vo);
        }
    }

    public void searchList(List<SongVO> list) {
        System.out.println("검색하실 노래 제목을 입력하세요.");
        String title = sc.next();

        for(int i=0; i<list.size(); i++) {
            if(list.get(i).getTitle() == title) {
                System.out.println(list.get(i));
            }
        }
    }

    public void modifyList(List<SongVO> list) {
        System.out.println("수정을 원하시는 노래 제목을 입력하세요");
        String title = sc.next();

        for(SongVO vo : list) {
            if(vo.getTitle() == title) {
                System.out.println("변경하실 제목을 입력하세요");
                vo.setTitle(sc.next());
            }
        }
    }

    public void deleteList(List<SongVO> list) {
        System.out.println("삭제하실 곡의 제목을 입력하세요.");
        String title = sc.next();

        for(SongVO vo : list) {
            if(vo.getTitle()==title) {
                list.remove(list.indexOf(vo));
            }
        }
    }



}

