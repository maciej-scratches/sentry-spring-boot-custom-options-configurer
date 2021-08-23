package com.example.sentryspringbootcustominit;

import io.sentry.Sentry;
import io.sentry.SentryOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SentrySpringBootCustomInitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentrySpringBootCustomInitApplication.class, args);
    }

    @Bean
    Sentry.OptionsConfiguration<SentryOptions> customOptionsConfiguration() {
        return sentryOptions -> {
            sentryOptions.setDsn("set by java code");
        };
    }

}
