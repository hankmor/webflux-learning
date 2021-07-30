package com.koobyte.dao;

import com.koobyte.entity.User;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

/**
 * Created by sun on 2021/7/30.
 *
 * @author sunfuchang03@126.com
 * @since 1.0
 */
public interface UserDao extends R2dbcRepository<User, Long> {
	//~ Constants/Initializer


	//~ Interfaces

	Flux<User> findByName(String name);
}
