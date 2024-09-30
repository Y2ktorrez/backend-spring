package com.y2k.ecommerce.service.interf;

import com.y2k.ecommerce.dto.LoginRequest;
import com.y2k.ecommerce.dto.Response;
import com.y2k.ecommerce.dto.UserDto;
import com.y2k.ecommerce.entity.User;

public interface UserService {
    Response registerUser(UserDto registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getLoginUser();
    Response getUserInfoAndOrderHistory();
}
