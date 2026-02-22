package com.docinc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
