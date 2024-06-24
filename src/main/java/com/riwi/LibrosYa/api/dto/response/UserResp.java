package com.riwi.LibrosYa.api.dto.response;

import com.riwi.LibrosYa.Util.enums.Role;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResp {
    private  Long id;
    private String name;
    private  String email;
    private String fullName;
    private Role role;
}
