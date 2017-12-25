package com.webapi.newbie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Bookmark {

    @Id
    @GeneratedValue
    public Long id;

    @Column(nullable = false)
    public String uri;
    public String description;

    @JsonIgnore
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    public Account account;

    // default ctor required by jpa
    public Bookmark() {
    }

    public Bookmark(Account account, String uri, String description) {
        this.account = account;
        this.uri = uri;
        this.description = description;
    }

}