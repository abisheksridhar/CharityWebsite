package org.online_charity_website.charity_website.Controller;

import org.online_charity_website.charity_website.Entities.NgoRequest;
import org.online_charity_website.charity_website.Services.NgoRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/")
public class NgoRequestController {

    @Autowired
    private NgoRequestService nRequestService;

    @PostMapping("/ngo/raiseRequest/{id}")
    public String raiseRequest(@RequestBody NgoRequest request,@PathVariable("id") Long ngoId)
    {
        String result;
        result = nRequestService.raiseRequest(request,ngoId);
        return result;
    }

    @PostMapping("/ngo/uploadDocument/{id}")
    public String uploadDocument(@RequestParam MultipartFile[] doc, @PathVariable("id") Long reqId)
    {
        String result;
        result = nRequestService.uploadDocument(doc,reqId);
        return result;
    }

    @DeleteMapping("/ngo/deleteRequest/{id}")
    public String deleteRequest(@PathVariable("id") Long id)
    {
        String result;
        result = nRequestService.deleteRequest(id);
        return result;
    }
    
}
