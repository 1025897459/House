package cn.bdqn.entity;

/**
 * 街道表
 */
public class Street {
    private int id;//街道id
    private String name;//街道名称
    private int district_id;//所属区县

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(int district_id) {
        this.district_id = district_id;
    }
}
