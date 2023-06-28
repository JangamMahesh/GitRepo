package com.example.demo.services.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.services.FileService;

@Service 
public class FileServiceImpl implements FileService {

	// here file that we are going to submit, path where to store in the project
	@Override
	public String uploadImage(String path, MultipartFile file) throws IOException {
		// file name from file
		String name = file.getOriginalFilename();

		
		String randomID = UUID.randomUUID().toString();
		String fileName1 = randomID.concat(name.substring(name.lastIndexOf(".")));

		// full path
		String filepath = path + File.separator + fileName1;

		// create folder if not created
		File f = new File(path);
		if (!f.exists()) {
			f.mkdir();
		}

		// file copy

		Files.copy(file.getInputStream(), Paths.get(filepath));

		return fileName1;
	}

	// db logic to return inputStream
	@Override
	public InputStream getResource(String path, String fileName) throws FileNotFoundException {
		String fullpath = path + File.separator + fileName;
		InputStream is = new FileInputStream(fullpath);
		
		return is;
	}

}
