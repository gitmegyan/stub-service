package com.stubservice.service;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.stubservice.model.StubRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WiremockManager {

    private final WireMockServer wireMockServer;

    public void createStub(StubRequest request) {
        wireMockServer.stubFor(WireMock.request(request.getMethod().toUpperCase(), WireMock.urlEqualTo(request.getUrl()))
                .willReturn(WireMock.aResponse()
                        .withStatus(request.getStatus())
                        .withHeader("Content-Type", request.getContentType())
                        .withBody(request.getBody())));

    }

    public void resetAllStubs() {
        wireMockServer.resetAll();
    }
}
