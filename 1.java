public class Main {
  static void hitungVoucher(String voucher, int money) {
    
    if(voucher == "DumbWaysJos" && money>=50000) {
      double res = money*21.1/100;
      if(res > 20000) {
      	double uang = money - 20000;
        double kembalian = money - uang;
        double diskon = 20000;
        
        print(uang, diskon, kembalian);
      }
      else {
        double uang1 = money - res;
        double kembalian1 = money - uang1;
        
        print(uang1, res, kembalian1);
      }
    }
    
    if(voucher == "DumbWaysMantap" && money>=80000) {
      double res1 = money*30/100;
      if(res1 > 40000) {
      	double uang2 = money - 40000;
        double kembalian2 = money - uang2;
        double diskon = 40000;
        
        print(uang2, diskon, kembalian2);
      }
        
      else {
      	double uang3 = money - res1;
        double kembalian3 = money - uang3;
        
        print(uang3, res1, kembalian3);
      }
    }
  }
  
  static void print(double harus_bayar, double diskon, double kembalian) {
    System.out.println("Uang yang harus dibayar: "+harus_bayar);
    System.out.println("Diskon: "+diskon);
    System.out.println("Kembalian: " + kembalian);
  }
  
  public static void main(String[] args) {
    hitungVoucher("DumbWaysJos", 100000);
  }
}
