package cn.bdqn.entity;

import java.io.Serializable;
import java.util.Date;

public class House implements Serializable {

    private int id;//房屋Id
    private String title;//标题
    private String descRiption;//描述
    private Float price;//价格
    private Date pubDate;//faculty时间
    private Float flooRage;//面积
    private String contact;//联系人
    private int user_id;//用户编号
    private int type_id;//类型编号
    private int street_id;//街道编号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescRiption() {
        return descRiption;
    }

    public void setDescRiption(String descRiption) {
        this.descRiption = descRiption;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public Float getFlooRage() {
        return flooRage;
    }

    public void setFlooRage(Float flooRage) {
        this.flooRage = flooRage;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public int getStreet_id() {
        return street_id;
    }

    public void setStreet_id(int street_id) {
        this.street_id = street_id;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", descRiption='" + descRiption + '\'' +
                ", price=" + price +
                ", pubDate=" + pubDate +
                ", flooRage=" + flooRage +
                ", contact='" + contact + '\'' +
                ", user_id=" + user_id +
                ", type_id=" + type_id +
                ", street_id=" + street_id +
                '}';
    }
}
