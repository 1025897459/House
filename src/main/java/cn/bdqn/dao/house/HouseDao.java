package cn.bdqn.dao.house;

import cn.bdqn.entity.House;
import cn.bdqn.entity.Users;

import java.util.List;

public interface HouseDao {
    /**
     * 根据用户Id查询房屋信息
     * @param house
     * @return
     */
    List<House> houseList(House house);
}
