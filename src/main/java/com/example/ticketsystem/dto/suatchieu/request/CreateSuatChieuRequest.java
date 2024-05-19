package com.example.ticketsystem.dto.suatchieu.request;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreateSuatChieuRequest {
    private String name;
    private String gioBatDau; // HH:mm
}
