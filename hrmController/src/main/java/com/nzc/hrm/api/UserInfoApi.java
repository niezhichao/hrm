package com.nzc.hrm.api;

import com.nzc.common.model.HrmResult;
import com.nzc.hrm.entity.po.UserInfo;

public interface UserInfoApi {
    HrmResult insertUserInfo(UserInfo userInfo)throws Exception;
}
