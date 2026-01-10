package com.airesume.airesumefeedback.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;
@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "AI Resume Feedback API",
        version = "1.0",
        description = "APIs for resume analysis"
    )
)
public class OpenApiConfig {
}
