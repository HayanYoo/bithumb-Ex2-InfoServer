# bithumb 과제 :  WebFlux를 이용한 내부 통신용 WebServer 구축

### [SayHello Server](https://github.com/HayanYoo/bithumb-Ex2)
- Server port = 8083
### [InfoService Server](https://github.com/HayanYoo/bithumb-Ex2)
- Server port = 8082
<br><br>
## Spec

1. SpringBoot 2.6.6
2. Java 11
3. WebFlux
4. Functional Endpoint
5. WebClient
<br><br>

## 1. GET Hello
>Request

`GET localhost:8082/info-service/uri?name=$name`
<br><br>
>Response

`application/json`
```json
{
    "job": "",
}
```
<br><br>
