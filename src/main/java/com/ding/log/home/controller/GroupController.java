package com.ding.log.home.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.ding.log.home.message.bean.GroupBean;
import com.ding.log.home.util.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@RestController
@RequestMapping(value = "/group")
public class GroupController {
    @Value("${temp.test.str}")
    private String str;

    @ResponseBody
    @RequestMapping(value = "/getGroupList")
    public List<GroupBean> getGroupList(String clientAppName) {
         log.info("clientAppName:{},data:{}",clientAppName,str);
        ArrayList<GroupBean> list = JSON.parseObject(str, new TypeReference<ArrayList<GroupBean>>() {
        });
        return list;
    }
}
