package com.riwi.LibrosYa.api.controllers;

import com.riwi.LibrosYa.api.dto.request.UserReq;
import com.riwi.LibrosYa.api.dto.response.UserResp;
import com.riwi.LibrosYa.infrastructure.crud.IUser;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping(path = "/User")
public class UserControllers implements GenericController<UserReq, UserResp, Long> {

    @Autowired
    private final IUser iUserService;

    @Override
    @PostMapping
    public ResponseEntity<UserResp> create(@RequestBody UserReq request) {
        return ResponseEntity.ok(this.iUserService.create(request));
    }

    @Override
    @GetMapping(path = "/{id}")
    public ResponseEntity<UserResp> get(@PathVariable Long id) {
        return ResponseEntity.ok(this.iUserService.get(id));
    }

    @Override
    public ResponseEntity<UserResp> update(@Validated @RequestBody UserReq request,@PathVariable  Long id) {
        return ResponseEntity.ok(this.iUserService.update(request, id));
    }

    @Override
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.iUserService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
