package com.example.ticketsystem.services.interfaces;

import com.example.ticketsystem.dto.common.response.ApiResponse;
import com.example.ticketsystem.dto.common.response.CommonStatusResponse;
import com.example.ticketsystem.dto.user.request.UserRegisterRequest;
import com.example.ticketsystem.dto.user.request.UserUpdateRequest;
import com.example.ticketsystem.dto.user.request.UserVerifyRequest;
import com.example.ticketsystem.dto.user.response.UserResponse;

import java.util.List;

public interface UserService {
    public ApiResponse<UserResponse> register(UserRegisterRequest request);
    public ApiResponse<UserResponse> getInfo(String id);
    public ApiResponse<UserResponse> update(UserUpdateRequest request);
    public ApiResponse<CommonStatusResponse> changeStatus(String id);
    public ApiResponse<CommonStatusResponse> verifyOtpRegister(UserVerifyRequest request);
    public ApiResponse<List<UserResponse>> getAll();
}
