package com.riwi.LibrosYa.infrastructure.crud;

import com.riwi.LibrosYa.api.dto.request.UserReq;
import com.riwi.LibrosYa.api.dto.response.UserResp;
import com.riwi.LibrosYa.infrastructure.crud.CrudService;
import org.springframework.stereotype.Service;

@Service
public interface IUser extends CrudService<UserReq, UserResp, Long> {
}
