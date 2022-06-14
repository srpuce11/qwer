package com.baeldung.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baeldung.persistence.model.MasterDB;


public interface IMasterDBDao<T> extends JpaRepository<MasterDB, Long>{

}
