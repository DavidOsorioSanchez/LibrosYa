package com.riwi.LibrosYa.infrastructure.helpers.mappers;

import com.riwi.LibrosYa.api.dto.request.UserReq;
import com.riwi.LibrosYa.api.dto.response.UserResp;
import com.riwi.LibrosYa.domain.entities.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    @InheritInverseConfiguration
    UserResp toUserResponse(User userEntity);

    @Mapping(source = "name", target = "userName")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "fullName", target = "fullName")
    @Mapping(source = "role", target = "role")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "loan", target = "loan")
    @Mapping(source = "reservations", target = "reservations")
    User toUserEntity(UserReq userRequest);
    
    List<UserResp>UserListToResponse(List<User> userEntities);


}
