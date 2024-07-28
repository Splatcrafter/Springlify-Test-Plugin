package de.splatgames.springlify.testplugin;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "de.splatgames.springlify.testplugin",
                "dev.temez.springlify"
        }
)
public class TestApplication {
}
