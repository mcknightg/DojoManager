package com.bluntsoftware.app.modules.dojomanager.rest;



import com.bluntsoftware.lib.jpa.repository.GenericRepository;
import com.bluntsoftware.app.modules.dojomanager.domain.Studenttest;
import com.bluntsoftware.app.modules.dojomanager.repository.StudenttestRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller("dojomanagerStudenttestService")
@RequestMapping(value = "/dojomanager/studenttest")
@Transactional
@Qualifier("dojomanager")

public class StudenttestService extends CustomService<Studenttest,Integer, StudenttestRepository> {


}
