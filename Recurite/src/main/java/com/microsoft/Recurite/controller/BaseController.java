package com.microsoft.Recurite.controller;

import com.microsoft.Recurite.constant.GlobalConst;

public class BaseController {
    public String userDirect(String viewName) {
        return GlobalConst.USER_RPATH + "/" + viewName;
    }

    public String hrDirect(String viewName) {
        return GlobalConst.HR_PATH + "/" + viewName;
    }

    public String adminDirect(String viewName) {
        return GlobalConst.ADMIN_PATH + "/" + viewName;
    }
}
