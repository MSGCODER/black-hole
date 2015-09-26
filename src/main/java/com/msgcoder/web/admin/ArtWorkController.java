package com.msgcoder.web.admin;

import com.msgcoder.dao.ArtWorkDao;
import com.msgcoder.dao.entities.ArtWork;
import com.msgcoder.util.Uploader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by guanshiming on 2015/9/26.
 */
@Controller
@RequestMapping(value = "/admin/artwork", method = RequestMethod.GET)
public class ArtWorkController {
    @Autowired
    private ArtWorkDao artWorkDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(){
        return "";
    }

    @RequestMapping(value = "/view/new", method = RequestMethod.GET)
    public String viewNew(){
        return "admin/artwork/new";
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public void newItem( @RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request,
                         @ModelAttribute ArtWork artWork, PrintWriter writer){
        if (file!=null && !file.isEmpty()){
            String imgUrl = Uploader.upload(request, file);
            artWork.setCover(imgUrl);
        }
        artWork.setCreateTime(new Date());
        Serializable id = artWorkDao.save(artWork);
        writer.write("success");
    }

}
