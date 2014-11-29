package dao.impl;

import com.entity.UserEntity;
import dao.UserDao;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by 细潮 on 2014/11/28 0028.
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public List<UserEntity> login(String name) {
        String sql="from UserEntity where name='"+name+"'";
        return (List<UserEntity>) this.getHibernateTemplate().find(sql);
    }
}
