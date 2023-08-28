package day3;

import java.util.Scanner;

public class BOJ_1526 {

   static StringBuilder sb;
   
   public static void main(String[] args) {
      sb = new StringBuilder();
      Scanner sc = new Scanner(System.in);
     
      String N = sc.nextLine();
      Max(N, N.length());
     
      System.out.println(sb.toString());
   }

   //자릿수만큼 돌면서 숫자 StringBuilder에 4 또는 7 추가
   static void Max(String N, int nLength) {
      
      if(nLength == 0) return; //남은 자릿수가 없으면 끝!
     
      int firstNum = Character.getNumericValue(N.charAt(0)); //첫째자리 수
	  
	  if(firstNum == 4 || firstNum == 7) 
	  {
		  if(nLength == 1) { //N이 한자리 수인 경우
			  if(firstNum == 4) sb.append(4);
			  else sb.append(7);
		  }
		  else { //N이 한자리 수가 아닌 경우

			  int oldR = Integer.parseInt(N.substring(1)); //첫째자리 제외한 수
			  int newR = Integer.parseInt(N.substring(1).replaceAll(".", "4")); //첫째자리 제외한 나머지 4로 치환한 수
			  
			  if(oldR < newR) {
				  if(firstNum == 4) sb.append(7);
				  else{
					  sb.append(4);
					  replaceNumber(nLength-1);
					  return;
				  }
			  }
			  else {
				  if(firstNum == 4) sb.append(4);
				  else sb.append(7);
			  }
		  }
		  
		  Max(N.substring(1), nLength-1);
	  }
	  else // N<4, 4<N<7, N>7
	  {
		  if(firstNum > 7) sb.append(7);
		  else if(firstNum > 4) sb.append(4);
		  
		  replaceNumber(nLength-1);
	  }
   }
    
   //자릿수에 따라 7 추가
   static void replaceNumber(int length) {
      if(length == 0) return;
     
      for (int i = 0; i < length; i++)
         sb.append(7);
   }
}
