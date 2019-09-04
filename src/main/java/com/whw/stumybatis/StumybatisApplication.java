package com.whw.stumybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.InputStream;

@SpringBootApplication
public class StumybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(StumybatisApplication.class, args);
		try{
			String resource = " classpath:mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		}catch (Exception ex){
			ex.printStackTrace();
		}

	}

}
