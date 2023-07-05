package com.summer.classdemo.service.Impl;

import com.summer.classdemo.service.UploadService;
import com.summer.classdemo.util.Base64Util;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@Service
public class UploadServiceImpl implements UploadService {
    @Override
    public Map<String, Object> fileUpload(MultipartFile file) {
        String base64 = Base64Util.generateBase64(file);
        HashMap<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("img_url", base64);
        return map;
    }
}
