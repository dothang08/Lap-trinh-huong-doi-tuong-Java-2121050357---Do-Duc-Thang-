package Bai1_1;

public class BenhNhan {
	private String tieuSu;
	private String chuanDoan;
	private BenhVien benhvien;
	public BenhNhan(String tieuSu, String chuanDoan, BenhVien benhvien) {
		this.tieuSu = tieuSu;
		this.chuanDoan = chuanDoan;
		this.benhvien = benhvien;
	}
	public String getTieuSu() {
		return tieuSu;
	}
	public void setTieuSu(String tieuSu) {
		this.tieuSu = tieuSu;
	}
	public String getChuanDoan() {
		return chuanDoan;
	}
	public void setChuanDoan(String chuanDoan) {
		this.chuanDoan = chuanDoan;
	}
	public BenhVien getBenhvien() {
		return benhvien;
	}
	public void setBenhvien(BenhVien benhvien) {
		this.benhvien = benhvien;
	}
	@Override
	public String toString() {
		return "BenhNhan [tieuSu =" + tieuSu + ", chuanDoan =" + chuanDoan + ", " + benhvien + "]";
	}
	
	
	
	
}
