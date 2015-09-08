package org.smvc.framework;

import org.smvc.framework.aop.Invocation;
import org.smvc.framework.aop.interceptor.Interceptor;

public class LogInterceptor implements Interceptor{

    public void intercept(Invocation inv) {
        System.out.println("Before invoke...");
        inv.invoke();
        System.out.println("After invoke...");
    }

}
