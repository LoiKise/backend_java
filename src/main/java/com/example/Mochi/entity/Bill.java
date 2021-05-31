package com.example.Mochi.entity;

import javax.persistence.*;

@Entity
@Table(name = "bill")
public class Bill {

    @EmbeddedId
    private Bill_ID billId;
    private int soluong;

    @ManyToOne
    @MapsId("donhangId")
    @JoinColumn(name = "donhangId")
    private DonHang donhang;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "productId")
    private Product product;


    public Bill_ID getBillId() {
        return billId;
    }

    public void setBillId(Bill_ID billId) {
        this.billId = billId;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
