/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproyect.Interceptores;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.interceptor.InterceptorBinding;

/**
 *
 * @author reyg6
 */
@InterceptorBinding
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EstudianteInterceptor {
    
}
