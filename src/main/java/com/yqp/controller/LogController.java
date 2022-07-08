package com.yqp.controller;

import com.yqp.common.ResponseJson;
import com.yqp.domain.Page;
import com.yqp.service.LogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author YuQingPeng
 * @Date 2022/7/8 000812:32
 * @Description TODO
 */
@Controller
@RequestMapping("/log")
public class LogController {

    @Resource
    private LogService logService;

    @GetMapping("/list")
    @ResponseBody
    public ResponseJson getLogList(Page page){
        return new ResponseJson(logService.getList(page));
    }


}
