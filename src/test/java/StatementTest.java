package com.docinc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatementTest {

    @Test
    public void testDownloadReturnsPdfPath() {
        Statement stmt = new Statement();
        stmt.pdfPath = "sample.pdf";

        String result = stmt.download();

        assertEquals("sample.pdf", result);
    }

    @Test
    public void testDownloadReturnsNullWhenNoPdfSet() {
        Statement stmt = new Statement();
        stmt.pdfPath = null;

        String result = stmt.download();

        assertNull(result);
    }
}
