package AddressBookLab;

import static org.assertj.core.api.Assertions.assertThat;

import AddressBookLab.Controller.PageRouterController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationTest{

    @Autowired
    private PageRouterController controller;

    @Test
    public void contextLoads() throws Exception{
        assertThat(this.controller).isNotNull();
    }
}
