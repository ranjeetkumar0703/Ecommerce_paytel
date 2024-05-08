package com.Ecommerce.paytel.serviceImpl;


import com.Ecommerce.paytel.entity.SubAdmin;
import com.Ecommerce.paytel.repository.SubAdminRepository;
import com.Ecommerce.paytel.service.SubAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubAdminServiceImpl implements SubAdminService {

    @Autowired
    private SubAdminRepository subAdminRepository;

    @Override
    public List<SubAdmin> getAllSubAdmins() {
        return subAdminRepository.findAll();
    }

    @Override
    public SubAdmin getSubAdminById(long id) {
        return subAdminRepository.findById(id).orElse(null);
    }

    @Override
    public List<SubAdmin> saveSubAdmins(List<SubAdmin> subAdmins) {
        return subAdminRepository.saveAll(subAdmins);
    }

    @Override
    public void deleteSubAdmin(long id) {
        subAdminRepository.deleteById(id);
    }

    @Override
    public SubAdmin saveSubAdmin(SubAdmin subAdmin) {
        return subAdminRepository.save(subAdmin);
    }
}
