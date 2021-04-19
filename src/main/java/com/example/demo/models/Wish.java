package com.example.demo.models;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name = "wishes")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Cacheable
public class Wish {

    @Id
    @SequenceGenerator(name = "wish_id_seq", sequenceName = "wish_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wish_id_seq")
    @Column(name = "wish_id")
    private long id;

    @ManyToOne(cascade=CascadeType.MERGE)
    @JoinColumn(name = "wishlist_id")
    private Wishlist wishlist;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "link")
    private String link;

    @Column(name = "price")
    private String price;

    @Column(name = "reserved")
    private Boolean reserved;

    public Wish() {
    }

    public Wishlist getWishlist() {
        return wishlist;
    }

    public void setWishlist(Wishlist wishlist) {
        this.wishlist = wishlist;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Boolean getReserved() {
        return reserved;
    }

    public void setReserved(Boolean reserved) {
        this.reserved = reserved;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
