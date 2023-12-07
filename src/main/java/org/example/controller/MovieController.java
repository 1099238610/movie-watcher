package org.example.controller;

import jakarta.annotation.Resource;
import org.example.model.DTO.MovieDTO;
import org.example.service.MovieService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Resource
    private MovieService movieService;

    @RequestMapping(value = "/page/{pageNum}/{pageSize}", method = RequestMethod.GET)
    public List<MovieDTO> getMoviePage(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int size) {
        return movieService.getMoviePage(pageNum, size);
    }
}
