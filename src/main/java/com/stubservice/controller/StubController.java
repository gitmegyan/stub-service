package com.stubservice.controller;

import com.stubservice.model.StubRequest;
import com.stubservice.service.WiremockManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stubs")
@RequiredArgsConstructor
@Slf4j
public class StubController {

    private final WiremockManager wiremockManager;

    @PostMapping
    public ResponseEntity<String> createStub(@RequestBody StubRequest stubRequest) {
        wiremockManager.createStub(stubRequest);
        return ResponseEntity.ok("Stub created for " + stubRequest.getUrl());
    }

    @DeleteMapping("/reset")
    public ResponseEntity<String> resetStubs() {
        wiremockManager.resetAllStubs();
        return ResponseEntity.ok("All stubs reset");
    }

}
