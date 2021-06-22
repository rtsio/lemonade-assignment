# Lemonade assignment

Exposes a simple HTTP server on port 8080 that counts words in a string.

### Building

Run: `./gradlew build`

### API

#### Count words

`POST /count` - count number of words in a given string

Payload:
```json
{
  "Text": "the cat jumped over the hill",
  "Word": "cat"
}
```

Response:

```
1
```

Assumptions:
  * words are not defined by whitespace (i.e. "catcat" is counted as 2 occurences of "cat")
  * dashes, commas, and digits in "Text" field are ignored
  * comparison is case-insensitive

#### Healthcheck

`GET /healthcheck` - default Spring Actuator healthcheck endpoint, remapped from `/actuator/health` 
(see [Actuator docs](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html))
