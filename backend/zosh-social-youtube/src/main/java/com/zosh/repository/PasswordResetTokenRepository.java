package com.zosh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zosh.models.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {

	PasswordResetToken findByToken(String token);

}
