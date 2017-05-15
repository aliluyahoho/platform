package com.spring.ServiceTest;


import com.spring.database.entity.ServiceInfo;
import com.spring.repository.ServiceInfoRepository;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Unit test for ServiceInfoController.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans/spring-mybatis.xml")
public class MockServiceTest {

    private static Logger logger = Logger.getLogger(MockServiceTest.class);
    private static ServiceInfo src = new ServiceInfo("com.alia.Service", "1.0.2", 10);
    private static ServiceInfo des = new ServiceInfo("com.alia.Service.des", "1.0.0_test", 500);
    private static ServiceInfo tmp = new ServiceInfo("com.tmp");


    @Autowired
    private ServiceInfoRepository serviceInfoRepository;

    @Test
    public void checkExist() {

        serviceInfoRepository.isExist(1);
        serviceInfoRepository.isExist(-1);
        serviceInfoRepository.isExist(src);
        serviceInfoRepository.isExist(des);
    }

    @Test
    public void addServiceInfoTest() {

        serviceInfoRepository.addServiceInfo(tmp);
        serviceInfoRepository.addServiceInfo(tmp);
    }

    @Test
    public void deleteServiceInfotest() {

        serviceInfoRepository.deleteServiceInfo(-1);

        serviceInfoRepository.deleteServiceInfo(tmp);
        serviceInfoRepository.deleteServiceInfo(tmp);
    }

    @Test
    public void getServiceInfoTest() {

        serviceInfoRepository.getServiceInfo(-1);
        serviceInfoRepository.getServiceInfo(2);
        serviceInfoRepository.getServiceInfo(src);
        serviceInfoRepository.getServiceInfo(tmp);

    }

    @Test
    public void getAllServiceInfoTest() {

        serviceInfoRepository.getAllServiceInfo();

    }

    @Test
    public void updateServiceInfoTest() {

        serviceInfoRepository.updateServiceInfo(1, src);
        serviceInfoRepository.updateServiceInfo(src, des);
        serviceInfoRepository.updateServiceInfo(2, src);
        serviceInfoRepository.updateServiceInfo(des, src);
    }

}
