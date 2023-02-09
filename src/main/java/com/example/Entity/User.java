package com.example.Entity;

import javax.persistence.*;

@Table(name= "user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Integer favorNum;
    private String favorColor;
    private String favorBook;
    private String favorMovie;
    @Column(name="create_time")
    private String createTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFavorNum() {
        return favorNum;
    }

    public void setFavorNum(Integer favorNum) {
        this.favorNum = favorNum;
    }

    public String getFavorColor() {
        return favorColor;
    }

    public void setFavorColor(String favorColor) {
        this.favorColor = favorColor;
    }

    public String getFavorBook() {
        return favorBook;
    }

    public void setFavorBook(String favorBook) {
        this.favorBook = favorBook;
    }

    public String getFavorMovie() {
        return favorMovie;
    }

    public void setFavorMovie(String favorMovie) {
        this.favorMovie = favorMovie;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}

/* mysql syntax
CREATE TABLE IF NOT EXISTS user01 (
    id bigint(20) not null auto_increment,
    name varchar(20) default null comment 'Name',
    favorNum int(11) default null comment 'favorite number',
    favorColor varchar(20) default null comment 'favorite color',
    favorBook varchar(20) default null comment 'favorite book',
    favorMovie varchar(20) default null comment 'favorite movie',
    create_time varchar(20) default null,
    primary key (id)
) ENGINE=InnoDB auto_increment=4 default charset=utf8;
 */
