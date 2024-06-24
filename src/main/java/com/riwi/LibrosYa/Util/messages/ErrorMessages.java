package com.riwi.LibrosYa.Util.messages;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class ErrorMessages {
    private final String mensaje = "hello";

    public static String idNotFound(String entity){
        final String message = "The ID from %s isnt exist";
        return String.format(message, entity);
    }
}
