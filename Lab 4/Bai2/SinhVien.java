package Bai_2;

public class SinhVien {

	private String lop, nganh;
	private Truong truong;
	public SinhVien(String lop, String nganh, Truong truong) {
		this.lop = lop;
		this.nganh = nganh;
		this.truong = truong;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getNganh() {
		return nganh;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	public Truong getTruong() {
		return truong;
	}
	public void setTruong(Truong truong) {
		this.truong = truong;
	}
	@Override
	public String toString() {
		return lop + " - " + nganh + " - " + truong;
	}
	
	
	
}
