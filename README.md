Consuming Rest API in Springboot by RestTemplate

RestTemplate Methods - 

GET Method:
---

getForObject(String url, Class<T> responseType, Object... uriVariables): Executes a GET request for the specified URL and returns the response body mapped to the specified Java object type.

getForEntity(String url, Class<T> responseType, Object... uriVariables): Similar to getForObject, but returns a ResponseEntity containing the response status code, headers, and body.

POST Method:
---

postForObject(String url, Object request, Class<T> responseType, Object... uriVariables): Executes a POST request with the given request object as the request body, and returns the response body mapped to the specified Java object type.

postForEntity(String url, Object request, Class<T> responseType, Object... uriVariables): Similar to postForObject, but returns a ResponseEntity containing the response status code, headers, and body.


![image](https://github.com/PPC2001/RestAPI-Consumption-Springboot/assets/107803628/2312c721-8a66-43d0-b0c6-48a1e743081d)


![image](https://github.com/PPC2001/RestAPI-Consumption-Springboot/assets/107803628/c5731bb3-4ee9-4ac0-a1b0-25b2298e845f)
