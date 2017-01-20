package com.bluntsoftware.app.modules.dojomanager.rest;



import com.bluntsoftware.lib.jpa.repository.GenericRepository;
import com.bluntsoftware.app.modules.dojomanager.domain.Student;
import com.bluntsoftware.app.modules.dojomanager.repository.StudentRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller("dojomanagerStudentService")
@RequestMapping(value = "/dojomanager/student")
@Transactional
@Qualifier("dojomanager")

public class StudentService extends CustomService<Student,Integer, StudentRepository> {


}
