package com.example.quryltai.services.impl;

import com.example.quryltai.db.repositories.StudentRepository;
import com.example.quryltai.services.StudentService;
import com.example.quryltai.db.entities.Student;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    @Override
    public UserDetailsService userDetailsService() {
        return this::getByUsername;
    }

    public Student getByUsername(String username) {
        return userRepository.findByEmailOptional(username)
                .orElseThrow(() -> new UsernameNotFoundException("Пользователь не найден"));

    }
}
