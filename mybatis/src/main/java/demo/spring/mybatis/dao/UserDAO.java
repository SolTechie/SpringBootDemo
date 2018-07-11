package demo.spring.mybatis.dao;

import demo.spring.mybatis.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created by liyuqiao on 2018/7/11.
 */
public interface UserDAO {

    @Select("select * from users where id = #{id}")
    User getUser(int id);

    @Insert("insert into users (id,name) values(#{id},#{name})")
    boolean addUser(User user);

}
