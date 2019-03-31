package ru.skhanov.springrestfileupload.service ;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * FileStorageProperties
 */
@Data
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {

    private String uploadDir;
}