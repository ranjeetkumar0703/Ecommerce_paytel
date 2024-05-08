package com.Ecommerce.paytel.controller;


import com.Ecommerce.paytel.entity.SubAdmin;
import com.Ecommerce.paytel.service.SubAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subadmins")
public class SubAdminController {

    @Autowired
    private SubAdminService subAdminService;

    @GetMapping
    public List<SubAdmin> getAllSubAdmins() {
        return subAdminService.getAllSubAdmins();
    }

    @GetMapping("/{id}")
    public SubAdmin getSubAdminById(@PathVariable("id") long id) {
        return subAdminService.getSubAdminById(id);
    }

    @PostMapping
    public SubAdmin saveSubAdmin(@RequestBody SubAdmin subAdmin) {
        return subAdminService.saveSubAdmin(subAdmin);
    }

    @DeleteMapping("/{id}")
    public void deleteSubAdmin(@PathVariable("id") long id) {
        subAdminService.deleteSubAdmin(id);
    }
}
