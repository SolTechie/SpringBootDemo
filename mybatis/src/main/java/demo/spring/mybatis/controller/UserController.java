package demo.spring.mybatis.controller;

import demo.spring.mybatis.dao.UserDAO;
import demo.spring.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liyuqiao on 2018/7/11.
 */
@RestController
public class UserController {

    @Autowired //注意main入口处要加 @MapperScan(value = "demo.spring.mybatis.dao")
    private UserDAO userDAO;

    @RequestMapping(value = "/get_user", method = RequestMethod.GET)
    public User getUser() {
        return userDAO.getUser(123);
    }

    @RequestMapping(value = "/add_user", method = RequestMethod.GET)
    public boolean addUser() {
        User user = new User();
        user.setName("tony");
        return userDAO.addUser(user);
    }
}
