package com.Ecommerce.paytel.service;


import com.Ecommerce.paytel.entity.SubAdmin;

import java.util.List;

public interface SubAdminService {
    List<SubAdmin> getAllSubAdmins();
    SubAdmin getSubAdminById(long id);
    List<SubAdmin> saveSubAdmins(List<SubAdmin> subAdmins);
    void deleteSubAdmin(long id);

    SubAdmin saveSubAdmin(SubAdmin subAdmin);
}
