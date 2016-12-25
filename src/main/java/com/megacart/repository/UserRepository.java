package com.megacart.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.megacart.domain.user.McUser;

public interface UserRepository extends PagingAndSortingRepository<McUser, Long> {

	McUser findByLastname(String lastName);
}
