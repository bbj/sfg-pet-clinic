package com.bbj.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    //Hibernate recommends to use Long (box type), versus long, because box types can be null.
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
