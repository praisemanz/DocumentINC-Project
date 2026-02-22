package com.docinc;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentServiceTest {

    @Test
    public void testRetrievePDFUsingMock() {
        DocumentService service = mock(DocumentService.class);

        when(service.retrievePDF()).thenReturn("mock.pdf");

        String pdf = service.retrievePDF();

        assertEquals("mock.pdf", pdf);
        verify(service).retrievePDF();
    }
}

