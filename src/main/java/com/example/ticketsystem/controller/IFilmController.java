package com.example.ticketsystem.controller;


import com.example.ticketsystem.dto.common.response.ApiResponse;
import com.example.ticketsystem.dto.common.response.CommonStatusResponse;
import com.example.ticketsystem.dto.film.repsonse.FilmResponse;
import com.example.ticketsystem.dto.film.request.AddNewFilmRequest;
import com.example.ticketsystem.dto.film.request.UpdateFilmRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/film")
public interface IFilmController {

    //Todo: add new
    @PostMapping("/v1/add")
    ResponseEntity<ApiResponse<FilmResponse>> addNew(@RequestBody AddNewFilmRequest request);
    //todo: get list


    @GetMapping("/v1/all")
    ResponseEntity<ApiResponse<List<FilmResponse>>> getList();

    //todo: get detail


    @GetMapping("/v1/{id}")
    ResponseEntity<ApiResponse<FilmResponse>> getDetail(@PathVariable(name = "id") String id);


    //todo: update
    @PutMapping("/v1/update")
    ResponseEntity<ApiResponse<FilmResponse>> update(@RequestBody UpdateFilmRequest request);

    //todo : delete

    @DeleteMapping("/v1/{id}")
    ResponseEntity<ApiResponse<CommonStatusResponse>> delete(@PathVariable(name = "id") String id);
}
