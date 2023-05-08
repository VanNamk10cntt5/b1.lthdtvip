package bai1b;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;



public class HangThucPham {
	public String maHang;
	public String tenHang;
	public double donGia;
	public LocalDate ngaySX;
	public LocalDate ngayHH;
	
	public HangThucPham(String maHang, String tenHang,double donGia,LocalDate ngaySX,LocalDate ngayHH) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.ngaySX = ngaySX;
		this.ngayHH = ngayHH;
	}
	public HangThucPham(String maHang) {
		this.maHang = maHang;
	}
	public double getDonGia() {
		return 0;
	}
	public String getMaHang() {
		return maHang;
	}
	public LocalDate getNgayHH() {
		return LocalDate.now();
	}
	public LocalDate getNgaySX() {
		return LocalDate.now();
	}
	public String getTenHang() {
		return null;
	}
	private void setMaHang(String maHang) throws Exception{
		if(!maHang.trim().equals(""))
			this.maHang =maHang;
		else
			throw new Exception("Loi : ma hang rong");
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public void setNgayHH(LocalDate ngayHH) {
		this.ngayHH = ngayHH;
	}
	public void setNgaySX(LocalDate ngaySX) {
		this.ngaySX = ngaySX;
	}
	public boolean ktra() {
		return ngayHH.isBefore(LocalDate.now()) ? true : false;
				
	}
@Override
	public String toString() {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	DecimalFormat df = new DecimalFormat("#,##0.00");
	var dg = df.format(donGia);
	String sx = sdf.format(ngaySX);
	String hh = sdf.format(ngayHH);
	return maHang + tenHang + dg + sx + hh + ktra();
	}	
}
