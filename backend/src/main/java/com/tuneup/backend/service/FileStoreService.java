package com.tuneup.backend.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class FileStoreService {
    private final Path fileStoreDirectiory;

    public FileStoreService(@Value("${spring.app.tabs-dir}") String tabsDir) {
        this.fileStoreDirectiory = Paths.get(tabsDir).toAbsolutePath().normalize();
    }

    public String storeFile(MultipartFile file) throws IOException {
        Files.createDirectories(fileStoreDirectiory);

        String fileName = UUID.randomUUID() + "_" + file.getOriginalFilename();
        Path targetPath = fileStoreDirectiory.resolve(fileName);
        Files.write(targetPath, file.getBytes());

        return fileStoreDirectiory + "/" + fileName;
    }
}
