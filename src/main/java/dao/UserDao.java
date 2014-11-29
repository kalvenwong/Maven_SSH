package dao;

import com.entity.UserEntity;

import java.util.List;

/**
 * Created by 细潮 on 2014/11/28 0028.
 */
public interface UserDao {
    /**
     * 登录
     * @param name
     * @return
     */
    public List<UserEntity> login(String name);
}
