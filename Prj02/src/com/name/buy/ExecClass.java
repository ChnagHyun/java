package com.name.buy;

public class ExecClass {
   public static void main(String[] args) {
      //1. 회원등록
      CustomClass c1 = new CustomClass(001, "한국진", 29, new ProductClass[10]);       //회원 c1 객체 생성
      CustomClass c2 = new CustomClass(002, "임경세", 27, new ProductClass[10]);      //회원 c2객체 생성
            
      // 장바구니 생성도 하는 회원 생성
      CustomClass c3 = new CustomClass(003, "박창현", 28, new ProductClass[10]);      //회원 c3객체 생성
      
      
      c1.customInfo();
      c2.customInfo();
      c3.customInfo();
      System.out.println();
      
      //2. 상품등록
      //새우깡(100,1000), 콜라(500, 2000), 천하장사(1000, 800), 빼빼로(300, 1500), 사이다(500, 2000)
      ProductClass p1 = new ProductClass(001, "새우깡", 100, 1000);
      ProductClass p2 = new ProductClass(002, "콜라", 500, 2000);
      ProductClass p3 = new ProductClass(003, "천하장사", 1000, 800);
      ProductClass p4 = new ProductClass(004, "빼빼로", 300, 1500);
      ProductClass p5 = new ProductClass(005, "사이다", 500, 2000);
      
      p1.productInfo();
      p2.productInfo();
      p3.productInfo();
      p4.productInfo();
      p5.productInfo();
      System.out.println();
      
      //3. 상품구매 - 장바구니 담기(물건, 수량)
      c3.addToCart(p1, 10);      
      c3.purchase();
      
      
   }
}