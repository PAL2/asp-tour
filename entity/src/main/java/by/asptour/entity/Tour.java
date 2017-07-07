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
    private Date startDate;
    private int priceUsd, priceByn, version;
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

    @Column(name = "START_DATE")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Column(name = "PRICE_USD")
    public int getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(int priceUsd) {
        this.priceUsd = priceUsd;
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
                ", startDate=" + startDate +
                ", priceUsd=" + priceUsd +
                ", priceByn=" + priceByn +
                ", photo='" + photo + '\'' +
                '}';
    }
}