package lu.atoz.main;

import lu.atoz.main.entities.Employee;
import lu.atoz.main.repositories.EmployeeRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainApplicationTests {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Test
    public void contextLoads() {
        MainApplication.main(new String[]{});
    }

    @Test
    public void testHibernateDdlAuto() {
        employeeRepo.save(Employee.builder().name("Houssam").build());
    }

}

