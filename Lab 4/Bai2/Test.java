package Bai_2;

public class Test {
	public static void main(String[] args) {
		Truong truong1 = new Truong("Ten truong: Dai hoc Mo Dia Chat", "Dia chi: 18 Pho Vien", "Hieu Truong: GS.TS Trần Thanh Hải");
		SinhVien sinhVien1 = new SinhVien("Lop DCCTCT66C2 ", "Nganh: CNTT", truong1);
		
		System.out.println(sinhVien1.toString());
	}
}
