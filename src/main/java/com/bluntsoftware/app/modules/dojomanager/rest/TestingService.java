package com.bluntsoftware.app.modules.dojomanager.rest;



import com.bluntsoftware.lib.jpa.repository.GenericRepository;
import com.bluntsoftware.app.modules.dojomanager.domain.Testing;
import com.bluntsoftware.app.modules.dojomanager.repository.TestingRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller("dojomanagerTestingService")
@RequestMapping(value = "/dojomanager/testing")
@Transactional
@Qualifier("dojomanager")

public class TestingService extends CustomService<Testing,Integer, TestingRepository> {


}
