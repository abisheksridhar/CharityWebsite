package org.online_charity_website.charity_website.Entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="NgoRequest")
public class NgoRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int requestId;
    private String requestName;
    private String requestDetail;
    private MultipartFile[] document;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ngoId",nullable=false)
    private Ngo ngo;

    public NgoRequest() {
    }

    public NgoRequest(String requestName, String requestDetail, MultipartFile[] document, Ngo ngo) {
        this.requestName = requestName;
        this.requestDetail = requestDetail;
        this.document = document;
        this.ngo = ngo;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getRequestName() {
        return requestName;
    }

    public void setRequestName(String requestName) {
        this.requestName = requestName;
    }

    public String getRequestDetail() {
        return requestDetail;
    }

    public void setRequestDetail(String requestDetail) {
        this.requestDetail = requestDetail;
    }

    public MultipartFile[] getDocument() {
        return document;
    }

    public void setDocument(MultipartFile[] document) {
        this.document = document;
    }

    public Ngo getNgo() {
        return ngo;
    }

    public void setNgo(Ngo ngo) {
        this.ngo = ngo;
    }

}
