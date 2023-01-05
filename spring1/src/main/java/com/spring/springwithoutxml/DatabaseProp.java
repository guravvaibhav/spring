package com.spring.springwithoutxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseProp {
	@Value("#{}")
	private String url;
	@Value("")
	private String username;
	@Value("")
	private String password;
	public DatabaseProp() {
		super();
	}
	public DatabaseProp(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "DatabaseProp [url=" + url + ", username=" + username + ", password=" + password + "]";
	}
	

}
