package uz.pdp.app_info_system.aop;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)//qayerda ishlatishimiz
@Retention(RetentionPolicy.RUNTIME)//qaysi vaqt ishlashi
public @interface HuquqniTekshirish {
    String huquq();//anotatsiya ichiga kiruvchi parametr
}
