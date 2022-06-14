package com.baeldung.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baeldung.persistence.dao.IMasterDBDao;
import com.baeldung.persistence.model.MasterDB;
import com.baeldung.requestvo.PersonalDetailForCustomerVo;

@Service
@Transactional
public class MasterDBService implements IMasterDBService {

	@Autowired
	IMasterDBDao<MasterDB> masterDBDao;
	
	@Override
	public void saveByVo(PersonalDetailForCustomerVo personalDetails) {
		// TODO Auto-generated method stub
		MasterDB masterDBObj = new MasterDB();
//		masterDBObj = masterDBDao.findById(personalDetails.getId());
//		if(masterDBObj != null) {
			masterDBObj.setFirstName(personalDetails.getFirstName());
			masterDBObj.setFatherName(personalDetails.getFatherName());
			masterDBObj.setPersonDesignation(personalDetails.getTitle());
//			masterDBObj.setDateOfBirth(personalDetails.getDateOfBirth();
			masterDBObj.setGender(personalDetails.getGender());
			masterDBObj.setEducationQualification(personalDetails.getQualification());
		masterDBDao.save(masterDBObj);
	}


}
