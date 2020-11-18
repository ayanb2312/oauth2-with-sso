package com.ab.resource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ab.resource.ResourceServerApp;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = { ResourceServerApp.class })
public class ContextIntegrationTest {

    @Test
    public void whenLoadApplication_thenSuccess() {

    }

}