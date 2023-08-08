package com.common;

import net.coobird.thumbnailator.Thumbnails;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class ImageCompressor {
    // Helper method to compress the image using Thumbnails library
    public static byte[] compressImage(byte[] imageData, double scalingFactor, double imageQuality) throws IOException {
        // Create a ByteArrayOutputStream to hold the compressed image data
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        // Use Thumbnails to compress the image and write it to the ByteArrayOutputStream
        Thumbnails.of(new ByteArrayInputStream(imageData))
                .scale(scalingFactor)
                .outputQuality(imageQuality)
                .outputFormat("jpeg") // Set the output format if needed
                .toOutputStream(outputStream);

        // Get the compressed image data from the ByteArrayOutputStream
        return outputStream.toByteArray();
    }

    public static byte[] compressImage(byte[] data) {

        Deflater deflater = new Deflater();
        deflater.setLevel(Deflater.BEST_COMPRESSION);
        deflater.setInput(data);
        deflater.finish();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
        byte[] tmp = new byte[4*1024];
        while (!deflater.finished()) {
            int size = deflater.deflate(tmp);
            outputStream.write(tmp, 0, size);
        }
        try {
            outputStream.close();
        } catch (Exception e) {
        }
        return outputStream.toByteArray();
    }

    public static byte[] decompressImage(byte[] data) {
        Inflater inflater = new Inflater();
        inflater.setInput(data);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
        byte[] tmp = new byte[4*1024];
        try {
            while (!inflater.finished()) {
                int count = inflater.inflate(tmp);
                outputStream.write(tmp, 0, count);
            }
            outputStream.close();
        } catch (Exception exception) {
        }
        return outputStream.toByteArray();
    }

    public static String convertImageIntoString(byte[] decompressedImage) {
        return Base64.getEncoder().encodeToString(decompressedImage);
    }
}