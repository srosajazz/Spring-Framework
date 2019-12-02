package com.sergiorosa.brewer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.sergiorosa.brewer.controller.BeerController;

@Configuration
@ComponentScan(basePackageClasses = BeerController.class)
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter{

}
