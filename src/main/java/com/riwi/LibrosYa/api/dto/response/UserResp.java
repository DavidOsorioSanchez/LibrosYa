package com.riwi.LibrosYa.api.dto.response;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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
}
