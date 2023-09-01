package com.test.controller;

import com.test.models.REGION;
import com.test.repository.RegionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FirstController {

    @Autowired
    private RegionRepo regionRepo;
    @GetMapping("/")
    public String addMaster(){
        return "Home";
    }
    @PostMapping("/getRegion")
    public ResponseEntity<?> getStudent(){
        System.out.println("api called");
        List<REGION> all = this.regionRepo.findAll();
        return ResponseEntity.ok(this.regionRepo.findAll());
    }
}
