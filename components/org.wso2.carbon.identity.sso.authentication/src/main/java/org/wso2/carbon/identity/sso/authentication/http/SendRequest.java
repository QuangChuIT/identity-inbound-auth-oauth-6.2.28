package org.wso2.carbon.identity.sso.authentication.http;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.message.BasicHeader;
import org.wso2.carbon.identity.sso.authentication.PropertyFileReader;

import java.security.GeneralSecurityException;
import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class SendRequest {

    public HttpResponse sendRequest(String message, String endpoint) throws GeneralSecurityException,
            ExecutionException, InterruptedException {
        return sendAsync(endpoint, message).get();
    }

    public HttpResponse getRequest(String endpoint) throws GeneralSecurityException, ExecutionException, InterruptedException {
        return getAsync(endpoint);
    }
    /**
     * Gửi bất đồng bộ tin push sử dụng CloseableHttpAsyncClient
     *
     * @param message
     * @return
     * @throws GeneralSecurityException
     */
    private Future<HttpResponse> sendAsync(String endpoint, String message) throws GeneralSecurityException {
        try {
            HttpPost httpPost = preparePost(endpoint, message);
            CloseableHttpAsyncClient closeableHttpAsyncClient = HttpAsyncClients.createSystem();
            closeableHttpAsyncClient.start();

            return closeableHttpAsyncClient.execute(httpPost, new CloseableCallback(closeableHttpAsyncClient));
        } catch (Exception e) {
            log.error("send push async exception = " + e);
            throw new GeneralSecurityException(e);
        }
    }
    private HttpResponse getAsync(String endpoint) throws GeneralSecurityException {
        try {
            HttpGet httpGet = prepareGet(endpoint);
            CloseableHttpClient httpClient = HttpClients.createDefault();
            return httpClient.execute(httpGet);
        } catch (Exception e){
            log.error("Error get async exception =" + e);
            throw new GeneralSecurityException(e);
        }
    }
    /**
     * Tạo http post với header và data push gửi đi
     *
     * @param message
     * @return
     */
    private HttpPost preparePost(String endpoint, String message) throws Exception {

        try {
            Properties props = PropertyFileReader.readPropertyFile();
            String token = props.getProperty("cas.sso.url");
            String appCode = props.getProperty("cas.sso.validate.ticket");
            HttpPost httpPost = new HttpPost(endpoint);
            httpPost.addHeader(new BasicHeader("Content-Type", "application/json"));
            httpPost.addHeader(new BasicHeader("token", token));
            httpPost.addHeader(new BasicHeader("appcode", appCode));

            httpPost.setEntity(new StringEntity(message));
            return httpPost;
        } catch (Exception e) {
            throw new Exception(e);
        }

    }

    private HttpGet prepareGet(String endpoint) throws Exception {
        try {
            return new HttpGet(endpoint);
        } catch (Exception e){
            throw new Exception("Error when call get endpoint" + endpoint + "in Hue Authenticator");
        }
    }
    private static final Log log = LogFactory.getLog(SendRequest.class);
}
