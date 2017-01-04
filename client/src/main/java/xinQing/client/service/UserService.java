package xinQing.client.service;

import xinQing.api.dto.UserDto;

import java.util.List;

/**
 * 这个是client的业务逻辑定义，不要跟dubbo的服务api搞混了
 * 根据各位大佬的博客，大家认为通常会把dubbo放在比较靠后的服务
 *
 * client的controller中调用自己的service，service可能要调用多个dubbo提供服务。
 *
 * 直接在controller很容易出现dubbo注入为null的问题。
 *
 * Created by null on 2017/1/4.
 */
public interface UserService {

    List<UserDto> findAll();

}
