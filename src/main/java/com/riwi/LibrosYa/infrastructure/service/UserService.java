package com.riwi.LibrosYa.infrastructure.service;

import com.riwi.LibrosYa.Util.exception.BadRequestException;
import com.riwi.LibrosYa.Util.messages.ErrorMessages;
import com.riwi.LibrosYa.api.dto.request.UserReq;
import com.riwi.LibrosYa.api.dto.response.UserResp;
import com.riwi.LibrosYa.domain.entities.User;
import com.riwi.LibrosYa.domain.repositories.UserRepository;
import com.riwi.LibrosYa.infrastructure.crud.IUser;
import com.riwi.LibrosYa.infrastructure.helpers.mappers.UserMapper;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class UserService implements IUser {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private  final UserMapper userMapper;


    @Override
    public UserResp create(UserReq request) {
         User userEntity = this.userMapper.toUserEntity(request);
         return this.userMapper.toUserResponse(this.userRepository.save(userEntity));

    }

    @Override
    public UserResp get(Long id) {
        return this.userMapper.toUserResponse(this.find(id));
    }

    @Override
    public UserResp update(UserReq request, Long id) {
         User user = this.find(id);
         user = this.userMapper.toUserEntity(request);
         user.setId(id);

         return this.userMapper.toUserResponse(this.userRepository.save(user));
    }

    @Override
    public void delete(Long id) {
        this.userRepository.delete(this.find(id));
    }

    private User find(Long id) {
        return this.userRepository.findById(id)
                .orElseThrow(() -> new BadRequestException(ErrorMessages.idNotFound("Servicio")));
    }
}
