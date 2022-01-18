package org.online_charity_website.charity_website.Services;

import java.util.Optional;
import org.online_charity_website.charity_website.Entities.Ngo;
import org.online_charity_website.charity_website.Entities.NgoRequest;
import org.online_charity_website.charity_website.Repositories.NgoRepo;
import org.online_charity_website.charity_website.Repositories.NgoRequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class NgoRequestServiceImplementation implements NgoRequestService {
    
    @Autowired
    private NgoRequestRepo nRequestRepo;

    @Autowired
    private NgoRepo nrepo;
    @Override
    public String raiseRequest(NgoRequest request, Long ngoId) {
       Optional<Ngo> ngo = nrepo.findById(ngoId);
       if(!ngo.isPresent())
       {
           
       }
       request.setNgo(ngo.get());
       nRequestRepo.save(request);
       return "Request Added Successfully";
    }
    @Override
    public String uploadDocument(MultipartFile[] doc, Long reqId) {
        Optional<NgoRequest> nOptional = nRequestRepo.findById(reqId);
        if(!nOptional.isPresent())
        {

        }
        NgoRequest NRequest = nOptional.get();
        NRequest.setDocument(doc);
        nRequestRepo.save(NRequest);
        return "Document added Successfully";
    }
    @Override
    public String deleteRequest(Long id) {
        nRequestRepo.deleteById(id);
        return "Successfull";
    }
    
}
