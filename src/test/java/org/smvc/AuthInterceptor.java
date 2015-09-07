package org.smvc;

import org.smvc.interceptor.Interceptor;
//方法拦截器
public class AuthInterceptor implements Interceptor {
    private String userName;
    AuthInterceptor(String userName){
        this.userName = userName;
    }
    
    public void intercept(Invocation inv) {
        //权限判断
        if(!"张三".equals(userName)){
            System.out.println("你没有权限！");
            //中断职责链
            return ;
        }
        
        //否则，职责链继续
        inv.invoke();
    }
}