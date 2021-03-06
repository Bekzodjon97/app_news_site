package uz.pdp.app_info_system.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import uz.pdp.app_info_system.entity.User;
import uz.pdp.app_info_system.exceptions.ForbiddenException;

@Component
@Aspect// anotatsiyamga natija ekanligi yozyapmiz
public class CheckPermissionExecutor {
    @Before(value = "@annotation(checkPermission)")
    public void checkUserPermissionMyMethod(CheckPermission checkPermission){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        boolean exist=false;
        for (GrantedAuthority authority : user.getAuthorities()) {
            if (authority.getAuthority().equals(checkPermission.value())){
                exist=true;
                break;
            }
        }
        if (!exist){
            throw new ForbiddenException(checkPermission.value(),"Ruxsat yo'q");
        }
    }
}
