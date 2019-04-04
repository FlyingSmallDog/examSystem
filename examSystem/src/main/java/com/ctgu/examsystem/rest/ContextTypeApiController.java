package com.ctgu.examsystem.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-21T15:25:48.246+08:00[Asia/Shanghai]")

@Controller
@RequestMapping("${openapi.aPI.base-path:}")
public class ContextTypeApiController implements ContextTypeApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ContextTypeApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
