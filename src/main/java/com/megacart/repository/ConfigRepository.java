package com.megacart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.megacart.domain.setting.McSetting;

public interface ConfigRepository extends JpaRepository<McSetting, Long> {

	McSetting findByKey(String key);
}
