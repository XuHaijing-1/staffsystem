package com.springmvc.entity;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 用户模型类
 * @author 憨态可拘
 *
 */
public class User implements Serializable{
	private static final long serialVersionUID = 8245746230705180748L;
	public static final String CACHE_NAME="users";
	@Id
	private String id;  //用户id
	private String year; //用户年龄
	private String username;  //用户名
	private String gender;  //用户性别
	private String site;  //用户地址


}
