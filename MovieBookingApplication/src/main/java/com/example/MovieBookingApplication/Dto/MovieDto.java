package com.example.MovieBookingApplication.Dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MovieDto {

    private String name;
    private String description;
    private String genre;
    private Integer duration;
    private LocalDate releasedDate;
    private String language;

}
