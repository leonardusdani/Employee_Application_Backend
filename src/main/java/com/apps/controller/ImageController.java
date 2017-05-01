package com.apps.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ImageController {
    
    //private static String UPLOADED_FOLDER = "/home/machine/Pictures/temp/";
    //private static String UPLOADED_FOLDER = "D://temp//";
    private static String UPLOADED_FOLDER = "temp/";

    @RequestMapping(value = "api/upload-image", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> uploadFile(
            @RequestParam("file") MultipartFile file) {
        try {
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(HttpStatus.OK);
    } 

}
