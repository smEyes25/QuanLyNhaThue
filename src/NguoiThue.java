
import java.util.Date;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LongNguyen
 */
public class NguoiThue {
    private int ma;
    private String ten, cmnd, que;
    private String ngayThue;
    private Date date;

    public NguoiThue() {
    }

    public NguoiThue(int ma, String ten, String cmnd, String que, String ngayThue) {
        this.ma = ma;
        this.ten = ten;
        this.cmnd = cmnd;
        this.que = que;
        this.ngayThue = ngayThue;
    }

    public NguoiThue(int ma, String ten, String cmnd, String que, String ngayThue, Date date) {
        this.ma = ma;
        this.ten = ten;
        this.cmnd = cmnd;
        this.que = que;
        this.ngayThue = ngayThue;
        this.date = date;
    }
    
    

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getCmnd() {
        return cmnd;
    }

    public String getQue() {
        return que;
    }

    public String getNgayThue() {
        return ngayThue;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public void setNgayThue(String ngayThue) {
        this.ngayThue = ngayThue;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
}
