package com.cg.eauction.auth.payload;

import com.cg.eauction.auth.helper.UserType;
import com.cg.eauction.auth.helper.ValueOfEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Generated;

@Data @EqualsAndHashCode(callSuper = false) @JsonInclude(Include.NON_NULL) @Generated
public class LoginDTO {

    @NotBlank(message = "{password.null.message}")
    private String password;

    @NotBlank(message = "{email.null.message}") @Email(message = "{email.format.message}")
    private String email;
    
    @NotBlank(message = "{usertype.null.message}") @ValueOfEnum(enumClass = UserType.class, message = "{usertype.format.message}")
    private String userType;
}
