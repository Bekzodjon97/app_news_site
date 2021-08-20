package uz.pdp.app_info_system.aop;

import java.lang.annotation.*;

//O'zim anotatsiya yozyapman
@Documented
@Target(ElementType.METHOD)//qayerda ishlatishimizni yozamiz
@Retention(RetentionPolicy.RUNTIME)//anotatsiya qachon ishlashi kerakligini yozamiz
public @interface CheckPermission {
    String value();//kiruvchi element, value majburiy emas
}
