package blog.dao;

import blog.model.User;

public interface UserDao {

	/**
	 * 注册用户
	 */
	boolean register(String username, String password);

	/**
	 * 登录验证
	 */
	User login(String username, String password);

}