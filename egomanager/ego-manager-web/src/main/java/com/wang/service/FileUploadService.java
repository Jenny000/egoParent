package com.wang.service;

import java.io.InputStream;

/**
 * Created by Administrator on 2017/5/2.
 */
public interface FileUploadService {
    FileUploadService fileUploadSave(String originalFileName, InputStream inputStream);
}
