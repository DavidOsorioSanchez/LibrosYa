package com.riwi.LibrosYa.api.dto.request;

import com.riwi.LibrosYa.Util.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserReq {
    @Size(max = 50, message = "it overbook the caracters")
    @NotBlank(message = "name cant be blank")
    private String name;
    @Size(max = 100, message = "it overbook the caracters")
    @NotBlank(message = "password cant be blank")
    private String password;
    @Size(max = 100, message = "it overbook the caracters")
    @Email(message = "The email isnt email")
    @NotBlank(message = "email cant be blank")
    private  String email;
    @Size(max = 100, message = "it overbook the caracters")
    @NotBlank(message = "full name cant be blank")
    private String fullName;
    private Role role;
}
