package com.bluntsoftware.app.modules.dojomanager.rest;



import com.bluntsoftware.lib.jpa.repository.GenericRepository;
import com.bluntsoftware.app.modules.dojomanager.domain.Schoolstudent;
import com.bluntsoftware.app.modules.dojomanager.repository.SchoolstudentRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller("dojomanagerSchoolstudentService")
@RequestMapping(value = "/dojomanager/schoolstudent")
@Transactional
@Qualifier("dojomanager")

public class SchoolstudentService extends CustomService<Schoolstudent,Integer, SchoolstudentRepository> {


}
