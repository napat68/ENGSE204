package Test1;

import java.util.Scanner;

public class Lab107 {

    // ============================
    //          Attribute
    // ============================
    // ไม่มี attribute ระดับคลาสในโปรแกรมนี้


    // ============================
    //          Method
    // ============================
    // คำนวณผลรวม N จำนวน โดยบวกสะสมทันที ไม่ใช้ array
    public static int sumNumbers(int n, Scanner sc) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();   // อ่านตัวเลขทีละตัว
            sum += num;               // บวกสะสมเข้า sum
        }

        return sum;   // คืนค่าผลรวมทั้งหมด
    }


    // ============================
    //          main Method
    // ============================
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();          // รับจำนวนตัวเลขที่จะตามมา

        int result = sumNumbers(n, sc);   // ส่งงานให้เมธอดทำการบวก

        System.out.println(result);       // แสดงผลรวม

        sc.close();
    }
}
