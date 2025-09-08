package com.example.webhook_demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WebhookControllerTest {

    @Test
    public void testStatusShouldFail() {
        WebhookController controller = new WebhookController();
        String status = controller.getStatus();

        // Intentionally wrong expected value
        assertEquals("App is NOT running!", status);
    }
}
