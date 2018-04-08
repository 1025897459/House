package cn.bdqn.dao.house.impl;

import cn.bdqn.dao.house.HouseDao;
import cn.bdqn.entity.House;
import cn.bdqn.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class HouseDaoImpl implements HouseDao {

    public List<House> houseList(House house) {
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
        String sql="from House where 1=1";
        session.createCriteria(sql);
        transaction.commit();
        session.close();

        return null;
    }
}
