/**
 * @author Big Martin
 *
 */
package org.smvc;

import org.smvc.annotation.Before;
import org.smvc.annotation.Clear;

@Before(value={LogInterceptor.class, AuthInterceptor.class})
public class TableDao {
    public void create(){
        System.out.println("create() is running...");
    }
    public void delete(){
        System.out.println("delete() is running...");
    }
    public void update(){
        System.out.println("update() is running...");
    }
    
    @Clear(value=AuthInterceptor.class)
    public void query(){
        System.out.println("query() is running...");
    }
}