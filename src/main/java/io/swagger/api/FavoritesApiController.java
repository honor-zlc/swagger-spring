package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.FavoritesAddReq;
import io.swagger.model.FavoritesCheckReq;
import io.swagger.model.FavoritesCheckResItem;
import io.swagger.model.FavoritesDeleteReq;
import io.swagger.model.FavoritesListResItem;
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
public class FavoritesApiController implements FavoritesApi {

    private static final Logger log = LoggerFactory.getLogger(FavoritesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FavoritesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> favoritesAddPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FavoritesAddReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<FavoritesCheckResItem>> favoritesCheckPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FavoritesCheckReq body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<FavoritesCheckResItem>>(objectMapper.readValue("[ {\n  \"docid\" : \"gns://DED18AD77A2849509DB0A7F6BAA58926/21A9B9FD1B524CB49D54BF7399F82EB4/0EBC549B0C89470189C5BE680B7B2354\",\n  \"favorited\" : true\n}, {\n  \"docid\" : \"gns://DED18AD77A2849509DB0A7F6BAA58926/21A9B9FD1B524CB49D54BF7399F82EB4/0EBC549B0C89470189C5BE680B7B2354\",\n  \"favorited\" : true\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<FavoritesCheckResItem>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<FavoritesCheckResItem>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> favoritesDeletePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody FavoritesDeleteReq body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<FavoritesListResItem>> favoritesListPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<FavoritesListResItem>>(objectMapper.readValue("[ {\n  \"docid\" : \"gns://DED18AD77A2849509DB0A7F6BAA58926/21A9B9FD1B524CB49D54BF7399F82EB4\",\n  \"name\" : \"filexxxx\",\n  \"path\" : \"gns://dir1/filexxxx\",\n  \"size\" : 90,\n  \"creator\" : \"user01\",\n  \"create_time\" : 1380502294452719,\n  \"editor\" : \"user01\",\n  \"modified\" : 1380502294452719\n}, {\n  \"docid\" : \"gns://DED18AD77A2849509DB0A7F6BAA58926/21A9B9FD1B524CB49D54BF7399F82EB4\",\n  \"name\" : \"filexxxx\",\n  \"path\" : \"gns://dir1/filexxxx\",\n  \"size\" : 90,\n  \"creator\" : \"user01\",\n  \"create_time\" : 1380502294452719,\n  \"editor\" : \"user01\",\n  \"modified\" : 1380502294452719\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<FavoritesListResItem>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<FavoritesListResItem>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
