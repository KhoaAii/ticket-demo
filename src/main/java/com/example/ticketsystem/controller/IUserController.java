package com.example.ticketsystem.controller;

import com.example.ticketsystem.dto.common.response.ApiResponse;
import com.example.ticketsystem.dto.common.response.CommonStatusResponse;
import com.example.ticketsystem.dto.user.request.UserRegisterRequest;
import com.example.ticketsystem.dto.user.request.UserUpdateRequest;
import com.example.ticketsystem.dto.user.request.UserVerifyRequest;
import com.example.ticketsystem.dto.user.response.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user/v1")
public interface IUserController {

    // TODO: REGISTER -> inactive => true / Post

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    ResponseEntity<ApiResponse<UserResponse>> addUser(@RequestBody UserRegisterRequest request);

    @GetMapping("/info/{id}")
    ResponseEntity<ApiResponse<UserResponse>> getUser(@PathVariable(name = "id") String id);

    @PutMapping("/update")
    ResponseEntity<ApiResponse<UserResponse>> updateUser(@RequestBody UserUpdateRequest request);

    // block user by id. | Patch
    @PatchMapping("/changeStatus/{id}")
    ResponseEntity<ApiResponse<CommonStatusResponse>> changeStatus(@PathVariable(name = "id") String id);

    @PostMapping("/verify")
    ResponseEntity<ApiResponse<CommonStatusResponse>> verifyRegister(@RequestBody UserVerifyRequest request);

    @GetMapping("/v1/all")
    ResponseEntity<ApiResponse<List<UserResponse>>> getList();
}
