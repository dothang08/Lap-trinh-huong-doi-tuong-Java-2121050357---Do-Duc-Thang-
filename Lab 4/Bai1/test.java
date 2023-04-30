package Bai1_1;

public class test {
	public static void main(String[] args) {
		BenhVien benhVien1 = new BenhVien(" Benh vien Da Khoa tinh Son La", "Son La","Do Duc Thang");
		
		BenhNhan benhNhan1 = new BenhNhan(" Khong", " Binh Thuong", benhVien1);
		BenhNhan benhNhan2 = new BenhNhan(" ABC ", " Benh AC ", benhVien1);
		
		System.out.println(benhNhan1.toString());
		System.out.println(benhNhan2.toString());
	}
}
