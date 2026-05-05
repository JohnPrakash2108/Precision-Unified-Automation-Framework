package requestBuilders;

import org.apache.log4j.Logger;
import org.example.utils.LoggerUtil;

import java.util.HashMap;
import java.util.Map;

public class UserRequestBuilder {

    private static final Logger log = LoggerUtil.getLogger(UserRequestBuilder.class);

    public static Map<String,String> createUser() {

        Map<String,String> body = new HashMap<>();
        log.info("Building create user request payload");

        body.put("name","John Prakash Balireddy");
        body.put("email","balireddyjohnprakash01@test.com");
        body.put("password","John@950241");
        body.put("title","Mr");
        body.put("birth_date","29");
        body.put("birth_month","April");
        body.put("birth_year","2004");
        body.put("firstname","John Prakash");
        body.put("lastname","Balireddy");
        body.put("company","Veeva Systems");
        body.put("address1","Adimma Dibba");
        body.put("address2","Wambay apartments");
        body.put("country","India");
        body.put("zipcode","533101");
        body.put("state","Andhra Pradesh");
        body.put("city","Rajahmundry");
        body.put("mobile_number","9502419692");

        log.info("Request body : "+body.toString());

        return body;
    }

    public static Map<String,String> updateUser() {

        Map<String,String> body = new HashMap<>();
        log.info("Building update user request payload");

        body.put("name","John");
        body.put("email","jp790@test.com");
        body.put("password","john123");
        body.put("birth_date","18");
        body.put("birth_month","June");
        body.put("birth_year","2004");
        body.put("address2","Satuluru bangla");
        body.put("zipcode","521369");

        log.info("Request body : "+body.toString());

        return body;
    }

    public static Map<String,String> deleteUser() {

        Map<String,String> body = new HashMap<>();
        log.info("Building delete user request payload");

        body.put("email","jp790@test.com");
        body.put("password","john123");

        log.info("Request body : "+body.toString());

        return body;
    }
}
