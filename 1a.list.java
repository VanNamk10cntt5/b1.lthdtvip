package bai1a;

import java.util.ArrayList;

public class List {
	Vehicle v = new Vehicle();
	public ArrayList<Vehicle> ds;
	public List() {
		this.ds = new ArrayList<Vehicle>();
	}
	public List(ArrayList<Vehicle> ds) {
		this.ds = ds;
	}
	public void add(Vehicle v) {
		this.ds.add(v);
	}
	public void hien() {
		System.out.format("%-30s %-30s %30s %30s %30s\n",
                "Ten chu xe",
                "Loai xe",
                "Dung tich",
                "Tri gia",
                "Thue phai nop");
        System.out.println("===============================================================================================================================================================");
        for (Vehicle ds : ds) {
            System.out.format("%-30s %-30s %30s %30.2f %30.2f\n",
                    ds.getTenCX(),
                    ds.getLoaiXe(),
                    ds.getDungTich(),
                    ds.getTriGia(),
                    ds.tinhThue()
            );
        }
	}
	
	}
