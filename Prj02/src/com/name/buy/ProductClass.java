package com.name.buy;

public class ProductClass {
   //field
   String name;   //제품명
   int id;         //제품번호
   int price;      //제품가격
   int quantity;   //제물 재고량
   
   //constructor
   ProductClass(int id, String name, int quantity, int price){
      this.id = id;
      this.name = name;
      this.quantity = quantity;
      this.price = price;
   }
   
   void productInfo() {
      String str = "제품번호: " + id + ", 제품명: " + name + ", 갯수: " + quantity + ", 가격: " + price;  
      System.out.println(str);
   }
   
   boolean check(int purchaseQty) {   //구입가능한지 확인
      return this.quantity >= purchaseQty ? true : false;
   }
}