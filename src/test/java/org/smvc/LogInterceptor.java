package org.smvc;

import org.smvc.interceptor.Interceptor;

public class LogInterceptor implements Interceptor{

    public void intercept(Invocation inv) {
        System.out.println("Before invoke...");
        inv.invoke();
        System.out.println("After invoke...");
    }

}
