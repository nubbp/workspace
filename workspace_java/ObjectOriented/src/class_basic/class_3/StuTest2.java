package class_basic.class_3;

import java.util.Scanner;

public class StuTest2 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         boolean isRunning = true;
         StuManage stuManage = new StuManage();

         while (isRunning) {
             System.out.println("-------------------");
             System.out.print("1) 학생등록 2)학생정보변경(연락처) 3)학생정보출력 4)모든학생정보출력  5)프로그램 종료 :");
             int menu = sc.nextInt();

             switch (menu) {
                 case 1:
                     stuManage.regInfo();
                     break;
                 case 2:
                     stuManage.changeInfo();
                     break;
                 case 3:
                     stuManage.print();
                     break;
                 case 4:
                     stuManage.printAll();
                     break;
                 case 5:
                     System.out.println("프로그램 종료");
                     isRunning = false;
             }
         }

     }

}
