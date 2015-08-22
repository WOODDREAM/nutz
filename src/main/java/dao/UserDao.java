package dao;

import bean.User;
import org.nutz.dao.Dao;
import org.nutz.dao.impl.NutDao;

/**
 * User:huangtao
 * Date:2015-08-22
 * description：
 */
public class UserDao {
    private User user;

    public static void  main(String[] arg){
        Dao dao = new NutDao(dataSource);
        User user = new User("wa","wa","123",12);
        dao.insert(user);
    }
}
