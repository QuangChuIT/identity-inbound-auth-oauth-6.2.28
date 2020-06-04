package org.wso2.carbon.identity.sso.authentication;

import org.osgi.service.http.HttpService;

public class SSOAuthenticationServiceHolder {
    private static volatile SSOAuthenticationServiceHolder dataHolder = null;

    private static HttpService httpService;

    private SSOAuthenticationServiceHolder() {

    }

    public static SSOAuthenticationServiceHolder getInstance() {

        if (dataHolder == null) {
            synchronized (SSOAuthenticationServiceHolder.class) {
                if (dataHolder == null) {
                    dataHolder = new SSOAuthenticationServiceHolder();
                }
            }
        }

        return dataHolder;
    }

    public HttpService getHttpService() {
        return httpService;
    }

    public void setHttpService(HttpService httpService) {
        this.httpService = httpService;
    }
}
