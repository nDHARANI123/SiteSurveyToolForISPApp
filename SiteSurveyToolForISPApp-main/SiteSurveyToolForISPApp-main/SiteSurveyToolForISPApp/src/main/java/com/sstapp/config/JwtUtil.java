package com.sstapp.config;

import java.util.Date;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {

	private static final String SECRET_KEY = "sst-secret-key";
	private static final long EXPIRATION = 1000 * 60 * 60; // 1 hour

	public static String generateToken(String email) {
		return Jwts.builder().setSubject(email).setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + EXPIRATION))
				.signWith(SignatureAlgorithm.HS256, SECRET_KEY).compact();
	}

	public static String extractEmail(String token) {
		Claims claims = Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();

		return claims.getSubject();
	}
}
