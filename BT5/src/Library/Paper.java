package Library;

public class Paper {
    
    private String MaTailieu;
    private String TenTailieu;
    private String NXB;
    private Integer Taiban;
    public Paper(String maTailieu, String tenTailieu, String nXB, Integer taiban) {
        MaTailieu = maTailieu;
        TenTailieu = tenTailieu;
        NXB = nXB;
        Taiban = taiban;
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
    public Integer getTaiban() {
        return Taiban;
    }
    public void setTaiban(Integer taiban) {
        Taiban = taiban;
    }
    @Override
    public String toString() {
        return "Paper [MaTailieu=" + MaTailieu + ", TenTailieu=" + TenTailieu + ", NXB=" + NXB + ", Taiban=" + Taiban
                + "]";
    }   
}
