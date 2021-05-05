package com.phong.polo.dao.polo.entities;

import javax.persistence.*;

@Entity
@Table(name="account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accountid")
    private int accountid;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "full_name")
    private String fullName;

    public Account() {
    }

    public Account(int accountid, String userName, String fullName) {
        this.accountid = accountid;
        this.userName = userName;
        this.fullName = fullName;
    }

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
