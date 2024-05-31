package school;

public class Teacher {

private String Madoituong, Tendoituong, Yob, Monday, Trinhdo;
private boolean gioitinh;
public Teacher(String madoituong, String tendoituong, String yob, String monday, String trinhdo, boolean gioitinh) {
    Madoituong = madoituong;
    Tendoituong = tendoituong;
    Yob = yob;
    Monday = monday;
    Trinhdo = trinhdo;
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
public String getMonday() {
    return Monday;
}
public void setMonday(String monday) {
    Monday = monday;
}
public String getTrinhdo() {
    return Trinhdo;
}
public void setTrinhdo(String trinhdo) {
    Trinhdo = trinhdo;
}
public boolean isGioitinh() {
    return gioitinh;
}
public void setGioitinh(boolean gioitinh) {
    this.gioitinh = gioitinh;
}
@Override
public String toString() {
    return "Teacher [Madoituong=" + Madoituong + ", Tendoituong=" + Tendoituong + ", Yob=" + Yob + ", Monday=" + Monday
            + ", Trinhdo=" + Trinhdo + ", gioitinh=" + gioitinh + "]";
}
}
