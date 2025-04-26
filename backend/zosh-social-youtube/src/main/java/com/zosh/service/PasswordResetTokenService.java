package com.zosh.service;

import com.zosh.models.PasswordResetToken;

public interface PasswordResetTokenService {

	public PasswordResetToken findByToken(String token);

	public void delete(PasswordResetToken resetToken);

}
