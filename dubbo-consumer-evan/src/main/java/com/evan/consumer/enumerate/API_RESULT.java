package com.evan.consumer.enumerate;

public enum API_RESULT {
    //系统返回状态
    OK("200", "OK"),
    ;

    public String RESULT_CODE;
    public String RESULT_MSG;

    API_RESULT(String resultCode, String resultMsg) {
        this.RESULT_CODE = resultCode;
        this.RESULT_MSG = resultMsg;
    }

    public String getRESULT_CODE() {
        return RESULT_CODE;
    }

    public void setRESULT_CODE(String RESULT_CODE) {
        this.RESULT_CODE = RESULT_CODE;
    }

    public String getRESULT_MSG() {
        return RESULT_MSG;
    }

    public void setRESULT_MSG(String RESULT_MSG) {
        this.RESULT_MSG = RESULT_MSG;
    }
}
