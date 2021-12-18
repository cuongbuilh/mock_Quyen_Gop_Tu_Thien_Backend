package com.vti.mock.controller;


import com.vti.mock.dto.UserDto;
import com.vti.mock.form.user.CreateUserForm;
import com.vti.mock.form.user.UpdateUserForm;
import com.vti.mock.model.User;
import com.vti.mock.service.IDonateService;
import com.vti.mock.service.IImagesService;
import com.vti.mock.service.IProgramService;
import com.vti.mock.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/users")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @Autowired
    private IProgramService programService;

    @Autowired
    private IImagesService imagesService;

    @Autowired
    private IDonateService donateService;

    @GetMapping()
    public void getAll() {
    }

    @GetMapping("/{id}")
    public void get(@PathVariable("id") String id) {
    }

    @PostMapping()
    public void create() {
    }

    @PutMapping()
    public void update() {
    }

    @DeleteMapping()
    public void delete() {
    }
}
