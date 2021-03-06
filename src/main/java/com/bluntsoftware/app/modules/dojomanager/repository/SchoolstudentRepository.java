package com.bluntsoftware.app.modules.dojomanager.repository;

import com.bluntsoftware.app.modules.dojomanager.domain.Schoolstudent;
import com.bluntsoftware.lib.jpa.repository.GenericRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.beans.factory.annotation.Qualifier;
/**
* Repository interface for table: Schoolstudent.
* @author autogenerated
*/

@Repository("dojomanagerSchoolstudentRepository")
@Qualifier("dojomanager")
//@RepositoryRestResource(collectionResourceRel="dojomanager.Schoolstudent", path="dojomanager/Schoolstudent")
public interface SchoolstudentRepository extends GenericRepository<Schoolstudent,Integer>  {

}