package com.wyait.manage.service;

import com.wyait.manage.entity.UserDTO;
import com.wyait.manage.entity.UserRolesVO;
import com.wyait.manage.entity.UserSearchDTO;
import com.wyait.manage.pojo.User;
import com.wyait.manage.utils.PageDataResult;

/**
 * @项目名称：lyd-channel
 * @包名：com.lyd.channel.service
 * @类描述：
 * @创建人：wyait
 * @创建时间：2017-12-20 15:52
 * @version：V1.0
 */
public interface UserService {
	/**
	 * 分页查询用户列表
	 * @param page
	 * @param limit
	 * @return
	 */
	PageDataResult getUsers(UserSearchDTO userSearch, int page, int limit);

	/**
	 *	设置用户【新增或更新】
	 * @param user
	 * @param roleIds
	 * @return
	 */
	String setUser(User user, String roleIds);

	/**
	 * 设置用户是否离职
	 * @param id
	 * @param isJob
	 * @return
	 */
	int setJobUser(Integer id, Integer isJob);

	/**
	 * 删除用户
	 * @param id
	 * @param isDel
	 * @return
	 */
	int setDelUser(Integer id, Integer isDel);

	/**
	 * 查询用户数据
	 * @param id
	 * @return
	 */
	UserRolesVO getUserAndRoles(Integer id);

	/**
	 * 发送短信验证码
	 * @param user
	 * @return
	 */
	String sendMsg(UserDTO user);

	/**
	 * 根据手机号查询用户数据
	 * @param mobile
	 * @return
	 */
	User findUserByMobile(String mobile);

	/**
	 * 根据手机号发送短信验证码
	 * @param mobile
	 * @return
	 */
	String sendMessage(int userId, String mobile);

	/**
	 * 修改用户手机号
	 * @param id
	 * @param password
	 * @return
	 */
	int updatePwd(Integer id, String password);

	/**
	 * 锁定用户
	 * @param id
	 * @param isLock  0:解锁；1：锁定
	 * @return
	 */
	int setUserLockNum(Integer id,int isLock);
}
