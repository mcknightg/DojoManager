package com.bluntsoftware.app.modules.dojomanager.repository;

import com.bluntsoftware.app.modules.dojomanager.domain.Testing;
import com.bluntsoftware.lib.jpa.repository.GenericRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.beans.factory.annotation.Qualifier;
/**
* Repository interface for table: Testing.
* @author autogenerated
*/

@Repository("dojomanagerTestingRepository")
@Qualifier("dojomanager")
//@RepositoryRestResource(collectionResourceRel="dojomanager.Testing", path="dojomanager/Testing")
public interface TestingRepository extends GenericRepository<Testing,Integer>  {

}