package io.swagger.api;

import io.swagger.model.Auth1CheckuninstallpwdReq;
import io.swagger.model.Auth1CheckuninstallpwdRes;
import io.swagger.model.Auth1ExtloginclientReq;
import io.swagger.model.Auth1ExtloginclientRes;
import io.swagger.model.Auth1GetbyadsessionReq;
import io.swagger.model.Auth1GetbyadsessionRes;
import io.swagger.model.Auth1GetbythirdpartyReq;
import io.swagger.model.Auth1GetbythirdpartyRes;
import io.swagger.model.Auth1GetbyticketReq;
import io.swagger.model.Auth1GetbyticketRes;
import io.swagger.model.Auth1GetconfigRes;
import io.swagger.model.Auth1GetextappinfoReq;
import io.swagger.model.Auth1GetextappinfoRes;
import io.swagger.model.Auth1GetnewReq;
import io.swagger.model.Auth1GetnewRes;
import io.swagger.model.Auth1GetoauthinfoRes;
import io.swagger.model.Auth1GetvcodeReq;
import io.swagger.model.Auth1GetvcodeRes;
import io.swagger.model.Auth1LogoutReq;
import io.swagger.model.Auth1ModifypasswordReq;
import io.swagger.model.Auth1RefreshtokenReq;
import io.swagger.model.Auth1RefreshtokenRes;
import io.swagger.model.Auth1RevoketokenReq;
import io.swagger.model.Auth1SelfregistrationReq;
import io.swagger.model.Auth1SelfregistrationRes;
import io.swagger.model.Auth1SendauthvcodeReq;
import io.swagger.model.Auth1SendauthvcodeRes;
import io.swagger.model.Auth1ValidatesecuritydeviceReq;
import io.swagger.model.Auth1ValidatesecuritydeviceRes;
import io.swagger.model.Error;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-10T06:15:45.348Z[GMT]")
@Controller
public class Auth1ApiController implements Auth1Api {

    private static final Logger log = LoggerFactory.getLogger(Auth1ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public Auth1ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Auth1CheckuninstallpwdRes> auth1CheckuninstallpwdPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Auth1CheckuninstallpwdReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Auth1CheckuninstallpwdRes>(objectMapper.readValue("{\n  \"result\" : \"ok\"\n}", Auth1CheckuninstallpwdRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Auth1CheckuninstallpwdRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Auth1CheckuninstallpwdRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Auth1ExtloginclientRes> auth1ExtloginclientPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Auth1ExtloginclientReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Auth1ExtloginclientRes>(objectMapper.readValue("{\n  \"userid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n  \"tokenid\" : \"f46d296a-0c66-35e4-b23c-77e2d304a7a8\",\n  \"expires\" : 3600\n}", Auth1ExtloginclientRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Auth1ExtloginclientRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Auth1ExtloginclientRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Auth1GetbyadsessionRes> auth1GetbyadsessionPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Auth1GetbyadsessionReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Auth1GetbyadsessionRes>(objectMapper.readValue("{\n  \"userid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n  \"tokenid\" : \"f46d296a-0c66-35e4-b23c-77e2d304a7a8\",\n  \"expires\" : 3600\n}", Auth1GetbyadsessionRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Auth1GetbyadsessionRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Auth1GetbyadsessionRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Auth1GetbythirdpartyRes> auth1GetbythirdpartyPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Auth1GetbythirdpartyReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Auth1GetbythirdpartyRes>(objectMapper.readValue("{\n  \"userid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n  \"tokenid\" : \"f46d296a-0c66-35e4-b23c-77e2d304a7a8\",\n  \"expires\" : 3600\n}", Auth1GetbythirdpartyRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Auth1GetbythirdpartyRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Auth1GetbythirdpartyRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Auth1GetbyticketRes> auth1GetbyticketPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Auth1GetbyticketReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Auth1GetbyticketRes>(objectMapper.readValue("{\n  \"userid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n  \"tokenid\" : \"f46d296a-0c66-35e4-b23c-77e2d304a7a8\",\n  \"expires\" : \"3600\"\n}", Auth1GetbyticketRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Auth1GetbyticketRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Auth1GetbyticketRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Auth1GetconfigRes> auth1GetconfigPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Auth1GetconfigRes>(objectMapper.readValue("{\n  \"api_version\" : \"6.0.8\",\n  \"auto_lock_remind\" : true,\n  \"cad_plugin_threshold\" : 10485760,\n  \"csf_level_enum\" : {\n    \"内部\" : 6,\n    \"机密\" : 8,\n    \"秘密\" : 7,\n    \"非密\" : 5\n  },\n  \"device_info\" : {\n    \"auth_days\" : 160,\n    \"auth_status\" : 2,\n    \"auth_type\" : 2,\n    \"hardware_type\" : \"ASE-S\",\n    \"software_type\" : \"ASE\"\n  },\n  \"dualfactor_auth_server_status\" : {\n    \"auth_by_OTP\" : false,\n    \"auth_by_Ukey\" : false,\n    \"auth_by_email\" : false,\n    \"auth_by_sms\" : false\n  },\n  \"enable_doc_comment\" : true,\n  \"enable_doc_due_remind\" : false,\n  \"enable_exit_pwd\" : false,\n  \"enable_invitation_share\" : false,\n  \"enable_limit_rate\" : false,\n  \"enable_link_access_code\" : false,\n  \"enable_message_notify\" : true,\n  \"enable_outlink_watermark\" : false,\n  \"enable_secret_mode\" : false,\n  \"enable_set_folder_security_level\" : true,\n  \"enable_strong_pwd\" : false,\n  \"entrydoc_view_config\" : 1,\n  \"extapp\" : {\n    \"enable_chaojibiaoge\" : false\n  },\n  \"file_crawl_status\" : false,\n  \"forbid_ostype\" : \"166\",\n  \"https\" : false,\n  \"id_card_login_status\" : false,\n  \"internal_link_prefix\" : \"AnyShare://\",\n  \"limit_rate_config\" : {\n    \"isenabled\" : false,\n    \"limittype\" : 0\n  },\n  \"oemconfig\" : {\n    \"allowauthlowcsfuser\" : true,\n    \"allowowner\" : true,\n    \"cadpreview\" : false,\n    \"clearcache\" : false,\n    \"clientlogouttime\" : -1,\n    \"defaultpermexpireddays\" : -1,\n    \"enableclientmanuallogin\" : true,\n    \"enablecsflevel\" : false,\n    \"enablefiletransferlimit\" : false,\n    \"enablehttplinkaudit\" : false,\n    \"enableonedrive\" : false,\n    \"enableshareaudit\" : false,\n    \"enableuseragreement\" : false,\n    \"hidecachesetting\" : false,\n    \"indefiniteperm\" : true,\n    \"maxpassexpireddays\" : -1,\n    \"owasurl\" : \"\",\n    \"rememberpass\" : true,\n    \"sursenpreview\" : false,\n    \"wopiurl\" : \"\"\n  },\n  \"only_share_to_user\" : false,\n  \"server_version\" : \"6.0.7-20190722-3852\",\n  \"show_knowledge_page\" : 0,\n  \"smtp_server_exists\" : true,\n  \"strong_pwd_length\" : 8,\n  \"tag_max_num\" : 30,\n  \"third_pwd_modify_url\" : \"\",\n  \"vcode_login_config\" : {\n    \"isenable\" : false,\n    \"passwderrcnt\" : 0\n  },\n  \"windows_ad_sso\" : {\n    \"is_enabled\" : true\n  }\n}", Auth1GetconfigRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Auth1GetconfigRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Auth1GetconfigRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Auth1GetextappinfoRes> auth1GetextappinfoPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Auth1GetextappinfoReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Auth1GetextappinfoRes>(objectMapper.readValue("{\n  \"value\" : {\n    \"access_token\" : \"24cc354221cdfa179572ab0e1792a323\",\n    \"expires_in\" : \"300\",\n    \"url\" : \"http://chaojibiaoge.com/index.php/ApiAuth/apiLogin/access_token/24cc354221cdfa179572ab0e1792a323\"\n  }\n}", Auth1GetextappinfoRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Auth1GetextappinfoRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Auth1GetextappinfoRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Auth1GetnewRes> auth1GetnewPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Auth1GetnewReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Auth1GetnewRes>(objectMapper.readValue("{\n  \"userid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n  \"tokenid\" : \"f46d296a-0c66-35e4-b23c-77e2d304a7a8\",\n  \"needmodifypassword\" : false,\n  \"expires\" : 3600\n}", Auth1GetnewRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Auth1GetnewRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Auth1GetnewRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Auth1GetoauthinfoRes> auth1GetoauthinfoPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Auth1GetoauthinfoRes>(objectMapper.readValue("{\n  \"isenabled\" : true,\n  \"authurl\" : \"http://ids.xidi.edu.cn/authserver/login?service=http://pan.xidi.edu.cn/oauth\",\n  \"authserver\" : \"http://ids.xidi.edu.cn/authserver/login\",\n  \"redirectserver\" : \"http://pan.xidi.edu.cn/oauth\"\n}", Auth1GetoauthinfoRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Auth1GetoauthinfoRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Auth1GetoauthinfoRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Auth1GetvcodeRes> auth1GetvcodePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Auth1GetvcodeReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Auth1GetvcodeRes>(objectMapper.readValue("{\n  \"uuid\" : \"441857eb-d170-4f4b-ba60-8e2bb5676284\",\n  \"vcode\" : \"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\"\n}", Auth1GetvcodeRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Auth1GetvcodeRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Auth1GetvcodeRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> auth1LogoutPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Auth1LogoutReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> auth1ModifypasswordPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Auth1ModifypasswordReq body
,@ApiParam(value = "签名") @Valid @RequestParam(value = "sign", required = false) String sign
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Auth1RefreshtokenRes> auth1RefreshtokenPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Auth1RefreshtokenReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Auth1RefreshtokenRes>(objectMapper.readValue("{\n  \"expires\" : 315360000\n}", Auth1RefreshtokenRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Auth1RefreshtokenRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Auth1RefreshtokenRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> auth1RevoketokenPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Auth1RevoketokenReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Auth1SelfregistrationRes> auth1SelfregistrationPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Auth1SelfregistrationReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Auth1SelfregistrationRes>(objectMapper.readValue("{\n  \"userid\" : \"e09863f6-2d7e-11e8-a0e0-005056af48ce\"\n}", Auth1SelfregistrationRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Auth1SelfregistrationRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Auth1SelfregistrationRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Auth1SendauthvcodeRes> auth1SendauthvcodePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Auth1SendauthvcodeReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Auth1SendauthvcodeRes>(objectMapper.readValue("{\n  \"authway\" : \"138******111\",\n  \"sendinterval\" : 60,\n  \"isduplicatesended\" : false\n}", Auth1SendauthvcodeRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Auth1SendauthvcodeRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Auth1SendauthvcodeRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Auth1ValidatesecuritydeviceRes> auth1ValidatesecuritydevicePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Auth1ValidatesecuritydeviceReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Auth1ValidatesecuritydeviceRes>(objectMapper.readValue("{\n  \"result\" : true\n}", Auth1ValidatesecuritydeviceRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Auth1ValidatesecuritydeviceRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Auth1ValidatesecuritydeviceRes>(HttpStatus.NOT_IMPLEMENTED);
    }

}
