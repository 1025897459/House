package cn.bdqn.dao.users.impl;

import cn.bdqn.dao.users.UsersDao;
import cn.bdqn.entity.Users;
import cn.bdqn.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UsersDaoImpl implements UsersDao {

    public Users getUsers(Users users) {
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
        String hql="from Users where username =: username and password =: password";
        Query query = session.createQuery(hql);
        List list = query.list();
        transaction.commit();
        session.close();
        return (Users)list.get(0);
    }
}
