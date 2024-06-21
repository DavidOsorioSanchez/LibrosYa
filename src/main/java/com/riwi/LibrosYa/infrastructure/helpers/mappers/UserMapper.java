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

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "loan", source = "", ignore = true)
    @Mapping(target = "reservations", source = "", ignore = true)
    User toUserEntity(UserReq userRequest);
    
    List<UserResp>UserListToResponse(List<User> userEntities);


}
