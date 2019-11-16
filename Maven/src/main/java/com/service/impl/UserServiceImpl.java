package com.service.impl;

import com.service.UserService;
import org.springframework.stereotype.Service;
import sun.misc.Unsafe;

/**
 * @author haya
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public Boolean login(String account, String password) {
        System.out.println( "login" );
        return true;
    }
}
