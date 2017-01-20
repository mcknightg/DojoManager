package com.bluntsoftware.app.modules.dojomanager.rest;



import com.bluntsoftware.lib.jpa.repository.GenericRepository;
import com.bluntsoftware.app.modules.dojomanager.domain.Dojo;
import com.bluntsoftware.app.modules.dojomanager.repository.DojoRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller("dojomanagerDojoService")
@RequestMapping(value = "/dojomanager/dojo")
@Transactional
@Qualifier("dojomanager")

public class DojoService extends CustomService<Dojo,Integer, DojoRepository> {


}
