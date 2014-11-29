package action;

import com.entity.UserEntity;
import service.UserService;

/**
 * Created by 细潮 on 2014/11/28 0028.
 */
public class UserAction extends BaseAction {
    private UserService userService;
    private UserEntity user;

    public String login(){
       UserEntity u= userService.login(getUser().getName());
        if(u!=null){
            if(u.getPassword().equals(getUser().getPassword())) {
                return SUCCESS;
            }
        }
        return "fail";
    }







    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
