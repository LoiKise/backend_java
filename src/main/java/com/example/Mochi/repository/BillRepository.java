package com.example.Mochi.repository;

import com.example.Mochi.entity.Bill;
import com.example.Mochi.entity.Bill_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface BillRepository extends JpaRepository<Bill, Bill_ID>{
    @Query(nativeQuery = true, value = "select * from Bill where donhangId =?1")
    List<Bill> getCTDHByMadh(int donhangId);

    @Query(nativeQuery = true, value = "select * from Bill where donhangId =?1")
    List<Bill> postCTDHByMadh(int donhangId);

    @Query(nativeQuery = true, value = "delete from Bill where donhangId =?1")
    List<Bill> deleteCTDHByDonhang(int donhangId);
}
