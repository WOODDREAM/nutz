package bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

import java.io.Serializable;

/**
 * User:huangtao
 * Date:2015-08-22
 * description：
 */
@Table("User")
public class User implements Serializable {

    @Id
    private int userID;
    @Column
    private String userName;
    @Column
    private String password;
    @Column
    private String birthday;
    @Column
    private int age;

    public User(String userName,String password,String birthday,int age){
        this.userName = userName;
        this.password = password;
        this.birthday = birthday;
        this.age = age;

    }
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
