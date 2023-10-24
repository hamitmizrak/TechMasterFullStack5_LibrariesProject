package com.hamitmizrak.dto;

import java.io.Serializable;

public class RegisterDto extends  BaseDto implements Serializable {

    // Serileştirme
    public static final Long serialVersionUID = 1L;

    //Variable
    private String uNickName;
    private String uEmailAddress;
    private String uPassword;
}
