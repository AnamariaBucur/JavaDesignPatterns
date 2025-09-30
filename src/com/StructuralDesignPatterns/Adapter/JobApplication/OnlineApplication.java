package com.StructuralDesignPatterns.Adapter.JobApplication;

public class OnlineApplication {
    private final DocumentUploader documentUploader;

    public OnlineApplication(DocumentUploader documentUploader) {
        this.documentUploader = documentUploader;
    }

    public void uploadDocument() {
        documentUploader.upload();
    }
}
