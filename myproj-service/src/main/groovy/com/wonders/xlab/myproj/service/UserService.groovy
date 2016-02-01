package com.wonders.xlab.myproj.service

import com.wonders.xlab.myproj.repository.UserRepository
import org.springframework.cache.annotation.Cacheable

import javax.inject.Inject
import javax.inject.Named

/**
 * Created by wangqiang on 16/1/29.
 */
@Named
class UserService {

    @Inject
    UserRepository userRepository

    @Cacheable
    def findOne(id) { userRepository.findOne(id) }

}
