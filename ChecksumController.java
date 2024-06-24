package com.twk.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@RestController
public class ChecksumController {
    private static final String NAME = "Jorge Cintron";

    @GetMapping("/checksum")
    public String getChecksum() throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(NAME.getBytes());
        String hexHash = bytesToHex(hash);
        return "Name: " + NAME + "\nAlgorithm: SHA-256\nChecksum: " + hexHash;
    }

    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
