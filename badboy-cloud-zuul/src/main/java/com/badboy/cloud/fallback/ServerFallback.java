package com.badboy.cloud.fallback;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;

@Component
public class ServerFallback implements FallbackProvider{

	@Override
	public String getRoute() {
		return "*";
	}

	@Override
	public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
		// TODO Auto-generated method stub
		return new ClientHttpResponse() {
			
			@Override
			public HttpStatus getStatusCode() throws IOException {
				return HttpStatus.OK; // 请求网关成功了，所以是ok
			}

			@Override
			public int getRawStatusCode() throws IOException {
				return this.getStatusCode().value();
			}

			@Override
			public String getStatusText() throws IOException {
				return this.getStatusCode().getReasonPhrase();
			}

			@Override
			public void close() {

			}

			@Override
			public InputStream getBody() throws IOException {
				JSONObject json = new JSONObject();
				json.put("code", "-1");
				json.put("currentTimeMillis", System.currentTimeMillis());
				json.put("desc", "业务服务错误");
				return new ByteArrayInputStream(json.toJSONString().getBytes("UTF-8")); // 返回前端的内容
			}

			@Override
			public HttpHeaders getHeaders() {
				HttpHeaders httpHeaders = new HttpHeaders();
				httpHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8); // 设置头
				return httpHeaders;
			}
		};
	}

}
