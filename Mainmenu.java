package Kiosk;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Mainmenu {
    List<Mainmenu> burgerMenu = new ArrayList<>(); // 버거 메뉴
    List<Mainmenu> frozenCustardMenu = new ArrayList<>(); //아이스크림 메뉴
    List<Mainmenu> beerMenu = new ArrayList<Mainmenu>(); // 맥주
    Order order = new Order(); //장바구니 확인 후 주문
    Scanner sc = new Scanner(System.in);

    public Mainmenu() {
        burgerMenu.add(new Mainmenu());
        burgerMenu.add(new Mainmenu());
        burgerMenu.add(new Mainmenu());

        frozenCustardMenu.add(new Mainmenu());

        beerMenu.add(new Mainmenu());

    }



    public void welcomeMainmnu() {
        System.out.println("아래 메뉴판을 보시고 메누를 주문해 주세요.");
        System.out.println("BURGER MANU");
        System.out.println("1. Burgers           | 앵거 비프 통살을 다져만든 버거 ");
        System.out.println("2. Forzen Custard    | 매장에서 직접 만드는음로");
        System.out.println("3. Drinks            | 매장에서 직접 만드는 음료");
        System.out.println("4. Beer              | 뉴욕 부루클린 브루어리에서 양조한 맥주");
        System.out.println("주문");
        System.out.println("5. Order          | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel         | 주문을 취소합니다.");

        System.out.println("메뉴선택 : ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

        }

        }

    }
