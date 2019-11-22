package pojo;

import java.io.Serializable;

/**
 * @ClassName:User
 * @description:
 * @author:
 * @createDate:2019/11/22
 * @version:1.0
 **/
public class User implements Serializable {
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
