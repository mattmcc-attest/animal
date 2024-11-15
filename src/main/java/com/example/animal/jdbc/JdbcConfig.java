package com.example.animal.jdbc;

import com.example.animal.Breed;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.core.convert.JdbcCustomConversions;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;

import java.util.List;

@Configuration
public class JdbcConfig extends AbstractJdbcConfiguration {
  @Bean
  public JdbcCustomConversions jdbcCustomConversions() {
    return new JdbcCustomConversions(
        List.of(
            new WritingEnumConverter<>(),
            new ReadingEnumConverter<>(Breed.class)));
  }
}
