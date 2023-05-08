//main
package bai1a;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List ds = new List();
		Vehicle v = new Vehicle();
		int luaChon = 0;
		do {
			System.out.println("1.nhap thong tin");
			System.out.println("2.xuat thong tin");
			System.out.println("0.thoat");
			luaChon = sc.nextInt();
			sc.nextLine();
			switch(luaChon) {
			case 1:{
				v = new Vehicle();
				v.nhap();
				ds.add(v);
				break;
			}
			case 2:{
				ds.hien();
				break;
			}
				
			}
		}while(luaChon!=0);
	}
}

