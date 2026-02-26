package com.docinc;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class AuthStub extends AuthenticationService {
    @Override
    public boolean authenticate() {
        return true;
    }
}

public class AuthenticationStubTest {

    @Test
    public void testAuthenticationStub() {
        AuthStub stub = new AuthStub();

        assertTrue(stub.authenticate());
    }
}
