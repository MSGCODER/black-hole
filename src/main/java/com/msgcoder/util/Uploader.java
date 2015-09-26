package com.msgcoder.util;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by guanshiming on 2015/9/26.
 */
public class Uploader {
    public static String upload(HttpServletRequest request, MultipartFile file){
        String path = request.getSession().getServletContext().getRealPath("/upload");
        String subPath = new SimpleDateFormat("yyyyMM").format(new Date());
        String fileName = new Date().getTime() + file.getOriginalFilename();
        File targetFile = new File(path+ "/" + subPath, fileName);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }

        //保存
        try {
            file.transferTo(targetFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/upload" + "/" + subPath +"/" +fileName;
    }
}
