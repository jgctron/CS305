package com.twk.restservice;

import java.util.List;
import javax.validation.constraints.NotEmpty;

public class DocData {
    @NotEmpty
    private String docId;

    @NotEmpty
    private List<String> docContent;

    // Getters and setters
    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public List<String> getDocContent() {
        return docContent;
    }

    public void setDocContent(List<String> docContent) {
        this.docContent = docContent;
    }
}
