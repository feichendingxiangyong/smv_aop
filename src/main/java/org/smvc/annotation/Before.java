/**
 * @author Big Martin
 *
 */
package org.smvc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.smvc.interceptor.Interceptor;

/**
 * Before is used to configure Interceptor and Validator.
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Before {
    Class<? extends Interceptor>[] value();
}