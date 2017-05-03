package com.wang.service;

import com.wang.result.FileResult;

import java.io.InputStream;

/**
 * Created by Administrator on 2017/5/2.
 */
public interface FileUploadService {

    FileResult fileUploadSave(String originalFileName, InputStream inputStream);
}
