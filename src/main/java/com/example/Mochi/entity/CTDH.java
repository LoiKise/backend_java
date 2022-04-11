package com.example.Mochi.entity;

import java.util.List;

public class CTDH {
    private DonHang donHang;
    private Product product;
    private List<String> products;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public DonHang getDonHang() {
        return donHang;
    }

    public void setDonHang(DonHang donHang) {
        this.donHang = donHang;
    }
}
