package com.xxxx.repo;

import com.xxxx.mybatis.domain.Enterprise;

public interface IEnterpriseService {
     public Enterprise getEnterpriseById(int enterpriseId);
     public void insertEnterprise(Enterprise enterprise);
     public void deleteEnterprise(int enterpriseId);
}
