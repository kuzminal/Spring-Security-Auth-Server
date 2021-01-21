# Getting Started

### Sending request

For authentication via auth-server:
* You should send request for endpoint: POST http://localhost:8080/user/auth with the following request body:
```json
{
    "username": "danielle",
    "password": "12345"
}
```
* Then you should check database table OTP and find actual code
* Put that code into next request to another endpoint: POST http://localhost:8080/otp/check with the following request body:

```json
{
    "username": "danielle",
    "code": {put your otp code here}
}
```
* You are logged in now!

### Another endpoints
  [GET http://localhost:9090/login](http://localhost:9090/login) with the following headers:
    - username: danielle
    - password: 12345

* You can add new user by sending request to POST http://localhost:8080/user/add with the following request body:
```json
{
    "username": "danielle",
    "password": "12345"
}
```