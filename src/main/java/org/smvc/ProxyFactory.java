/**
 * @author Big Martin
 *
 */
package org.smvc;

import org.smvc.interceptor.Interceptor;

import net.sf.cglib.proxy.Enhancer;

public class ProxyFactory {
    
    public static <T> T getInstance(Class targetClass, Interceptor[] interceptors){  
        Enhancer en = new Enhancer();  //Enhancer用来生成一个原有类的子类
        //进行代理  
        en.setSuperclass(targetClass); 
        
        //设置织入逻辑
        en.setCallback(new Callback(interceptors));
        //生成代理实例  
        return (T)en.create();  
    } 
 }