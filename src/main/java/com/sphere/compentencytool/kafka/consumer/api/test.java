//package com.sphere.compentencytool.kafka.consumer.api;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.apache.http.client.HttpClient;
//import org.apache.http.impl.client.HttpClientBuilder;
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.springframework.http.*;
//import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
//import org.springframework.web.client.RestTemplate;
//
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.ResourceBundle;
//
//class test {
//
//    public static void main(String[] args) throws IOException {
//
////        ObjectMapper mapper = new ObjectMapper();
////        JSONObject mainobj =new JSONObject();
////        JSONObject main1 =new JSONObject();
////        main1.put( "userId", "0eb7e0aa-481a-4f00-a8be-f5173202507ccc");
////        main1.put(  "typeName", "competency");
////
////        JSONArray competencyDetails= new JSONArray();
////        JSONObject  competencyDetails_main_obj =new JSONObject();
////        competencyDetails_main_obj.put("competencyId", "50");
////
////        JSONObject additionalParams = new JSONObject();
////        additionalParams.put("competencyName", "Procurement and Distribution of HCM");
////        competencyDetails_main_obj.put("additionalParams",additionalParams);
////
////        JSONObject acquiredDetails = new JSONObject();
////
////        acquiredDetails.put("acquiredChannel", "Course");
////        acquiredDetails.put("competencyLevelId", "11");
////        acquiredDetails.put("secondaryPassbookId", "competencyLevelId1");
////        JSONObject acquiredDetails_additionalParams = new JSONObject();
////        acquiredDetails_additionalParams.put("courseId", "do_1134170689871134721450");
////        acquiredDetails_additionalParams.put("courseName", "Normal Labour & Birth and AMTSL");
////
////        acquiredDetails.put("additionalParams",acquiredDetails_additionalParams);
////        competencyDetails_main_obj.put("acquiredDetails",acquiredDetails);
////        competencyDetails.put(competencyDetails_main_obj);
////        main1.put("competencyDetails",competencyDetails);
////
////
////
////        mainobj.put("request",main1);
////        Passbook_update("0eb7e0aa-481a-4f00-a8be-f5173202507ccc",mainobj);
//
//
//
////        System.out.println(mainobj.toString(4));
//
//
//
////        // convert map to JSON string
////        String json = mapper.writeValueAsString(mainobj);
////
////        System.out.println(json);   // compact-print
////
////        json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mainobj);
////
////        System.out.println(json);   // pretty-print
//
//        JSONObject getentityid = get_entityById("45");
//        System.out.println(getentityid);
//
//
//
//
//    }
//
//    private static void Passbook_update(String userId, JSONObject request) throws JsonProcessingException {
//
//        RestTemplate restTemplate = new RestTemplate();
//        HttpClient httpClient = HttpClientBuilder.create().build();
//        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
//        restTemplate.setRequestFactory(requestFactory);
//
//        String request_body = request.toString();
//        String url = "https://sphere.aastrika.org/api/user/v1/passbook";
//        String Api_key = "bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJTNHNNVFdjZUZqYkxUWGxiczkzUzk4dmFtODBhdkRPUiJ9.nPOCY0-bVX28iNcxxnYbGpihY3ZzfNwx0-SFCnJwjas";
//        HttpHeaders header = new HttpHeaders();
//        header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        header.add("Authorization", Api_key);
//        header.add("x-authenticated-userid",userId );
//        Map<String, Object> mapping = new ObjectMapper().readValue(request_body, HashMap.class);
//
//        System.out.println("mapping : "+mapping);
//
//        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(mapping, header);
//        ResponseEntity<String> passbookResponse = restTemplate.exchange(url , HttpMethod.PATCH, entity, String.class);
//        System.out.println(passbookResponse);
//        String responseStr = passbookResponse.getBody();
//        int begin = responseStr.indexOf("{");
//        int end = responseStr.lastIndexOf("}") + 1;
//        responseStr = responseStr.substring(begin, end);
//        System.out.println(responseStr);
//        JSONObject passbook_payload = new JSONObject(responseStr);
//        System.out.println(passbook_payload.toString(4));
//
//    }
//
//    private static JSONObject get_entityById(String competency_id) throws JsonProcessingException {
//        ResourceBundle props = ResourceBundle.getBundle("application");
//        RestTemplate restTemplate = new RestTemplate();
//        String url = props.getString("get.entityById") + competency_id;
//        System.out.println("get_entityById fun ");
//        String token = props.getString("token.key");
//        HttpHeaders header = new HttpHeaders();
//        header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
////        header.add("x-authenticated-user-token", token);
//
//        String req = "{\"filter\":{\"isDetail\":true}}";
//        Map<String, Object> mapping = new ObjectMapper().readValue(req, HashMap.class);
//
//        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(mapping, header);
//        ResponseEntity<String> entityResponse = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
//
//        System.out.println(entityResponse.getStatusCode());
//
//        HttpStatus statusCode = entityResponse.getStatusCode();
//        System.out.println(statusCode);
//
//        String responseStr = entityResponse.getBody();
//        int begin = responseStr.indexOf("{");
//        int end = responseStr.lastIndexOf("}") + 1;
//        responseStr = responseStr.substring(begin, end);
//       System.out.println(responseStr);
//        JSONObject passbook_payload = new JSONObject(responseStr);
//        System.out.println(passbook_payload.get("responseCode"));
//
//        JSONObject passbook_result = passbook_payload.getJSONObject("result");
//        return (JSONObject) passbook_result.get("response");
//
//    }  }