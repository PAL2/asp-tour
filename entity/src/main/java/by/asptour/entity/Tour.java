package by.asptour.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "tour")
public class Tour implements Serializable {
    private Integer id;
    private String country, city, hotel;
    private byte star, duration;
    private Date date;
    private int price, priceByn, version;
    private byte[] photo;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "COUNTRY")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "CITY")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "HOTEL")
    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    @Column(name = "STAR")
    public byte getStar() {
        return star;
    }

    public void setStar(byte star) {
        this.star = star;
    }

    @Column(name = "DURATION")
    public byte getDuration() {
        return duration;
    }

    public void setDuration(byte duration) {
        this.duration = duration;
    }

    @Column(name = "DATE")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name = "PRICE")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Column(name = "PRICE_BYN")
    public int getPriceByn() {
        return priceByn;
    }

    public void setPriceByn(int priceByn) {
        this.priceByn = priceByn;
    }

    @Version
    @Column(name = "VERSION")
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public byte[] getPhoto() {
        return photo;
    }

    @Column(name = "PHOTO")
    @Lob
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", hotel='" + hotel + '\'' +
                ", star=" + star +
                ", duration=" + duration +
                ", date=" + date +
                ", price=" + price +
                ", priceByn=" + priceByn +
                ", photo='" + photo + '\'' +
                '}';
    }
}