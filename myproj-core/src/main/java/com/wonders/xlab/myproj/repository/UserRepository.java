package com.wonders.xlab.myproj.repository;

import com.wonders.xlab.myproj.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wangqiang on 16/1/29.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
