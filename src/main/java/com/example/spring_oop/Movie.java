package com.example.spring_oop;

import lombok.Builder;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Builder
@Getter
public class Movie implements Serializable{
	private String title;
	private String link;
	private float userRating;
}

