package com.wangsong.system.api;

import com.wangsong.common.model.Result;
import com.wangsong.system.model.UserDO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("springcloud-app-system")
public interface SystemAPI {


    @RequestMapping(value = "/springcloud-app-system/api/getUser", method = RequestMethod.POST)
    Result<UserDO> getUser(@RequestBody UserDO u);


}