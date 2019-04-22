package person.liuxx.calculator.controller;

import javax.servlet.ServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘湘湘
 * @since 2019年4月22日 下午4:43:14
 */
@RestController
public class TestController
{
    @GetMapping(value = "/test")
    String listSystemAddresses(ServletRequest request)
    {
        return "TEST SUCCED !";
    }
}
