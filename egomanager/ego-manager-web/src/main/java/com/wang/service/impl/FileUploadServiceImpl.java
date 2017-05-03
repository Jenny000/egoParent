package com.wang.service.impl;

import com.wang.result.FileResult;
import com.wang.service.FileUploadService;
import com.wang.util.DateUtil;
import com.wang.util.FileUploadUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/2.
 */
@Service
public class FileUploadServiceImpl implements FileUploadService {
    private static Logger logger= LoggerFactory.getLogger(FileUploadServiceImpl.class);

    @Value("${ftp.host}")
    private String ftpHost;
    @Value("${ftp.username}")
    private String ftpUsername;
    @Value("${ftp.password}")
    private String ftpPassword;
    @Value("${ftp.path}")
    private String ftpPath;

    @Override
    public FileResult fileUploadSave(String fileName, InputStream inputStream) {
        //得到日期 格式 2016/12/20
        String path = DateUtil.getDateStr(new Date(),DateUtil.pattern_xg);
        FileResult result=null;


        try {
            //得到文件上传至服务器中的名称
            String remotname=FileUploadUtil.fileUpload(ftpHost,ftpUsername,ftpPassword,fileName,
                    inputStream, ftpPath+"/"+path);
            if(remotname!=null && remotname.length()>0){
                String imageUrl=(ftpHost+"/"+path+remotname);
                result=new FileResult();
                result.setSuccess("文件上传成功");
                result.setFileUrl(imageUrl);
            }
        } catch (IOException e) {
            logger.error("文件上传失败" +e.getMessage());
            e.printStackTrace();
        }
       return result;


    }
}
