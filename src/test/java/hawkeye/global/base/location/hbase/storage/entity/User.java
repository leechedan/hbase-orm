package hawkeye.global.base.location.hbase.storage.entity;

import hawkeye.global.base.hbase.orm.annotaion.TableColumnFamily;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author 许峰敏
 * @since 2016-08-26 17-48
 */
@Table(name = "user")
@TableColumnFamily(name = "data")
public class User implements Serializable {

    private static final long serialVersionUID = 3934393662040968553L;

    @Id
    @Column
    private Long id;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String passWord;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
