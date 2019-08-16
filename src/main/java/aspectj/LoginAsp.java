package aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Aspect
public class LoginAsp {
    private static final Logger logger= LoggerFactory.getLogger(LoginAsp.class);

    @Pointcut("execution(* service.*.*(..))")
    public void pring(){};

    @Before("pring()")
    public void beforeAdvice(){
        logger.debug("我来了"+new Date().toString());
    }
    @After("pring()")
    public  void afterAdvice(){
        logger.debug("我走了");
    }



}
