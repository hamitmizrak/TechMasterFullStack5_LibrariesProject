package com.hamitmizrak.dto;

import java.io.Serializable;
import java.util.Date;

public class BaseDto implements Serializable {

    // Serileştirme
    public static final Long serialVersionUID = 1L;

    // Variable
    protected Long id;
    protected Date systemCreatedDate;

    // Constructor
    // parametresiz constructor
    public BaseDto() {
        systemCreatedDate = new Date(System.currentTimeMillis());
    }

    // parametresiz constructor
    public BaseDto(Long id, Date systemCreatedDate) {
        this.id = id;
        this.systemCreatedDate = systemCreatedDate;
    }

    // Getter And Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getSystemCreatedDate() {
        return systemCreatedDate;
    }

    public void setSystemCreatedDate(Date systemCreatedDate) {
        this.systemCreatedDate = systemCreatedDate;
    }
} //end class
