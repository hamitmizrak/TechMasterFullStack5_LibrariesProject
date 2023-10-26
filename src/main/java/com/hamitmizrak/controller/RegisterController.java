package com.hamitmizrak.controller;

import com.hamitmizrak.dao.IDaoGenerics;
import com.hamitmizrak.dao.RegisterDao;
import com.hamitmizrak.dto.RegisterDto;

import java.util.ArrayList;

public class RegisterController  implements IDaoGenerics<RegisterDto> {

    // Injection

    @Override
    public String speedData(Long id) {
        return null;
    }

    @Override
    public String allDelete() {
        return null;
    }

    @Override
    public void create(RegisterDto registerDto) {

    }

    @Override
    public RegisterDto findById(Long id) {
        return null;
    }

    @Override
    public ArrayList<RegisterDto> list() {
        return null;
    }

    @Override
    public RegisterDto update(Long id, RegisterDto registerDto) {
        return null;
    }

    @Override
    public RegisterDto delete(Long id) {
        return null;
    }
}
