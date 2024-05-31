package school {

public class Student {

 private String Madoituong, Tendoituong, Yob, lop, ban;
 private boolean gioitinh;
public Student(String madoituong, String tendoituong, String yob, String lop, String ban, boolean gioitinh) {
    Madoituong = madoituong;
    Tendoituong = tendoituong;
    Yob = yob;
    this.lop = lop;
    this.ban = ban;
    this.gioitinh = gioitinh;
}
public String getMadoituong() {
    return Madoituong;
}
public void setMadoituong(String madoituong) {
    Madoituong = madoituong;
}
public String getTendoituong() {
    return Tendoituong;
}
public void setTendoituong(String tendoituong) {
    Tendoituong = tendoituong;
}
public String getYob() {
    return Yob;
}
public void setYob(String yob) {
    Yob = yob;
}
public String getLop() {
    return lop;
}
public void setLop(String lop) {
    this.lop = lop;
}
public String getBan() {
    return ban;
}
public void setBan(String ban) {
    this.ban = ban;
}
public boolean isGioitinh() {
    return gioitinh;
}
public void setGioitinh(boolean gioitinh) {
    this.gioitinh = gioitinh;
}
@Override
public String toString() {
    return "Student [Madoituong=" + Madoituong + ", Tendoituong=" + Tendoituong + ", Yob=" + Yob + ", lop=" + lop
            + ", ban=" + ban + ", gioitinh=" + gioitinh + "]";
}
}
}
