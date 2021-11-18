package com.revature.revspace.aspects;

import com.revature.revspace.util.MyLogger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    /*
       To use the this logging aspect copy and paste the function from the working aspects below to the bottom of the document
       After you have copied the function change the name of the function to the thing that you want to log for example UserRepo or UserServiceImpl or UserController
       follow the naming convention that is layed out below
       THEN MAKE SURE TO CHANGE THE POINTCUT value to the location you want to log from examples below
        ex: "execution(* com.revature.revspace.repositories.CredentialsRepo.*(..))"
        you only need to change package name and the class name and that's it  com.revature.revspace.packageName.ClassName

        To summarize to get logging to work change the variable name and the pointcut

     */

    //Logging the return of CredentialsRepo
    @AfterReturning(pointcut = "execution(* com.revature.revspace.repositories.CredentialsRepo.*(..))", returning = "result")
    public void logAfterCredentialsRepo(JoinPoint joinPoint, Object result){
        String logString = "The class is : " + joinPoint.getTarget().getClass().getName() + " Return for method : " + joinPoint.getSignature().getName();
        if(result != null){
            MyLogger.logger.info(logString + " Success");
        }
        else{
            MyLogger.logger.warn(logString + " Returned Null");
        }
    }

    //Logging the errors of the CredentialsRepo
    @AfterThrowing(pointcut = "execution(* com.revature.revspace.repositories.CredentialsRepo.*(..))", throwing = "error")
    public void logErrorCredentialsRepo(JoinPoint joinPoint, Throwable error){
        String logString = "The class is : " + joinPoint.getTarget().getClass().getName() + " The Method is : " + joinPoint.getSignature().getName() + " Error is : " +error.getMessage();
        MyLogger.logger.error(logString);
    }

    //Logging the return of CredentialsService
    @AfterReturning(pointcut = "execution(* com.revature.revspace.services.CredentialsServiceImpl.*(..))", returning = "result")
    public void logAfterCredentialsService(JoinPoint joinPoint, Object result){
        String logString = "The class is : " + joinPoint.getTarget().getClass().getName() + " Return for method : " + joinPoint.getSignature().getName();
        if(result != null){
            MyLogger.logger.info(logString + " Success");
        }
        else{
            MyLogger.logger.warn(logString + " Returned Null");
        }
    }

    //Logging the errors of the CredentialsService
    @AfterThrowing(pointcut = "execution(* com.revature.revspace.services.CredentialsServiceImpl.*(..))", throwing = "error")
    public void logErrorCredentialsService(JoinPoint joinPoint, Throwable error){
        String logString = "The class is : " + joinPoint.getTarget().getClass().getName() + " The Method is : " + joinPoint.getSignature().getName() + " Error is : " +error.getMessage();
        MyLogger.logger.error(logString);
    }

}
