package com.lcl.galaxy.customer.service.provider.service;

import com.lcl.galaxy.cs.infrastructure.exception.BizException;
import com.lcl.galaxy.cs.infrastructure.page.PageObject;
import com.lcl.galaxy.customer.service.provider.entity.staff.CustomerStaff;

import java.util.List;

public interface ICustomerStaffService {

    PageObject<CustomerStaff> findCustomerStaffs(Long pageSize, Long pageIndex);

    List<CustomerStaff> findCustomerStaffs();

    PageObject<CustomerStaff> findCustomerStaffsByName(String staffName, Long pageSize, Long pageIndex);

    CustomerStaff findCustomerStaffById(Long staffId);

    Boolean createCustomerStaff(CustomerStaff customerStaff) throws BizException;

    Boolean updateCustomerStaff(CustomerStaff customerStaff);

    Boolean deleteCustomerStaffById(Long staffId);

    // Pull模式：获取OutsourcingSystem中的Customer
    void syncGetOutsourcingCustomerStaffBySystemId(Long systemId);
}
