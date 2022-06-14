package com.baeldung.service;

import java.util.List;

import com.baeldung.requestvo.PersonalDetailForCustomerVo;


public interface IMasterDBService {

	public void saveByVo(PersonalDetailForCustomerVo personalDetails);

}
