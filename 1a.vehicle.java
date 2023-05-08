package bai1a;

import java.util.Scanner;

public class Vehicle {
	public String tenCX;
	public String loaiXe;
	public int dungTich;
	public double triGia;
	
	public Vehicle() {
		
	}
	public Vehicle(String tenCX, String loaiXe,int dungTich,double triGia) {
		this.tenCX = tenCX;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.triGia = triGia;

	}
	public String getTenCX() {
		return tenCX;
	}
	public void setTenCX(String tenCX) {
		this.tenCX = tenCX;
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}
	public int getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}
	public double getTriGia() {
		return triGia;
	}
	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}
	public double tinhThue() {
		double thue;
		if(dungTich<100)
			return thue = 0.01*triGia;		
		if(dungTich>200) 
			return thue = 0.05*triGia;
		return thue = 0.03*triGia;
		
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten chu xe");
		tenCX = sc.nextLine();
		System.out.println("Nhap loai xe");
		loaiXe = sc.nextLine();
		System.out.println("Nhap dung tich");
		dungTich = sc.nextInt();
		System.out.println("Nhap tri gia");
		triGia = sc.nextDouble();
		
		
	}
	
	
	
}
