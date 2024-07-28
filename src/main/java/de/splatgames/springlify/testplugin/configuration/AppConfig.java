package de.splatgames.springlify.testplugin.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "de.splatgames.springlify.testplugin.domain.dao")
@EntityScan(basePackages = "de.splatgames.springlify.testplugin.domain.entity")
public class AppConfig {
}
