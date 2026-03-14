# Java Security

## Topics to Practice
- [ ] Input validation & sanitization
- [ ] `MessageDigest` — SHA-256, MD5 hashing
- [ ] `Mac` — HMAC for message authentication
- [ ] `Cipher` — AES, RSA encryption/decryption
- [ ] `KeyGenerator`, `KeyPairGenerator`
- [ ] `SecureRandom` vs `Random`
- [ ] Java KeyStore (`KeyStore`)
- [ ] SSL/TLS with `SSLContext`, `HttpsURLConnection`
- [ ] OWASP Top 10 in Java context
  - SQL Injection — use `PreparedStatement`
  - XSS — output encoding
  - Insecure deserialization — avoid Java native deserialization from untrusted input
  - Broken access control
- [ ] Secure coding guidelines — avoid `Runtime.exec()` with user input
