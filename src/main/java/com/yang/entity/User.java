package com.yang.entity;

import java.math.BigDecimal;

/**
 * @author: yangmengjun
 * @date: 2019\3\26 0026 17:09
 */
public class User {
    private Long id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
