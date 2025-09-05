package com.example.webhook_demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebhookController {

    // POST API for webhook
    @PostMapping("/webhook")
    public ResponseEntity<String> receiveWebhook(@RequestBody String payload) {
        System.out.println("Webhook received: " + payload);
        return ResponseEntity.ok("✅ Webhook received successfully!");
    }

    // GET API for testing
    @GetMapping("/")
    public String hello() {
        return "App is running!";
    }
}

