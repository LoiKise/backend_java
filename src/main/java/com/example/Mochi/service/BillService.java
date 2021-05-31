package com.example.Mochi.service;

import com.example.Mochi.entity.Bill;
import com.example.Mochi.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    @Autowired
    private BillRepository repository;

    public List<Bill> getBill(int donhangId){
        List<Bill> listBill = repository.getCTDHByMadh(donhangId);
        return listBill;
    }

    public String deleteCTDH(int donhangId) {

        try {
            repository.deleteCTDHByDonhang(donhangId);
        } catch (Exception e) {
            e.getMessage();
            return "false";
        }
        return "true";
    }
}
