package com.name.buy;

public class CustomClass {
   //field
   String name;   //회원 이름
   int id;         //회원 번호
   int age;      //회원 나이
   
   //장바구니
   ProductClass[] list;   //물품(객체)를 저장할 장바구니 역할 크기가 10인 배열
   int purchaseIndex = 0;
   int purchaseQty[] = new int [10];
   
   //constructor
   CustomClass(int id, String name, int age){
      this.id = id;
      this.name = name;
      this.age = age;      
   }
   
   CustomClass(int id, String name, int age, ProductClass[] list){
      this.id = id;
      this.name = name;
      this.age = age;
      this.list = list;
   }
   
   //method
   void customInfo() {
      String info = "회원이름: " + name +", 회원번호: " + id + ", 나이: " + age;
      System.out.println(info);
   }
   
   void addToCart(ProductClass product, int purchaseQty) {    
      boolean isOk = product.check(purchaseQty);   //입력한 제품의 수량과 재고량을 비교
      if(!isOk) {      //수량부족
         System.out.println("수량이 부족합니다. 구입가능한 수량은 " + product.quantity + "입니다.");
      }else {         //구입가능
         list[this.purchaseIndex] = product;
         this.purchaseQty[this.purchaseIndex] = purchaseQty; 
         this.purchaseIndex++;
         product.quantity -= purchaseQty;   //재고수량 = 재고수량 - 구입수량
         System.out.printf("나이가 %d살인 %s님은 %d원인 %s %d개를 장바구니에 담았습니다.\n",age,name,product.price,product.name,purchaseQty);
      }         
   }
   
  // for(int i =0 ; shoppingBasket.length ; i++) {
	//   if(list[i] != null) {
	//	   System.out.printf("%s님이 %을 %d원 구매했습니다.", this.name, list[i].name, purchaseQty[i]);
	//   }
  // }
   
   void purchase() {
      System.out.println("구매했습니다.");
      
      for(int i =0 ; list.length > i  ; i++) {
   	   if(list[i] != null) {
   		   System.out.printf("%s님이 %s을 %d개 구매했습니다.", this.name, list[i].name, purchaseQty[i]);
   	   }
      }
   }
}