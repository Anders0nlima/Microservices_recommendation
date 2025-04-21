package com.streaming.recommendation.controller;

import com.streaming.recommendation.dto.VideoDto;
import com.streaming.recommendation.model.Recommendation;
import com.streaming.recommendation.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/recommendations")
public class RecommendationController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RecommendationRepository recommendationRepository;

    @PostMapping
    public Recommendation addRecommendation(@RequestBody Recommendation recommendation) {
        return recommendationRepository.save(recommendation);
    }

    @GetMapping("/user/{userId}")
    public List<Recommendation> getRecommendationsByUser(@PathVariable Long userId) {
        return recommendationRepository.findByUserId(userId);
    }

    @GetMapping
    public List<Recommendation> getAllRecommendations() {
        return recommendationRepository.findAll();
    }

    @GetMapping("/video-info/{videoId}")
    public VideoDto getVideoInfo(@PathVariable Long videoId) {
        String url = "http://localhost:8081/videos/" + videoId;
        return restTemplate.getForObject(url, VideoDto.class);
    }
}
