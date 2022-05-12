
import java.util.Map;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LongNguyen
 */
public class NhaThue {
    private int ma;
    private String ten;
    private Map<Integer, NguoiThue> dsNT;

    public NhaThue() {
    }

    public NhaThue(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
        this.dsNT = new TreeMap<>();
    }

    public NhaThue(String ten) {
        this.ten = ten;
        this.dsNT = new TreeMap<>();
    }
    

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public Map<Integer, NguoiThue> getDsNT() {
        return dsNT;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDsNT(Map<Integer, NguoiThue> dsNT) {
        this.dsNT = dsNT;
    }
    
    public void themDS(NguoiThue nt) {
        dsNT.put(nt.getMa(), nt);
    } 
    public void xoaDS(int ma) {
        dsNT.remove(ma);
    }
    public void capNhatDS(int ma, NguoiThue nt) {
        dsNT.put(ma, nt);
    }
    public NguoiThue tim(int ma) {
        return dsNT.get(ma);
    }
}
