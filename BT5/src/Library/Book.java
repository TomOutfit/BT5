package Library {

public class Book {

private String MaTailieu;
private String TenTailieu;
private String NXB;
private Integer Sotrang;
public Book(String maTailieu, String tenTailieu, String nXB, Integer sotrang) {
    MaTailieu = maTailieu;
    TenTailieu = tenTailieu;
    NXB = nXB;
    Sotrang = sotrang;
}
public String getMaTailieu() {
    return MaTailieu;
}
public void setMaTailieu(String maTailieu) {
    MaTailieu = maTailieu;
}
public String getTenTailieu() {
    return TenTailieu;
}
public void setTenTailieu(String tenTailieu) {
    TenTailieu = tenTailieu;
}
public String getNXB() {
    return NXB;
}
public void setNXB(String nXB) {
    NXB = nXB;
}
public Integer getSotrang() {
    return Sotrang;
}
public void setSotrang(Integer sotrang) {
    Sotrang = sotrang;
}
@Override
public String toString() {
    return "Book [MaTailieu=" + MaTailieu + ", TenTailieu=" + TenTailieu + ", NXB=" + NXB + ", Sotrang=" + Sotrang
            + "]";
}
}
}