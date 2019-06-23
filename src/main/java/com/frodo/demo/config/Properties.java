package com.frodo.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties("server")
public class Properties {
    private String emailAddress;
    private List<Kluster> drive = new ArrayList<>();

    public static class Kluster {
        private String ipAddress;
        private String pathAddress;

        public String getIpAddress() {
            return ipAddress;
        }

        public void setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
        }

        public String getPathAddress() {
            return pathAddress;
        }

        public void setPathAddress(String pathAddress) {
            this.pathAddress = pathAddress;
        }

        @Override
        public String toString() {
            return "Kluster{" +
                    "ipAddress='" + ipAddress + '\'' +
                    ", pathAddress='" + pathAddress + '\'' +
                    '}';
        }
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public List<Kluster> getDrive() {
        return drive;
    }

    public void setDrive(List<Kluster> drive) {
        this.drive = drive;
    }

    @Override
    public String toString() {
        return "ServerProperties{" +
                "emailAddress='" + emailAddress + '\'' +
                ", drive=" + drive +
                '}';
    }
}
