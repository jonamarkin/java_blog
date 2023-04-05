package com.markin.blog.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import jakarta.xml.bind.DatatypeConverter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.function.Function;

@Service
public class JwtService {
  // Secret key for JWT
  private static String SECRET_KEY =
      "38782F413F4428472B4B6250655368566D597033733676397924422645294840";

  // Extract username from JWT
  public String extractUsername(String token) {
    return extractClaim(token, Claims::getSubject);
  }

  // Extract claims from JWT
  private Claims extractAllClaims(String token) {
    return Jwts.parserBuilder()
        .setSigningKey(getSignInKey())
        .build()
        .parseClaimsJws(token)
        .getBody();
  }


  // Get signInKey
  private Key getSignInKey() {
    byte[] apiKeySecretBytes = Decoders.BASE64.decode(SECRET_KEY);
    return Keys.hmacShaKeyFor(apiKeySecretBytes);
  }

  // Extract claim
  public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
    final Claims claims = extractAllClaims(token);
    return claimsResolver.apply(claims);
  }
}
