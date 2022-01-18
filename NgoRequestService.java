package org.online_charity_website.charity_website.Services;

import org.online_charity_website.charity_website.Entities.NgoRequest;
import org.springframework.web.multipart.MultipartFile;

public interface NgoRequestService {

    String raiseRequest(NgoRequest request,Long ngoId);

    String uploadDocument(MultipartFile[] doc, Long reqId);

    String deleteRequest(Long id);
    
}
