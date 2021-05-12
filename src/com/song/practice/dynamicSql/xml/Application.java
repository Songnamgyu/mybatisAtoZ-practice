package com.song.practice.dynamicSql.xml;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("================== 동적 SQL 테스트 ================");
			System.out.println("1. if 확인하기");
			System.out.println("2. choose(when, otherwise) 확인하기");
			System.out.println("3. foreach 확인하기");
			System.out.println("4. trim(set, where) 확인하기");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 번호를 입력해주세요 :");
			int no = sc.nextInt();
			
			switch(no) {
			case 1 : ifSubMenu(); break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 9 : break;
			
			}

		}while(true);

	}
	
	private static void ifSubMenu() {
		
		Scanner sc = new Scanner(System.in);
		MenuService menuService = new MenuService();
		do {
			System.out.println("if 서브메뉴 선택해주세요~");
			System.out.println("1. 원하는 금액대에 메뉴 보여줄게요~");
			System.out.println("2. 메뉴이름, 카테고리로 검색하기");
			System.out.println("9. 이전 메뉴로");
			System.out.println("메뉴 번호를 입력해주세요 : ");
			
			int no = sc.nextInt();
			switch(no) {
			case 1 : menuService.showMenu(inputPrice()); break;
			case 2 : break;
			case 9 : break;
			}
			
		}while(true);
	}

	private static int inputPrice() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가격을 입력해주세요");
		int price = sc.nextInt();
		
		return price;
	}
}
