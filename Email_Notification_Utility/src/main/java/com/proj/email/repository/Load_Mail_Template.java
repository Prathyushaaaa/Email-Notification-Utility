package com.proj.email.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proj.email.bean.Email_Template_Config;

@Repository
public interface Load_Mail_Template extends CrudRepository<Email_Template_Config, String> {
	
	public List<Email_Template_Config> findByApplicationNameAndTemplateName(String applicationName,String templateName);

}