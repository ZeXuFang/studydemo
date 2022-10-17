package com.ibm.portalserver.controller;

import com.ibm.portalserver.domain.LinkEntity;
import com.ibm.portalserver.service.impl.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/link")
public class LinkCtl {
    @Autowired
    private LinkService linkService;
    public void getLinkService(LinkService linkService) {
        this.linkService = linkService;
    }
    @CrossOrigin
    @GetMapping("/link")
    public List<LinkEntity> linkUser() {
        return linkService.linkUser();
    }
}
