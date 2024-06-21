package com.riwi.LibrosYa.api.controllers;

import com.riwi.LibrosYa.api.dto.request.UserReq;
import com.riwi.LibrosYa.api.dto.response.UserResp;
import com.riwi.LibrosYa.infrastructure.crud.IUser;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
@RequestMapping(path = "/User")
public class UserControllers implements GenericController<UserReq, UserResp, Long> {

    @Autowired
    private final IUser iUserService;

    @Override
    public ResponseEntity<UserResp> create(@RequestBody UserReq request) {
        return ResponseEntity.ok(this.iUserService.create(request));
    }

    @Override
    public ResponseEntity<UserResp> get(Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<UserResp> update(UserReq request, Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(Long aLong) {
        return null;
    }
}
