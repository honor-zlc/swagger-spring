package io.swagger.api;

import io.swagger.model.AuditApproveReq;
import io.swagger.model.AuditApproveRes;
import io.swagger.model.AuditApprovedocReq;
import io.swagger.model.AuditApprovedocRes;
import io.swagger.model.AuditGetapplyhistoryReq;
import io.swagger.model.AuditGetapplyhistoryRes;
import io.swagger.model.AuditGetapplyhistorycountRes;
import io.swagger.model.AuditGetapplysReq;
import io.swagger.model.AuditGetapplysRes;
import io.swagger.model.AuditGetapprovehistoryReq;
import io.swagger.model.AuditGetapprovehistoryRes;
import io.swagger.model.AuditGetapprovehistorycountRes;
import io.swagger.model.AuditGetdocapplysRes;
import io.swagger.model.AuditGetdocapprovalsRes;
import io.swagger.model.AuditGetdocprocessesRes;
import io.swagger.model.AuditGetpendingapprovalsReq;
import io.swagger.model.AuditGetpendingapprovalsRes;
import io.swagger.model.AuditGetpendingapprovalscountsRes;
import io.swagger.model.AuditGetshareapplyhistorycountRes;
import io.swagger.model.AuditGetshareapprovehistoryReq;
import io.swagger.model.AuditGetshareapprovehistoryRes;
import io.swagger.model.AuditGetshareapprovehistorycountRes;
import io.swagger.model.AuditPublishdocReq;
import io.swagger.model.AuditPublishdocRes;
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
public class AuditApiController implements AuditApi {

    private static final Logger log = LoggerFactory.getLogger(AuditApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AuditApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<AuditApproveRes> auditApprovePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AuditApproveReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuditApproveRes>(objectMapper.readValue("{\n  \"result\" : \"ok\"\n}", AuditApproveRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditApproveRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditApproveRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AuditApprovedocRes> auditApprovedocPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AuditApprovedocReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuditApprovedocRes>(objectMapper.readValue("{\n  \"result\" : \"ok\"\n}", AuditApprovedocRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditApprovedocRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditApprovedocRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AuditGetapplyhistoryRes> auditGetapplyhistoryPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AuditGetapplyhistoryReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuditGetapplyhistoryRes>(objectMapper.readValue("{\n  \"applyinfos\" : [ {\n    \"approveindex\" : -1,\n    \"auditornames\" : [ \"1\" ],\n    \"audittype\" : 1,\n    \"csflevel\" : 6,\n    \"docname\" : \"AnyShare://1的文档库/1.txt\",\n    \"isdir\" : false,\n    \"processname\" : \"同级审核\",\n    \"requestdate\" : 1565339620252023,\n    \"vetoindex\" : 0\n  }, {\n    \"approveindex\" : -1,\n    \"auditornames\" : [ \"1\" ],\n    \"audittype\" : 1,\n    \"csflevel\" : 5,\n    \"docname\" : \"AnyShare://文档库/1.txt\",\n    \"isdir\" : false,\n    \"processname\" : \"跨网络文档交换\",\n    \"requestdate\" : 1560784862184312,\n    \"vetoindex\" : 0\n  }, {\n    \"approveindex\" : -1,\n    \"auditornames\" : [ \"1\" ],\n    \"audittype\" : 1,\n    \"csflevel\" : 5,\n    \"docname\" : \"AnyShare://121/为什么有了Office Online还需要超级表格.pptx\",\n    \"isdir\" : false,\n    \"processname\" : \"同级审核\",\n    \"requestdate\" : 1557198881910624,\n    \"vetoindex\" : 0\n  }, {\n    \"approveindex\" : -1,\n    \"auditornames\" : [ \"1\" ],\n    \"audittype\" : 1,\n    \"csflevel\" : 5,\n    \"docname\" : \"AnyShare://121/未保存kill.pptx\",\n    \"isdir\" : false,\n    \"processname\" : \"同级审核\",\n    \"requestdate\" : 1557193102519334,\n    \"vetoindex\" : 0\n  }, {\n    \"approveindex\" : -1,\n    \"auditornames\" : [ \"1\" ],\n    \"audittype\" : 1,\n    \"csflevel\" : 6,\n    \"docname\" : \"AnyShare://121/data.txt\",\n    \"isdir\" : false,\n    \"processname\" : \"同级审核\",\n    \"requestdate\" : 1557126045607223,\n    \"vetoindex\" : 0\n  }, {\n    \"approveindex\" : -1,\n    \"auditornames\" : [ \"2__1\" ],\n    \"audittype\" : 1,\n    \"csflevel\" : 5,\n    \"docname\" : \"AnyShare://1/1.txt\",\n    \"isdir\" : false,\n    \"processname\" : \"跨网络文档交换\",\n    \"requestdate\" : 1556260701047269,\n    \"vetoindex\" : 0\n  }, {\n    \"approveindex\" : -1,\n    \"auditornames\" : [ \"1_1\" ],\n    \"audittype\" : 1,\n    \"csflevel\" : 5,\n    \"docname\" : \"AnyShare://1/AnyShare  6.0安装手册 (2).docx\",\n    \"isdir\" : false,\n    \"processname\" : \"跨网络文档交换\",\n    \"requestdate\" : 1556257301972333,\n    \"vetoindex\" : 0\n  }, {\n    \"approveindex\" : -1,\n    \"auditornames\" : [ \"1_1\", \"2__1\" ],\n    \"audittype\" : 3,\n    \"csflevel\" : 5,\n    \"docname\" : \"AnyShare://1/1.txt\",\n    \"isdir\" : false,\n    \"processname\" : \"121\",\n    \"requestdate\" : 1556239882044142,\n    \"vetoindex\" : 0\n  }, {\n    \"approveindex\" : 0,\n    \"auditornames\" : [ \"1_1\", \"2__1\" ],\n    \"audittype\" : 3,\n    \"csflevel\" : 5,\n    \"docname\" : \"AnyShare://1/1.txt\",\n    \"isdir\" : false,\n    \"processname\" : \"121\",\n    \"requestdate\" : 1556185049021017,\n    \"vetoindex\" : 1\n  }, {\n    \"approveindex\" : 1,\n    \"auditornames\" : [ \"1_1\", \"2__1\" ],\n    \"audittype\" : 3,\n    \"csflevel\" : 5,\n    \"docname\" : \"AnyShare://1/1.txt\",\n    \"isdir\" : false,\n    \"processname\" : \"121\",\n    \"requestdate\" : 1556184892595413,\n    \"vetoindex\" : -1\n  }, {\n    \"approveindex\" : 1,\n    \"auditornames\" : [ \"1_1\", \"2__1\" ],\n    \"audittype\" : 3,\n    \"csflevel\" : 5,\n    \"docname\" : \"AnyShare://1/1.txt\",\n    \"isdir\" : false,\n    \"processname\" : \"121\",\n    \"requestdate\" : 1556184429908394,\n    \"vetoindex\" : -1\n  } ]\n}", AuditGetapplyhistoryRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditGetapplyhistoryRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditGetapplyhistoryRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AuditGetapplyhistorycountRes> auditGetapplyhistorycountPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuditGetapplyhistorycountRes>(objectMapper.readValue("{\n  \"count\" : 12\n}", AuditGetapplyhistorycountRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditGetapplyhistorycountRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditGetapplyhistorycountRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AuditGetapplysRes> auditGetapplysPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AuditGetapplysReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuditGetapplysRes>(objectMapper.readValue("{\n  \"applyinfos\" : [ {\n    \"applyid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n    \"docid\" : \"gns://DED18AD77A2849509DB0A7F6BAA58926/11118AD77A2849509DB0A7F6BAA51111\",\n    \"docname\" : \"公司制度/请求审批流程.ppt\",\n    \"createdate:\" : 1380502294452719,\n    \"apptype\" : 1,\n    \"isdir\" : false,\n    \"csflevel\" : 6,\n    \"auditornames\" : [ \"张三\", \"李四\" ],\n    \"detail\" : {\n      \"optype\" : 2,\n      \"accessorid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n      \"accessortype\" : \"department\",\n      \"accessorname\" : \"部门001\",\n      \"allowvalue\" : 3,\n      \"denyvalue\" : 16,\n      \"endtime\" : 1380502294452719\n    }\n  }, {\n    \"applyid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e5\",\n    \"docid\" : \"gns://DED18AD77A2849509DB0A7F6BAA58926/11118AD77A2849509DB0A7F6BAA51111\",\n    \"docname\" : \"公司制度\",\n    \"createdate:\" : 1380502294452719,\n    \"apptype\" : 2,\n    \"isdir\" : true,\n    \"csflevel\" : 0,\n    \"auditornames\" : [ \"张三\", \"李四\" ],\n    \"detail\" : {\n      \"optype\" : 2,\n      \"perm\" : 3,\n      \"password\" : \"123456\",\n      \"endtime\" : 1380502294452719\n    }\n  } ]\n}", AuditGetapplysRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditGetapplysRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditGetapplysRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AuditGetapprovehistoryRes> auditGetapprovehistoryPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AuditGetapprovehistoryReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuditGetapprovehistoryRes>(objectMapper.readValue("{\n  \"applyinfos\" : [ {\n    \"approveindex\" : -1,\n    \"auditornames\" : [ \"1\" ],\n    \"audittype\" : 1,\n    \"csflevel\" : 6,\n    \"docname\" : \"AnyShare://1的文档库/1.txt\",\n    \"isdir\" : false,\n    \"processname\" : \"同级审核\",\n    \"requestdate\" : 1565339620252023,\n    \"requesterName\" : \"1\",\n    \"vetoindex\" : 0\n  }, {\n    \"approveindex\" : -1,\n    \"auditornames\" : [ \"1\" ],\n    \"audittype\" : 1,\n    \"csflevel\" : 5,\n    \"docname\" : \"AnyShare://文档库/1.txt\",\n    \"isdir\" : false,\n    \"processname\" : \"跨网络文档交换\",\n    \"requestdate\" : 1560784862184312,\n    \"requesterName\" : \"1\",\n    \"vetoindex\" : 0\n  }, {\n    \"approveindex\" : 0,\n    \"auditornames\" : [ \"1\", \"2\" ],\n    \"audittype\" : 3,\n    \"csflevel\" : 6,\n    \"docname\" : \"AnyShare://121/data.txt\",\n    \"isdir\" : false,\n    \"processname\" : \"逐级审核\",\n    \"requestdate\" : 1558676634741388,\n    \"requesterName\" : \"1\",\n    \"vetoindex\" : -1\n  }, {\n    \"approveindex\" : -1,\n    \"auditornames\" : [ \"1\" ],\n    \"audittype\" : 1,\n    \"csflevel\" : 5,\n    \"docname\" : \"AnyShare://121/为什么有了Office Online还需要超级表格.pptx\",\n    \"isdir\" : false,\n    \"processname\" : \"同级审核\",\n    \"requestdate\" : 1557198881910624,\n    \"requesterName\" : \"1\",\n    \"vetoindex\" : 0\n  }, {\n    \"approveindex\" : -1,\n    \"auditornames\" : [ \"1\" ],\n    \"audittype\" : 1,\n    \"csflevel\" : 5,\n    \"docname\" : \"AnyShare://121/未保存kill.pptx\",\n    \"isdir\" : false,\n    \"processname\" : \"同级审核\",\n    \"requestdate\" : 1557193102519334,\n    \"requesterName\" : \"1\",\n    \"vetoindex\" : 0\n  }, {\n    \"approveindex\" : -1,\n    \"auditornames\" : [ \"1\" ],\n    \"audittype\" : 1,\n    \"csflevel\" : 6,\n    \"docname\" : \"AnyShare://121/data.txt\",\n    \"isdir\" : false,\n    \"processname\" : \"同级审核\",\n    \"requestdate\" : 1557126045607223,\n    \"requesterName\" : \"1\",\n    \"vetoindex\" : 0\n  } ]\n}", AuditGetapprovehistoryRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditGetapprovehistoryRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditGetapprovehistoryRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AuditGetapprovehistorycountRes> auditGetapprovehistorycountPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuditGetapprovehistorycountRes>(objectMapper.readValue("{\n  \"count\" : 12\n}", AuditGetapprovehistorycountRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditGetapprovehistorycountRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditGetapprovehistorycountRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AuditGetdocapplysRes> auditGetdocapplysPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuditGetdocapplysRes>(objectMapper.readValue("{\n  \"applyinfos\" : [ {\n    \"applyid\" : \"68b4e42d-3f01-4af2-a6e1-6a1fe17765ad\",\n    \"applymsg\" : \"\",\n    \"auditornames\" : [ \"1\" ],\n    \"auditprogress\" : 0,\n    \"audittype\" : 1,\n    \"createdate\" : 1565339620252023,\n    \"csflevel\" : 6,\n    \"docid\" : \"gns://44611A634F5C400F9BD6CC6343060BD4/CC33BDC6F8B74201A26FFB9164274C04\",\n    \"docname\" : \"1的文档库\\1.txt\",\n    \"isdir\" : false,\n    \"processname\" : \"同级审核\"\n  } ]\n}", AuditGetdocapplysRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditGetdocapplysRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditGetdocapplysRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AuditGetdocapprovalsRes> auditGetdocapprovalsPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuditGetdocapprovalsRes>(objectMapper.readValue("{\n  \"applyinfos\" : [ {\n    \"applyid\" : \"68b4e42d-3f01-4af2-a6e1-6a1fe17765ad\",\n    \"applymsg\" : \"\",\n    \"auditornames\" : [ \"1\" ],\n    \"auditprogress\" : 0,\n    \"audittype\" : 1,\n    \"createdate\" : 1565339620252023,\n    \"creatorname\" : \"1\",\n    \"csflevel\" : 6,\n    \"docid\" : \"gns://44611A634F5C400F9BD6CC6343060BD4/CC33BDC6F8B74201A26FFB9164274C04\",\n    \"docname\" : \"1的文档库\\1.txt\",\n    \"isdir\" : false,\n    \"processname\" : \"同级审核\"\n  } ]\n}", AuditGetdocapprovalsRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditGetdocapprovalsRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditGetdocapprovalsRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AuditGetdocprocessesRes> auditGetdocprocessesPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuditGetdocprocessesRes>(objectMapper.readValue("{\n  \"processinfos\" : [ {\n    \"auditornames\" : [ \"无审核员\" ],\n    \"audittype\" : 4,\n    \"destpath\" : \"指定的隔离网络接收文件箱\",\n    \"processid\" : -1,\n    \"processname\" : \"跨网络文档交换\"\n  }, {\n    \"auditornames\" : [ \"1\", \"2\" ],\n    \"audittype\" : 2,\n    \"destpath\" : \"AnyShare://文档库\",\n    \"processid\" : \"6e7aebfc-6b0a-11e9-b084-005056af0410\",\n    \"processname\" : \"汇签审核\"\n  }, {\n    \"auditornames\" : [ \"1\" ],\n    \"audittype\" : 1,\n    \"destpath\" : \"AnyShare://文档库\",\n    \"processid\" : \"8547157c-6b0a-11e9-81d4-005056af0410\",\n    \"processname\" : \"同级审核\"\n  }, {\n    \"auditornames\" : [ \"1\", \"2\" ],\n    \"audittype\" : 3,\n    \"destpath\" : \"AnyShare://文档库\",\n    \"processid\" : \"147f33c8-673c-11e9-ac10-005056af0410\",\n    \"processname\" : \"逐级审核\"\n  } ]\n}", AuditGetdocprocessesRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditGetdocprocessesRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditGetdocprocessesRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AuditGetpendingapprovalsRes> auditGetpendingapprovalsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AuditGetpendingapprovalsReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuditGetpendingapprovalsRes>(objectMapper.readValue("{\n  \"applyinfos\" : [ {\n    \"applyid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n    \"docid\" : \"gns://DED18AD77A2849509DB0A7F6BAA58926/11118AD77A2849509DB0A7F6BAA51111\",\n    \"docname\" : \"公司制度/请求审批流程.ppt\",\n    \"createdate:\" : 1380502294452719,\n    \"apptype\" : 1,\n    \"isdir\" : false,\n    \"csflevel\" : 6,\n    \"auditornames\" : [ \"张三\", \"李四\" ],\n    \"detail\" : {\n      \"optype\" : 2,\n      \"accessorid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n      \"accessortype\" : \"department\",\n      \"accessorname\" : \"部门001\",\n      \"allowvalue\" : 3,\n      \"denyvalue\" : 16,\n      \"endtime\" : 1380502294452719\n    }\n  }, {\n    \"applyid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e5\",\n    \"docid\" : \"gns://DED18AD77A2849509DB0A7F6BAA58926/11118AD77A2849509DB0A7F6BAA51111\",\n    \"docname\" : \"公司制度\",\n    \"createdate:\" : 1380502294452719,\n    \"apptype\" : 2,\n    \"isdir\" : true,\n    \"csflevel\" : 0,\n    \"auditornames\" : [ \"张三\", \"李四\" ],\n    \"detail\" : {\n      \"optype\" : 2,\n      \"perm\" : 3,\n      \"password\" : \"123456\",\n      \"endtime\" : 1380502294452719\n    }\n  } ]\n}", AuditGetpendingapprovalsRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditGetpendingapprovalsRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditGetpendingapprovalsRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AuditGetpendingapprovalscountsRes> auditGetpendingapprovalscountsPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuditGetpendingapprovalscountsRes>(objectMapper.readValue("{\n  \"counts\" : 0,\n  \"csfauditcount\" : 0,\n  \"docauditcount\" : 0,\n  \"pemcount\" : 0,\n  \"shareauditcount\" : 0\n}", AuditGetpendingapprovalscountsRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditGetpendingapprovalscountsRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditGetpendingapprovalscountsRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AuditGetpendingapprovalsRes> auditGetshareapplyhistoryPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AuditGetpendingapprovalsReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuditGetpendingapprovalsRes>(objectMapper.readValue("{\n  \"applyinfos\" : [ {\n    \"applyid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n    \"docid\" : \"gns://DED18AD77A2849509DB0A7F6BAA58926/11118AD77A2849509DB0A7F6BAA51111\",\n    \"docname\" : \"公司制度/请求审批流程.ppt\",\n    \"createdate:\" : 1380502294452719,\n    \"apptype\" : 1,\n    \"isdir\" : false,\n    \"csflevel\" : 6,\n    \"auditornames\" : [ \"张三\", \"李四\" ],\n    \"detail\" : {\n      \"optype\" : 2,\n      \"accessorid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e4\",\n      \"accessortype\" : \"department\",\n      \"accessorname\" : \"部门001\",\n      \"allowvalue\" : 3,\n      \"denyvalue\" : 16,\n      \"endtime\" : 1380502294452719\n    }\n  }, {\n    \"applyid\" : \"d22f7ec5-231f-35f5-a495-9194b66193e5\",\n    \"docid\" : \"gns://DED18AD77A2849509DB0A7F6BAA58926/11118AD77A2849509DB0A7F6BAA51111\",\n    \"docname\" : \"公司制度\",\n    \"createdate:\" : 1380502294452719,\n    \"apptype\" : 2,\n    \"isdir\" : true,\n    \"csflevel\" : 0,\n    \"auditornames\" : [ \"张三\", \"李四\" ],\n    \"detail\" : {\n      \"optype\" : 2,\n      \"perm\" : 3,\n      \"password\" : \"123456\",\n      \"endtime\" : 1380502294452719\n    }\n  } ]\n}", AuditGetpendingapprovalsRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditGetpendingapprovalsRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditGetpendingapprovalsRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AuditGetshareapplyhistorycountRes> auditGetshareapplyhistorycountPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuditGetshareapplyhistorycountRes>(objectMapper.readValue("{\n  \"count\" : 12\n}", AuditGetshareapplyhistorycountRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditGetshareapplyhistorycountRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditGetshareapplyhistorycountRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AuditGetshareapprovehistoryRes> auditGetshareapprovehistoryPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AuditGetshareapprovehistoryReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuditGetshareapprovehistoryRes>(objectMapper.readValue("{\n  \"applyinfos\" : [ {\n    \"approveindex\" : -1,\n    \"apptype\" : 1,\n    \"auditornames\" : [ \"1\" ],\n    \"csflevel\" : 6,\n    \"detail\" : {\n      \"accessorid\" : \"1c01b2e2-23a8-11e9-bf60-005056af0410\",\n      \"accessorname\" : \"2\",\n      \"accessortype\" : 1,\n      \"allowvalue\" : 9,\n      \"auditmsg\" : \"\",\n      \"denyvalue\" : 0,\n      \"endtime\" : 1561219199000000,\n      \"optype\" : 1\n    },\n    \"docname\" : \"AnyShare://121/data.txt\",\n    \"isdir\" : false,\n    \"requestdate\" : 1558597143150846,\n    \"requestername\" : \"1\",\n    \"vetoindex\" : 0\n  }, {\n    \"approveindex\" : 0,\n    \"apptype\" : 2,\n    \"auditornames\" : [ \"1\" ],\n    \"csflevel\" : 5,\n    \"detail\" : {\n      \"accessLimit\" : -1,\n      \"auditmsg\" : \"\",\n      \"endtime\" : 1560095999000000,\n      \"link\" : \"75AD44A74C10376C0E713AA93F8C3EAA\",\n      \"optype\" : 2,\n      \"password\" : \"gB4Y\",\n      \"perm\" : 3,\n      \"watermarkConfig\" : \"\"\n    },\n    \"docname\" : \"AnyShare://1/新建文件夹/1-AnyShare5.0访问控制开放API接口文档 - 对外.docx\",\n    \"isdir\" : false,\n    \"requestdate\" : 1557451216150390,\n    \"requestername\" : \"1\",\n    \"vetoindex\" : -1\n  }, {\n    \"approveindex\" : -1,\n    \"apptype\" : 3,\n    \"auditornames\" : [ \"1\" ],\n    \"csflevel\" : 6,\n    \"detail\" : {\n      \"accessorid\" : \"1c01b2e2-23a8-11e9-bf60-005056af0410\",\n      \"accessorname\" : \"2\",\n      \"accessortype\" : 1,\n      \"auditmsg\" : \"\",\n      \"endtime\" : -1,\n      \"optype\" : 3\n    },\n    \"docname\" : \"AnyShare://121/data.txt\",\n    \"isdir\" : false,\n    \"requestdate\" : 1558597143066637,\n    \"requestername\" : \"1\",\n    \"vetoindex\" : 0\n  }, {\n    \"approveindex\" : -1,\n    \"apptype\" : 5,\n    \"auditornames\" : [ \"1\" ],\n    \"csflevel\" : 6,\n    \"detail\" : {\n      \"applycsflevel\" : 6,\n      \"auditmsg\" : \"\",\n      \"doccsflevel\" : 5,\n      \"usercsflevel\" : 6\n    },\n    \"docname\" : \"AnyShare://121/data.txt\",\n    \"isdir\" : false,\n    \"requestdate\" : 1557125666211211,\n    \"requestername\" : \"1\",\n    \"vetoindex\" : 0\n  }, {\n    \"approveindex\" : -1,\n    \"apptype\" : 6,\n    \"auditornames\" : [ \"1\" ],\n    \"csflevel\" : 6,\n    \"detail\" : {\n      \"auditmsg\" : \"\",\n      \"inherit\" : false\n    },\n    \"docname\" : \"AnyShare://121/data.txt\",\n    \"isdir\" : false,\n    \"requestdate\" : 1557125666211211,\n    \"requestername\" : \"1\",\n    \"vetoindex\" : 0\n  } ]\n}", AuditGetshareapprovehistoryRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditGetshareapprovehistoryRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditGetshareapprovehistoryRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AuditGetshareapprovehistorycountRes> auditGetshareapprovehistorycountPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuditGetshareapprovehistorycountRes>(objectMapper.readValue("{\n  \"count\" : 12\n}", AuditGetshareapprovehistorycountRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditGetshareapprovehistorycountRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditGetshareapprovehistorycountRes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AuditPublishdocRes> auditPublishdocPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AuditPublishdocReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuditPublishdocRes>(objectMapper.readValue("{\n  \"applyid\" : \"68b4e42d-3f01-4af2-a6e1-6a1fe17765ad\",\n  \"audittype\" : 1,\n  \"result\" : \"ok\"\n}", AuditPublishdocRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditPublishdocRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditPublishdocRes>(HttpStatus.NOT_IMPLEMENTED);
    }

}
