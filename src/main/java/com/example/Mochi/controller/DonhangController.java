package com.example.Mochi.controller;


import com.example.Mochi.entity.CTDH;
import com.example.Mochi.entity.DonHang;
import com.example.Mochi.entity.User;
import com.example.Mochi.repository.DonhangRepository;
import com.example.Mochi.service.DonhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class DonhangController {

    @Autowired
    private DonhangService service;

    @Autowired
    private DonhangRepository repository;

//    @PostMapping()
//    public @ResponseBody
//     DonHang createDonhang(@RequestBody CTDH ctdh){
//        DonHang result = service.createDonhang(ctdh);
//        boolean b = Objects.nonNull(result);
//
//        if(Boolean.TRUE.equals(b))
//        {
//            //call service to insert order detail
//            // CREATEDETAI(list<int> produc result.getDOm)
//            System.out.println("don hang:  " +  result.getDonhangId());
//        }
//
//        //call service to insert order detail
//          // CREATEDETAI(list<int> product
//        //      , int donhangid)
//
//        return result;
//
//    }
    @GetMapping()
    public List<DonHang> getAll(){
        return service.getAllDonhang();
    }
    //get DonhangById
    @GetMapping("/{id}")
    public Optional<DonHang> getDonhangById(@PathVariable("id") int id){
        return service.getById(id);
    }
    //getByUserid
    @GetMapping("/user")
    public List<DonHang> getByUserId(@RequestParam(value = "user", required = false) User user)
    {
        return repository.getDonhangByUserId(user);
    }

    @PutMapping()
    public String updateDonhang(@RequestBody DonHang donHang) {
        return service.putDonhang(donHang);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public String deleteDonhang(@PathVariable("id") int id){
            return  service.deleteDonhangById(id);
    }

}
