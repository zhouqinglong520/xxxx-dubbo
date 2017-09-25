package com.xxxx.restservice;

import com.xxxx.mybatis.domain.Enterprise;

public interface IEnterpriseRestService {
	  public Enterprise getEnterpriseById(int id);
	  public void insertEnterprise(Enterprise enterprise);
	  public String getString(String name);
	  public void deleteEnterprise(int enterpriseId);
}
