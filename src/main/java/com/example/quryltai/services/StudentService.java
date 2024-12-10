package com.example.quryltai.services;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface StudentService extends UserDetailsService {
    UserDetailsService userDetailsService();
}
