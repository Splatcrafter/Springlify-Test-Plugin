package de.splatgames.springlify.testplugin;

import dev.temez.springlify.annotation.SpringlifyApplication;
import dev.temez.springlify.plugin.SpringlifyBukkitPlugin;
import lombok.extern.slf4j.Slf4j;

@SpringlifyApplication(
    springApplicationClass = TestApplication.class
)
@Slf4j
public final class TestPlugin extends SpringlifyBukkitPlugin {

    @Override
    public void onEnable() {
        Class<?> mariaDBClass = null;
        try {
            mariaDBClass = Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            log.error("MariaDB driver not found! Please add the MariaDB driver to your classpath!");
            log.error("You can download the MariaDB driver from https://mariadb.com/kb/en/about-mariadb-connector-j/");
            log.error("If you are using Maven, you can add the following dependency to your pom.xml:");
            log.error("<dependency>");
            log.error("    <groupId>org.mariadb.jdbc</groupId>");
            log.error("    <artifactId>mariadb-java-client</artifactId>");
            log.error("    <version>3.3.0</version>");
            log.error("</dependency>");
            log.error("If you are using Gradle, you can add the following dependency to your build.gradle:");
            log.error("implementation 'org.mariadb.jdbc:mariadb-java-client:3.3.0'");
            log.error("If you are using another build system, you can download the MariaDB driver from the link above and add it to your classpath!");
        }
        System.out.println("MariaDB driver found: " + (mariaDBClass != null)); // In my tests, this is always true! (The MariaDB driver is included in the classpath of the test plugin on building)
        super.onEnable();
        log.info("Splatgames.de Springlify TestPlugin enabling...");
        log.warn("This is only a test plugin to show the usage of SpringlifyBukkitPlugin! This plugin will not affect anything!");
        log.warn("If you are warring if this plugin is safe, you can decompile the jar file and check the source code! (All rights reserved to Splatgames.de)");
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
