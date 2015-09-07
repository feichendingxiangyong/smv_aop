/**
 * @author Big Martin
 *
 */
package org.smvc.interceptor;

import org.smvc.Invocation;

/**
 * Interceptor.
 */
public interface Interceptor {
    
    void intercept(Invocation inv);
}

