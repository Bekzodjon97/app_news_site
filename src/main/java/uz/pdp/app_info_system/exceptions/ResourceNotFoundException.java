package uz.pdp.app_info_system.exceptions;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@AllArgsConstructor
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private final String resourceName;//lavozimda topolmadim

    private final String resourceField;//nimasi bo'yicha qidirgandiz

    private final Object object; //nima berib yuborgandiz



}
