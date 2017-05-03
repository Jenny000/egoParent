package com.wang.service.impl;

import com.wang.result.FileResult;
import com.wang.service.FileUploadService;
import com.wang.util.DateUtil;
import com.wang.util.FileUploadUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


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
    public FileUploadService fileUploadSave(String originalFileName, InputStream inputStream) {
        //得到日期 格式 2016/12/20
        String path = DateUtil.getDateStr(new Date(),DateUtil.pattern_xg);
        FileResult result=null;
        FileUploadUtil fileUploadUtil =null;
        //得到文件上传至服务器中的名称
       // String remotname=FileUploadUtil.fileUpload(ftpHost,ftpUsername,ftpPassword,fftpPath)
        System.out.println("hhhh");
        return null;

    }
}
