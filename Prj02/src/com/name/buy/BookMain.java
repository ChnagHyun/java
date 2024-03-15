package com.name.buy;

import java.util.Scanner;
import java.util.ArrayList;

public class BookMain {
	public static ArrayList<BookClass> books = new ArrayList<>();	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System. in);
		
	 a: while(true) {		
			System.out.println("-------------------------------");
			System.out.println("1. 도서 등록 ");
			System.out.println("2. 도서 검색 ");
			System.out.println("3. 도서 삭제 ");
			System.out.println("4. 도서 확인 ");
			System.out.println("5. 도서 구입 ");
			System.out.println("6. 종료");
			System.out.println("-------------------------------");
		int var1 = sc.nextInt();
		
		switch(var1) {
		case 1:				//도서 등록
			add();
			break;
		case 2:				//도서 검색
			search();
			break;
		case 3:				//도서 삭제
			remove();
			break;
		case 4:				//도서 확인
			list();
			break;			
		case 5:				//도서 구입
			purchase();
			break;			
		case 6:
			System.out.println("종료합니다.");
			break a;
		default :
			System.out.println("다시 입력해주세요.");
			}			
		}
	}	
	//도서등록
	public static void add() {						
		Scanner sc = new Scanner(System.in);
		System.out.println("1.전자책 | 2.종이책");
		int var2 = sc.nextInt();
		switch(var2) {
		case 1:
			ebook() ;
			break;
		case 2:
			paperbook();
			break;
		default:
			System.out.println("다시 입력해주세요.");
			
		}
	}
	//전자책
	public static void ebook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("도서 제목을 작성해주세요.");
		String title = sc.nextLine();
		System.out.println("저자를 작성해주세요.");
		String author = sc.nextLine();
		System.out.println("출판사를 작성해주세요.");
		String house = sc.nextLine();
		System.out.println("가격을 적어주세요.");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.println("호환 기기가 무엇인가요?");
		String phone = sc.nextLine();
		
		books.add(new EBooksClass(title, author, price, house, phone));		
	}
	//종이책
	public static void paperbook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("도서 제목을 작성해주세요.");
		String title = sc.nextLine();
		System.out.println("저자를 작성해주세요.");
		String author = sc.nextLine();
		System.out.println("출판사를 작성해주세요.");
		String house = sc.nextLine();
		System.out.println("가격을 적어주세요.");
		int price = sc.nextInt();
		System.out.println("페이지 수가 몇쪽까지 인가요?");
		int paper = sc.nextInt();
		
		books.add(new PaperBookClass(title, author, price, house, paper));
	}
	//도서 검색
	public static void search() {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 도서나 작가가 무엇인가요?");
		String keyword =sc.nextLine();
		
		int index = bookIndex2(keyword);
		if(index == -1) {
			System.out.println("해당 도서나 작가가 없습니다.");
			return;
		}
		books.get(index).getTitle();
		System.out.println("해당 도서 및 작가를 찾았습니다.");
		System.out.println(books.get(index).getTitle());
		
	}
	//도서 삭제
	public static void remove() {
		Scanner sc = new Scanner(System.in);
		System.out.print("제외할 도서가 무엇인가요?");
		String title =sc.nextLine();
		
		int index = bookIndex(title);
		if(index == -1) {
			System.out.println("해당 도서가 없습니다.");
			return;
		}				
			books.remove(index);
			System.out.println("도서가 삭제되었습니다.");
		
	}
	//도서 확인
	public static void list() {
		int totalPrice = 0;
		for(int i = 0 ; i < books.size(); i++) {
			System.out.println("지금 담은 책은 " + books.get(i).getTitle());
			totalPrice += books.get(i).getprice();
			
		}
		System.out.println("담은 책의 가격은 " + totalPrice + "원 입니다.(세금 미포함)");
		
	}
	//도서 구입
	public static void purchase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("구매할 도서는 1.전자책 | 2.종이책인가요?");
		int var3 = sc.nextInt();
		int i = 0;
		int totalPrice2 = 0;
		if(var3 ==1) {
			totalPrice2 += (int)(books.get(i).getprice() * books.get(i).gettax());
			System.out.println("구매한 가격은:" + totalPrice2 + "입니다.");
		}else if(var3 ==2) {
			totalPrice2 += (int)(books.get(i).getprice() * books.get(i).gettax());
			System.out.println("구매한 가격은:" + totalPrice2 + "입니다.");
		}
		
	}
	
	private static int bookIndex(String title) {
		for( int i = 0; i< books.size(); i++) {
			if(books.get(i).getTitle().equals(title)) {
				return i;
			}
		}
		return -1;
	}
	private static int bookIndex2(String keyword) {
		for( int i = 0 ; i < books.size(); i++) {
			if(books.get(i).getauthor().equals(keyword)||books.get(i).getTitle().equals(keyword)) {
				return i;
			}
		}
		return -1;
	}
}