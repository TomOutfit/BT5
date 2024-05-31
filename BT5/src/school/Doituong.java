package school {
    
public class Doituong {
    private String Madoituong;
    private String Tendoituong;
    private Boolean gioitinh;
    private String Yob;
    public Doituong(String madoituong, String tendoituong, Boolean gioitinh, String yob) {
        Madoituong = madoituong;
        Tendoituong = tendoituong;
        this.gioitinh = gioitinh;
        Yob = yob;
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
    public Boolean getGioitinh() {
        return gioitinh;
    }
    public void setGioitinh(Boolean gioitinh) {
        this.gioitinh = gioitinh;
    }
    public String getYob() {
        return Yob;
    }
    public void setYob(String yob) {
        Yob = yob;
    }
    @Override
    public String toString() {
        return "Doituong [Madoituong=" + Madoituong + ", Tendoituong=" + Tendoituong + ", gioitinh=" + gioitinh
                + ", Yob=" + Yob + "]";
    }
    
}    
}