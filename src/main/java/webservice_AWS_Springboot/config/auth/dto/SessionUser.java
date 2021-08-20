package webservice_AWS_Springboot.config.auth.dto;

import lombok.Getter;
import webservice_AWS_Springboot.domain.user.User;

import java.io.Serializable;


@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
