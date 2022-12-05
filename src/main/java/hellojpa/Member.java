package hellojpa;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Member {

    @Id
    private Integer id;

    @Column(name = "name", nullable = false)
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Member() {}
}
