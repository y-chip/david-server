package com.yamamoto.yuta.david;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("execution(* com.yamamoto.yuta.david..*.*(..))")
    private void pointcut() {
    }

    @Before("pointcut()")
    public void doBefore(JoinPoint jp) {

        Signature sig = jp.getSignature();

        if (jp.getArgs() == null || jp.getArgs().length == 0) {

            logger.info(
                    String.format("Execute method '%s.%s (full name: %s)'",
                            sig.getDeclaringType().getSimpleName(),
                            sig.getName(),
                            sig.getDeclaringTypeName()));
            return;
        }

        logger.info(
                String.format("Execute method '%s.%s' (full name: %s) (args: %s)",
                        sig.getDeclaringType().getSimpleName(),
                        sig.getName(),
                        sig.getDeclaringTypeName(),
                        Arrays.toString(jp.getArgs())));

    }

    @AfterReturning(pointcut = "pointcut()", returning = "value")
    public void doAfterReturning(JoinPoint jp, Object value) {

        Signature sig = jp.getSignature();

        logger.info(
                String.format("Return from method '%s.%s' (full name: %s) (value: %s)",
                        sig.getDeclaringType().getSimpleName(),
                        sig.getName(),
                        sig.getDeclaringTypeName(),
                        value));
    }

    @AfterThrowing(pointcut = "pointcut()", throwing = "exception")
    public void doAfterThrowing(JoinPoint jp, Exception exception) {

        Signature sig = jp.getSignature();

        StringWriter stackTrace = new StringWriter();
        exception.printStackTrace(new PrintWriter(stackTrace));

        logger.info(
                String.format("Throw Exception from method '%s.%s' (full name: %s) (stackTrace: %s)",
                        sig.getDeclaringType().getSimpleName(),
                        sig.getName(),
                        sig.getDeclaringTypeName(),
                        stackTrace.toString()));
    }
}
