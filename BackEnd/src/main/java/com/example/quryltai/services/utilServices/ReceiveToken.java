package com.example.quryltai.services.utilServices;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Map;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ReceiveToken {

    private final JWTCore jwtCore;


    public Map<String,String> tokenData (){
        HttpServletRequest request = getCurrentHttpRequest();
        String token = jwtCore.extractJwtToken(request);
        return jwtCore.extractTokenData(token);
    }

    private HttpServletRequest getCurrentHttpRequest() {
        return ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
    }

}
